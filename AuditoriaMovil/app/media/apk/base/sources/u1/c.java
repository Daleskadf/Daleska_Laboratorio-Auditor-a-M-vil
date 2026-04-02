package u1;

import J2.e;
import m1.B;
import m1.InterfaceC1426A;
import m1.u;
import m1.z;
/* loaded from: classes.dex */
public final class c extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1426A f15969b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f15970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, InterfaceC1426A interfaceC1426A, InterfaceC1426A interfaceC1426A2) {
        super(interfaceC1426A);
        this.f15970c = eVar;
        this.f15969b = interfaceC1426A2;
    }

    @Override // m1.u, m1.InterfaceC1426A
    public final z j(long j) {
        z j8 = this.f15969b.j(j);
        B b5 = j8.f14019a;
        long j9 = b5.f13884a;
        long j10 = this.f15970c.f2402b;
        B b7 = new B(j9, b5.f13885b + j10);
        B b8 = j8.f14020b;
        return new z(b7, new B(b8.f13884a, b8.f13885b + j10));
    }
}
