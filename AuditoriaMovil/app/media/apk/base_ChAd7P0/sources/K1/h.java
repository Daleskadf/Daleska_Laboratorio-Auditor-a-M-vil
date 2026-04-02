package K1;
/* loaded from: classes.dex */
public final class h extends J1.i implements Comparable {

    /* renamed from: f0  reason: collision with root package name */
    public long f2620f0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (c(4) != hVar.c(4)) {
            if (!c(4)) {
                return -1;
            }
        } else {
            long j = this.f3345X - hVar.f3345X;
            if (j == 0) {
                j = this.f2620f0 - hVar.f2620f0;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        }
        return 1;
    }
}
