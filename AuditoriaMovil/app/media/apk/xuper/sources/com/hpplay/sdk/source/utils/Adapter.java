package com.hpplay.sdk.source.utils;

import android.text.TextUtils;
import com.hpplay.component.common.utils.DeviceProperties;
import com.hpplay.component.protocol.mirror.AutoStrategy;
import com.hpplay.sdk.source.bean.OutParameter;
import com.hpplay.sdk.source.browse.data.BrowserInfo;
import com.hpplay.sdk.source.common.store.Preference;
import com.hpplay.sdk.source.log.SourceLog;
import java.util.Map;
/* loaded from: classes3.dex */
public class Adapter {
    private static final String TAG = "Adapter";

    public static int adjustBitRate(int i10) {
        if (Feature.isPico()) {
            return AutoStrategy.BITRATE_SUPER;
        }
        return i10;
    }

    public static int adjustFrame(int i10) {
        if (useLowFrameRate()) {
            return 30;
        }
        if (Feature.isPico()) {
            return 60;
        }
        int i11 = Preference.getInstance().get(Preference.KEY_MIRROR_FPS, 0);
        if (i11 > 0) {
            return i11;
        }
        return i10;
    }

    public static boolean delayStop(OutParameter outParameter) {
        try {
            String name = outParameter.currentBrowserInfo.getName();
            Map<String, String> extras = outParameter.currentBrowserInfo.getExtras();
            String str = extras.get(BrowserInfo.KEY_DLNA_MODE_NAME);
            String str2 = extras.get(BrowserInfo.KEY_MANUFACTURER);
            if (!TextUtils.isEmpty(name) && name.contains("爱投屏") && "Media Renderer".equals(str)) {
                if ("DLNA".equals(str2)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return false;
        }
    }

    public static boolean useLowFrameRate() {
        try {
            if ("M2010J19SC".equals(DeviceProperties.getModel())) {
                SourceLog.w(TAG, "useLowFrameRate for M2010J19SC");
                return true;
            }
            return false;
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return false;
        }
    }
}
