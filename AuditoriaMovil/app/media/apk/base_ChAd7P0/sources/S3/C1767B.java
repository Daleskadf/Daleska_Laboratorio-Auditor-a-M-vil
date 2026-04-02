package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.maps.zzap;
/* renamed from: s3.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767B extends X2.a {
    public static final Parcelable.Creator<C1767B> CREATOR = new C1770E(4);

    /* renamed from: a  reason: collision with root package name */
    public zzap f15576a;

    /* renamed from: c  reason: collision with root package name */
    public float f15578c;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15577b = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15579d = true;

    /* renamed from: e  reason: collision with root package name */
    public float f15580e = 0.0f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int G2 = m5.d.G(20293, parcel);
        zzap zzapVar = this.f15576a;
        if (zzapVar == null) {
            asBinder = null;
        } else {
            asBinder = zzapVar.asBinder();
        }
        m5.d.v(parcel, 2, asBinder);
        boolean z7 = this.f15577b;
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(z7 ? 1 : 0);
        float f = this.f15578c;
        m5.d.K(parcel, 4, 4);
        parcel.writeFloat(f);
        boolean z8 = this.f15579d;
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(z8 ? 1 : 0);
        float f4 = this.f15580e;
        m5.d.K(parcel, 6, 4);
        parcel.writeFloat(f4);
        m5.d.J(G2, parcel);
    }
}
