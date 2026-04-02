package v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import s3.C1770E;
/* loaded from: classes.dex */
public final class f extends X2.a {
    public static final Parcelable.Creator<f> CREATOR = new C1770E(20);

    /* renamed from: a  reason: collision with root package name */
    public final int f16049a;

    /* renamed from: b  reason: collision with root package name */
    public final D f16050b;

    public f(int i7, D d7) {
        this.f16049a = i7;
        this.f16050b = d7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f16049a);
        m5.d.A(parcel, 2, this.f16050b, i7, false);
        m5.d.J(G2, parcel);
    }
}
