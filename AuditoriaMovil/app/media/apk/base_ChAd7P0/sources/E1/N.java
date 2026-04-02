package e1;

import f5.C0993a;
/* loaded from: classes.dex */
public final class N implements InterfaceC0959y {

    /* renamed from: a  reason: collision with root package name */
    public final A.f f10699a;

    /* renamed from: b  reason: collision with root package name */
    public final X5.E f10700b;

    /* renamed from: c  reason: collision with root package name */
    public final F2.c f10701c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.firebase.firestore.Z f10702d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10703e;

    public N(A.f fVar, m1.m mVar) {
        X5.E e7 = new X5.E(mVar, 10);
        F2.c cVar = new F2.c();
        com.google.firebase.firestore.Z z7 = new com.google.firebase.firestore.Z(18);
        this.f10699a = fVar;
        this.f10700b = e7;
        this.f10701c = cVar;
        this.f10702d = z7;
        this.f10703e = 1048576;
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y a(boolean z7) {
        return this;
    }

    @Override // e1.InterfaceC0959y
    public final AbstractC0936a b(H0.C c8) {
        c8.f1642b.getClass();
        return new O(c8, this.f10699a, this.f10700b, this.f10701c.b(c8), this.f10702d, this.f10703e);
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y c(C0993a c0993a) {
        return this;
    }
}
