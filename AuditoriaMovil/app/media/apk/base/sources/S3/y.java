package s3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class y extends X2.a {
    public static final Parcelable.Creator<y> CREATOR = new C1770E(2);

    /* renamed from: a  reason: collision with root package name */
    public final x f15682a;

    /* renamed from: b  reason: collision with root package name */
    public final double f15683b;

    public y(x xVar, double d7) {
        if (d7 > 0.0d) {
            this.f15682a = xVar;
            this.f15683b = d7;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f15682a, i7, false);
        m5.d.K(parcel, 3, 8);
        parcel.writeDouble(this.f15683b);
        m5.d.J(G2, parcel);
    }
}
