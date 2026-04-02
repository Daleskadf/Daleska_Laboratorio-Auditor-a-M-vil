package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
/* renamed from: s3.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785m extends X2.a {
    public static final Parcelable.Creator<C1785m> CREATOR = new C1770E(12);

    /* renamed from: a  reason: collision with root package name */
    public final String f15624a;

    public C1785m(String str) {
        I.j(str, "json must not be null");
        this.f15624a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f15624a, false);
        m5.d.J(G2, parcel);
    }
}
