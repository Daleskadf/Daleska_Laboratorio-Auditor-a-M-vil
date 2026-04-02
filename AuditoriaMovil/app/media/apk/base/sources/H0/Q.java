package H0;

import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class Q implements Comparable, Parcelable {
    public static final Parcelable.Creator<Q> CREATOR = new C1772G(25);

    /* renamed from: a  reason: collision with root package name */
    public final int f1713a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1714b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1715c;

    static {
        K0.x.H(0);
        K0.x.H(1);
        K0.x.H(2);
    }

    public Q() {
        this.f1713a = -1;
        this.f1714b = -1;
        this.f1715c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Q q2 = (Q) obj;
        int i7 = this.f1713a - q2.f1713a;
        if (i7 == 0) {
            int i8 = this.f1714b - q2.f1714b;
            if (i8 == 0) {
                return this.f1715c - q2.f1715c;
            }
            return i8;
        }
        return i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        Q q2 = (Q) obj;
        if (this.f1713a == q2.f1713a && this.f1714b == q2.f1714b && this.f1715c == q2.f1715c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1713a * 31) + this.f1714b) * 31) + this.f1715c;
    }

    public final String toString() {
        return this.f1713a + "." + this.f1714b + "." + this.f1715c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f1713a);
        parcel.writeInt(this.f1714b);
        parcel.writeInt(this.f1715c);
    }

    public Q(Parcel parcel) {
        this.f1713a = parcel.readInt();
        this.f1714b = parcel.readInt();
        this.f1715c = parcel.readInt();
    }
}
