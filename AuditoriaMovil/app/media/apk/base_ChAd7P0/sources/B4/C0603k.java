package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: b4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603k extends X2.a {
    public static final Parcelable.Creator<C0603k> CREATOR = new C0595c(4);

    /* renamed from: a  reason: collision with root package name */
    public String f8270a;

    /* renamed from: b  reason: collision with root package name */
    public String f8271b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f8272c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f8273d;

    /* renamed from: e  reason: collision with root package name */
    public C0599g f8274e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f8270a, false);
        m5.d.B(parcel, 2, this.f8271b, false);
        m5.d.F(parcel, 3, this.f8272c, false);
        m5.d.F(parcel, 4, this.f8273d, false);
        m5.d.A(parcel, 5, this.f8274e, i7, false);
        m5.d.J(G2, parcel);
    }
}
