package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482O extends X2.a {
    public static final Parcelable.Creator<C1482O> CREATOR = new U(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f14188a;

    /* renamed from: b  reason: collision with root package name */
    public final short f14189b;

    /* renamed from: c  reason: collision with root package name */
    public final short f14190c;

    public C1482O(int i7, short s7, short s8) {
        this.f14188a = i7;
        this.f14189b = s7;
        this.f14190c = s8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1482O)) {
            return false;
        }
        C1482O c1482o = (C1482O) obj;
        if (this.f14188a != c1482o.f14188a || this.f14189b != c1482o.f14189b || this.f14190c != c1482o.f14190c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14188a), Short.valueOf(this.f14189b), Short.valueOf(this.f14190c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14188a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f14189b);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f14190c);
        m5.d.J(G2, parcel);
    }
}
