package z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.C1770E;
/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new C1770E(29);

    /* renamed from: X  reason: collision with root package name */
    public ArrayList f16682X;

    /* renamed from: Y  reason: collision with root package name */
    public ArrayList f16683Y;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f16684a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f16685b;

    /* renamed from: c  reason: collision with root package name */
    public C2042b[] f16686c;

    /* renamed from: d  reason: collision with root package name */
    public int f16687d;

    /* renamed from: e  reason: collision with root package name */
    public String f16688e;
    public ArrayList f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f16684a);
        parcel.writeStringList(this.f16685b);
        parcel.writeTypedArray(this.f16686c, i7);
        parcel.writeInt(this.f16687d);
        parcel.writeString(this.f16688e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.f16682X);
        parcel.writeTypedList(this.f16683Y);
    }
}
