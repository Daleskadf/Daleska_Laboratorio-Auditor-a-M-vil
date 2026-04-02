package W2;

import a6.t0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d extends X2.a {
    public static final Parcelable.Creator<d> CREATOR = new m(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f6166a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6167b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6168c;

    public d(long j, String str, int i7) {
        this.f6166a = str;
        this.f6167b = i7;
        this.f6168c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f6166a;
            if (((str != null && str.equals(dVar.f6166a)) || (str == null && dVar.f6166a == null)) && k() == dVar.k()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6166a, Long.valueOf(k())});
    }

    public final long k() {
        long j = this.f6168c;
        if (j == -1) {
            return this.f6167b;
        }
        return j;
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f6166a, "name");
        t0Var.m(Long.valueOf(k()), "version");
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f6166a, false);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f6167b);
        long k2 = k();
        m5.d.K(parcel, 3, 8);
        parcel.writeLong(k2);
        m5.d.J(G2, parcel);
    }

    public d(String str, long j) {
        this.f6166a = str;
        this.f6168c = j;
        this.f6167b = -1;
    }
}
