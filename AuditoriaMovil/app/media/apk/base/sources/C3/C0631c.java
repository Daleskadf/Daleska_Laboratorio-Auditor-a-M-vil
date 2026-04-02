package c3;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* renamed from: c3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631c extends X2.a {
    public static final Parcelable.Creator<C0631c> CREATOR = new android.support.v4.media.session.b(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f8372a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8373b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8374c;

    public C0631c(int i7, String str, int i8) {
        this.f8372a = i7;
        this.f8373b = str;
        this.f8374c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f8372a);
        d.B(parcel, 2, this.f8373b, false);
        d.K(parcel, 3, 4);
        parcel.writeInt(this.f8374c);
        d.J(G2, parcel);
    }

    public C0631c(String str, int i7) {
        this.f8372a = 1;
        this.f8373b = str;
        this.f8374c = i7;
    }
}
