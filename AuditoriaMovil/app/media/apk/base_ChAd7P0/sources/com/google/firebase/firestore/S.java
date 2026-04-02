package com.google.firebase.firestore;

import H4.e1;
import H4.p1;
import O0.C0244f;
import O0.C0245g;
import Q0.C0276m;
import a6.t0;
import a6.u0;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.AbstractC0852m;
import e.C0918D;
import e1.C0960z;
import io.flutter.plugins.firebase.auth.C1140c;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.firestore.C1162g;
import io.flutter.plugins.googlemaps.E0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import l4.C1422f;
import m1.InterfaceC1426A;
import n4.C1516b;
import n4.C1533t;
import n4.RunnableC1531q;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.apache.tika.pipes.pipesiterator.TotalCounter;
import org.apache.tika.utils.XMLReaderUtils;
import p4.C1683m;
import p4.RunnableC1680j;
import p4.RunnableC1682l;
import q5.C1712a;
import t4.C1819G;
import t4.C1820H;
import z0.AbstractActivityC2064y;
import z1.C2067b;
/* loaded from: classes.dex */
public final /* synthetic */ class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9782b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9783c;

    public /* synthetic */ S(int i7, Object obj, Object obj2) {
        this.f9781a = i7;
        this.f9782b = obj;
        this.f9783c = obj2;
    }

    private final void a() {
        C1162g c1162g = (C1162g) this.f9782b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f9783c;
        HashMap hashMap = C1162g.f11922Y;
        c1162g.getClass();
        try {
            HashMap hashMap2 = C1162g.f11922Y;
            synchronized (hashMap2) {
                for (Map.Entry entry : hashMap2.entrySet()) {
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) entry.getKey();
                    Tasks.await(firebaseFirestore.j());
                    C1162g.a(firebaseFirestore);
                }
            }
            c1162g.h();
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    private final void b() {
        Task a7;
        io.flutter.plugins.firebase.firestore.q qVar = (io.flutter.plugins.firebase.firestore.q) this.f9782b;
        C1154q c1154q = (C1154q) this.f9783c;
        try {
            R1.j jVar = C1162g.c(qVar).f9754k;
            synchronized (jVar) {
                jVar.n0();
                C1533t c1533t = (C1533t) jVar.f4683c;
                c1533t.e();
                a7 = c1533t.f14363d.a(new RunnableC1531q(c1533t, 2));
            }
            Tasks.await(a7);
            c1154q.d(null);
        } catch (Exception e7) {
            H4.W.H(c1154q, e7);
        }
    }

    private final void c() {
        Task a7;
        io.flutter.plugins.firebase.firestore.q qVar = (io.flutter.plugins.firebase.firestore.q) this.f9782b;
        C1154q c1154q = (C1154q) this.f9783c;
        try {
            R1.j jVar = C1162g.c(qVar).f9754k;
            synchronized (jVar) {
                jVar.n0();
                C1533t c1533t = (C1533t) jVar.f4683c;
                c1533t.e();
                a7 = c1533t.f14363d.a(new RunnableC1531q(c1533t, 1));
            }
            Tasks.await(a7);
            c1154q.d(null);
        } catch (Exception e7) {
            H4.W.H(c1154q, e7);
        }
    }

    private final void d() {
        C0276m c0276m = (C0276m) this.f9782b;
        C0244f c0244f = (C0244f) this.f9783c;
        c0276m.getClass();
        synchronized (c0244f) {
        }
        O0.E e7 = c0276m.f4297c;
        int i7 = K0.x.f2529a;
        O0.H h8 = e7.f3482a;
        P0.d dVar = h8.f3529m0;
        P0.a G2 = dVar.G((C0960z) dVar.f3909d.f);
        dVar.J(G2, 1020, new A.j(G2, c0244f, 20));
        h8.f3493G0 = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1426A sVar;
        t0 t0Var;
        boolean z7;
        int i7 = 1;
        boolean z8 = false;
        switch (this.f9781a) {
            case 0:
                ((T) this.f9782b).f9785b.f4425b.c((W) this.f9783c);
                return;
            case 1:
                B.a aVar = (B.a) this.f9782b;
                Object obj = this.f9783c;
                aVar.getClass();
                com.google.android.gms.common.internal.I.i(obj);
                synchronized (((com.google.firebase.storage.v) aVar.f225c).f9953a) {
                    ((HashMap) aVar.f226d).remove(obj);
                    ((ConcurrentLinkedQueue) aVar.f224b).remove(obj);
                    B4.c.f273c.a(obj);
                }
                return;
            case 2:
                d4.a aVar2 = (d4.a) this.f9782b;
                Process.setThreadPriority(aVar2.f10325c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f10326d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f9783c).run();
                return;
            case 3:
                Callable callable = (Callable) this.f9782b;
                d4.h hVar = (d4.h) ((A.c) this.f9783c).f4b;
                try {
                    hVar.j(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar.k(e7);
                    return;
                }
            case 4:
                Runnable runnable = (Runnable) this.f9783c;
                u0 u0Var = (u0) this.f9782b;
                Semaphore semaphore = (Semaphore) u0Var.f7215c;
                try {
                    runnable.run();
                    return;
                } finally {
                    semaphore.release();
                    u0Var.c();
                }
            case 5:
                AbstractActivityC2064y abstractActivityC2064y = (AbstractActivityC2064y) this.f9782b;
                int i8 = e.n.f10547m0;
                abstractActivityC2064y.f6028a.a(new e.h((C0918D) this.f9783c, abstractActivityC2064y));
                return;
            case 6:
                e1.M m7 = (e1.M) this.f9782b;
                C2067b c2067b = m7.f10686m0;
                InterfaceC1426A interfaceC1426A = (InterfaceC1426A) this.f9783c;
                if (c2067b == null) {
                    sVar = interfaceC1426A;
                } else {
                    sVar = new m1.s(-9223372036854775807L);
                }
                m7.f10693u0 = sVar;
                m7.f10694v0 = interfaceC1426A.l();
                if (!m7.f10663B0 && interfaceC1426A.l() == -9223372036854775807L) {
                    z8 = true;
                }
                m7.f10695w0 = z8;
                if (z8) {
                    i7 = 7;
                }
                m7.f10696x0 = i7;
                if (m7.q0) {
                    m7.f10670X.v(m7.f10694v0, interfaceC1426A.h(), m7.f10695w0);
                    return;
                } else {
                    m7.v();
                    return;
                }
            case 7:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f9783c;
                HashMap hashMap = C1140c.f11846Z;
                C1140c c1140c = (C1140c) this.f9782b;
                c1140c.getClass();
                try {
                    c1140c.b();
                    C1140c.f11846Z.clear();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e8) {
                    taskCompletionSource.setException(e8);
                    return;
                }
            case 8:
                io.flutter.plugins.firebase.firestore.q qVar = (io.flutter.plugins.firebase.firestore.q) this.f9782b;
                C1154q c1154q = (C1154q) this.f9783c;
                try {
                    Tasks.await(C1162g.c(qVar).a());
                    c1154q.d(null);
                    return;
                } catch (Exception e9) {
                    H4.W.H(c1154q, e9);
                    return;
                }
            case 9:
                b();
                return;
            case 10:
                Boolean bool = (Boolean) this.f9782b;
                C1154q c1154q2 = (C1154q) this.f9783c;
                HashMap hashMap2 = C1162g.f11922Y;
                try {
                    if (bool.booleanValue()) {
                        u4.q.f16015a = u4.p.DEBUG;
                    } else {
                        u4.q.f16015a = u4.p.WARN;
                    }
                    c1154q2.d(null);
                    return;
                } catch (Exception e10) {
                    H4.W.H(c1154q2, e10);
                    return;
                }
            case 11:
                a();
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                c();
                return;
            case 13:
                io.flutter.plugins.firebase.firestore.q qVar2 = (io.flutter.plugins.firebase.firestore.q) this.f9782b;
                C1154q c1154q3 = (C1154q) this.f9783c;
                try {
                    Tasks.await(C1162g.c(qVar2).l());
                    c1154q3.d(null);
                    return;
                } catch (Exception e11) {
                    H4.W.H(c1154q3, e11);
                    return;
                }
            case 14:
                io.flutter.plugins.firebase.firestore.q qVar3 = (io.flutter.plugins.firebase.firestore.q) this.f9782b;
                C1154q c1154q4 = (C1154q) this.f9783c;
                try {
                    FirebaseFirestore c8 = C1162g.c(qVar3);
                    Tasks.await(c8.j());
                    C1162g.a(c8);
                    c1154q4.d(null);
                    return;
                } catch (Exception e12) {
                    H4.W.H(c1154q4, e12);
                    return;
                }
            case 15:
                E0 e02 = (E0) this.f9782b;
                R1.j jVar = (R1.j) e02.f;
                String str = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.getTileOverlayTile" + ((String) t0Var.f7210c);
                new E.e((L5.f) ((t0) jVar.f4683c).f7209b, str, io.flutter.plugins.googlemaps.A.f12030d, null, 4).f0(new ArrayList(Arrays.asList((String) jVar.f4682b, (io.flutter.plugins.googlemaps.o0) this.f9783c, Long.valueOf(e02.f12050c))), new A4.d(str, 17, e02));
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C0276m c0276m = (C0276m) this.f9782b;
                c0276m.getClass();
                int i9 = K0.x.f2529a;
                O0.H h8 = c0276m.f4297c.f3482a;
                H0.e0 e0Var = (H0.e0) this.f9783c;
                h8.f3509W0 = e0Var;
                h8.f3523g0.e(25, new O0.D(e0Var));
                return;
            case 17:
                C0276m c0276m2 = (C0276m) this.f9782b;
                c0276m2.getClass();
                int i10 = K0.x.f2529a;
                O0.H h9 = c0276m2.f4297c.f3482a;
                h9.f3493G0 = (H0.r) this.f9783c;
                P0.d dVar = h9.f3529m0;
                dVar.J(dVar.I(), 1017, new P0.b(5));
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                d();
                return;
            case 19:
                n4.J j = ((C1533t) this.f9782b).f14367i;
                if (!j.f14292b.f3687b) {
                    u4.q.a("J", "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
                }
                int e13 = j.f14291a.f15268c.e();
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f9783c;
                if (e13 == -1) {
                    taskCompletionSource2.setResult(null);
                    return;
                }
                HashMap hashMap3 = j.j;
                if (!hashMap3.containsKey(Integer.valueOf(e13))) {
                    hashMap3.put(Integer.valueOf(e13), new ArrayList());
                }
                ((List) hashMap3.get(Integer.valueOf(e13))).add(taskCompletionSource2);
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C1683m c1683m = ((C1533t) this.f9782b).f14365g;
                c1683m.getClass();
                c1683m.f15266a.G("Configure indexes", new RunnableC1682l(c1683m, (ArrayList) this.f9783c, 1));
                return;
            case 21:
                ((HashSet) ((C1533t) this.f9782b).j.f922d).remove((InterfaceC0816s) this.f9783c);
                return;
            case 22:
                C1516b c1516b = (C1516b) this.f9783c;
                ((HashSet) ((C1533t) this.f9782b).j.f922d).add(c1516b);
                c1516b.a(null, null);
                return;
            case 23:
                C1533t c1533t = (C1533t) this.f9782b;
                if (c1533t.f14367i != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("SyncEngine not yet initialized", z7, new Object[0]);
                C1422f c1422f = (C1422f) this.f9783c;
                u4.q.a("FirestoreClient", "Credential changed. Current user: %s", c1422f.f13857a);
                n4.J j8 = c1533t.f14367i;
                boolean equals = j8.f14300l.equals(c1422f);
                j8.f14300l = c1422f;
                if (!equals) {
                    HashMap hashMap4 = j8.j;
                    for (Map.Entry entry : hashMap4.entrySet()) {
                        for (TaskCompletionSource taskCompletionSource3 : (List) entry.getValue()) {
                            taskCompletionSource3.setException(new J("'waitForPendingWrites' task is cancelled due to User change.", I.CANCELLED));
                        }
                    }
                    hashMap4.clear();
                    C1683m c1683m2 = j8.f14291a;
                    List j9 = c1683m2.f15268c.j();
                    c1683m2.c(c1422f);
                    RunnableC1680j runnableC1680j = new RunnableC1680j(c1683m2, 0);
                    H4.W w2 = c1683m2.f15266a;
                    w2.G("Start IndexManager", runnableC1680j);
                    w2.G("Start MutationQueue", new RunnableC1680j(c1683m2, 1));
                    List j10 = c1683m2.f15268c.j();
                    e4.e eVar = q4.h.f15356c;
                    for (List<r4.i> list : Arrays.asList(j9, j10)) {
                        for (r4.i iVar : list) {
                            for (r4.h hVar2 : iVar.f15502d) {
                                eVar = eVar.e(hVar2.f15496a);
                            }
                        }
                    }
                    j8.b(c1683m2.f.H(eVar), null);
                }
                O0.d0 d0Var = j8.f14292b;
                if (d0Var.f3687b) {
                    u4.q.a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
                    d0Var.f3687b = false;
                    d0Var.c();
                    ((androidx.camera.core.impl.X) d0Var.f3692h).d(n4.z.UNKNOWN);
                    ((C1820H) d0Var.j).b();
                    ((C1819G) d0Var.f3693i).b();
                    d0Var.e();
                    return;
                }
                return;
            case 24:
                ExternalParser.b((Process) this.f9782b, (InputStream) this.f9783c);
                return;
            case 25:
                AsyncProcessor.a((AsyncProcessor) this.f9782b, (TotalCounter) this.f9783c);
                return;
            case 26:
                ((C1683m) this.f9782b).j.q((m4.e) this.f9783c);
                return;
            case 27:
                ((C1683m) this.f9782b).f15268c.h((AbstractC0852m) this.f9783c);
                return;
            case 28:
                ((C1712a) this.f9782b).f15388b.a(this.f9783c);
                return;
            default:
                C1712a this$0 = (C1712a) this.f9782b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                this$0.f15388b.a(this.f9783c);
                return;
        }
    }

    public /* synthetic */ S(C0276m c0276m, H0.r rVar, C0245g c0245g) {
        this.f9781a = 17;
        this.f9782b = c0276m;
        this.f9783c = rVar;
    }
}
