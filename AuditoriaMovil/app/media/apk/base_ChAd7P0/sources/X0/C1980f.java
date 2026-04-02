package x0;
/* renamed from: x0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1980f {

    /* renamed from: a  reason: collision with root package name */
    public final long f16432a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16433b;

    public C1980f(long j, long j8) {
        if (j8 == 0) {
            this.f16432a = 0L;
            this.f16433b = 1L;
            return;
        }
        this.f16432a = j;
        this.f16433b = j8;
    }

    public final String toString() {
        return this.f16432a + "/" + this.f16433b;
    }
}
