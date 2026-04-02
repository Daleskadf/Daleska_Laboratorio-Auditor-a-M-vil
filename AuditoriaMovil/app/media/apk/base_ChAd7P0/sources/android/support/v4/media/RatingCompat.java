package android.support.v4.media;

import W2.m;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new m(25);

    /* renamed from: a  reason: collision with root package name */
    public final int f7238a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7239b;

    public RatingCompat(float f, int i7) {
        this.f7238a = i7;
        this.f7239b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f7238a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f7238a);
        sb.append(" rating=");
        float f = this.f7239b;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f7238a);
        parcel.writeFloat(this.f7239b);
    }
}
