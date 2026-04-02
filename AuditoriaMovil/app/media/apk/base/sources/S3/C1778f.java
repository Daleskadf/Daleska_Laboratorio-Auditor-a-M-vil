package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
/* renamed from: s3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1778f extends X2.a {
    public static final Parcelable.Creator<C1778f> CREATOR = new C1770E(7);

    /* renamed from: X  reason: collision with root package name */
    public boolean f15596X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f15597Y;

    /* renamed from: Z  reason: collision with root package name */
    public ArrayList f15598Z;

    /* renamed from: a  reason: collision with root package name */
    public LatLng f15599a;

    /* renamed from: b  reason: collision with root package name */
    public double f15600b;

    /* renamed from: c  reason: collision with root package name */
    public float f15601c;

    /* renamed from: d  reason: collision with root package name */
    public int f15602d;

    /* renamed from: e  reason: collision with root package name */
    public int f15603e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f15599a, i7, false);
        double d7 = this.f15600b;
        m5.d.K(parcel, 3, 8);
        parcel.writeDouble(d7);
        float f = this.f15601c;
        m5.d.K(parcel, 4, 4);
        parcel.writeFloat(f);
        int i8 = this.f15602d;
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(i8);
        int i9 = this.f15603e;
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(i9);
        float f4 = this.f;
        m5.d.K(parcel, 7, 4);
        parcel.writeFloat(f4);
        boolean z7 = this.f15596X;
        m5.d.K(parcel, 8, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.f15597Y;
        m5.d.K(parcel, 9, 4);
        parcel.writeInt(z8 ? 1 : 0);
        m5.d.F(parcel, 10, this.f15598Z, false);
        m5.d.J(G2, parcel);
    }
}
