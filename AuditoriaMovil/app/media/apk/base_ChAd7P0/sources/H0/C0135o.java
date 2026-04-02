package H0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import s3.C1772G;
/* renamed from: H0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135o implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0135o> CREATOR = new C1772G(22);

    /* renamed from: a  reason: collision with root package name */
    public final C0134n[] f1827a;

    /* renamed from: b  reason: collision with root package name */
    public int f1828b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1829c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1830d;

    public C0135o(String str, ArrayList arrayList) {
        this(str, false, (C0134n[]) arrayList.toArray(new C0134n[0]));
    }

    public final C0135o a(String str) {
        if (K0.x.a(this.f1829c, str)) {
            return this;
        }
        return new C0135o(str, false, this.f1827a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0134n c0134n = (C0134n) obj;
        C0134n c0134n2 = (C0134n) obj2;
        UUID uuid = AbstractC0128h.f1800a;
        if (uuid.equals(c0134n.f1823b)) {
            if (uuid.equals(c0134n2.f1823b)) {
                return 0;
            }
            return 1;
        }
        return c0134n.f1823b.compareTo(c0134n2.f1823b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0135o.class != obj.getClass()) {
            return false;
        }
        C0135o c0135o = (C0135o) obj;
        if (K0.x.a(this.f1829c, c0135o.f1829c) && Arrays.equals(this.f1827a, c0135o.f1827a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1828b == 0) {
            String str = this.f1829c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f1828b = (hashCode * 31) + Arrays.hashCode(this.f1827a);
        }
        return this.f1828b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f1829c);
        parcel.writeTypedArray(this.f1827a, 0);
    }

    public C0135o(C0134n... c0134nArr) {
        this(null, true, c0134nArr);
    }

    public C0135o(String str, boolean z7, C0134n... c0134nArr) {
        this.f1829c = str;
        c0134nArr = z7 ? (C0134n[]) c0134nArr.clone() : c0134nArr;
        this.f1827a = c0134nArr;
        this.f1830d = c0134nArr.length;
        Arrays.sort(c0134nArr, this);
    }

    public C0135o(Parcel parcel) {
        this.f1829c = parcel.readString();
        C0134n[] c0134nArr = (C0134n[]) parcel.createTypedArray(C0134n.CREATOR);
        int i7 = K0.x.f2529a;
        this.f1827a = c0134nArr;
        this.f1830d = c0134nArr.length;
    }
}
