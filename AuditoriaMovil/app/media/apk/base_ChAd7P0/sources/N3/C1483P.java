package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.P  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483P extends X2.a {
    public static final Parcelable.Creator<C1483P> CREATOR = new android.support.v4.media.session.b(25);

    /* renamed from: a  reason: collision with root package name */
    public final long f14191a;

    public C1483P(long j) {
        this.f14191a = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1483P) || this.f14191a != ((C1483P) obj).f14191a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14191a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 8);
        parcel.writeLong(this.f14191a);
        m5.d.J(G2, parcel);
    }
}
