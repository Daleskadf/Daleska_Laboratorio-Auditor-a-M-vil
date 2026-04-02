package I2;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final L2.a f2175a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2176b;

    public b(L2.a aVar, HashMap hashMap) {
        this.f2175a = aVar;
        this.f2176b = hashMap;
    }

    public final long a(A2.d dVar, long j, int i7) {
        long j8;
        long o7 = j - this.f2175a.o();
        c cVar = (c) this.f2176b.get(dVar);
        long j9 = cVar.f2177a;
        int i8 = i7 - 1;
        if (j9 > 1) {
            j8 = j9;
        } else {
            j8 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i8) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j8 * i8))), o7), cVar.f2178b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2175a.equals(bVar.f2175a) && this.f2176b.equals(bVar.f2176b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2175a.hashCode() ^ 1000003) * 1000003) ^ this.f2176b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f2175a + ", values=" + this.f2176b + "}";
    }
}
