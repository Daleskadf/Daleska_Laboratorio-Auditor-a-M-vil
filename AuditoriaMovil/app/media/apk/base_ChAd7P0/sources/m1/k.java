package m1;
/* loaded from: classes.dex */
public class k implements InterfaceC1426A {

    /* renamed from: a  reason: collision with root package name */
    public final long f13964a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13965b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13966c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13967d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13968e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13969g;

    public k(long j, long j8, int i7, int i8, boolean z7) {
        this.f13964a = j;
        this.f13965b = j8;
        this.f13966c = i8 == -1 ? 1 : i8;
        this.f13968e = i7;
        this.f13969g = z7;
        if (j == -1) {
            this.f13967d = -1L;
            this.f = -9223372036854775807L;
            return;
        }
        long j9 = j - j8;
        this.f13967d = j9;
        this.f = (Math.max(0L, j9) * 8000000) / i7;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        if (this.f13967d == -1 && !this.f13969g) {
            return false;
        }
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        long j8 = this.f13967d;
        int i7 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
        long j9 = this.f13965b;
        if (i7 == 0 && !this.f13969g) {
            B b5 = new B(0L, j9);
            return new z(b5, b5);
        }
        int i8 = this.f13968e;
        long j10 = this.f13966c;
        long j11 = (((i8 * j) / 8000000) / j10) * j10;
        if (i7 != 0) {
            j11 = Math.min(j11, j8 - j10);
        }
        long max = Math.max(j11, 0L) + j9;
        long max2 = (Math.max(0L, max - j9) * 8000000) / i8;
        B b7 = new B(max2, max);
        if (i7 != 0 && max2 < j) {
            long j12 = max + j10;
            if (j12 < this.f13964a) {
                return new z(b7, new B((Math.max(0L, j12 - j9) * 8000000) / i8, j12));
            }
        }
        return new z(b7, b7);
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f;
    }
}
