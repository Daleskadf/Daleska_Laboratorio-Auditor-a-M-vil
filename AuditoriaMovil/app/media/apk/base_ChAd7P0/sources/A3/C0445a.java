package a3;

import W2.m;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* renamed from: a3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445a extends X2.a {
    public static final Parcelable.Creator<C0445a> CREATOR = new m(5);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6943a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6944b;

    public C0445a(int i7, boolean z7) {
        this.f6943a = z7;
        this.f6944b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f6943a ? 1 : 0);
        d.K(parcel, 2, 4);
        parcel.writeInt(this.f6944b);
        d.J(G2, parcel);
    }
}
