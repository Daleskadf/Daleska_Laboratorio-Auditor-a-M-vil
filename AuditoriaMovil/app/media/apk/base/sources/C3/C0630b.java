package c3;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* renamed from: c3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630b extends X2.a {
    public static final Parcelable.Creator<C0630b> CREATOR = new android.support.v4.media.session.b(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f8370a;

    /* renamed from: b  reason: collision with root package name */
    public final C0629a f8371b;

    public C0630b(int i7, C0629a c0629a) {
        this.f8370a = i7;
        this.f8371b = c0629a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f8370a);
        d.A(parcel, 2, this.f8371b, i7, false);
        d.J(G2, parcel);
    }

    public C0630b(C0629a c0629a) {
        this.f8370a = 1;
        this.f8371b = c0629a;
    }
}
