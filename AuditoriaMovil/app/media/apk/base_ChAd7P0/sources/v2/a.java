package V2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a extends X2.a {
    public static final Parcelable.Creator<a> CREATOR = new N2.f(28);

    /* renamed from: a  reason: collision with root package name */
    public final int f5938a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5939b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f5940c;

    public a(int i7, int i8, Bundle bundle) {
        this.f5938a = i7;
        this.f5939b = i8;
        this.f5940c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f5938a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f5939b);
        m5.d.q(parcel, 3, this.f5940c, false);
        m5.d.J(G2, parcel);
    }
}
