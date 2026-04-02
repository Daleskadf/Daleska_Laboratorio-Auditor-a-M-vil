package m1;
/* renamed from: m1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432f {

    /* renamed from: a  reason: collision with root package name */
    public final long f13948a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13949b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13950c;

    /* renamed from: d  reason: collision with root package name */
    public long f13951d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f13952e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f13953g;

    /* renamed from: h  reason: collision with root package name */
    public long f13954h;

    public C1432f(long j, long j8, long j9, long j10, long j11, long j12) {
        this.f13948a = j;
        this.f13949b = j8;
        this.f13952e = j9;
        this.f = j10;
        this.f13953g = j11;
        this.f13950c = j12;
        this.f13954h = a(j8, 0L, j9, j10, j11, j12);
    }

    public static long a(long j, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 < j11 && j8 + 1 < j9) {
            long j13 = ((float) (j - j8)) * (((float) (j11 - j10)) / ((float) (j9 - j8)));
            return K0.x.k(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
        }
        return j10;
    }
}
