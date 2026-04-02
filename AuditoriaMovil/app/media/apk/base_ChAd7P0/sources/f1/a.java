package F1;

import m1.k;
/* loaded from: classes.dex */
public final class a extends k implements f {

    /* renamed from: h  reason: collision with root package name */
    public final int f1117h;

    /* renamed from: i  reason: collision with root package name */
    public final long f1118i;

    public a(long j, long j8, int i7, int i8, boolean z7) {
        super(j, j8, i7, i8, z7);
        this.f1117h = i7;
        this.f1118i = j == -1 ? -1L : j;
    }

    @Override // F1.f
    public final long b(long j) {
        return (Math.max(0L, j - this.f13965b) * 8000000) / this.f13968e;
    }

    @Override // F1.f
    public final long d() {
        return this.f1118i;
    }

    @Override // F1.f
    public final int k() {
        return this.f1117h;
    }
}
