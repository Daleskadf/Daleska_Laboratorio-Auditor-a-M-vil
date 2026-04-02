package f1;

import H0.r;
/* loaded from: classes.dex */
public abstract class l extends AbstractC0983e {

    /* renamed from: e0  reason: collision with root package name */
    public final long f11044e0;

    public l(M0.h hVar, M0.l lVar, r rVar, int i7, Object obj, long j, long j8, long j9) {
        super(hVar, lVar, 1, rVar, i7, obj, j, j8);
        rVar.getClass();
        this.f11044e0 = j9;
    }

    public long a() {
        long j = this.f11044e0;
        if (j == -1) {
            return -1L;
        }
        return 1 + j;
    }

    public abstract boolean c();
}
