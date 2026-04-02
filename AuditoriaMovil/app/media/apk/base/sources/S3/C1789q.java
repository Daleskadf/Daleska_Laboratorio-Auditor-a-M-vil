package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: s3.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789q extends X2.a {
    public static final Parcelable.Creator<C1789q> CREATOR = new C1770E(8);

    /* renamed from: a  reason: collision with root package name */
    public String f15646a;

    /* renamed from: b  reason: collision with root package name */
    public C1774b f15647b;

    /* renamed from: c  reason: collision with root package name */
    public int f15648c;

    /* renamed from: d  reason: collision with root package name */
    public int f15649d;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        boolean z7 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1789q)) {
            return false;
        }
        C1789q c1789q = (C1789q) obj;
        if (this.f15648c != c1789q.f15648c || (((str = this.f15646a) != (str2 = c1789q.f15646a) && (str == null || !str.equals(str2))) || this.f15649d != c1789q.f15649d)) {
            return false;
        }
        C1774b c1774b = c1789q.f15647b;
        C1774b c1774b2 = this.f15647b;
        if ((c1774b2 == null && c1774b != null) || (c1774b2 != null && c1774b == null)) {
            return false;
        }
        if (c1774b2 == null || c1774b == null) {
            return true;
        }
        Object c8 = i3.b.c(c1774b2.f15590a);
        Object c9 = i3.b.c(c1774b.f15590a);
        if (c8 != c9) {
            if (c8 != null) {
                if (!c8.equals(c9)) {
                    return false;
                }
            } else {
                z7 = false;
            }
        }
        return z7;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15646a, this.f15647b, Integer.valueOf(this.f15648c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f15646a, false);
        C1774b c1774b = this.f15647b;
        if (c1774b == null) {
            asBinder = null;
        } else {
            asBinder = c1774b.f15590a.asBinder();
        }
        m5.d.v(parcel, 3, asBinder);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f15648c);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f15649d);
        m5.d.J(G2, parcel);
    }
}
