package m1;

import a6.t0;
/* loaded from: classes.dex */
public class s implements InterfaceC1426A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13984a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13985b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13986c;

    public /* synthetic */ s(Object obj, long j, int i7) {
        this.f13984a = i7;
        this.f13986c = obj;
        this.f13985b = j;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        switch (this.f13984a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        long j8;
        switch (this.f13984a) {
            case 0:
                t tVar = (t) this.f13986c;
                K0.a.k(tVar.f13995k);
                t0 t0Var = tVar.f13995k;
                long[] jArr = (long[]) t0Var.f7209b;
                int f = K0.x.f(jArr, K0.x.k((tVar.f13991e * j) / 1000000, 0L, tVar.j - 1), false);
                long j9 = 0;
                if (f == -1) {
                    j8 = 0;
                } else {
                    j8 = jArr[f];
                }
                long[] jArr2 = (long[]) t0Var.f7210c;
                if (f != -1) {
                    j9 = jArr2[f];
                }
                int i7 = tVar.f13991e;
                long j10 = (j8 * 1000000) / i7;
                long j11 = this.f13985b;
                B b5 = new B(j10, j9 + j11);
                if (j10 != j && f != jArr.length - 1) {
                    int i8 = f + 1;
                    return new z(b5, new B((jArr[i8] * 1000000) / i7, j11 + jArr2[i8]));
                }
                return new z(b5, b5);
            case 1:
                return (z) this.f13986c;
            default:
                o1.b bVar = (o1.b) this.f13986c;
                z b7 = bVar.f14525i[0].b(j);
                int i9 = 1;
                while (true) {
                    o1.e[] eVarArr = bVar.f14525i;
                    if (i9 < eVarArr.length) {
                        z b8 = eVarArr[i9].b(j);
                        if (b8.f14019a.f13885b < b7.f14019a.f13885b) {
                            b7 = b8;
                        }
                        i9++;
                    } else {
                        return b7;
                    }
                }
        }
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        switch (this.f13984a) {
            case 0:
                return ((t) this.f13986c).b();
            case 1:
                return this.f13985b;
            default:
                return this.f13985b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(long j) {
        this(j, 0L);
        this.f13984a = 1;
    }

    public s(long j, long j8) {
        this.f13984a = 1;
        this.f13985b = j;
        B b5 = j8 == 0 ? B.f13883c : new B(0L, j8);
        this.f13986c = new z(b5, b5);
    }
}
