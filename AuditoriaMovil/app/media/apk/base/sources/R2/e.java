package R2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class e extends X2.a {
    public static final Parcelable.Creator<e> CREATOR = new N2.f(17);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4701a;

    public e(boolean z7) {
        this.f4701a = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e) || this.f4701a != ((e) obj).f4701a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4701a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f4701a ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
