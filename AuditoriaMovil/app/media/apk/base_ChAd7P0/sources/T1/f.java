package T1;

import G1.i;
import K0.x;
import java.math.RoundingMode;
import m1.B;
import m1.InterfaceC1426A;
import m1.z;
/* loaded from: classes.dex */
public final class f implements InterfaceC1426A {

    /* renamed from: a  reason: collision with root package name */
    public final i f5320a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5321b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5322c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5323d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5324e;

    public f(i iVar, int i7, long j, long j8) {
        this.f5320a = iVar;
        this.f5321b = i7;
        this.f5322c = j;
        long j9 = (j8 - j) / iVar.f1377c;
        this.f5323d = j9;
        this.f5324e = a(j9);
    }

    public final long a(long j) {
        long j8 = j * this.f5321b;
        long j9 = this.f5320a.f1376b;
        int i7 = x.f2529a;
        return x.U(j8, 1000000L, j9, RoundingMode.FLOOR);
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        i iVar = this.f5320a;
        long j8 = (iVar.f1376b * j) / (this.f5321b * 1000000);
        long j9 = this.f5323d;
        long k2 = x.k(j8, 0L, j9 - 1);
        long j10 = this.f5322c;
        long a7 = a(k2);
        B b5 = new B(a7, (iVar.f1377c * k2) + j10);
        if (a7 < j && k2 != j9 - 1) {
            long j11 = k2 + 1;
            return new z(b5, new B(a(j11), (iVar.f1377c * j11) + j10));
        }
        return new z(b5, b5);
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f5324e;
    }
}
