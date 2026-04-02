package B1;

import H0.E;
import H0.G;
import H0.r;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class d implements G {
    public static final Parcelable.Creator<d> CREATOR = new C1772G(15);

    /* renamed from: a  reason: collision with root package name */
    public final float f239a;

    /* renamed from: b  reason: collision with root package name */
    public final int f240b;

    public d(float f, int i7) {
        this.f239a = f;
        this.f240b = i7;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f239a == dVar.f239a && this.f240b == dVar.f240b) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f239a).hashCode() + 527) * 31) + this.f240b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f239a + ", svcTemporalLayerCount=" + this.f240b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f239a);
        parcel.writeInt(this.f240b);
    }

    public d(Parcel parcel) {
        this.f239a = parcel.readFloat();
        this.f240b = parcel.readInt();
    }
}
