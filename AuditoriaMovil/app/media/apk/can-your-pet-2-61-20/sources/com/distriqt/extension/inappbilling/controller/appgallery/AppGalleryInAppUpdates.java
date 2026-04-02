package com.distriqt.extension.inappbilling.controller.appgallery;

import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.controller.InAppUpdateInfo;
import com.distriqt.extension.inappbilling.controller.InAppUpdates;
import com.distriqt.extension.inappbilling.events.InAppUpdatesEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.huawei.hms.jos.JosApps;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppGalleryInAppUpdates implements InAppUpdates {
    private static final int DEFAULT_VALUE = -4;
    public static final String TAG = "AppGalleryInAppUpdates";
    private ApkUpgradeInfo _apkUpgradeInfo;
    private IExtensionContext _extContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static int failCodeToErrorCode(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2 && i != 3 && i != 4 && i != 5 && i != 7) {
                    return -1;
                }
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int statusToAvailability(int i) {
        if (i == 1 || i == 2 || i == 4 || i == 5 || i == 6) {
            return 0;
        }
        if (i != 7) {
            return i != 9 ? 1 : 3;
        }
        return 2;
    }

    public AppGalleryInAppUpdates(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        this._extContext = null;
    }

    @Override // com.distriqt.extension.inappbilling.controller.InAppUpdates
    public boolean isSupported() {
        Logger.d(TAG, "isSupported()", new Object[0]);
        return true;
    }

    @Override // com.distriqt.extension.inappbilling.controller.InAppUpdates
    public boolean checkAppUpdate() {
        Logger.d(TAG, "checkAppUpdate()", new Object[0]);
        try {
            JosApps.getAppUpdateClient(this._extContext.getActivity()).checkAppUpdate(this._extContext.getActivity(), new CheckUpdateCallBack() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryInAppUpdates.1
                public void onUpdateInfo(Intent intent) {
                    Logger.d(AppGalleryInAppUpdates.TAG, "checkAppUpdate::onUpdateInfo()", new Object[0]);
                    if (intent != null) {
                        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -4);
                        int intExtra2 = intent.getIntExtra("failcause", -4);
                        String stringExtra = intent.getStringExtra("failreason");
                        String str = AppGalleryInAppUpdates.TAG;
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(intExtra);
                        objArr[1] = Integer.valueOf(intExtra2);
                        objArr[2] = stringExtra == null ? "null" : stringExtra;
                        Logger.d(str, "checkAppUpdate::onUpdateInfo(): status:%d failCode:%d failReason:%s", objArr);
                        if (intExtra2 == -4 || intExtra2 == 0) {
                            ApkUpgradeInfo serializableExtra = intent.getSerializableExtra("updatesdk_update_info");
                            if (serializableExtra instanceof ApkUpgradeInfo) {
                                ApkUpgradeInfo apkUpgradeInfo = serializableExtra;
                                AppGalleryInAppUpdates.this._apkUpgradeInfo = apkUpgradeInfo;
                                InAppUpdateInfo inAppUpdateInfo = new InAppUpdateInfo();
                                inAppUpdateInfo.packageName = apkUpgradeInfo.getPackage_();
                                inAppUpdateInfo.versionCode = apkUpgradeInfo.getVersionCode_();
                                inAppUpdateInfo.versionName = apkUpgradeInfo.getVersion_();
                                inAppUpdateInfo.totalBytes = apkUpgradeInfo.getBundleSize_();
                                AppGalleryInAppUpdates.this._extContext.dispatchEvent(InAppUpdatesEvent.CHECK_APP_UPDATE_SUCCESS, InAppUpdatesEvent.formatForEvent(2, inAppUpdateInfo));
                                return;
                            }
                            AppGalleryInAppUpdates.this._extContext.dispatchEvent(InAppUpdatesEvent.CHECK_APP_UPDATE_SUCCESS, InAppUpdatesEvent.formatForEvent(AppGalleryInAppUpdates.statusToAvailability(intExtra), null));
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("failCode", intExtra2);
                            jSONObject.put("failReason", stringExtra == null ? "Unknown" : stringExtra);
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, intExtra);
                        } catch (Exception unused) {
                        }
                        AppGalleryInAppUpdates.this._extContext.dispatchEvent(InAppUpdatesEvent.CHECK_APP_UPDATE_FAILED, InAppUpdatesEvent.formatForErrorEvent(AppGalleryInAppUpdates.failCodeToErrorCode(intExtra2), stringExtra, jSONObject));
                        return;
                    }
                    Logger.d(AppGalleryInAppUpdates.TAG, "checkAppUpdate::onUpdateInfo(): no intent ? ", new Object[0]);
                    AppGalleryInAppUpdates.this._extContext.dispatchEvent(InAppUpdatesEvent.CHECK_APP_UPDATE_FAILED, InAppUpdatesEvent.formatForErrorEvent(-1, "No data returned from app update check, try again later", null));
                }

                public void onMarketInstallInfo(Intent intent) {
                    Logger.d(AppGalleryInAppUpdates.TAG, "checkAppUpdate::onMarketInstallInfo()", new Object[0]);
                }

                public void onMarketStoreError(int i) {
                    Logger.d(AppGalleryInAppUpdates.TAG, "checkAppUpdate::onMarketStoreError( %d )", Integer.valueOf(i));
                }

                public void onUpdateStoreError(int i) {
                    Logger.d(AppGalleryInAppUpdates.TAG, "checkAppUpdate::onUpdateStoreError( %d )", Integer.valueOf(i));
                }
            });
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.InAppUpdates
    public boolean startAppUpdate(boolean z) {
        Logger.d(TAG, "startAppUpdate()", new Object[0]);
        try {
            JosApps.getAppUpdateClient(this._extContext.getActivity()).showUpdateDialog(this._extContext.getActivity(), this._apkUpgradeInfo, z);
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }
}
