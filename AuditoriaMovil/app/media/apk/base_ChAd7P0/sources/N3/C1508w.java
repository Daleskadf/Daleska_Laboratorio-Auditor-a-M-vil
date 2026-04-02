package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1508w extends X2.a {
    public static final Parcelable.Creator<C1508w> CREATOR = new android.support.v4.media.session.b(27);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14246a;

    public C1508w(boolean z7) {
        this.f14246a = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1508w)) {
            return false;
        }
        if (this.f14246a != ((C1508w) obj).f14246a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14246a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14246a ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
