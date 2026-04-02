package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* renamed from: s3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1783k extends X2.a {
    public static final Parcelable.Creator<C1783k> CREATOR = new C1770E(9);

    /* renamed from: X  reason: collision with root package name */
    public float f15609X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f15610Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f15611Z;

    /* renamed from: a  reason: collision with root package name */
    public C1774b f15612a;

    /* renamed from: b  reason: collision with root package name */
    public LatLng f15613b;

    /* renamed from: c  reason: collision with root package name */
    public float f15614c;

    /* renamed from: d  reason: collision with root package name */
    public float f15615d;

    /* renamed from: e  reason: collision with root package name */
    public LatLngBounds f15616e;

    /* renamed from: e0  reason: collision with root package name */
    public float f15617e0;
    public float f;

    /* renamed from: f0  reason: collision with root package name */
    public float f15618f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f15619g0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.v(parcel, 2, this.f15612a.f15590a.asBinder());
        m5.d.A(parcel, 3, this.f15613b, i7, false);
        float f = this.f15614c;
        m5.d.K(parcel, 4, 4);
        parcel.writeFloat(f);
        float f4 = this.f15615d;
        m5.d.K(parcel, 5, 4);
        parcel.writeFloat(f4);
        m5.d.A(parcel, 6, this.f15616e, i7, false);
        float f8 = this.f;
        m5.d.K(parcel, 7, 4);
        parcel.writeFloat(f8);
        float f9 = this.f15609X;
        m5.d.K(parcel, 8, 4);
        parcel.writeFloat(f9);
        boolean z7 = this.f15610Y;
        m5.d.K(parcel, 9, 4);
        parcel.writeInt(z7 ? 1 : 0);
        float f10 = this.f15611Z;
        m5.d.K(parcel, 10, 4);
        parcel.writeFloat(f10);
        float f11 = this.f15617e0;
        m5.d.K(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.f15618f0;
        m5.d.K(parcel, 12, 4);
        parcel.writeFloat(f12);
        boolean z8 = this.f15619g0;
        m5.d.K(parcel, 13, 4);
        parcel.writeInt(z8 ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
