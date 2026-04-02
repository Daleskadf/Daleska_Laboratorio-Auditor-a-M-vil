package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.S  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485S extends X2.a {
    public static final Parcelable.Creator<C1485S> CREATOR = new android.support.v4.media.session.b(28);

    /* renamed from: a  reason: collision with root package name */
    public final String f14193a;

    public C1485S(String str) {
        com.google.android.gms.common.internal.I.i(str);
        this.f14193a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1485S)) {
            return false;
        }
        return this.f14193a.equals(((C1485S) obj).f14193a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14193a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f14193a, false);
        m5.d.J(G2, parcel);
    }
}
