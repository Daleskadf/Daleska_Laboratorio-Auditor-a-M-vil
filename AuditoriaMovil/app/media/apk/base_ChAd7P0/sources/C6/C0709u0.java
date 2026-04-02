package c6;

import a6.AbstractC0482k;
import a6.C0476e;
/* renamed from: c6.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709u0 extends AbstractC0653b0 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0642C f9009a;

    /* renamed from: b  reason: collision with root package name */
    public final E.e f9010b;

    public C0709u0(InterfaceC0642C interfaceC0642C, E.e eVar) {
        this.f9009a = interfaceC0642C;
        this.f9010b = eVar;
    }

    @Override // c6.InterfaceC0720y
    public final InterfaceC0711v b(Q0.A a7, a6.e0 e0Var, C0476e c0476e, AbstractC0482k[] abstractC0482kArr) {
        return new C0706t0(this, this.f9009a.b(a7, e0Var, c0476e, abstractC0482kArr));
    }

    @Override // c6.AbstractC0653b0
    public final InterfaceC0642C g() {
        return this.f9009a;
    }
}
