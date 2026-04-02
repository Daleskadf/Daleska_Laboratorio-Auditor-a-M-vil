package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507v extends X2.a {
    public static final Parcelable.Creator<C1507v> CREATOR = new c0(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f14245a;

    public C1507v(String str) {
        com.google.android.gms.common.internal.I.i(str);
        this.f14245a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1507v)) {
            return false;
        }
        return this.f14245a.equals(((C1507v) obj).f14245a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14245a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f14245a, false);
        m5.d.J(G2, parcel);
    }
}
