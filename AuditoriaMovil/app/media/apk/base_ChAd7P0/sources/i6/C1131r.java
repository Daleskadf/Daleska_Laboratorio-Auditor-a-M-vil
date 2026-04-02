package i6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0472a;
import a6.C0473b;
import a6.C0487p;
import a6.C0493w;
import a6.EnumC0477f;
import a6.EnumC0486o;
import a6.L;
import a6.P;
import a6.o0;
import a6.t0;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: i6.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131r extends AbstractC1115b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0471A f11553a;

    /* renamed from: b  reason: collision with root package name */
    public C1124k f11554b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11555c;

    /* renamed from: d  reason: collision with root package name */
    public C0487p f11556d;

    /* renamed from: e  reason: collision with root package name */
    public P f11557e;
    public final AbstractC0478g f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C1132s f11558g;

    public C1131r(C1132s c1132s, L l8, C1121h c1121h) {
        this.f11558g = c1132s;
        P p7 = (P) l8.c();
        if (p7 != null) {
            this.f11557e = p7;
            C1119f c1119f = new C1119f(this, p7, 1);
            l8.getClass();
            L d7 = L.d();
            d7.e(l8.f7088b);
            C0473b c0473b = l8.f7089c;
            G.i.j(c0473b, "attrs");
            d7.f7089c = c0473b;
            Object[][] objArr = l8.f7090d;
            Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, objArr.length, 2);
            d7.f7090d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            d7.a(c1119f);
            this.f11553a = c1121h.g(d7.b());
        } else {
            this.f11553a = c1121h.g(l8);
        }
        this.f = this.f11553a.d();
    }

    @Override // a6.AbstractC0471A
    public final C0473b c() {
        C1124k c1124k = this.f11554b;
        AbstractC0471A abstractC0471A = this.f11553a;
        if (c1124k != null) {
            C0473b c8 = abstractC0471A.c();
            c8.getClass();
            C0472a c0472a = C1132s.f11559n;
            C1124k c1124k2 = this.f11554b;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(c0472a, c1124k2);
            for (Map.Entry entry : c8.f7116a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put((C0472a) entry.getKey(), entry.getValue());
                }
            }
            return new C0473b(identityHashMap);
        }
        return abstractC0471A.c();
    }

    @Override // i6.AbstractC1115b, a6.AbstractC0471A
    public final void m() {
        C1124k c1124k = this.f11554b;
        if (c1124k != null) {
            this.f11554b = null;
            c1124k.f.remove(this);
        }
        super.m();
    }

    @Override // a6.AbstractC0471A
    public final void o(P p7) {
        if (this.f11557e != null) {
            q().o(p7);
            return;
        }
        this.f11557e = p7;
        q().o(new C1119f(this, p7, 1));
    }

    @Override // i6.AbstractC1115b, a6.AbstractC0471A
    public final void p(List list) {
        boolean g3 = C1132s.g(b());
        C1132s c1132s = this.f11558g;
        if (g3 && C1132s.g(list)) {
            if (c1132s.f.containsValue(this.f11554b)) {
                C1124k c1124k = this.f11554b;
                c1124k.getClass();
                this.f11554b = null;
                c1124k.f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((C0493w) list.get(0)).f7224a.get(0);
            if (c1132s.f.containsKey(socketAddress)) {
                ((C1124k) c1132s.f.get(socketAddress)).a(this);
            }
        } else if (C1132s.g(b()) && !C1132s.g(list)) {
            if (c1132s.f.containsKey(a().f7224a.get(0))) {
                C1124k c1124k2 = (C1124k) c1132s.f.get(a().f7224a.get(0));
                c1124k2.getClass();
                this.f11554b = null;
                c1124k2.f.remove(this);
                t0 t0Var = c1124k2.f11531b;
                ((AtomicLong) t0Var.f7209b).set(0L);
                ((AtomicLong) t0Var.f7210c).set(0L);
                t0 t0Var2 = c1124k2.f11532c;
                ((AtomicLong) t0Var2.f7209b).set(0L);
                ((AtomicLong) t0Var2.f7210c).set(0L);
            }
        } else if (!C1132s.g(b()) && C1132s.g(list)) {
            SocketAddress socketAddress2 = (SocketAddress) ((C0493w) list.get(0)).f7224a.get(0);
            if (c1132s.f.containsKey(socketAddress2)) {
                ((C1124k) c1132s.f.get(socketAddress2)).a(this);
            }
        }
        this.f11553a.p(list);
    }

    @Override // i6.AbstractC1115b
    public final AbstractC0471A q() {
        return this.f11553a;
    }

    public final void r() {
        this.f11555c = true;
        P p7 = this.f11557e;
        o0 o0Var = o0.f7180n;
        G.i.f("The error status must not be OK", !o0Var.e());
        p7.a(new C0487p(EnumC0486o.TRANSIENT_FAILURE, o0Var));
        this.f.m(EnumC0477f.INFO, "Subchannel ejected: {0}", this);
    }

    @Override // i6.AbstractC1115b
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f11553a.b() + '}';
    }
}
