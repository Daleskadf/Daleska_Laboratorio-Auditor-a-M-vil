package S0;

import java.util.List;
/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j8, long j9, long j10, List list, long j11, List list2, long j12, long j13) {
        super(jVar, j, j8, j9, j10, list, j11, j12, j13);
        this.j = list2;
    }

    @Override // S0.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // S0.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.f4897d));
    }

    @Override // S0.n
    public final boolean i() {
        return true;
    }
}
