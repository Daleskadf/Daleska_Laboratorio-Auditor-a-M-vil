package U3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f5765a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5766b;

    public p(int i7, long j) {
        b.a(i7, j);
        this.f5765a = j;
        this.f5766b = i7;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(p other) {
        int compareTo;
        kotlin.jvm.internal.j.e(other, "other");
        w6.l[] lVarArr = {n.f5763b, o.f5764b};
        for (int i7 = 0; i7 < 2; i7++) {
            w6.l lVar = lVarArr[i7];
            Comparable comparable = (Comparable) lVar.invoke(this);
            Comparable comparable2 = (Comparable) lVar.invoke(other);
            if (comparable == comparable2) {
                compareTo = 0;
            } else if (comparable == null) {
                compareTo = -1;
            } else if (comparable2 == null) {
                compareTo = 1;
            } else {
                compareTo = comparable.compareTo(comparable2);
            }
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof p) || compareTo((p) obj) != 0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f5765a;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.f5766b;
    }

    public final String toString() {
        return "Timestamp(seconds=" + this.f5765a + ", nanoseconds=" + this.f5766b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        dest.writeLong(this.f5765a);
        dest.writeInt(this.f5766b);
    }

    public p(Date date) {
        l6.d dVar;
        kotlin.jvm.internal.j.e(date, "date");
        long time = date.getTime();
        long j = (long) PipesIterator.DEFAULT_QUEUE_SIZE;
        long j8 = time / j;
        int time2 = (int) ((date.getTime() % j) * 1000000);
        if (time2 < 0) {
            dVar = new l6.d(Long.valueOf(j8 - 1), Integer.valueOf(time2 + 1000000000));
        } else {
            dVar = new l6.d(Long.valueOf(j8), Integer.valueOf(time2));
        }
        long longValue = ((Number) dVar.f13865a).longValue();
        int intValue = ((Number) dVar.f13866b).intValue();
        b.a(intValue, longValue);
        this.f5765a = longValue;
        this.f5766b = intValue;
    }
}
