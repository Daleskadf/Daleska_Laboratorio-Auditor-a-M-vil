package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: s3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1787o extends X2.a {
    public static final Parcelable.Creator<C1787o> CREATOR = new C1770E(13);

    /* renamed from: X  reason: collision with root package name */
    public boolean f15626X;

    /* renamed from: a  reason: collision with root package name */
    public LatLng f15629a;

    /* renamed from: b  reason: collision with root package name */
    public String f15630b;

    /* renamed from: c  reason: collision with root package name */
    public String f15631c;

    /* renamed from: d  reason: collision with root package name */
    public C1774b f15632d;

    /* renamed from: i0  reason: collision with root package name */
    public float f15638i0;

    /* renamed from: k0  reason: collision with root package name */
    public View f15640k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f15641l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f15642m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f15643n0;

    /* renamed from: e  reason: collision with root package name */
    public float f15633e = 0.5f;
    public float f = 1.0f;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f15627Y = true;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f15628Z = false;

    /* renamed from: e0  reason: collision with root package name */
    public float f15634e0 = 0.0f;

    /* renamed from: f0  reason: collision with root package name */
    public float f15635f0 = 0.5f;

    /* renamed from: g0  reason: collision with root package name */
    public float f15636g0 = 0.0f;

    /* renamed from: h0  reason: collision with root package name */
    public float f15637h0 = 1.0f;

    /* renamed from: j0  reason: collision with root package name */
    public int f15639j0 = 0;

    public final void k(LatLng latLng) {
        if (latLng != null) {
            this.f15629a = latLng;
            return;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f15629a, i7, false);
        m5.d.B(parcel, 3, this.f15630b, false);
        m5.d.B(parcel, 4, this.f15631c, false);
        C1774b c1774b = this.f15632d;
        if (c1774b == null) {
            asBinder = null;
        } else {
            asBinder = c1774b.f15590a.asBinder();
        }
        m5.d.v(parcel, 5, asBinder);
        float f = this.f15633e;
        m5.d.K(parcel, 6, 4);
        parcel.writeFloat(f);
        float f4 = this.f;
        m5.d.K(parcel, 7, 4);
        parcel.writeFloat(f4);
        boolean z7 = this.f15626X;
        m5.d.K(parcel, 8, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.f15627Y;
        m5.d.K(parcel, 9, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.f15628Z;
        m5.d.K(parcel, 10, 4);
        parcel.writeInt(z9 ? 1 : 0);
        float f8 = this.f15634e0;
        m5.d.K(parcel, 11, 4);
        parcel.writeFloat(f8);
        float f9 = this.f15635f0;
        m5.d.K(parcel, 12, 4);
        parcel.writeFloat(f9);
        float f10 = this.f15636g0;
        m5.d.K(parcel, 13, 4);
        parcel.writeFloat(f10);
        float f11 = this.f15637h0;
        m5.d.K(parcel, 14, 4);
        parcel.writeFloat(f11);
        float f12 = this.f15638i0;
        m5.d.K(parcel, 15, 4);
        parcel.writeFloat(f12);
        m5.d.K(parcel, 17, 4);
        parcel.writeInt(this.f15639j0);
        m5.d.v(parcel, 18, new i3.b(this.f15640k0).asBinder());
        int i8 = this.f15641l0;
        m5.d.K(parcel, 19, 4);
        parcel.writeInt(i8);
        m5.d.B(parcel, 20, this.f15642m0, false);
        m5.d.K(parcel, 21, 4);
        parcel.writeFloat(this.f15643n0);
        m5.d.J(G2, parcel);
    }
}
