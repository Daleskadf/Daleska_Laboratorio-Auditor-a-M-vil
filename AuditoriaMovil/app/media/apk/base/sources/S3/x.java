package s3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class x extends X2.a {
    public static final Parcelable.Creator<x> CREATOR = new C1770E(1);

    /* renamed from: a  reason: collision with root package name */
    public final float f15677a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15678b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15679c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15680d;

    /* renamed from: e  reason: collision with root package name */
    public final w f15681e;

    public x(float f, int i7, int i8, boolean z7, w wVar) {
        this.f15677a = f;
        this.f15678b = i7;
        this.f15679c = i8;
        this.f15680d = z7;
        this.f15681e = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 2, 4);
        parcel.writeFloat(this.f15677a);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15678b);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f15679c);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f15680d ? 1 : 0);
        m5.d.A(parcel, 6, this.f15681e, i7, false);
        m5.d.J(G2, parcel);
    }
}
