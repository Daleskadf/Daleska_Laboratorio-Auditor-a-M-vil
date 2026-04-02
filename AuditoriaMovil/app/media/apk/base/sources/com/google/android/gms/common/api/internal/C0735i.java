package com.google.android.gms.common.api.internal;

import H4.e1;
import H4.p1;
import a6.t0;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0764m;
import com.google.android.gms.common.internal.C0770t;
import com.google.android.gms.common.internal.C0772v;
import com.google.android.gms.common.internal.C0773w;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f3.AbstractC0989b;
import h3.AbstractC1079a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.google.android.gms.common.api.internal.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735i implements Handler.Callback {

    /* renamed from: k0  reason: collision with root package name */
    public static final Status f9248k0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: l0  reason: collision with root package name */
    public static final Status f9249l0 = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f9250m0 = new Object();

    /* renamed from: n0  reason: collision with root package name */
    public static C0735i f9251n0;

    /* renamed from: X  reason: collision with root package name */
    public final t0 f9252X;

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicInteger f9253Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicInteger f9254Z;

    /* renamed from: a  reason: collision with root package name */
    public long f9255a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9256b;

    /* renamed from: c  reason: collision with root package name */
    public com.google.android.gms.common.internal.x f9257c;

    /* renamed from: d  reason: collision with root package name */
    public Y2.b f9258d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f9259e;

    /* renamed from: e0  reason: collision with root package name */
    public final ConcurrentHashMap f9260e0;
    public final W2.e f;

    /* renamed from: f0  reason: collision with root package name */
    public E f9261f0;

    /* renamed from: g0  reason: collision with root package name */
    public final S.g f9262g0;

    /* renamed from: h0  reason: collision with root package name */
    public final S.g f9263h0;

    /* renamed from: i0  reason: collision with root package name */
    public final zau f9264i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile boolean f9265j0;

    public C0735i(Context context, Looper looper) {
        W2.e eVar = W2.e.f6170d;
        this.f9255a = 10000L;
        this.f9256b = false;
        boolean z7 = true;
        this.f9253Y = new AtomicInteger(1);
        this.f9254Z = new AtomicInteger(0);
        this.f9260e0 = new ConcurrentHashMap(5, 0.75f, 1);
        this.f9261f0 = null;
        this.f9262g0 = new S.g(0);
        this.f9263h0 = new S.g(0);
        this.f9265j0 = true;
        this.f9259e = context;
        zau zauVar = new zau(looper, this);
        this.f9264i0 = zauVar;
        this.f = eVar;
        this.f9252X = new t0(8);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0989b.f11056e == null) {
            AbstractC0989b.f11056e = Boolean.valueOf((Build.VERSION.SDK_INT < 26 || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z7);
        }
        if (AbstractC0989b.f11056e.booleanValue()) {
            this.f9265j0 = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f9250m0) {
            try {
                C0735i c0735i = f9251n0;
                if (c0735i != null) {
                    c0735i.f9254Z.incrementAndGet();
                    zau zauVar = c0735i.f9264i0;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C0728b c0728b, W2.b bVar) {
        return new Status(17, io.flutter.plugins.pathprovider.b.i("API: ", c0728b.f9226b.f9160c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f6161c, bVar);
    }

    public static C0735i h(Context context) {
        C0735i c0735i;
        synchronized (f9250m0) {
            try {
                if (f9251n0 == null) {
                    Looper looper = AbstractC0764m.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = W2.e.f6169c;
                    f9251n0 = new C0735i(applicationContext, looper);
                }
                c0735i = f9251n0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0735i;
    }

    public final void b(E e7) {
        synchronized (f9250m0) {
            try {
                if (this.f9261f0 != e7) {
                    this.f9261f0 = e7;
                    this.f9262g0.clear();
                }
                this.f9262g0.addAll(e7.f9172e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f9256b) {
            return false;
        }
        C0773w c0773w = (C0773w) C0772v.b().f9399a;
        if (c0773w != null && !c0773w.f9401b) {
            return false;
        }
        int i7 = ((SparseIntArray) this.f9252X.f7209b).get(203400000, -1);
        if (i7 != -1 && i7 != 0) {
            return false;
        }
        return true;
    }

    public final boolean d(W2.b bVar, int i7) {
        PendingIntent pendingIntent;
        boolean z7;
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent pendingIntent2;
        Boolean bool;
        W2.e eVar = this.f;
        Context context = this.f9259e;
        eVar.getClass();
        synchronized (AbstractC1079a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC1079a.f11332a;
            pendingIntent = null;
            if (context2 != null && (bool = AbstractC1079a.f11333b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC1079a.f11333b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC1079a.f11333b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC1079a.f11333b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC1079a.f11333b = Boolean.FALSE;
                }
            }
            AbstractC1079a.f11332a = applicationContext;
            booleanValue = AbstractC1079a.f11333b.booleanValue();
        }
        if (!booleanValue) {
            int i8 = bVar.f6160b;
            if (i8 == 0 || (pendingIntent2 = bVar.f6161c) == null) {
                Intent b5 = eVar.b(i8, context, null);
                if (b5 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b5, zzd.zza | 134217728);
                }
                pendingIntent2 = pendingIntent;
            }
            if (pendingIntent2 != null) {
                int i9 = bVar.f6160b;
                int i10 = GoogleApiActivity.f9145b;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent2);
                intent.putExtra("failing_client_id", i7);
                intent.putExtra("notify_manager", true);
                eVar.h(context, i9, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    public final G f(com.google.android.gms.common.api.l lVar) {
        ConcurrentHashMap concurrentHashMap = this.f9260e0;
        C0728b apiKey = lVar.getApiKey();
        G g3 = (G) concurrentHashMap.get(apiKey);
        if (g3 == null) {
            g3 = new G(this, lVar);
            concurrentHashMap.put(apiKey, g3);
        }
        if (g3.f9176b.requiresSignIn()) {
            this.f9263h0.add(apiKey);
        }
        g3.n();
        return g3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, com.google.android.gms.common.api.l r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L7d
            com.google.android.gms.common.api.internal.b r3 = r11.getApiKey()
            boolean r11 = r8.c()
            if (r11 != 0) goto Ld
            goto L4b
        Ld:
            com.google.android.gms.common.internal.v r11 = com.google.android.gms.common.internal.C0772v.b()
            java.lang.Object r11 = r11.f9399a
            com.google.android.gms.common.internal.w r11 = (com.google.android.gms.common.internal.C0773w) r11
            r0 = 1
            if (r11 == 0) goto L4d
            boolean r1 = r11.f9401b
            if (r1 == 0) goto L4b
            j$.util.concurrent.ConcurrentHashMap r1 = r8.f9260e0
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.common.api.internal.G r1 = (com.google.android.gms.common.api.internal.G) r1
            if (r1 == 0) goto L48
            com.google.android.gms.common.api.g r2 = r1.f9176b
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.AbstractC0757f
            if (r4 == 0) goto L4b
            com.google.android.gms.common.internal.f r2 = (com.google.android.gms.common.internal.AbstractC0757f) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L48
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L48
            com.google.android.gms.common.internal.j r11 = com.google.android.gms.common.api.internal.L.a(r1, r2, r10)
            if (r11 == 0) goto L4b
            int r2 = r1.f9184n
            int r2 = r2 + r0
            r1.f9184n = r2
            boolean r0 = r11.f9362c
            goto L4d
        L48:
            boolean r0 = r11.f9402c
            goto L4d
        L4b:
            r10 = 0
            goto L69
        L4d:
            com.google.android.gms.common.api.internal.L r11 = new com.google.android.gms.common.api.internal.L
            r1 = 0
            if (r0 == 0) goto L58
            long r4 = java.lang.System.currentTimeMillis()
            goto L59
        L58:
            r4 = r1
        L59:
            if (r0 == 0) goto L61
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L62
        L61:
            r6 = r1
        L62:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L69:
            if (r10 == 0) goto L7d
            com.google.android.gms.tasks.Task r9 = r9.getTask()
            com.google.android.gms.internal.base.zau r11 = r8.f9264i0
            r11.getClass()
            G.h r0 = new G.h
            r1 = 1
            r0.<init>(r11, r1)
            r9.addOnCompleteListener(r0, r10)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0735i.g(com.google.android.gms.tasks.TaskCompletionSource, int, com.google.android.gms.common.api.l):void");
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [com.google.android.gms.common.api.l, Y2.b] */
    /* JADX WARN: Type inference failed for: r0v79, types: [com.google.android.gms.common.api.l, Y2.b] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.gms.common.api.l, Y2.b] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        G g3;
        Status status;
        W2.d[] g4;
        int i7 = message.what;
        zau zauVar = this.f9264i0;
        ConcurrentHashMap concurrentHashMap = this.f9260e0;
        com.google.android.gms.common.internal.z zVar = com.google.android.gms.common.internal.z.f9407b;
        long j = 300000;
        switch (i7) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f9255a = j;
                zauVar.removeMessages(12);
                for (C0728b c0728b : concurrentHashMap.keySet()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, c0728b), this.f9255a);
                }
                break;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (G g8 : concurrentHashMap.values()) {
                    com.google.android.gms.common.internal.I.d(g8.f9185o.f9264i0);
                    g8.f9183m = null;
                    g8.n();
                }
                break;
            case 4:
            case 8:
            case 13:
                N n7 = (N) message.obj;
                G g9 = (G) concurrentHashMap.get(n7.f9200c.getApiKey());
                if (g9 == null) {
                    g9 = f(n7.f9200c);
                }
                boolean requiresSignIn = g9.f9176b.requiresSignIn();
                b0 b0Var = n7.f9198a;
                if (requiresSignIn && this.f9254Z.get() != n7.f9199b) {
                    b0Var.a(f9248k0);
                    g9.r();
                    break;
                } else {
                    g9.o(b0Var);
                    break;
                }
                break;
            case 5:
                int i8 = message.arg1;
                W2.b bVar = (W2.b) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        g3 = (G) it.next();
                        if (g3.f9180i == i8) {
                        }
                    } else {
                        g3 = null;
                    }
                }
                if (g3 != null) {
                    int i9 = bVar.f6160b;
                    if (i9 == 13) {
                        this.f.getClass();
                        AtomicBoolean atomicBoolean = W2.i.f6175a;
                        StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("Error resolution was canceled by the user, original error message: ", W2.b.k(i9), ": ");
                        m7.append(bVar.f6162d);
                        g3.d(new Status(17, m7.toString(), null, null));
                        break;
                    } else {
                        g3.d(e(g3.f9177c, bVar));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", io.flutter.plugins.pathprovider.b.f("Could not find API instance ", i8, " while trying to fail enqueued calls."), new Exception());
                    break;
                }
            case 6:
                Context context = this.f9259e;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0730d.b((Application) context.getApplicationContext());
                    ComponentCallbacks2C0730d componentCallbacks2C0730d = ComponentCallbacks2C0730d.f9232e;
                    componentCallbacks2C0730d.a(new X3.i(this));
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0730d.f9234b;
                    boolean z7 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C0730d.f9233a;
                    if (!z7) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f9255a = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                f((com.google.android.gms.common.api.l) message.obj);
                break;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    G g10 = (G) concurrentHashMap.get(message.obj);
                    com.google.android.gms.common.internal.I.d(g10.f9185o.f9264i0);
                    if (g10.f9181k) {
                        g10.n();
                        break;
                    }
                }
                break;
            case 10:
                S.g gVar = this.f9263h0;
                gVar.getClass();
                S.b bVar2 = new S.b(gVar);
                while (bVar2.hasNext()) {
                    G g11 = (G) concurrentHashMap.remove((C0728b) bVar2.next());
                    if (g11 != null) {
                        g11.r();
                    }
                }
                gVar.clear();
                break;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    G g12 = (G) concurrentHashMap.get(message.obj);
                    C0735i c0735i = g12.f9185o;
                    com.google.android.gms.common.internal.I.d(c0735i.f9264i0);
                    boolean z8 = g12.f9181k;
                    if (z8) {
                        if (z8) {
                            C0735i c0735i2 = g12.f9185o;
                            zau zauVar2 = c0735i2.f9264i0;
                            C0728b c0728b2 = g12.f9177c;
                            zauVar2.removeMessages(11, c0728b2);
                            c0735i2.f9264i0.removeMessages(9, c0728b2);
                            g12.f9181k = false;
                        }
                        if (c0735i.f.d(c0735i.f9259e, W2.f.f6171a) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null);
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.", null, null);
                        }
                        g12.d(status);
                        g12.f9176b.disconnect("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((G) concurrentHashMap.get(message.obj)).m(true);
                    break;
                }
                break;
            case 14:
                F f = (F) message.obj;
                C0728b c0728b3 = f.f9173a;
                boolean containsKey = concurrentHashMap.containsKey(c0728b3);
                TaskCompletionSource taskCompletionSource = f.f9174b;
                if (!containsKey) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    break;
                } else {
                    taskCompletionSource.setResult(Boolean.valueOf(((G) concurrentHashMap.get(c0728b3)).m(false)));
                    break;
                }
            case 15:
                H h8 = (H) message.obj;
                if (concurrentHashMap.containsKey(h8.f9186a)) {
                    G g13 = (G) concurrentHashMap.get(h8.f9186a);
                    if (g13.f9182l.contains(h8) && !g13.f9181k) {
                        if (!g13.f9176b.isConnected()) {
                            g13.n();
                            break;
                        } else {
                            g13.g();
                            break;
                        }
                    }
                }
                break;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                H h9 = (H) message.obj;
                if (concurrentHashMap.containsKey(h9.f9186a)) {
                    G g14 = (G) concurrentHashMap.get(h9.f9186a);
                    if (g14.f9182l.remove(h9)) {
                        C0735i c0735i3 = g14.f9185o;
                        c0735i3.f9264i0.removeMessages(15, h9);
                        c0735i3.f9264i0.removeMessages(16, h9);
                        LinkedList linkedList = g14.f9175a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it2 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            W2.d dVar = h9.f9187b;
                            if (hasNext) {
                                b0 b0Var2 = (b0) it2.next();
                                if ((b0Var2 instanceof K) && (g4 = ((K) b0Var2).g(g14)) != null) {
                                    int length = g4.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= length) {
                                            break;
                                        } else if (com.google.android.gms.common.internal.I.m(g4[i10], dVar)) {
                                            if (i10 >= 0) {
                                                arrayList.add(b0Var2);
                                            }
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    b0 b0Var3 = (b0) arrayList.get(i11);
                                    linkedList.remove(b0Var3);
                                    b0Var3.b(new com.google.android.gms.common.api.x(dVar));
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                com.google.android.gms.common.internal.x xVar = this.f9257c;
                if (xVar != null) {
                    if (xVar.f9405a > 0 || c()) {
                        if (this.f9258d == null) {
                            this.f9258d = new com.google.android.gms.common.api.l(this.f9259e, null, Y2.b.f6701a, zVar, com.google.android.gms.common.api.k.f9283c);
                        }
                        this.f9258d.c(xVar);
                    }
                    this.f9257c = null;
                    break;
                }
                break;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                M m8 = (M) message.obj;
                int i12 = (m8.f9196c > 0L ? 1 : (m8.f9196c == 0L ? 0 : -1));
                C0770t c0770t = m8.f9194a;
                int i13 = m8.f9195b;
                if (i12 == 0) {
                    com.google.android.gms.common.internal.x xVar2 = new com.google.android.gms.common.internal.x(i13, Arrays.asList(c0770t));
                    if (this.f9258d == null) {
                        this.f9258d = new com.google.android.gms.common.api.l(this.f9259e, null, Y2.b.f6701a, zVar, com.google.android.gms.common.api.k.f9283c);
                    }
                    this.f9258d.c(xVar2);
                    break;
                } else {
                    com.google.android.gms.common.internal.x xVar3 = this.f9257c;
                    if (xVar3 != null) {
                        List list = xVar3.f9406b;
                        if (xVar3.f9405a == i13 && (list == null || list.size() < m8.f9197d)) {
                            com.google.android.gms.common.internal.x xVar4 = this.f9257c;
                            if (xVar4.f9406b == null) {
                                xVar4.f9406b = new ArrayList();
                            }
                            xVar4.f9406b.add(c0770t);
                        } else {
                            zauVar.removeMessages(17);
                            com.google.android.gms.common.internal.x xVar5 = this.f9257c;
                            if (xVar5 != null) {
                                if (xVar5.f9405a > 0 || c()) {
                                    if (this.f9258d == null) {
                                        this.f9258d = new com.google.android.gms.common.api.l(this.f9259e, null, Y2.b.f6701a, zVar, com.google.android.gms.common.api.k.f9283c);
                                    }
                                    this.f9258d.c(xVar5);
                                }
                                this.f9257c = null;
                            }
                        }
                    }
                    if (this.f9257c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c0770t);
                        this.f9257c = new com.google.android.gms.common.internal.x(i13, arrayList2);
                        zauVar.sendMessageDelayed(zauVar.obtainMessage(17), m8.f9196c);
                        break;
                    }
                }
                break;
            case 19:
                this.f9256b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
        return true;
    }

    public final Task i(com.google.android.gms.common.api.l lVar, AbstractC0745t abstractC0745t, A a7, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(taskCompletionSource, abstractC0745t.f9275c, lVar);
        N n7 = new N(new Z(new O(abstractC0745t, a7, runnable), taskCompletionSource), this.f9254Z.get(), lVar);
        zau zauVar = this.f9264i0;
        zauVar.sendMessage(zauVar.obtainMessage(8, n7));
        return taskCompletionSource.getTask();
    }

    public final void j(W2.b bVar, int i7) {
        if (!d(bVar, i7)) {
            zau zauVar = this.f9264i0;
            zauVar.sendMessage(zauVar.obtainMessage(5, i7, 0, bVar));
        }
    }
}
