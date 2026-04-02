package Y1;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: Y1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411l implements Parcelable {
    public static final Parcelable.Creator<C0411l> CREATOR = new W2.m(2);

    /* renamed from: a  reason: collision with root package name */
    public int f6677a;

    /* renamed from: b  reason: collision with root package name */
    public int f6678b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6679c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6677a);
        parcel.writeInt(this.f6678b);
        parcel.writeInt(this.f6679c ? 1 : 0);
    }
}
