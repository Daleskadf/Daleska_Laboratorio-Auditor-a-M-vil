package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b0 extends X2.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0(0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14205a;

    public b0(boolean z7) {
        this.f14205a = Boolean.valueOf(z7).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0) || this.f14205a != ((b0) obj).f14205a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14205a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14205a ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
