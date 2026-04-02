package H1;

import K0.x;
import m1.InterfaceC1426A;
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: X  reason: collision with root package name */
    public long f1920X;

    /* renamed from: Y  reason: collision with root package name */
    public long f1921Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f1922Z;

    /* renamed from: a  reason: collision with root package name */
    public final f f1923a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1924b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1925c;

    /* renamed from: d  reason: collision with root package name */
    public final i f1926d;

    /* renamed from: e  reason: collision with root package name */
    public int f1927e;

    /* renamed from: e0  reason: collision with root package name */
    public long f1928e0;
    public long f;

    /* renamed from: f0  reason: collision with root package name */
    public long f1929f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f1930g0;

    public b(i iVar, long j, long j8, long j9, long j10, boolean z7) {
        boolean z8;
        if (j >= 0 && j8 > j) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.e(z8);
        this.f1926d = iVar;
        this.f1924b = j;
        this.f1925c = j8;
        if (j9 != j8 - j && !z7) {
            this.f1927e = 0;
        } else {
            this.f = j10;
            this.f1927e = 4;
        }
        this.f1923a = new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // H1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(m1.l r25) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.b.a(m1.l):long");
    }

    @Override // H1.g
    public final InterfaceC1426A b() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // H1.g
    public final void f(long j) {
        this.f1921Y = x.k(j, 0L, this.f - 1);
        this.f1927e = 2;
        this.f1922Z = this.f1924b;
        this.f1928e0 = this.f1925c;
        this.f1929f0 = 0L;
        this.f1930g0 = this.f;
    }
}
