package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i extends X2.a {
    public static final Parcelable.Creator<i> CREATOR = new N2.f(12);

    /* renamed from: a  reason: collision with root package name */
    public final int f4709a;

    public i(int i7) {
        this.f4709a = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return I.m(Integer.valueOf(this.f4709a), Integer.valueOf(((i) obj).f4709a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4709a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f4709a);
        m5.d.J(G2, parcel);
    }
}
