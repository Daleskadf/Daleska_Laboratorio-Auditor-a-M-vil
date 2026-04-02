package e1;

import A3.AbstractC0021t;
import A3.e0;
import H0.C0140u;
import H0.C0141v;
import H0.C0143x;
import H0.C0144y;
import f5.C0993a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class G extends AbstractC0945j {

    /* renamed from: m0  reason: collision with root package name */
    public static final H0.C f10632m0;

    /* renamed from: f0  reason: collision with root package name */
    public final AbstractC0936a[] f10633f0;

    /* renamed from: g0  reason: collision with root package name */
    public final H0.V[] f10634g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f10635h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C0993a f10636i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f10637j0;

    /* renamed from: k0  reason: collision with root package name */
    public long[][] f10638k0;

    /* renamed from: l0  reason: collision with root package name */
    public R0.a f10639l0;

    /* JADX WARN: Type inference failed for: r4v0, types: [H0.w, H0.v] */
    static {
        C0140u c0140u = new C0140u();
        A3.I i7 = A3.K.f98b;
        e0 e0Var = e0.f138e;
        Collections.emptyList();
        e0 e0Var2 = e0.f138e;
        C0143x c0143x = new C0143x();
        f10632m0 = new H0.C("MergingMediaSource", new C0141v(c0140u), null, new C0144y(c0143x), H0.F.f1669y, H0.A.f1640a);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [A3.t, java.lang.Object] */
    public G(AbstractC0936a... abstractC0936aArr) {
        C0993a c0993a = new C0993a(17);
        this.f10633f0 = abstractC0936aArr;
        this.f10636i0 = c0993a;
        this.f10635h0 = new ArrayList(Arrays.asList(abstractC0936aArr));
        this.f10637j0 = -1;
        this.f10634g0 = new H0.V[abstractC0936aArr.length];
        this.f10638k0 = new long[0];
        new HashMap();
        AbstractC0021t.e(8, "expectedKeys");
        new Object().a().o();
    }

    @Override // e1.AbstractC0936a
    public final InterfaceC0958x b(C0960z c0960z, i1.e eVar, long j) {
        AbstractC0936a[] abstractC0936aArr = this.f10633f0;
        int length = abstractC0936aArr.length;
        InterfaceC0958x[] interfaceC0958xArr = new InterfaceC0958x[length];
        H0.V[] vArr = this.f10634g0;
        int b5 = vArr[0].b(c0960z.f10852a);
        for (int i7 = 0; i7 < length; i7++) {
            interfaceC0958xArr[i7] = abstractC0936aArr[i7].b(c0960z.a(vArr[i7].l(b5)), eVar, j - this.f10638k0[b5][i7]);
        }
        return new F(this.f10636i0, this.f10638k0[b5], interfaceC0958xArr);
    }

    @Override // e1.AbstractC0936a
    public final H0.C h() {
        AbstractC0936a[] abstractC0936aArr = this.f10633f0;
        if (abstractC0936aArr.length > 0) {
            return abstractC0936aArr[0].h();
        }
        return f10632m0;
    }

    @Override // e1.AbstractC0945j, e1.AbstractC0936a
    public final void k() {
        R0.a aVar = this.f10639l0;
        if (aVar == null) {
            super.k();
            return;
        }
        throw aVar;
    }

    @Override // e1.AbstractC0936a
    public final void m(M0.C c8) {
        this.f10811e0 = c8;
        this.f10810Z = K0.x.n(null);
        int i7 = 0;
        while (true) {
            AbstractC0936a[] abstractC0936aArr = this.f10633f0;
            if (i7 < abstractC0936aArr.length) {
                z(Integer.valueOf(i7), abstractC0936aArr[i7]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        F f = (F) interfaceC0958x;
        int i7 = 0;
        while (true) {
            AbstractC0936a[] abstractC0936aArr = this.f10633f0;
            if (i7 < abstractC0936aArr.length) {
                AbstractC0936a abstractC0936a = abstractC0936aArr[i7];
                InterfaceC0958x interfaceC0958x2 = f.f10627a[i7];
                if (interfaceC0958x2 instanceof a0) {
                    interfaceC0958x2 = ((a0) interfaceC0958x2).f10776a;
                }
                abstractC0936a.o(interfaceC0958x2);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // e1.AbstractC0945j, e1.AbstractC0936a
    public final void q() {
        super.q();
        Arrays.fill(this.f10634g0, (Object) null);
        this.f10637j0 = -1;
        this.f10639l0 = null;
        ArrayList arrayList = this.f10635h0;
        arrayList.clear();
        Collections.addAll(arrayList, this.f10633f0);
    }

    @Override // e1.AbstractC0936a
    public final void t(H0.C c8) {
        this.f10633f0[0].t(c8);
    }

    @Override // e1.AbstractC0945j
    public final C0960z u(Object obj, C0960z c0960z) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return c0960z;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [R0.a, java.io.IOException] */
    @Override // e1.AbstractC0945j
    public final void x(Object obj, AbstractC0936a abstractC0936a, H0.V v6) {
        Integer num = (Integer) obj;
        if (this.f10639l0 == null) {
            if (this.f10637j0 == -1) {
                this.f10637j0 = v6.h();
            } else if (v6.h() != this.f10637j0) {
                this.f10639l0 = new IOException();
                return;
            }
            int length = this.f10638k0.length;
            H0.V[] vArr = this.f10634g0;
            if (length == 0) {
                this.f10638k0 = (long[][]) Array.newInstance(Long.TYPE, this.f10637j0, vArr.length);
            }
            ArrayList arrayList = this.f10635h0;
            arrayList.remove(abstractC0936a);
            vArr[num.intValue()] = v6;
            if (arrayList.isEmpty()) {
                n(vArr[0]);
            }
        }
    }
}
