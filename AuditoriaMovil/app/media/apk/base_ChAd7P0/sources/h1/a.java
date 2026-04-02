package H1;

import K0.x;
import java.math.BigInteger;
import m1.B;
import m1.InterfaceC1426A;
import m1.z;
/* loaded from: classes.dex */
public final class a implements InterfaceC1426A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f1919a;

    public a(b bVar) {
        this.f1919a = bVar;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        b bVar = this.f1919a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f1926d.f1957i * j) / 1000000);
        long j8 = bVar.f1925c;
        long j9 = bVar.f1924b;
        B b5 = new B(j, x.k((valueOf.multiply(BigInteger.valueOf(j8 - j9)).divide(BigInteger.valueOf(bVar.f)).longValue() + j9) - 30000, bVar.f1924b, j8 - 1));
        return new z(b5, b5);
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        b bVar = this.f1919a;
        return (bVar.f * 1000000) / bVar.f1926d.f1957i;
    }
}
