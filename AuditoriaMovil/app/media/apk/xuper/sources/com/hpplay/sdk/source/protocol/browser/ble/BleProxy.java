package com.hpplay.sdk.source.protocol.browser.ble;

import android.content.Context;
import com.hpplay.sdk.source.browse.api.IServiceInfoParseListener;
import com.hpplay.sdk.source.business.cloud.SourceDataReport;
import com.hpplay.sdk.source.config.LelinkConfig;
/* loaded from: classes3.dex */
public class BleProxy {
    public static boolean isBrowserSuccess() {
        if (!LelinkConfig.isBLEEnable()) {
            return false;
        }
        return BleBrowserBridge.getInstance().isBrowserSuccess();
    }

    public static void setServiceInfoParseListener(IServiceInfoParseListener iServiceInfoParseListener) {
        if (!LelinkConfig.isBLEEnable()) {
            return;
        }
        BleBrowserBridge.getInstance().setServiceInfoParseListener(iServiceInfoParseListener);
    }

    public static boolean startBrowse(Context context) {
        if (!LelinkConfig.isBLEEnable()) {
            return false;
        }
        return BleBrowserBridge.getInstance().startBrowse(context);
    }

    public static void startPublish(Context context, String str) {
        if (!LelinkConfig.isBLEEnable()) {
            SourceDataReport.getInstance().onBlePublish(0, null);
        } else if (BleBrowserBridge.getInstance().startPublish(context, str)) {
            SourceDataReport.getInstance().onBlePublish(1, null);
        } else {
            SourceDataReport.getInstance().onBlePublish(0, null);
        }
    }

    public static void stopBrowse(Context context) {
        if (!LelinkConfig.isBLEEnable()) {
            return;
        }
        BleBrowserBridge.getInstance().stopBrowse(context);
    }

    public static void stopPublish(Context context) {
        if (!LelinkConfig.isBLEEnable()) {
            return;
        }
        BleBrowserBridge.getInstance().stopPublish(context);
    }
}
