package com.hpplay.component.adjuster;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.hpplay.component.common.ParamsMap;
import com.hpplay.component.common.browse.IBrowseResultListener;
import com.hpplay.component.common.browse.IBrowser;
import com.hpplay.component.common.protocol.ProtocolListener;
import com.hpplay.component.common.utils.CLog;
import com.hpplay.component.common.utils.ModuleIds;
import com.hpplay.component.modulelinker.api.ModuleLinker;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class DeviceAdjuster {
    public static final int ACTIVE_STOP_TIME_OUT = 1000;
    public static final int AUTO_STOP_TIME_OUT = 10000;
    public static final String KEY_AIRPLAY_PORT = "airplay";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_DEVICE_IP = "deviceip";
    public static final String KEY_DEVICE_NAME = "devicename";
    public static final String KEY_DLNA_DESC = "dlna_mode_desc";
    public static final String KEY_LEBO_FEATURE = "lebofeature";
    public static final String KEY_LELINK_PORT = "lelinkport";
    public static final String KEY_LELINK_UID = " u";
    public static final String KEY_LELINK_VV = "vv";
    public static final String KEY_MAC = "devicemac";
    public static final String KEY_MIRROR_PORT = "mirror";
    public static final String KEY_RAOP_PORT = "raop";
    public static final String KEY_REMOTE_PORT = "remote";
    public static final String KEY_VERSION = "version";
    public static final String TAG = "DeviceAdjuster";
    private boolean isFindDevice;
    private IBrowseResultListener mBrowseResultListener;
    private int mCurrentType;
    private ParamsMap mParamsMap;
    private ProtocolListener mRequestNewDeviceProtocolListener;
    private StopBrowseTask mStopBrowseTask;
    private ConcurrentHashMap<String, CopyOnWriteArraySet> mInfos = new ConcurrentHashMap<>();
    private CopyOnWriteArraySet<String> mValidInfos = new CopyOnWriteArraySet<>();
    private AtomicBoolean isRequestDev = new AtomicBoolean();
    private Timer mTimer = new Timer();
    private IBrowseResultListener browseResultListener = new IBrowseResultListener() { // from class: com.hpplay.component.adjuster.DeviceAdjuster.1
        @Override // com.hpplay.component.common.browse.IBrowseResultListener
        public void onBrowseResultCallback(int i10, Object obj) {
            if (DeviceAdjuster.this.isRequestDev.get()) {
                DeviceAdjuster.this.filterDevices(i10, obj);
            }
            if (DeviceAdjuster.this.mBrowseResultListener != null) {
                DeviceAdjuster.this.mBrowseResultListener.onBrowseResultCallback(i10, obj);
            }
        }
    };

    /* loaded from: classes2.dex */
    public class StopBrowseTask extends TimerTask {
        public StopBrowseTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                DeviceAdjuster.this.isRequestDev.set(false);
                ((IBrowser) ModuleLinker.getInstance().loadModule(ModuleIds.CLAZZ_ID968_BROWSECONTROLLER)).stopBrowse();
                CLog.i(DeviceAdjuster.TAG, " StopBrowseTask ");
                DeviceAdjuster.this.matchDevice();
            } catch (Exception e10) {
                CLog.w(DeviceAdjuster.TAG, e10);
            }
        }
    }

    private void claerTemp() {
        ConcurrentHashMap<String, CopyOnWriteArraySet> concurrentHashMap = this.mInfos;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = this.mValidInfos;
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.clear();
        }
    }

    private int convertType(int i10) {
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        return i10;
    }

    private void delayStopBrowse(long j10) {
        CLog.i(TAG, "delayStopBrowse ... " + j10);
        StopBrowseTask stopBrowseTask = this.mStopBrowseTask;
        if (stopBrowseTask != null) {
            stopBrowseTask.cancel();
            this.mTimer.purge();
        }
        StopBrowseTask stopBrowseTask2 = new StopBrowseTask();
        this.mStopBrowseTask = stopBrowseTask2;
        this.mTimer.schedule(stopBrowseTask2, j10);
    }

    private String deviceConvert(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mParamsMap.putParam(ParamsMap.ConnectParams.KEY_CONNECT_SUPPORT, new int[]{i10}).putParam("ip", jSONObject.optString(KEY_DEVICE_IP)).putParam("port", jSONObject.optString("lelinkport")).putParam(ParamsMap.DeviceParams.KEY_LELINK_PORT, jSONObject.optString("lelinkport")).putParam(ParamsMap.DeviceParams.KEY_RAOP_PORT, jSONObject.optString("raop")).putParam(ParamsMap.DeviceParams.KEY_SINK_NAME, jSONObject.optString(KEY_DEVICE_NAME)).putParam("vv", jSONObject.optString("vv")).putParam(ParamsMap.DeviceParams.KEY_MIRROR_PORT, jSONObject.optString("mirror")).putParam(ParamsMap.DeviceParams.KEY_AIRPLAY_PORT, jSONObject.optString("airplay")).putParam(ParamsMap.DeviceParams.KEY_CHANNEL_VERSION, jSONObject.optString("channel")).putParam("remote", jSONObject.optString("remote")).putParam(ParamsMap.DeviceParams.KEY_MAC, jSONObject.optString(KEY_MAC)).putParam(ParamsMap.PushParams.KEY_LOCATION_URI, jSONObject.optString("dlna_mode_desc"));
            String jason = this.mParamsMap.toJason();
            CLog.i(TAG, "covert device info " + jason);
            return jason;
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[Catch: Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000c, B:10:0x0037, B:12:0x0043, B:15:0x0050, B:17:0x00b1, B:19:0x00b9, B:21:0x00c9, B:23:0x00d9, B:25:0x00dd, B:16:0x0083), top: B:30:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void filterDevices(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hpplay.component.adjuster.DeviceAdjuster.filterDevices(int, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void matchDevice() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " start match device "
            r0.append(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArraySet> r1 = r9.mInfos
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DeviceAdjuster"
            com.hpplay.component.common.utils.CLog.i(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArraySet> r0 = r9.mInfos
            int r0 = r0.size()
            r1 = 0
            r2 = 20
            if (r0 <= 0) goto Lda
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArraySet> r0 = r9.mInfos
            r3 = 2
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r0 = r0.get(r3)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArraySet> r3 = r9.mInfos
            r4 = 1
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.Object r3 = r3.get(r5)
            java.util.concurrent.CopyOnWriteArraySet r3 = (java.util.concurrent.CopyOnWriteArraySet) r3
            java.lang.String r5 = "sink_name"
            if (r0 == 0) goto L80
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L4a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L81
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            com.hpplay.component.common.ParamsMap r7 = r9.mParamsMap
            java.lang.String r8 = "uid"
            java.lang.String r7 = r7.getStringParam(r8)
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L70
            com.hpplay.component.common.ParamsMap r7 = r9.mParamsMap
            java.lang.String r7 = r7.getStringParam(r5)
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L4a
        L70:
            com.hpplay.component.common.protocol.ProtocolListener r0 = r9.mRequestNewDeviceProtocolListener
            if (r0 == 0) goto L7f
            java.lang.String r1 = r9.deviceConvert(r4, r6)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.onResult(r2, r1)
        L7f:
            return
        L80:
            r6 = r1
        L81:
            if (r3 == 0) goto Le1
            java.util.Iterator r0 = r3.iterator()
        L87:
            boolean r3 = r0.hasNext()
            r7 = 3
            if (r3 == 0) goto Lb0
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.hpplay.component.common.ParamsMap r3 = r9.mParamsMap
            java.lang.String r3 = r3.getStringParam(r5)
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L87
            com.hpplay.component.common.protocol.ProtocolListener r0 = r9.mRequestNewDeviceProtocolListener
            if (r0 == 0) goto Laf
            java.lang.String r1 = r9.deviceConvert(r7, r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.onResult(r2, r1)
        Laf:
            return
        Lb0:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto Lca
            com.hpplay.component.common.protocol.ProtocolListener r0 = r9.mRequestNewDeviceProtocolListener
            if (r0 == 0) goto Le1
            java.lang.String r1 = r9.deviceConvert(r4, r6)
            java.lang.String r1 = r9.deviceConvert(r4, r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.onResult(r2, r1)
            goto Le1
        Lca:
            com.hpplay.component.common.protocol.ProtocolListener r0 = r9.mRequestNewDeviceProtocolListener
            if (r0 == 0) goto Le1
            java.lang.String r1 = r9.deviceConvert(r7, r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.onResult(r2, r1)
            goto Le1
        Lda:
            com.hpplay.component.common.protocol.ProtocolListener r0 = r9.mRequestNewDeviceProtocolListener
            if (r0 == 0) goto Le1
            r0.onResult(r2, r1)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hpplay.component.adjuster.DeviceAdjuster.matchDevice():void");
    }

    private void rebrowse(int i10) {
        try {
            claerTemp();
            delayStopBrowse(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
            this.isRequestDev.set(true);
            IBrowser iBrowser = (IBrowser) ModuleLinker.getInstance().loadModule(ModuleIds.CLAZZ_ID968_BROWSECONTROLLER);
            iBrowser.stopBrowse();
            iBrowser.startBrowse(i10);
            CLog.i(TAG, "rebrowse ...browse type :" + i10);
        } catch (Exception e10) {
            CLog.w(TAG, e10);
        }
    }

    public IBrowseResultListener getBrowseResultListener() {
        return this.browseResultListener;
    }

    public void requestNewDevices(int i10, ParamsMap paramsMap, ProtocolListener protocolListener) {
        try {
            this.mCurrentType = i10;
            String stringParam = paramsMap.getStringParam(ParamsMap.DeviceParams.KEY_SINK_NAME);
            String ip = paramsMap.getIp();
            this.isFindDevice = false;
            claerTemp();
            this.mParamsMap = paramsMap;
            this.mRequestNewDeviceProtocolListener = protocolListener;
            rebrowse(i10);
            CLog.i(TAG, "requestNewDevices ... requestName: " + stringParam + " request  " + ip.replace(".", ""));
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            protocolListener.onResult(20, null);
        }
    }

    public void setBrowseInfosPoolListener(IBrowseResultListener iBrowseResultListener) {
        claerTemp();
        this.mBrowseResultListener = iBrowseResultListener;
    }

    public void stopRequestDevice() {
        this.mRequestNewDeviceProtocolListener = null;
        StopBrowseTask stopBrowseTask = this.mStopBrowseTask;
        if (stopBrowseTask != null) {
            stopBrowseTask.cancel();
            this.mTimer.purge();
        }
    }

    public void requestNewDevices(ParamsMap paramsMap, ProtocolListener protocolListener) {
        requestNewDevices(3, paramsMap, protocolListener);
    }
}
