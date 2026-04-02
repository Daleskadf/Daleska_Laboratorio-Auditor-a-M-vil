package c6;

import A3.AbstractC0021t;
import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0473b;
import a6.C0487p;
import a6.C0493w;
import a6.EnumC0486o;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: c6.w1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716w1 extends a6.Q {

    /* renamed from: o  reason: collision with root package name */
    public static final Logger f9024o = Logger.getLogger(C0716w1.class.getName());
    public final AbstractC0478g f;

    /* renamed from: h  reason: collision with root package name */
    public C0712v0 f9026h;

    /* renamed from: k  reason: collision with root package name */
    public a6.t0 f9028k;

    /* renamed from: l  reason: collision with root package name */
    public EnumC0486o f9029l;

    /* renamed from: m  reason: collision with root package name */
    public EnumC0486o f9030m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f9031n;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f9025g = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public int f9027i = 0;
    public boolean j = true;

    public C0716w1(AbstractC0478g abstractC0478g) {
        boolean z7 = false;
        EnumC0486o enumC0486o = EnumC0486o.IDLE;
        this.f9029l = enumC0486o;
        this.f9030m = enumC0486o;
        Logger logger = AbstractC0671h0.f8829a;
        String str = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        str = str == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : str;
        if (!H4.W.x(str) && Boolean.parseBoolean(str)) {
            z7 = true;
        }
        this.f9031n = z7;
        this.f = abstractC0478g;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [c6.v0, java.lang.Object] */
    @Override // a6.Q
    public final a6.o0 a(a6.N n7) {
        List emptyList;
        List emptyList2;
        EnumC0486o enumC0486o;
        List emptyList3;
        if (this.f9029l == EnumC0486o.SHUTDOWN) {
            return a6.o0.f7178l.g("Already shut down");
        }
        List<C0493w> list = n7.f7096a;
        boolean isEmpty = list.isEmpty();
        C0473b c0473b = n7.f7097b;
        if (isEmpty) {
            a6.o0 o0Var = a6.o0.f7180n;
            a6.o0 g3 = o0Var.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + c0473b);
            c(g3);
            return g3;
        }
        for (C0493w c0493w : list) {
            if (c0493w == null) {
                a6.o0 o0Var2 = a6.o0.f7180n;
                a6.o0 g4 = o0Var2.g("NameResolver returned address list with null endpoint. addrs=" + list + ", attrs=" + c0473b);
                c(g4);
                return g4;
            }
        }
        this.j = true;
        A3.H o7 = A3.K.o();
        o7.d(list);
        A3.e0 g8 = o7.g();
        C0712v0 c0712v0 = this.f9026h;
        if (c0712v0 == null) {
            ?? obj = new Object();
            if (g8 != null) {
                emptyList3 = g8;
            } else {
                emptyList3 = Collections.emptyList();
            }
            obj.f9015a = emptyList3;
            this.f9026h = obj;
        } else if (this.f9029l == EnumC0486o.READY) {
            SocketAddress a7 = c0712v0.a();
            C0712v0 c0712v02 = this.f9026h;
            if (g8 != null) {
                emptyList2 = g8;
            } else {
                c0712v02.getClass();
                emptyList2 = Collections.emptyList();
            }
            c0712v02.f9015a = emptyList2;
            c0712v02.f9016b = 0;
            c0712v02.f9017c = 0;
            if (this.f9026h.e(a7)) {
                return a6.o0.f7173e;
            }
            C0712v0 c0712v03 = this.f9026h;
            c0712v03.f9016b = 0;
            c0712v03.f9017c = 0;
        } else {
            if (g8 != null) {
                emptyList = g8;
            } else {
                emptyList = Collections.emptyList();
            }
            c0712v0.f9015a = emptyList;
            c0712v0.f9016b = 0;
            c0712v0.f9017c = 0;
        }
        HashMap hashMap = this.f9025g;
        HashSet hashSet = new HashSet(hashMap.keySet());
        HashSet hashSet2 = new HashSet();
        A3.I listIterator = g8.listIterator(0);
        while (listIterator.hasNext()) {
            hashSet2.addAll(((C0493w) listIterator.next()).f7224a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it.next();
            if (!hashSet2.contains(socketAddress)) {
                ((C0713v1) hashMap.remove(socketAddress)).f9018a.m();
            }
        }
        if (hashSet.size() != 0 && (enumC0486o = this.f9029l) != EnumC0486o.CONNECTING && enumC0486o != EnumC0486o.READY) {
            EnumC0486o enumC0486o2 = EnumC0486o.IDLE;
            if (enumC0486o == enumC0486o2) {
                i(enumC0486o2, new C0710u1(this, this));
            } else if (enumC0486o == EnumC0486o.TRANSIENT_FAILURE) {
                g();
                e();
            }
        } else {
            EnumC0486o enumC0486o3 = EnumC0486o.CONNECTING;
            this.f9029l = enumC0486o3;
            i(enumC0486o3, new C0707t1(a6.M.f7091e));
            g();
            e();
        }
        return a6.o0.f7173e;
    }

    @Override // a6.Q
    public final void c(a6.o0 o0Var) {
        HashMap hashMap = this.f9025g;
        for (C0713v1 c0713v1 : hashMap.values()) {
            c0713v1.f9018a.m();
        }
        hashMap.clear();
        i(EnumC0486o.TRANSIENT_FAILURE, new C0707t1(a6.M.a(o0Var)));
    }

    @Override // a6.Q
    public final void e() {
        AbstractC0471A abstractC0471A;
        C0712v0 c0712v0 = this.f9026h;
        if (c0712v0 != null && c0712v0.c() && this.f9029l != EnumC0486o.SHUTDOWN) {
            SocketAddress a7 = this.f9026h.a();
            HashMap hashMap = this.f9025g;
            boolean containsKey = hashMap.containsKey(a7);
            Logger logger = f9024o;
            if (containsKey) {
                abstractC0471A = ((C0713v1) hashMap.get(a7)).f9018a;
            } else {
                C0704s1 c0704s1 = new C0704s1(this);
                a6.L d7 = a6.L.d();
                d7.e(AbstractC0021t.p(new C0493w(a7)));
                d7.a(c0704s1);
                final AbstractC0471A g3 = this.f.g(d7.b());
                if (g3 != null) {
                    C0713v1 c0713v1 = new C0713v1(g3, EnumC0486o.IDLE, c0704s1);
                    c0704s1.f8980b = c0713v1;
                    hashMap.put(a7, c0713v1);
                    if (g3.c().f7116a.get(a6.Q.f7101d) == null) {
                        c0704s1.f8979a = C0487p.a(EnumC0486o.READY);
                    }
                    g3.o(new a6.P() { // from class: c6.q1
                        @Override // a6.P
                        public final void a(C0487p c0487p) {
                            AbstractC0471A abstractC0471A2;
                            int i7;
                            int i8;
                            C0716w1 c0716w1 = C0716w1.this;
                            c0716w1.getClass();
                            EnumC0486o enumC0486o = c0487p.f7186a;
                            HashMap hashMap2 = c0716w1.f9025g;
                            AbstractC0471A abstractC0471A3 = g3;
                            C0713v1 c0713v12 = (C0713v1) hashMap2.get((SocketAddress) abstractC0471A3.a().f7224a.get(0));
                            if (c0713v12 != null && (abstractC0471A2 = c0713v12.f9018a) == abstractC0471A3 && enumC0486o != EnumC0486o.SHUTDOWN) {
                                EnumC0486o enumC0486o2 = EnumC0486o.IDLE;
                                AbstractC0478g abstractC0478g = c0716w1.f;
                                if (enumC0486o == enumC0486o2) {
                                    abstractC0478g.q();
                                }
                                C0713v1.a(c0713v12, enumC0486o);
                                EnumC0486o enumC0486o3 = c0716w1.f9029l;
                                EnumC0486o enumC0486o4 = EnumC0486o.TRANSIENT_FAILURE;
                                if (enumC0486o3 == enumC0486o4 || c0716w1.f9030m == enumC0486o4) {
                                    if (enumC0486o != EnumC0486o.CONNECTING) {
                                        if (enumC0486o == enumC0486o2) {
                                            c0716w1.e();
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                int i9 = AbstractC0701r1.f8970a[enumC0486o.ordinal()];
                                if (i9 != 1) {
                                    if (i9 != 2) {
                                        if (i9 != 3) {
                                            if (i9 == 4) {
                                                if (c0716w1.f9026h.c() && ((C0713v1) hashMap2.get(c0716w1.f9026h.a())).f9018a == abstractC0471A3 && c0716w1.f9026h.b()) {
                                                    c0716w1.g();
                                                    c0716w1.e();
                                                }
                                                C0712v0 c0712v02 = c0716w1.f9026h;
                                                if (c0712v02 != null && !c0712v02.c()) {
                                                    int size = hashMap2.size();
                                                    List list = c0716w1.f9026h.f9015a;
                                                    if (list != null) {
                                                        i7 = list.size();
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    if (size >= i7) {
                                                        for (C0713v1 c0713v13 : hashMap2.values()) {
                                                            if (!c0713v13.f9021d) {
                                                                return;
                                                            }
                                                        }
                                                        EnumC0486o enumC0486o5 = EnumC0486o.TRANSIENT_FAILURE;
                                                        c0716w1.f9029l = enumC0486o5;
                                                        c0716w1.i(enumC0486o5, new C0707t1(a6.M.a(c0487p.f7187b)));
                                                        int i10 = c0716w1.f9027i + 1;
                                                        c0716w1.f9027i = i10;
                                                        List list2 = c0716w1.f9026h.f9015a;
                                                        if (list2 != null) {
                                                            i8 = list2.size();
                                                        } else {
                                                            i8 = 0;
                                                        }
                                                        if (i10 >= i8 || c0716w1.j) {
                                                            c0716w1.j = false;
                                                            c0716w1.f9027i = 0;
                                                            abstractC0478g.q();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            throw new IllegalArgumentException("Unsupported state:" + enumC0486o);
                                        }
                                        c0716w1.g();
                                        for (C0713v1 c0713v14 : hashMap2.values()) {
                                            if (!c0713v14.f9018a.equals(abstractC0471A2)) {
                                                c0713v14.f9018a.m();
                                            }
                                        }
                                        hashMap2.clear();
                                        EnumC0486o enumC0486o6 = EnumC0486o.READY;
                                        C0713v1.a(c0713v12, enumC0486o6);
                                        hashMap2.put((SocketAddress) abstractC0471A2.a().f7224a.get(0), c0713v12);
                                        c0716w1.f9026h.e((SocketAddress) abstractC0471A3.a().f7224a.get(0));
                                        c0716w1.f9029l = enumC0486o6;
                                        c0716w1.j(c0713v12);
                                        return;
                                    }
                                    EnumC0486o enumC0486o7 = EnumC0486o.CONNECTING;
                                    c0716w1.f9029l = enumC0486o7;
                                    c0716w1.i(enumC0486o7, new C0707t1(a6.M.f7091e));
                                    return;
                                }
                                C0712v0 c0712v03 = c0716w1.f9026h;
                                c0712v03.f9016b = 0;
                                c0712v03.f9017c = 0;
                                c0716w1.f9029l = enumC0486o2;
                                c0716w1.i(enumC0486o2, new C0710u1(c0716w1, c0716w1));
                            }
                        }
                    });
                    abstractC0471A = g3;
                } else {
                    logger.warning("Was not able to create subchannel for " + a7);
                    throw new IllegalStateException("Can't create subchannel");
                }
            }
            int i7 = AbstractC0701r1.f8970a[((C0713v1) hashMap.get(a7)).f9019b.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            this.f9026h.b();
                            e();
                            return;
                        }
                        return;
                    }
                    logger.warning("Requesting a connection even though we have a READY subchannel");
                    return;
                } else if (this.f9031n) {
                    h();
                    return;
                } else {
                    abstractC0471A.l();
                    return;
                }
            }
            abstractC0471A.l();
            C0713v1.a((C0713v1) hashMap.get(a7), EnumC0486o.CONNECTING);
            h();
        }
    }

    @Override // a6.Q
    public final void f() {
        Level level = Level.FINE;
        HashMap hashMap = this.f9025g;
        f9024o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(hashMap.size()));
        EnumC0486o enumC0486o = EnumC0486o.SHUTDOWN;
        this.f9029l = enumC0486o;
        this.f9030m = enumC0486o;
        g();
        for (C0713v1 c0713v1 : hashMap.values()) {
            c0713v1.f9018a.m();
        }
        hashMap.clear();
    }

    public final void g() {
        a6.t0 t0Var = this.f9028k;
        if (t0Var != null) {
            t0Var.o();
            this.f9028k = null;
        }
    }

    public final void h() {
        if (this.f9031n) {
            a6.t0 t0Var = this.f9028k;
            if (t0Var != null) {
                a6.s0 s0Var = (a6.s0) t0Var.f7209b;
                if (!s0Var.f7201c && !s0Var.f7200b) {
                    return;
                }
            }
            AbstractC0478g abstractC0478g = this.f;
            this.f9028k = abstractC0478g.j().d(new G.c(this, 16), 250L, TimeUnit.MILLISECONDS, abstractC0478g.i());
        }
    }

    public final void i(EnumC0486o enumC0486o, a6.O o7) {
        if (enumC0486o == this.f9030m && (enumC0486o == EnumC0486o.IDLE || enumC0486o == EnumC0486o.CONNECTING)) {
            return;
        }
        this.f9030m = enumC0486o;
        this.f.r(enumC0486o, o7);
    }

    public final void j(C0713v1 c0713v1) {
        EnumC0486o enumC0486o = c0713v1.f9019b;
        EnumC0486o enumC0486o2 = EnumC0486o.READY;
        if (enumC0486o != enumC0486o2) {
            return;
        }
        C0487p c0487p = c0713v1.f9020c.f8979a;
        EnumC0486o enumC0486o3 = c0487p.f7186a;
        if (enumC0486o3 == enumC0486o2) {
            i(enumC0486o2, new L0(a6.M.b(c0713v1.f9018a, null)));
            return;
        }
        EnumC0486o enumC0486o4 = EnumC0486o.TRANSIENT_FAILURE;
        if (enumC0486o3 == enumC0486o4) {
            i(enumC0486o4, new C0707t1(a6.M.a(c0487p.f7187b)));
        } else if (this.f9030m != enumC0486o4) {
            i(enumC0486o3, new C0707t1(a6.M.f7091e));
        }
    }
}
