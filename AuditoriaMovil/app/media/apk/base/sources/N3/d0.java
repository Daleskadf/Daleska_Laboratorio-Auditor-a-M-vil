package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d0 extends X2.a {
    public static final Parcelable.Creator<d0> CREATOR = new android.support.v4.media.session.b(24);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14207a;

    public d0(boolean z7) {
        this.f14207a = Boolean.valueOf(z7).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0) || this.f14207a != ((d0) obj).f14207a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14207a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14207a ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
