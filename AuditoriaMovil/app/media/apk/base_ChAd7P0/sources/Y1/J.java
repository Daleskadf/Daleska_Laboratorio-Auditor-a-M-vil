package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new W2.m(4);

    /* renamed from: X  reason: collision with root package name */
    public ArrayList f6614X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f6615Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f6616Z;

    /* renamed from: a  reason: collision with root package name */
    public int f6617a;

    /* renamed from: b  reason: collision with root package name */
    public int f6618b;

    /* renamed from: c  reason: collision with root package name */
    public int f6619c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f6620d;

    /* renamed from: e  reason: collision with root package name */
    public int f6621e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6622e0;
    public int[] f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6617a);
        parcel.writeInt(this.f6618b);
        parcel.writeInt(this.f6619c);
        if (this.f6619c > 0) {
            parcel.writeIntArray(this.f6620d);
        }
        parcel.writeInt(this.f6621e);
        if (this.f6621e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.f6615Y ? 1 : 0);
        parcel.writeInt(this.f6616Z ? 1 : 0);
        parcel.writeInt(this.f6622e0 ? 1 : 0);
        parcel.writeList(this.f6614X);
    }
}
