package w;

import D.AbstractC0059i;
import android.util.Range;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.y0;
import java.util.Set;
import java.util.UUID;
/* renamed from: w.Q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1907Q implements y0 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.camera.core.impl.W f16111a;

    public C1907Q() {
        androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
        b5.j(y0.f7685K, new Object());
        b5.j(androidx.camera.core.impl.O.f7574w, 34);
        b5.j(I.l.j, C1908S.class);
        b5.j(I.l.f2121i, C1908S.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.f16111a = b5;
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ int A() {
        return AbstractC0059i.f(this);
    }

    @Override // androidx.camera.core.impl.G
    public final Object G(C0501c c0501c) {
        return this.f16111a.G(c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public final Set H() {
        return this.f16111a.H();
    }

    @Override // androidx.camera.core.impl.y0
    public final o0 J() {
        return (o0) G(y0.f7683I);
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ int K() {
        return AbstractC0059i.h(this);
    }

    @Override // androidx.camera.core.impl.y0
    public final C1892B L() {
        return (C1892B) f0(y0.f7685K, null);
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ boolean O() {
        return AbstractC0059i.l(this);
    }

    @Override // androidx.camera.core.impl.y0
    public final o0 S() {
        return (o0) f0(y0.f7683I, null);
    }

    @Override // androidx.camera.core.impl.G
    public final Set U(C0501c c0501c) {
        return this.f16111a.U(c0501c);
    }

    @Override // I.l
    public final /* synthetic */ String X(String str) {
        return AbstractC0059i.j(this, str);
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ boolean Y() {
        return AbstractC0059i.m(this);
    }

    @Override // androidx.camera.core.impl.G
    public final androidx.camera.core.impl.F e0(C0501c c0501c) {
        return this.f16111a.e0(c0501c);
    }

    @Override // androidx.camera.core.impl.y0
    public final A0 f() {
        return A0.METERING_REPEATING;
    }

    @Override // androidx.camera.core.impl.G
    public final Object f0(C0501c c0501c, Object obj) {
        androidx.camera.core.impl.W w2 = this.f16111a;
        w2.getClass();
        try {
            return w2.G(c0501c);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ int g() {
        return AbstractC0059i.k(this);
    }

    @Override // androidx.camera.core.impl.G
    public final boolean h(C0501c c0501c) {
        return this.f16111a.f7596a.containsKey(c0501c);
    }

    @Override // androidx.camera.core.impl.O
    public final /* synthetic */ D.D l() {
        return AbstractC0059i.d(this);
    }

    @Override // androidx.camera.core.impl.G
    public final void m(A4.d dVar) {
        this.f16111a.m(dVar);
    }

    @Override // androidx.camera.core.impl.G
    public final Object n(C0501c c0501c, androidx.camera.core.impl.F f) {
        return this.f16111a.n(c0501c, f);
    }

    @Override // I.l
    public final /* synthetic */ String o() {
        return AbstractC0059i.i(this);
    }

    @Override // androidx.camera.core.impl.f0
    public final androidx.camera.core.impl.G u() {
        return this.f16111a;
    }

    @Override // androidx.camera.core.impl.y0
    public final Range v() {
        return (Range) f0(y0.f7688N, null);
    }

    @Override // androidx.camera.core.impl.O
    public final int x() {
        return ((Integer) G(androidx.camera.core.impl.O.f7574w)).intValue();
    }
}
