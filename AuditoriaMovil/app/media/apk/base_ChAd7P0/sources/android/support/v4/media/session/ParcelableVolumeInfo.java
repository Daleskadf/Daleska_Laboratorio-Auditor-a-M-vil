package android.support.v4.media.session;

import W2.m;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new m(29);

    /* renamed from: a  reason: collision with root package name */
    public int f7244a;

    /* renamed from: b  reason: collision with root package name */
    public int f7245b;

    /* renamed from: c  reason: collision with root package name */
    public int f7246c;

    /* renamed from: d  reason: collision with root package name */
    public int f7247d;

    /* renamed from: e  reason: collision with root package name */
    public int f7248e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f7244a);
        parcel.writeInt(this.f7246c);
        parcel.writeInt(this.f7247d);
        parcel.writeInt(this.f7248e);
        parcel.writeInt(this.f7245b);
    }
}
