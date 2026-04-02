package b4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class V implements X2.b {
    public static final Parcelable.Creator<V> CREATOR = new C0595c(6);

    /* renamed from: a  reason: collision with root package name */
    public final String f8223a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8224b;

    /* renamed from: c  reason: collision with root package name */
    public final S.f f8225c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8226d;

    public V(boolean z7) {
        this.f8226d = z7;
        this.f8224b = null;
        this.f8223a = null;
        this.f8225c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f8223a, false);
        m5.d.B(parcel, 2, this.f8224b, false);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f8226d ? 1 : 0);
        m5.d.J(G2, parcel);
    }

    public V(String str, String str2, boolean z7) {
        com.google.android.gms.common.internal.I.e(str);
        com.google.android.gms.common.internal.I.e(str2);
        this.f8223a = str;
        this.f8224b = str2;
        this.f8225c = x.d(str2);
        this.f8226d = z7;
    }
}
