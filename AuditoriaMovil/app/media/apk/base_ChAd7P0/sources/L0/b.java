package L0;

import H0.E;
import H0.G;
import H0.r;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class b implements G {
    public static final Parcelable.Creator<b> CREATOR = new C1772G(27);

    /* renamed from: a  reason: collision with root package name */
    public final float f2824a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2825b;

    public b(float f, float f4) {
        K0.a.d("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f4 >= -180.0f && f4 <= 180.0f);
        this.f2824a = f;
        this.f2825b = f4;
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final /* synthetic */ void c(E e7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2824a == bVar.f2824a && this.f2825b == bVar.f2825b) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        return Float.valueOf(this.f2825b).hashCode() + ((Float.valueOf(this.f2824a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f2824a + ", longitude=" + this.f2825b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f2824a);
        parcel.writeFloat(this.f2825b);
    }

    public b(Parcel parcel) {
        this.f2824a = parcel.readFloat();
        this.f2825b = parcel.readFloat();
    }
}
