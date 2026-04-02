package n4;

import H4.W;
import O0.d0;
import a6.t0;
import android.content.Context;
import b3.C0585f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.C1418b;
import l4.C1419c;
import l4.C1421e;
import l4.C1422f;
import p.C1608t;
import p.Y0;
import p4.C1675e;
import p4.C1683m;
import p4.RunnableC1680j;
/* renamed from: n4.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533t {

    /* renamed from: a  reason: collision with root package name */
    public final K5.d f14360a;

    /* renamed from: b  reason: collision with root package name */
    public final C1421e f14361b;

    /* renamed from: c  reason: collision with root package name */
    public final C1419c f14362c;

    /* renamed from: d  reason: collision with root package name */
    public final u4.e f14363d;

    /* renamed from: e  reason: collision with root package name */
    public final t0 f14364e;
    public W f;

    /* renamed from: g  reason: collision with root package name */
    public C1683m f14365g;

    /* renamed from: h  reason: collision with root package name */
    public d0 f14366h;

    /* renamed from: i  reason: collision with root package name */
    public J f14367i;
    public E.e j;

    /* renamed from: k  reason: collision with root package name */
    public R1.j f14368k;

    /* renamed from: l  reason: collision with root package name */
    public p4.W f14369l;

    public C1533t(Context context, K5.d dVar, C1421e c1421e, C1419c c1419c, u4.e eVar, t4.j jVar, y yVar) {
        this.f14360a = dVar;
        this.f14361b = c1421e;
        this.f14362c = c1419c;
        this.f14363d = eVar;
        this.f14364e = new t0(new C1608t((q4.f) dVar.f2699c));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.a(new Q0.x(this, taskCompletionSource, context, yVar, jVar, 7));
        W3.a aVar = new W3.a(this, atomicBoolean, taskCompletionSource, eVar);
        synchronized (c1421e) {
            c1421e.f = aVar;
            aVar.a(c1421e.B());
        }
        c1419c.D(new C1418b(4));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [p.Y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [b4.e, java.lang.Object] */
    public final void a(Context context, C1422f c1422f, y yVar, t4.j jVar) {
        u4.q.a("FirestoreClient", "Initializing. user=%s", c1422f.f13857a);
        K5.d dVar = this.f14360a;
        C1421e c1421e = this.f14361b;
        C1419c c1419c = this.f14362c;
        u4.e eVar = this.f14363d;
        R1.j jVar2 = new R1.j(context, eVar, dVar, c1422f, c1421e, c1419c, jVar);
        F3.o oVar = yVar.f14375b;
        q4.f fVar = (q4.f) dVar.f2699c;
        oVar.f1179c = new C1608t(fVar);
        t4.k kVar = new t4.k(c1421e, c1419c);
        ?? obj = new Object();
        obj.f14761c = eVar;
        obj.f14759a = context;
        obj.f = dVar;
        obj.f14758X = kVar;
        obj.f14760b = Tasks.call(u4.k.f16006c, new org.apache.tika.pipes.async.b(obj, 1));
        oVar.f1178b = obj;
        Y0 y02 = (Y0) oVar.f1178b;
        m5.d.j(y02, "grpcCallProvider not initialized yet", new Object[0]);
        oVar.f1180d = new t4.p(eVar, c1421e, c1419c, fVar, jVar, y02);
        C1608t c1608t = (C1608t) oVar.f1179c;
        m5.d.j(c1608t, "remoteSerializer not initialized yet", new Object[0]);
        t4.p pVar = (t4.p) oVar.f1180d;
        m5.d.j(pVar, "firestoreChannel not initialized yet", new Object[0]);
        oVar.f1181e = new t4.i(eVar, c1608t, pVar);
        oVar.f = new E.e(context, 24);
        W c8 = yVar.c(jVar2);
        yVar.f14376c = c8;
        c8.K();
        W w2 = yVar.f14376c;
        m5.d.j(w2, "persistence not initialized yet", new Object[0]);
        ?? obj2 = new Object();
        obj2.f8247b = false;
        yVar.f14377d = new C1683m(w2, obj2, c1422f);
        C0585f c0585f = new C0585f(yVar, 12);
        C1683m d7 = yVar.d();
        t4.i iVar = (t4.i) oVar.f1181e;
        m5.d.j(iVar, "datastore not initialized yet", new Object[0]);
        E.e eVar2 = (E.e) oVar.f;
        m5.d.j(eVar2, "connectivityMonitor not initialized yet", new Object[0]);
        yVar.f = new d0(fVar, c0585f, d7, iVar, eVar, eVar2);
        C1683m d8 = yVar.d();
        d0 d0Var = yVar.f;
        m5.d.j(d0Var, "remoteStore not initialized yet", new Object[0]);
        yVar.f14378e = new J(d8, d0Var, c1422f);
        yVar.f14379g = new E.e(yVar.e());
        C1683m c1683m = yVar.f14377d;
        c1683m.f15266a.s().run();
        RunnableC1680j runnableC1680j = new RunnableC1680j(c1683m, 0);
        W w7 = c1683m.f15266a;
        w7.G("Start IndexManager", runnableC1680j);
        w7.G("Start MutationQueue", new RunnableC1680j(c1683m, 1));
        yVar.f.e();
        yVar.f14381i = yVar.a(jVar2);
        yVar.f14380h = yVar.b(jVar2);
        W w8 = yVar.f14376c;
        m5.d.j(w8, "persistence not initialized yet", new Object[0]);
        this.f = w8;
        this.f14369l = yVar.f14381i;
        this.f14365g = yVar.d();
        d0 d0Var2 = yVar.f;
        m5.d.j(d0Var2, "remoteStore not initialized yet", new Object[0]);
        this.f14366h = d0Var2;
        this.f14367i = yVar.e();
        E.e eVar3 = yVar.f14379g;
        m5.d.j(eVar3, "eventManager not initialized yet", new Object[0]);
        this.j = eVar3;
        C1675e c1675e = yVar.f14380h;
        p4.W w9 = this.f14369l;
        if (w9 != null) {
            w9.start();
        }
        if (c1675e != null) {
            R1.j jVar3 = c1675e.f15249a;
            this.f14368k = jVar3;
            jVar3.start();
        }
    }

    public final E b(D d7, C1523i c1523i, C1516b c1516b) {
        e();
        E e7 = new E(d7, c1523i, c1516b);
        this.f14363d.a(new RunnableC1532s(this, e7, 1));
        return e7;
    }

    public final void c(boolean z7) {
        e();
        this.f14363d.a(new C.d(this, z7, 2));
    }

    public final Task d() {
        Task a7;
        this.f14361b.E();
        this.f14362c.C();
        u4.e eVar = this.f14363d;
        RunnableC1531q runnableC1531q = new RunnableC1531q(this, 0);
        u4.c cVar = eVar.f15988a;
        synchronized (cVar) {
            if (cVar.b()) {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(null);
                a7 = taskCompletionSource.getTask();
            } else {
                a7 = cVar.a(new org.apache.tika.pipes.async.b(runnableC1531q, 3));
                cVar.f15985b = true;
            }
        }
        return a7;
    }

    public final void e() {
        if (!this.f14363d.f15988a.b()) {
            return;
        }
        throw new IllegalStateException("The client has already been terminated");
    }

    public final Task f(List list) {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14363d.a(new A.h(this, list, taskCompletionSource, 23));
        return taskCompletionSource.getTask();
    }
}
