package com.adobe.air;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.adobe.air.AndroidActivityWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ConfigDownloadListener {
    private static String LOG_TAG = "ConfigDownloadListener";
    private static ConfigDownloadListener sListener;
    private BroadcastReceiver mDownloadConfigRecv = new BroadcastReceiver() { // from class: com.adobe.air.ConfigDownloadListener.1
        private String LOG_TAG = "ConfigDownloadListenerBR";

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
            if (r4.this$0.lastPauseTime < r5.getLong(com.adobe.air.AIRService.EXTRA_DOWNLOAD_TIME)) goto L10;
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                java.lang.String r5 = r6.getAction()
                java.lang.String r0 = "com.adobe.air.DownloadConfigComplete"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L37
                boolean r5 = r4.isInitialStickyBroadcast()
                r0 = 1
                if (r5 == 0) goto L2c
                android.os.Bundle r5 = r6.getExtras()
                if (r5 == 0) goto L2a
                java.lang.String r6 = "com.adobe.air.DownloadConfigCompleteTime"
                long r5 = r5.getLong(r6)
                com.adobe.air.ConfigDownloadListener r1 = com.adobe.air.ConfigDownloadListener.this
                long r1 = com.adobe.air.ConfigDownloadListener.access$000(r1)
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 >= 0) goto L2a
                goto L2c
            L2a:
                r5 = 0
                r0 = 0
            L2c:
                if (r0 == 0) goto L37
                com.adobe.air.AndroidActivityWrapper r5 = com.adobe.air.AndroidActivityWrapper.GetAndroidActivityWrapper()
                if (r5 == 0) goto L37
                r5.applyDownloadedConfig()
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.ConfigDownloadListener.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };
    private AndroidActivityWrapper.StateChangeCallback mActivityStateCB = new AndroidActivityWrapper.StateChangeCallback() { // from class: com.adobe.air.ConfigDownloadListener.2
        @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
        public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
            Activity activity = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity();
            if (activityState == AndroidActivityWrapper.ActivityState.PAUSED) {
                activity.unregisterReceiver(ConfigDownloadListener.this.mDownloadConfigRecv);
                ConfigDownloadListener.this.lastPauseTime = SystemClock.uptimeMillis();
            } else if (activityState == AndroidActivityWrapper.ActivityState.RESUMED) {
                activity.registerReceiver(ConfigDownloadListener.this.mDownloadConfigRecv, new IntentFilter(AIRService.INTENT_CONFIG_DOWNLOADED));
            }
        }
    };
    private long lastPauseTime = SystemClock.uptimeMillis();

    private ConfigDownloadListener() {
        AndroidActivityWrapper.GetAndroidActivityWrapper().addActivityStateChangeListner(this.mActivityStateCB);
    }

    public static ConfigDownloadListener GetConfigDownloadListener() {
        if (sListener == null) {
            sListener = new ConfigDownloadListener();
        }
        return sListener;
    }
}
