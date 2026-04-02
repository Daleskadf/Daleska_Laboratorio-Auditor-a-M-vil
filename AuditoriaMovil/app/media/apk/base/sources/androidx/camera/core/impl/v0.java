package androidx.camera.core.impl;
/* loaded from: classes.dex */
public final class v0 implements D.m0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f7675b;

    /* renamed from: c  reason: collision with root package name */
    public final D.m0 f7676c;

    public v0(long j, D.m0 m0Var) {
        boolean z7;
        if (j >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.a("Timeout must be non-negative.", z7);
        this.f7675b = j;
        this.f7676c = m0Var;
    }

    @Override // D.m0
    public final long a() {
        return this.f7675b;
    }

    @Override // D.m0
    public final D.l0 b(B2.c cVar) {
        D.l0 b5 = this.f7676c.b(cVar);
        long j = this.f7675b;
        if (j > 0) {
            if (cVar.f250b >= j - b5.f740a) {
                return D.l0.f738d;
            }
            return b5;
        }
        return b5;
    }
}
