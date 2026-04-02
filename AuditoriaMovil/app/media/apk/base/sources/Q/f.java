package Q;

import D.y0;
import androidx.camera.core.impl.AbstractC0517t;
import androidx.camera.core.impl.InterfaceC0518u;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.r;
import h3.AbstractC1079a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f implements InterfaceC0521x {

    /* renamed from: a  reason: collision with root package name */
    public final i f4116a;

    /* renamed from: b  reason: collision with root package name */
    public final j f4117b;

    /* renamed from: c  reason: collision with root package name */
    public final g f4118c;

    /* JADX WARN: Type inference failed for: r2v1, types: [B0.b, Q.i] */
    public f(InterfaceC0521x interfaceC0521x, g gVar, P0.b bVar) {
        this.f4118c = gVar;
        this.f4116a = new B0.b(interfaceC0521x.n());
        this.f4117b = new j(interfaceC0521x.m());
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x, D.InterfaceC0065o
    public final InterfaceC0519v a() {
        return m();
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final /* synthetic */ void b(boolean z7) {
    }

    @Override // D.x0
    public final void c(y0 y0Var) {
        AbstractC1079a.e();
        this.f4118c.c(y0Var);
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final boolean d() {
        if (((L) a()).b() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final void e(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final /* synthetic */ void f(C5.i iVar) {
    }

    @Override // D.x0
    public final void g(y0 y0Var) {
        AbstractC1079a.e();
        this.f4118c.g(y0Var);
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final void h(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // D.x0
    public final void i(y0 y0Var) {
        AbstractC1079a.e();
        this.f4118c.i(y0Var);
    }

    @Override // D.x0
    public final void j(y0 y0Var) {
        AbstractC1079a.e();
        this.f4118c.j(y0Var);
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final boolean k() {
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final /* synthetic */ void l(boolean z7) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final InterfaceC0519v m() {
        return this.f4117b;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final InterfaceC0518u n() {
        return this.f4116a;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final r o() {
        return AbstractC0517t.f7671a;
    }
}
