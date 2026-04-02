package Q2;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a extends X2.a {
    public static final Parcelable.Creator<a> CREATOR = new N2.f(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f4361a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4362b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4363c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4364d;

    public a(int i7, boolean z7, long j, boolean z8) {
        this.f4361a = i7;
        this.f4362b = z7;
        this.f4363c = j;
        this.f4364d = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f4361a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f4362b ? 1 : 0);
        m5.d.K(parcel, 3, 8);
        parcel.writeLong(this.f4363c);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f4364d ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
