package z0;

import android.os.Parcel;
import android.os.Parcelable;
import s3.C1770E;
/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new C1770E(28);

    /* renamed from: a  reason: collision with root package name */
    public String f16638a;

    /* renamed from: b  reason: collision with root package name */
    public int f16639b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16638a);
        parcel.writeInt(this.f16639b);
    }
}
