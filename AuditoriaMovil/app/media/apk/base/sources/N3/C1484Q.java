package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.Q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484Q extends X2.a {
    public static final Parcelable.Creator<C1484Q> CREATOR = new android.support.v4.media.session.b(26);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14192a;

    public C1484Q(boolean z7) {
        this.f14192a = Boolean.valueOf(z7).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1484Q) || this.f14192a != ((C1484Q) obj).f14192a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14192a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14192a ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
