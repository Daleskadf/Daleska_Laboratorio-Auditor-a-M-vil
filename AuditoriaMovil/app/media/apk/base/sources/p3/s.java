package p3;

import android.os.Parcel;
import android.os.Parcelable;
import n3.c0;
/* loaded from: classes.dex */
public final class s extends X2.a {
    public static final Parcelable.Creator<s> CREATOR = new c0(18);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15130a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15131b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15132c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15133d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15134e;
    public final boolean f;

    public s(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f15130a = z7;
        this.f15131b = z8;
        this.f15132c = z9;
        this.f15133d = z10;
        this.f15134e = z11;
        this.f = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f15130a ? 1 : 0);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15131b ? 1 : 0);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15132c ? 1 : 0);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f15133d ? 1 : 0);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f15134e ? 1 : 0);
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
