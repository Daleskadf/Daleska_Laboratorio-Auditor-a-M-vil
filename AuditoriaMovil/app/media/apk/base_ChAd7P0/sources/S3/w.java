package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class w extends X2.a {
    public static final Parcelable.Creator<w> CREATOR = new C1770E(17);

    /* renamed from: a  reason: collision with root package name */
    public final C1774b f15676a;

    public w(IBinder iBinder) {
        this.f15676a = new C1774b(i3.b.b(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.v(parcel, 2, this.f15676a.f15590a.asBinder());
        m5.d.J(G2, parcel);
    }
}
