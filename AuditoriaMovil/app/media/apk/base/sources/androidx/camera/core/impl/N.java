package androidx.camera.core.impl;

import D.AbstractC0059i;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import w.C1892B;
/* loaded from: classes.dex */
public final class N implements y0, Q, I.h {

    /* renamed from: X  reason: collision with root package name */
    public static final C0501c f7565X;

    /* renamed from: Y  reason: collision with root package name */
    public static final C0501c f7566Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C0501c f7567Z;

    /* renamed from: b  reason: collision with root package name */
    public static final C0501c f7568b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0501c f7569c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0501c f7570d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0501c f7571e;

    /* renamed from: e0  reason: collision with root package name */
    public static final C0501c f7572e0;
    public static final C0501c f;

    /* renamed from: a  reason: collision with root package name */
    public final Z f7573a;

    static {
        Class cls = Integer.TYPE;
        f7568b = new C0501c("camerax.core.imageCapture.captureMode", cls, null);
        f7569c = new C0501c("camerax.core.imageCapture.flashMode", cls, null);
        f7570d = new C0501c("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f7571e = new C0501c("camerax.core.imageCapture.outputFormat", Integer.class, null);
        f = new C0501c("camerax.core.imageCapture.imageReaderProxyProvider", D.c0.class, null);
        f7565X = new C0501c("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        f7566Y = new C0501c("camerax.core.imageCapture.flashType", cls, null);
        f7567Z = new C0501c("camerax.core.imageCapture.screenFlash", I.i.class, null);
        f7572e0 = new C0501c("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public N(Z z7) {
        this.f7573a = z7;
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ int A() {
        return AbstractC0059i.f(this);
    }

    @Override // androidx.camera.core.impl.Q
    public final /* synthetic */ int F() {
        return P.c(this);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Object G(C0501c c0501c) {
        return AbstractC0059i.p(this, c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Set H() {
        return AbstractC0059i.n(this);
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

    @Override // androidx.camera.core.impl.Q
    public final /* synthetic */ ArrayList P() {
        return P.b(this);
    }

    @Override // androidx.camera.core.impl.Q
    public final P.b Q() {
        int i7 = P.f7576a;
        return (P.b) f0(Q.f7583G, null);
    }

    @Override // androidx.camera.core.impl.y0
    public final o0 S() {
        return (o0) f0(y0.f7683I, null);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Set U(C0501c c0501c) {
        return AbstractC0059i.g(this, c0501c);
    }

    @Override // androidx.camera.core.impl.Q
    public final Size V() {
        int i7 = P.f7576a;
        return (Size) f0(Q.f7581E, null);
    }

    @Override // I.l
    public final /* synthetic */ String X(String str) {
        return AbstractC0059i.j(this, str);
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ boolean Y() {
        return AbstractC0059i.m(this);
    }

    @Override // androidx.camera.core.impl.Q
    public final Size Z() {
        int i7 = P.f7576a;
        return (Size) f0(Q.f7580D, null);
    }

    @Override // androidx.camera.core.impl.Q
    public final /* synthetic */ int d() {
        return P.d(this);
    }

    @Override // androidx.camera.core.impl.Q
    public final /* synthetic */ int d0() {
        return P.a(this);
    }

    @Override // androidx.camera.core.impl.Q
    public final Size e() {
        int i7 = P.f7576a;
        return (Size) f0(Q.f7579C, null);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ F e0(C0501c c0501c) {
        return AbstractC0059i.e(this, c0501c);
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ A0 f() {
        return AbstractC0059i.c(this);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Object f0(C0501c c0501c, Object obj) {
        return AbstractC0059i.q(this, c0501c, obj);
    }

    @Override // androidx.camera.core.impl.y0
    public final /* synthetic */ int g() {
        return AbstractC0059i.k(this);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ boolean h(C0501c c0501c) {
        return AbstractC0059i.a(this, c0501c);
    }

    @Override // androidx.camera.core.impl.O
    public final /* synthetic */ D.D l() {
        return AbstractC0059i.d(this);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ void m(A4.d dVar) {
        AbstractC0059i.b(this, dVar);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Object n(C0501c c0501c, F f4) {
        return AbstractC0059i.r(this, c0501c, f4);
    }

    @Override // I.l
    public final /* synthetic */ String o() {
        return AbstractC0059i.i(this);
    }

    @Override // androidx.camera.core.impl.Q
    public final boolean p() {
        int i7 = P.f7576a;
        return h(Q.f7585y);
    }

    @Override // androidx.camera.core.impl.Q
    public final List q() {
        int i7 = P.f7576a;
        return (List) f0(Q.f7582F, null);
    }

    @Override // androidx.camera.core.impl.Q
    public final int s() {
        int i7 = P.f7576a;
        return ((Integer) G(Q.f7585y)).intValue();
    }

    @Override // androidx.camera.core.impl.Q
    public final P.b t() {
        int i7 = P.f7576a;
        return (P.b) G(Q.f7583G);
    }

    @Override // androidx.camera.core.impl.f0
    public final G u() {
        return this.f7573a;
    }

    @Override // androidx.camera.core.impl.y0
    public final Range v() {
        return (Range) f0(y0.f7688N, null);
    }

    @Override // androidx.camera.core.impl.O
    public final int x() {
        return ((Integer) AbstractC0059i.p(this, O.f7574w)).intValue();
    }
}
