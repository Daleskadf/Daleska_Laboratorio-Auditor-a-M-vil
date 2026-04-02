package c6;

import D.AbstractC0055e;
import a6.AbstractC0478g;
import a6.C0473b;
import a6.C0487p;
import a6.C0493w;
import a6.EnumC0477f;
import a6.EnumC0486o;
import d6.C0912i;
import j$.util.DesugarCollections;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: c6.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721y0 implements a6.G {

    /* renamed from: a  reason: collision with root package name */
    public final a6.H f9035a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9036b;

    /* renamed from: c  reason: collision with root package name */
    public final q2 f9037c;

    /* renamed from: d  reason: collision with root package name */
    public final s2 f9038d;

    /* renamed from: e  reason: collision with root package name */
    public final C0679k f9039e;
    public final ScheduledExecutorService f;

    /* renamed from: g  reason: collision with root package name */
    public final a6.E f9040g;

    /* renamed from: h  reason: collision with root package name */
    public final E.e f9041h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC0478g f9042i;
    public final ArrayList j;

    /* renamed from: k  reason: collision with root package name */
    public final a6.u0 f9043k;

    /* renamed from: l  reason: collision with root package name */
    public final C0712v0 f9044l;

    /* renamed from: m  reason: collision with root package name */
    public volatile List f9045m;

    /* renamed from: n  reason: collision with root package name */
    public Y f9046n;

    /* renamed from: o  reason: collision with root package name */
    public final T1 f9047o;

    /* renamed from: p  reason: collision with root package name */
    public a6.t0 f9048p;

    /* renamed from: q  reason: collision with root package name */
    public a6.t0 f9049q;

    /* renamed from: r  reason: collision with root package name */
    public InterfaceC0672h1 f9050r;

    /* renamed from: u  reason: collision with root package name */
    public C0709u0 f9053u;

    /* renamed from: v  reason: collision with root package name */
    public volatile C0709u0 f9054v;

    /* renamed from: x  reason: collision with root package name */
    public a6.o0 f9056x;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f9051s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final C0695p0 f9052t = new C0695p0(this, 0);

    /* renamed from: w  reason: collision with root package name */
    public volatile C0487p f9055w = C0487p.a(EnumC0486o.IDLE);

    /* JADX WARN: Type inference failed for: r4v9, types: [c6.v0, java.lang.Object] */
    public C0721y0(List list, String str, q2 q2Var, C0679k c0679k, ScheduledExecutorService scheduledExecutorService, C0665f0 c0665f0, a6.u0 u0Var, s2 s2Var, a6.E e7, E.e eVar, C0694p c0694p, a6.H h8, AbstractC0478g abstractC0478g, ArrayList arrayList) {
        G.i.j(list, "addressGroups");
        G.i.f("addressGroups is empty", !list.isEmpty());
        for (Object obj : list) {
            G.i.j(obj, "addressGroups contains null entry");
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f9045m = unmodifiableList;
        ?? obj2 = new Object();
        obj2.f9015a = unmodifiableList;
        this.f9044l = obj2;
        this.f9036b = str;
        this.f9037c = q2Var;
        this.f9039e = c0679k;
        this.f = scheduledExecutorService;
        c0665f0.getClass();
        this.f9047o = new T1();
        this.f9043k = u0Var;
        this.f9038d = s2Var;
        this.f9040g = e7;
        this.f9041h = eVar;
        G.i.j(c0694p, "channelTracer");
        G.i.j(h8, "logId");
        this.f9035a = h8;
        G.i.j(abstractC0478g, "channelLogger");
        this.f9042i = abstractC0478g;
        this.j = arrayList;
    }

    public static void g(C0721y0 c0721y0, EnumC0486o enumC0486o) {
        c0721y0.f9043k.e();
        c0721y0.i(C0487p.a(enumC0486o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [c6.g1, java.lang.Object, D.d] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, c6.x0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [c6.z, java.lang.Object] */
    public static void h(C0721y0 c0721y0) {
        boolean z7;
        SocketAddress socketAddress;
        a6.B b5;
        a6.u0 u0Var = c0721y0.f9043k;
        u0Var.e();
        if (c0721y0.f9048p == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("Should have no reconnectTask scheduled", z7);
        C0712v0 c0712v0 = c0721y0.f9044l;
        if (c0712v0.f9016b == 0 && c0712v0.f9017c == 0) {
            T1 t1 = c0721y0.f9047o;
            t1.f8587b = false;
            t1.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((C0493w) c0712v0.f9015a.get(c0712v0.f9016b)).f7224a.get(c0712v0.f9017c);
        if (socketAddress2 instanceof a6.B) {
            b5 = (a6.B) socketAddress2;
            socketAddress = b5.f7066b;
        } else {
            socketAddress = socketAddress2;
            b5 = null;
        }
        C0473b c0473b = ((C0493w) c0712v0.f9015a.get(c0712v0.f9016b)).f7225b;
        String str = (String) c0473b.f7116a.get(C0493w.f7223d);
        ?? obj = new Object();
        obj.f9058a = "unknown-authority";
        obj.f9059b = C0473b.f7115b;
        if (str == null) {
            str = c0721y0.f9036b;
        }
        G.i.j(str, "authority");
        obj.f9058a = str;
        obj.f9059b = c0473b;
        obj.f9060c = b5;
        ?? obj2 = new Object();
        obj2.f9032d = c0721y0.f9035a;
        C0679k c0679k = c0721y0.f9039e;
        C0912i c0912i = c0679k.f8874a;
        if (!c0912i.f10394i0) {
            C0661e c0661e = c0912i.f10390e0;
            long j = c0661e.f8816b.get();
            d6.p pVar = new d6.p(c0912i, (InetSocketAddress) socketAddress, obj.f9058a, obj.f9059b, obj.f9060c, new G.c(new J2.e(c0661e, j, 5), 25));
            if (c0912i.f10384Z) {
                pVar.f10445G = true;
                pVar.f10446H = j;
                pVar.f10447I = c0912i.f10391f0;
            }
            C0709u0 c0709u0 = new C0709u0(new C0676j(c0679k, pVar, obj.f9058a), c0721y0.f9041h);
            obj2.f9032d = c0709u0.c();
            a6.G g3 = (a6.G) c0721y0.f9040g.f7077c.put(Long.valueOf(c0709u0.c().f7082c), c0709u0);
            c0721y0.f9053u = c0709u0;
            c0721y0.f9051s.add(c0709u0);
            ?? obj3 = new Object();
            obj3.f690c = c0721y0;
            obj3.f688a = false;
            obj3.f689b = c0709u0;
            Runnable e7 = c0709u0.e(obj3);
            if (e7 != null) {
                u0Var.b(e7);
            }
            c0721y0.f9042i.m(EnumC0477f.INFO, "Started transport {0}", obj2.f9032d);
            return;
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    public static String j(a6.o0 o0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(o0Var.f7183a);
        String str = o0Var.f7184b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        Throwable th = o0Var.f7185c;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // a6.G
    public final a6.H c() {
        return this.f9035a;
    }

    public final void i(C0487p c0487p) {
        boolean z7;
        this.f9043k.e();
        if (this.f9055w.f7186a != c0487p.f7186a) {
            if (this.f9055w.f7186a != EnumC0486o.SHUTDOWN) {
                z7 = true;
            } else {
                z7 = false;
            }
            G.i.o("Cannot transition out of SHUTDOWN to " + c0487p, z7);
            this.f9055w = c0487p;
            ((a6.P) this.f9038d.f8984b).a(c0487p);
        }
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.b("logId", this.f9035a.f7082c);
        C7.a(this.f9045m, "addressGroups");
        return C7.toString();
    }
}
