package com.distriqt.extension.inappbilling.controller.playbilling;

import android.content.Intent;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.DebugUtil;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.controller.InAppUpdateInfo;
import com.distriqt.extension.inappbilling.controller.InAppUpdates;
import com.distriqt.extension.inappbilling.events.InAppUpdatesEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.appupdate.AppUpdateOptions;
/* loaded from: classes.dex */
public class PlayInAppUpdates extends ActivityStateListener implements InAppUpdates {
    private static final int RC_APP_UPDATE = 19233;
    public static final String TAG = "PlayInAppUpdates";
    private AppUpdateInfo _appUpdateInfo;
    private IExtensionContext _extContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static int playAvailabilityToAvailability(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public PlayInAppUpdates(IExtensionContext iExtensionContext) {
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
            AppUpdateManagerFactory.create(this._extContext.getActivity()).getAppUpdateInfo().addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayInAppUpdates.2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppUpdateInfo appUpdateInfo) {
                    try {
                        PlayInAppUpdates.this._appUpdateInfo = appUpdateInfo;
                        InAppUpdateInfo inAppUpdateInfo = new InAppUpdateInfo();
                        inAppUpdateInfo.packageName = PlayInAppUpdates.this._appUpdateInfo.packageName();
                        inAppUpdateInfo.versionCode = PlayInAppUpdates.this._appUpdateInfo.availableVersionCode();
                        inAppUpdateInfo.totalBytes = PlayInAppUpdates.this._appUpdateInfo.totalBytesToDownload();
                        if (PlayInAppUpdates.this._extContext != null) {
                            PlayInAppUpdates.this._extContext.dispatchEvent(InAppUpdatesEvent.CHECK_APP_UPDATE_SUCCESS, InAppUpdatesEvent.formatForEvent(PlayInAppUpdates.playAvailabilityToAvailability(PlayInAppUpdates.this._appUpdateInfo.updateAvailability()), inAppUpdateInfo));
                        }
                    } catch (Exception e) {
                        Errors.handleException(e);
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayInAppUpdates.1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    try {
                        if (PlayInAppUpdates.this._extContext != null) {
                            PlayInAppUpdates.this._extContext.dispatchEvent(InAppUpdatesEvent.CHECK_APP_UPDATE_FAILED, InAppUpdatesEvent.formatForErrorEvent(2, exc.getMessage(), null));
                        }
                    } catch (Exception e) {
                        Errors.handleException(e);
                    }
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
            if (this._appUpdateInfo != null) {
                AppUpdateManagerFactory.create(this._extContext.getActivity()).startUpdateFlowForResult(this._appUpdateInfo, this._extContext.getActivity(), AppUpdateOptions.newBuilder(z ? 1 : 0).build(), RC_APP_UPDATE);
                this._appUpdateInfo = null;
                return true;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == RC_APP_UPDATE) {
            String str = TAG;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = intent == null ? "null" : DebugUtil.bundleToString(intent.getExtras());
            Logger.d(str, "onActivityResult( %d, %d, %s )", objArr);
        }
    }
}
