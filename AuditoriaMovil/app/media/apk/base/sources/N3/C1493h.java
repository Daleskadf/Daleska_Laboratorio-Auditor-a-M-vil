package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1493h extends X2.a {
    public static final Parcelable.Creator<C1493h> CREATOR = new U(18);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14221a;

    public C1493h(boolean z7) {
        this.f14221a = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1493h) || this.f14221a != ((C1493h) obj).f14221a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14221a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14221a ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
