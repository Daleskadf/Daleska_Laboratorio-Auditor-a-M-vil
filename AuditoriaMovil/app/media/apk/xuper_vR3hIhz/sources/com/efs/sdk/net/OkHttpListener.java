package com.efs.sdk.net;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.net.a.a;
import com.efs.sdk.net.a.b;
import com.efs.sdk.net.a.c;
import com.efs.sdk.net.a.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class OkHttpListener extends EventListener {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f6362a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private String f6363b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6364c;

    /* renamed from: d  reason: collision with root package name */
    private List f6365d = new ArrayList();

    private void a(String str) {
        Map<String, Long> map;
        try {
            d c10 = a.a().c(this.f6363b);
            if (c10 == null || (map = c10.E) == null) {
                return;
            }
            map.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        String str;
        try {
            final d c10 = a.a().c(this.f6363b);
            final c a10 = a.a().a(this.f6363b);
            if (c10 != null && a10 != null) {
                Map<String, Long> map = c10.E;
                Map<String, Long> map2 = c10.F;
                Log.i("NetTrace-Listener", a10.toString());
                if (!TextUtils.isEmpty(c10.B)) {
                    final EfsJSONLog efsJSONLog = new EfsJSONLog("netperf");
                    if (map.containsKey(d.f6407d)) {
                        efsJSONLog.put("wd_dns", map.get(d.f6407d));
                    }
                    if (map.containsKey(d.f6408e)) {
                        efsJSONLog.put("wd_dnstm", map.get(d.f6408e));
                    }
                    if (map2.containsKey(d.f6423t)) {
                        efsJSONLog.put("wl_dns", map2.get(d.f6423t));
                    }
                    if (map.containsKey(d.f6409f)) {
                        efsJSONLog.put("wd_tcp", map.get(d.f6409f));
                    }
                    if (map.containsKey(d.f6412i)) {
                        efsJSONLog.put("wd_tcptm", map.get(d.f6412i));
                    }
                    if (map2.containsKey(d.f6425v)) {
                        efsJSONLog.put("wl_tcp", map2.get(d.f6425v));
                    }
                    if (map.containsKey(d.f6410g)) {
                        efsJSONLog.put("wd_ssl", map.get(d.f6410g));
                    }
                    if (map.containsKey(d.f6411h)) {
                        efsJSONLog.put("wd_ssltm", map.get(d.f6411h));
                    }
                    if (map2.containsKey(d.f6424u)) {
                        efsJSONLog.put("wl_ssl", map2.get(d.f6424u));
                    }
                    if (map.containsKey(d.f6414k)) {
                        efsJSONLog.put("wd_ds", map.get(d.f6414k));
                    }
                    if (map.containsKey(d.f6417n)) {
                        efsJSONLog.put("wd_dstm", map.get(d.f6417n));
                    }
                    if (map2.containsKey(d.f6426w) && map2.containsKey(d.f6427x)) {
                        efsJSONLog.put("wl_ds", Long.valueOf(map2.get(d.f6426w).longValue() + map2.get(d.f6427x).longValue()));
                    }
                    if (map.containsKey(d.f6418o)) {
                        efsJSONLog.put("wd_srt", map.get(d.f6418o));
                    }
                    if (map.containsKey(d.f6421r)) {
                        efsJSONLog.put("wd_srttm", map.get(d.f6421r));
                    }
                    if (map2.containsKey(d.f6428y) && map2.containsKey(d.f6429z)) {
                        efsJSONLog.put("wl_srt", Long.valueOf(map2.get(d.f6428y).longValue() + map2.get(d.f6429z).longValue()));
                    }
                    String[] split = c10.B.split("\\?");
                    if (split != null) {
                        str = split[0];
                    } else {
                        str = null;
                    }
                    List list = this.f6365d;
                    if (list != null && str != null && !list.contains(str)) {
                        this.f6365d.add(str);
                        if (map.containsKey(d.f6417n)) {
                            efsJSONLog.put("wd_ttfb", map.get(d.f6417n));
                        } else if (map.containsKey(d.f6415l)) {
                            efsJSONLog.put("wd_ttfb", map.get(d.f6415l));
                        }
                        if (map.containsKey(d.f6418o)) {
                            efsJSONLog.put("wd_ttfbtm", map.get(d.f6418o));
                        }
                        if (map.containsKey(d.f6418o)) {
                            if (map.containsKey(d.f6417n)) {
                                efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.f6418o).longValue() - map.get(d.f6417n).longValue()));
                            } else if (map.containsKey(d.f6415l)) {
                                efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.f6418o).longValue() - map.get(d.f6415l).longValue()));
                            }
                        }
                    } else {
                        efsJSONLog.put("wd_ttfb", 0);
                        efsJSONLog.put("wd_ttfbtm", 0);
                        efsJSONLog.put("wl_ttfb", 0);
                    }
                    if (map.containsKey(d.f6404a)) {
                        efsJSONLog.put("wd_rt", map.get(d.f6404a));
                    }
                    if (map.containsKey(d.f6405b)) {
                        efsJSONLog.put("wd_rttm", map.get(d.f6405b));
                    }
                    if (map2.containsKey(d.f6422s)) {
                        efsJSONLog.put("wl_rt", map2.get(d.f6422s));
                    }
                    efsJSONLog.put("wk_res", a10.f6396c);
                    efsJSONLog.put("wk_res_ori", c10.B);
                    efsJSONLog.put("wk_ip", c10.C);
                    efsJSONLog.put("wk_method", a10.f6398e);
                    efsJSONLog.put("wk_rc", Integer.valueOf(a10.f6401h));
                    efsJSONLog.put("wl_up", Long.valueOf(a10.f6399f));
                    efsJSONLog.put("wl_down", Long.valueOf(a10.f6403j));
                    efsJSONLog.put("wl_total", Long.valueOf(a10.f6399f + a10.f6403j));
                    b.a(new Runnable() { // from class: com.efs.sdk.net.OkHttpListener.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (NetManager.getNetConfigManager().getNetRequestBodyCollectState() && !TextUtils.isEmpty(a10.f6400g)) {
                                    String str2 = "";
                                    if (c10.E.containsKey(d.f6404a)) {
                                        str2 = String.valueOf(c10.E.get(d.f6404a));
                                    }
                                    efsJSONLog.put("wk_bd", com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(a10.f6400g.getBytes(), com.efs.sdk.net.b.a.a(str2 + ControllerCenter.getGlobalEnvStruct().getAppid() + ControllerCenter.getGlobalEnvStruct().getSecret()).getBytes())));
                                }
                                OkHttpListener.a(c10, a10, efsJSONLog);
                            }
                        }
                    });
                    a.a().d(this.f6363b);
                    a.a().b(this.f6363b);
                    return;
                }
                Log.d("NetTrace-Listener", "url is null.");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static EventListener.Factory get() {
        return new EventListener.Factory() { // from class: com.efs.sdk.net.OkHttpListener.1
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return new OkHttpListener();
            }
        };
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        super.callEnd(call);
        try {
            Log.d("NetTrace-Listener", "callEnd");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callEnd net enable false.");
                return;
            }
            a(d.f6405b);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        try {
            Log.d("NetTrace-Listener", "callFailed");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callFailed net enable false.");
                return;
            }
            a(d.f6406c);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        super.callStart(call);
        try {
            Log.d("NetTrace-Listener", "callStart");
            if (NetManager.getNetConfigManager() != null && NetManager.getNetConfigManager().enableTracer()) {
                this.f6364c = true;
            }
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            this.f6363b = String.valueOf(f6362a.getAndIncrement());
            Log.i("NetTrace-Listener", "requestId is" + this.f6363b);
            a(d.f6404a);
            String httpUrl = call.request().url().toString();
            d c10 = a.a().c(this.f6363b);
            if (c10 != null) {
                c10.B = httpUrl;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        try {
            Log.d("NetTrace-Listener", "connectEnd");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectEnd net enable false.");
                return;
            }
            a(d.f6412i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        try {
            Log.d("NetTrace-Listener", "connectFailed");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectFailed net enable false.");
                return;
            }
            a(d.f6413j);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        try {
            Log.d("NetTrace-Listener", "connectStart");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectStart net enable false.");
                return;
            }
            a(d.f6409f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        try {
            Log.d("NetTrace-Listener", "connectionAcquired");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            InetAddress inetAddress = connection.socket().getInetAddress();
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                d c10 = a.a().c(this.f6363b);
                if (c10 != null) {
                    c10.C = hostAddress;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        try {
            Log.d("NetTrace-Listener", "dnsEnd");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsEnd net enable false.");
                return;
            }
            a(d.f6408e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        try {
            Log.d("NetTrace-Listener", "dnsStart");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsStart net enable false.");
                return;
            }
            a(d.f6407d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j10) {
        super.requestBodyEnd(call, j10);
        try {
            Log.d("NetTrace-Listener", "requestBodyEnd");
            call.request().body();
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyEnd net enable false.");
                return;
            }
            a(d.f6417n);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        try {
            Log.d("NetTrace-Listener", "requestBodyStart");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyStart net enable false.");
                return;
            }
            a(d.f6416m);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        super.requestHeadersEnd(call, request);
        try {
            Log.d("NetTrace-Listener", "requestHeadersEnd");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersEnd net enable false.");
                return;
            }
            a(d.f6415l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        try {
            Log.d("NetTrace-Listener", "requestHeadersStart");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersStart net enable false.");
                return;
            }
            a(d.f6414k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j10) {
        super.responseBodyEnd(call, j10);
        try {
            Log.d("NetTrace-Listener", "responseBodyEnd");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyEnd net enable false.");
                return;
            }
            a(d.f6421r);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        try {
            Log.d("NetTrace-Listener", "responseBodyStart");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyStart net enable false.");
                return;
            }
            a(d.f6420q);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        try {
            Log.d("NetTrace-Listener", "responseHeadersEnd");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersEnd net enable false.");
                return;
            }
            a(d.f6419p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
        try {
            Log.d("NetTrace-Listener", "responseHeadersStart");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersStart net enable false.");
                return;
            }
            a(d.f6418o);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        try {
            Log.d("NetTrace-Listener", "secureConnectEnd");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectEnd net enable false.");
                return;
            }
            a(d.f6411h);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        try {
            Log.d("NetTrace-Listener", "secureConnectStart");
            if (!this.f6364c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectStart net enable false.");
                return;
            }
            a(d.f6410g);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a() {
        try {
            d c10 = a.a().c(this.f6363b);
            if (c10 != null) {
                Map<String, Long> map = c10.E;
                Map<String, Long> map2 = c10.F;
                map2.put(d.f6422s, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6404a, d.f6405b)));
                map2.put(d.f6423t, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6407d, d.f6408e)));
                map2.put(d.f6424u, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6410g, d.f6411h)));
                map2.put(d.f6425v, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6409f, d.f6412i)));
                map2.put(d.f6426w, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6414k, d.f6415l)));
                map2.put(d.f6427x, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6416m, d.f6417n)));
                map2.put(d.f6428y, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6418o, d.f6419p)));
                map2.put(d.f6429z, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6420q, d.f6421r)));
                b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(EfsJSONLog efsJSONLog) {
        try {
            EfsReporter reporter = NetManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                if (SamplingWhiteListUtil.isHitWL()) {
                    return;
                }
                Context context = ControllerCenter.getGlobalEnvStruct().mAppContext;
                SharedPreferences sharedPreferences = context.getSharedPreferences("net_launch" + ProcessUtil.getCurrentProcessName(), 0);
                String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(System.currentTimeMillis()));
                if (sharedPreferences != null) {
                    int i10 = sharedPreferences.getInt(format, 0);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (edit != null) {
                        edit.putInt(format, i10 + 1);
                        edit.apply();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static String a(Map<String, String> map, boolean z10, boolean z11) {
        try {
            StringBuilder sb = new StringBuilder();
            if (!SamplingWhiteListUtil.isHitWL()) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            sb.append("|");
            sb.append(NetManager.getNetConfigManager().getExtraRateFlag());
            if (map.size() == 0) {
                sb.append("|0");
            } else if (z10) {
                sb.append("|0");
            } else if (z11) {
                sb.append("|1");
            } else {
                sb.append("|0");
            }
            sb.append("|");
            sb.append(new JSONObject(map).toString());
            return com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(sb.toString().getBytes(), ControllerCenter.getGlobalEnvStruct().getSecret().getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
        if (java.util.regex.Pattern.matches(r12, r16.B) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f A[Catch: all -> 0x0189, TryCatch #2 {all -> 0x0189, blocks: (B:21:0x008d, B:24:0x0094, B:26:0x00a4, B:29:0x00ab, B:31:0x00b1, B:33:0x00bd, B:35:0x00c9, B:37:0x00d2, B:41:0x00e3, B:43:0x011a, B:48:0x012d, B:51:0x0137, B:64:0x015f, B:65:0x0174, B:56:0x0145, B:58:0x014f, B:42:0x0103, B:46:0x0125, B:66:0x0179), top: B:100:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.efs.sdk.net.a.d r16, com.efs.sdk.net.a.c r17, com.efs.sdk.base.protocol.record.EfsJSONLog r18) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.OkHttpListener.a(com.efs.sdk.net.a.d, com.efs.sdk.net.a.c, com.efs.sdk.base.protocol.record.EfsJSONLog):void");
    }
}
