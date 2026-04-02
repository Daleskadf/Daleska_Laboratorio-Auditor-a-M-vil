package i6;

import a6.AbstractC0478g;
import a6.C0472a;
import a6.C0473b;
import a6.C0493w;
import a6.EnumC0477f;
import a6.N;
import a6.Q;
import a6.S;
import a6.o0;
import a6.r0;
import a6.s0;
import a6.t0;
import a6.u0;
import c6.q2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: i6.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132s extends Q {

    /* renamed from: n  reason: collision with root package name */
    public static final C0472a f11559n = new C0472a("addressTrackerKey");
    public final M0.o f;

    /* renamed from: g  reason: collision with root package name */
    public final u0 f11560g;

    /* renamed from: h  reason: collision with root package name */
    public final C1118e f11561h;

    /* renamed from: i  reason: collision with root package name */
    public final q2 f11562i;
    public final ScheduledExecutorService j;

    /* renamed from: k  reason: collision with root package name */
    public t0 f11563k;

    /* renamed from: l  reason: collision with root package name */
    public Long f11564l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC0478g f11565m;

    public C1132s(AbstractC0478g abstractC0478g) {
        q2 q2Var = q2.f8962b;
        AbstractC0478g h8 = abstractC0478g.h();
        this.f11565m = h8;
        this.f11561h = new C1118e(new C1117d(this, abstractC0478g));
        this.f = new M0.o();
        u0 j = abstractC0478g.j();
        G.i.j(j, "syncContext");
        this.f11560g = j;
        ScheduledExecutorService i7 = abstractC0478g.i();
        G.i.j(i7, "timeService");
        this.j = i7;
        this.f11562i = q2Var;
        h8.l(EnumC0477f.DEBUG, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((C0493w) it.next()).f7224a.size();
            if (i7 > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(M0.o oVar, int i7) {
        ArrayList arrayList = new ArrayList();
        for (C1124k c1124k : oVar.values()) {
            if (c1124k.c() >= i7) {
                arrayList.add(c1124k);
            }
        }
        return arrayList;
    }

    @Override // a6.Q
    public final o0 a(N n7) {
        Long valueOf;
        AbstractC0478g abstractC0478g = this.f11565m;
        abstractC0478g.m(EnumC0477f.DEBUG, "Received resolution result: {0}", n7);
        C1127n c1127n = (C1127n) n7.f7098c;
        ArrayList arrayList = new ArrayList();
        for (C0493w c0493w : n7.f7096a) {
            arrayList.addAll(c0493w.f7224a);
        }
        M0.o oVar = this.f;
        oVar.keySet().retainAll(arrayList);
        for (C1124k c1124k : ((HashMap) oVar.f3191b).values()) {
            c1124k.f11530a = c1127n;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it.next();
            HashMap hashMap = (HashMap) oVar.f3191b;
            if (!hashMap.containsKey(socketAddress)) {
                hashMap.put(socketAddress, new C1124k(c1127n));
            }
        }
        S s7 = c1127n.f11547g.f8872a;
        C1118e c1118e = this.f11561h;
        c1118e.i(s7);
        if (c1127n.f11546e == null && c1127n.f == null) {
            t0 t0Var = this.f11563k;
            if (t0Var != null) {
                t0Var.o();
                this.f11564l = null;
                for (C1124k c1124k2 : ((HashMap) oVar.f3191b).values()) {
                    if (c1124k2.d()) {
                        c1124k2.e();
                    }
                    c1124k2.f11534e = 0;
                }
            }
        } else {
            Long l8 = this.f11564l;
            Long l9 = c1127n.f11542a;
            if (l8 == null) {
                valueOf = l9;
            } else {
                valueOf = Long.valueOf(Math.max(0L, l9.longValue() - (this.f11562i.c() - this.f11564l.longValue())));
            }
            t0 t0Var2 = this.f11563k;
            if (t0Var2 != null) {
                t0Var2.o();
                for (C1124k c1124k3 : ((HashMap) oVar.f3191b).values()) {
                    t0 t0Var3 = c1124k3.f11531b;
                    ((AtomicLong) t0Var3.f7209b).set(0L);
                    ((AtomicLong) t0Var3.f7210c).set(0L);
                    t0 t0Var4 = c1124k3.f11532c;
                    ((AtomicLong) t0Var4.f7209b).set(0L);
                    ((AtomicLong) t0Var4.f7210c).set(0L);
                }
            }
            H2.a aVar = new H2.a(this, c1127n, abstractC0478g, 10);
            long longValue = valueOf.longValue();
            long longValue2 = l9.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            u0 u0Var = this.f11560g;
            u0Var.getClass();
            s0 s0Var = new s0(aVar);
            this.f11563k = new t0(s0Var, this.j.scheduleWithFixedDelay(new r0(u0Var, s0Var, aVar, longValue2), longValue, longValue2, timeUnit));
        }
        C0473b c0473b = C0473b.f7115b;
        c1118e.d(new N(n7.f7096a, n7.f7097b, c1127n.f11547g.f8873b));
        return o0.f7173e;
    }

    @Override // a6.Q
    public final void c(o0 o0Var) {
        this.f11561h.c(o0Var);
    }

    @Override // a6.Q
    public final void f() {
        this.f11561h.f();
    }
}
