package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.M  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1480M extends X2.a {
    public static final Parcelable.Creator<C1480M> CREATOR = new U(11);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14186a;

    public C1480M(boolean z7) {
        this.f14186a = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1480M) || this.f14186a != ((C1480M) obj).f14186a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14186a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14186a ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
