package com.distriqt.extension.adverts.platforms.huawei;

import android.content.Context;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.events.AdvertisingIdEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
/* loaded from: classes.dex */
public class HuaweiAdsIdentifier {
    public static final String TAG = "HuaweiAdsIdentifier";
    private AdvertisingIdClient.Info _advertisingIdInfo;
    private IExtensionContext _extContext;

    public HuaweiAdsIdentifier(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        this._extContext = null;
    }

    public String getAdvertisingId() {
        Logger.d(TAG, "getAdvertisingId()", new Object[0]);
        final Context applicationContext = this._extContext.getActivity().getApplicationContext();
        new Thread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiAdsIdentifier$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HuaweiAdsIdentifier.this.m250x1633d744(applicationContext);
            }
        }).start();
        AdvertisingIdClient.Info info = this._advertisingIdInfo;
        return info == null ? "" : info.getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getAdvertisingId$0$com-distriqt-extension-adverts-platforms-huawei-HuaweiAdsIdentifier  reason: not valid java name */
    public /* synthetic */ void m250x1633d744(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this._advertisingIdInfo = advertisingIdInfo;
            IExtensionContext iExtensionContext = this._extContext;
            String id = advertisingIdInfo == null ? "" : advertisingIdInfo.getId();
            AdvertisingIdClient.Info info = this._advertisingIdInfo;
            iExtensionContext.dispatchEvent(AdvertisingIdEvent.ADVERTISING_ID, AdvertisingIdEvent.formatAdvertisingIdForEvent(id, info == null ? false : info.isLimitAdTrackingEnabled()));
        } catch (Exception e) {
            Errors.handleException(e);
        } catch (NoClassDefFoundError unused) {
            this._extContext.dispatchEvent("extension:error", "Missing com.huawei.hms.adsidentifier extension dependency");
        }
    }
}
