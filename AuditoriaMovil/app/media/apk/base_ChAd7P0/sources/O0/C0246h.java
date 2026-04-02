package O0;
/* renamed from: O0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246h {

    /* renamed from: a  reason: collision with root package name */
    public final long f3746a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3747b;

    /* renamed from: c  reason: collision with root package name */
    public long f3748c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public long f3749d = -9223372036854775807L;
    public long f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f3751g = -9223372036854775807L;
    public float j = 0.97f;

    /* renamed from: i  reason: collision with root package name */
    public float f3753i = 1.03f;

    /* renamed from: k  reason: collision with root package name */
    public float f3754k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public long f3755l = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public long f3750e = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f3752h = -9223372036854775807L;

    /* renamed from: m  reason: collision with root package name */
    public long f3756m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public long f3757n = -9223372036854775807L;

    public C0246h(long j, long j8) {
        this.f3746a = j;
        this.f3747b = j8;
    }

    public final void a() {
        long j;
        long j8 = this.f3748c;
        if (j8 != -9223372036854775807L) {
            j = this.f3749d;
            if (j == -9223372036854775807L) {
                long j9 = this.f;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j = this.f3751g;
                if (j == -9223372036854775807L || j8 <= j) {
                    j = j8;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f3750e == j) {
            return;
        }
        this.f3750e = j;
        this.f3752h = j;
        this.f3756m = -9223372036854775807L;
        this.f3757n = -9223372036854775807L;
        this.f3755l = -9223372036854775807L;
    }
}
