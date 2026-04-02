package com.efs.sdk.memoryinfo;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
/* loaded from: classes.dex */
final class d implements UMMemoryMonitorApi {
    private boolean A;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6324u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6325v = true;

    /* renamed from: w  reason: collision with root package name */
    private b f6326w;

    /* renamed from: x  reason: collision with root package name */
    private WeakReference<Activity> f6327x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6328y;

    /* renamed from: z  reason: collision with root package name */
    private int f6329z;

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final String getCurrentActivity() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f6327x;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return "";
        }
        return activity.getClass().getName();
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final boolean isEnable() {
        b bVar;
        if (!this.f6325v || (bVar = this.f6326w) == null || !bVar.f6302b) {
            return false;
        }
        return true;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final boolean isForeground() {
        return this.f6328y;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityResumed(Activity activity) {
        if (!this.f6325v) {
            return;
        }
        this.f6327x = new WeakReference<>(activity);
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityStarted(Activity activity) {
        if (!this.f6325v || activity == null) {
            return;
        }
        if (this.A) {
            this.A = false;
            return;
        }
        int i10 = this.f6329z + 1;
        this.f6329z = i10;
        if (i10 == 1) {
            this.f6328y = true;
        }
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityStopped(Activity activity) {
        if (!this.f6325v || activity == null) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            this.A = true;
            return;
        }
        int i10 = this.f6329z - 1;
        this.f6329z = i10;
        if (i10 == 0) {
            this.f6328y = false;
        }
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void setEnable(boolean z10) {
        this.f6325v = z10;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void start(Context context, EfsReporter efsReporter) {
        if ((!this.f6325v && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) || this.f6324u) {
            return;
        }
        this.f6324u = true;
        final b bVar = new b(context, efsReporter);
        this.f6326w = bVar;
        bVar.f6301a.getAllSdkConfig(new String[]{"apm_memperf_sampling_rate", "apm_memperf_collect_interval", "apm_memperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.efs.sdk.memoryinfo.b.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                Object obj;
                boolean z10;
                Object obj2;
                Object obj3;
                try {
                    if (bVar.f6302b || (obj = map.get("apm_memperf_sampling_rate")) == null) {
                        return;
                    }
                    int parseInt = Integer.parseInt(obj.toString());
                    if (parseInt == 0 || (parseInt != 100 && !SamplingWhiteListUtil.isHitWL() && new Random().nextInt(100) > parseInt)) {
                        z10 = false;
                        if ((z10 && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) || (obj2 = map.get("apm_memperf_collect_interval")) == null || (obj3 = map.get("apm_memperf_collect_max_period_sec")) == null) {
                            return;
                        }
                        final int parseInt2 = Integer.parseInt(obj2.toString());
                        final int parseInt3 = Integer.parseInt(obj3.toString());
                        final HandlerThread handlerThread = new HandlerThread("mem-info");
                        handlerThread.start();
                        final Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.efs.sdk.memoryinfo.b.1.1
                            {
                                AnonymousClass1.this = this;
                            }

                            @Override // android.os.Handler
                            public final void handleMessage(Message message) {
                                super.handleMessage(message);
                                if (message.what == 1) {
                                    try {
                                        handlerThread.quit();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        };
                        handler.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.1.2
                            {
                                AnonymousClass1.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String uuid = UUID.randomUUID().toString();
                                    int myPid = Process.myPid();
                                    final String lowerCase = UMUtils.MD5(myPid + uuid).toLowerCase();
                                    final b bVar2 = bVar;
                                    final Handler handler2 = handler;
                                    final int i10 = parseInt2;
                                    final int i11 = parseInt3;
                                    final e eVar = new e(bVar2.mContext, bVar2.f6301a);
                                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                                    handler2.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (SystemClock.elapsedRealtime() - elapsedRealtime > i11 * 1000) {
                                                handler2.sendEmptyMessage(1);
                                                return;
                                            }
                                            try {
                                                b.a(bVar2, eVar, lowerCase);
                                            } catch (Throwable th) {
                                                f.a("collect ", th);
                                            }
                                            handler2.postDelayed(this, i10 * 1000);
                                        }
                                    });
                                } catch (Throwable unused) {
                                    handler.sendEmptyMessage(1);
                                }
                            }
                        });
                        bVar.f6302b = true;
                    }
                    z10 = true;
                    if (z10) {
                    }
                    final int parseInt22 = Integer.parseInt(obj2.toString());
                    final int parseInt32 = Integer.parseInt(obj3.toString());
                    final HandlerThread handlerThread2 = new HandlerThread("mem-info");
                    handlerThread2.start();
                    final Handler handler2 = new Handler(handlerThread2.getLooper()) { // from class: com.efs.sdk.memoryinfo.b.1.1
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // android.os.Handler
                        public final void handleMessage(Message message) {
                            super.handleMessage(message);
                            if (message.what == 1) {
                                try {
                                    handlerThread2.quit();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    };
                    handler2.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.1.2
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                String uuid = UUID.randomUUID().toString();
                                int myPid = Process.myPid();
                                final String lowerCase = UMUtils.MD5(myPid + uuid).toLowerCase();
                                final b bVar2 = bVar;
                                final Handler handler22 = handler2;
                                final int i10 = parseInt22;
                                final int i11 = parseInt32;
                                final e eVar = new e(bVar2.mContext, bVar2.f6301a);
                                final long elapsedRealtime = SystemClock.elapsedRealtime();
                                handler22.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (SystemClock.elapsedRealtime() - elapsedRealtime > i11 * 1000) {
                                            handler22.sendEmptyMessage(1);
                                            return;
                                        }
                                        try {
                                            b.a(bVar2, eVar, lowerCase);
                                        } catch (Throwable th) {
                                            f.a("collect ", th);
                                        }
                                        handler22.postDelayed(this, i10 * 1000);
                                    }
                                });
                            } catch (Throwable unused) {
                                handler2.sendEmptyMessage(1);
                            }
                        }
                    });
                    bVar.f6302b = true;
                } catch (Throwable th) {
                    f.a("collect ", th);
                }
            }
        });
    }
}
