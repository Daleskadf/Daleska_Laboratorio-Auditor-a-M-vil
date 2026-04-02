package H0;

import D.AbstractC0055e;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import s3.C1772G;
/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new C1772G(24);

    /* renamed from: a  reason: collision with root package name */
    public final G[] f1692a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1693b;

    public H(G... gArr) {
        this(-9223372036854775807L, gArr);
    }

    public final H a(G... gArr) {
        if (gArr.length == 0) {
            return this;
        }
        int i7 = K0.x.f2529a;
        G[] gArr2 = this.f1692a;
        Object[] copyOf = Arrays.copyOf(gArr2, gArr2.length + gArr.length);
        System.arraycopy(gArr, 0, copyOf, gArr2.length, gArr.length);
        return new H(this.f1693b, (G[]) copyOf);
    }

    public final H d(H h8) {
        if (h8 == null) {
            return this;
        }
        return a(h8.f1692a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h8 = (H) obj;
        if (Arrays.equals(this.f1692a, h8.f1692a) && this.f1693b == h8.f1693b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0055e.l(this.f1693b) + (Arrays.hashCode(this.f1692a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f1692a));
        long j = this.f1693b;
        if (j == -9223372036854775807L) {
            str = StringUtils.EMPTY;
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        G[] gArr = this.f1692a;
        parcel.writeInt(gArr.length);
        for (G g3 : gArr) {
            parcel.writeParcelable(g3, 0);
        }
        parcel.writeLong(this.f1693b);
    }

    public H(long j, G... gArr) {
        this.f1693b = j;
        this.f1692a = gArr;
    }

    public H(List list) {
        this((G[]) list.toArray(new G[0]));
    }

    public H(Parcel parcel) {
        this.f1692a = new G[parcel.readInt()];
        int i7 = 0;
        while (true) {
            G[] gArr = this.f1692a;
            if (i7 < gArr.length) {
                gArr[i7] = (G) parcel.readParcelable(G.class.getClassLoader());
                i7++;
            } else {
                this.f1693b = parcel.readLong();
                return;
            }
        }
    }
}
