package o3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n3.c0;
/* loaded from: classes.dex */
public final class g extends X2.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f14580a;

    /* renamed from: b  reason: collision with root package name */
    public final f f14581b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14582c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14583d;

    public g(int i7, String str, String str2, byte[] bArr) {
        this.f14580a = i7;
        try {
            this.f14581b = f.a(str);
            this.f14582c = bArr;
            this.f14583d = str2;
        } catch (e e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Arrays.equals(this.f14582c, gVar.f14582c) || this.f14581b != gVar.f14581b) {
            return false;
        }
        String str = gVar.f14583d;
        String str2 = this.f14583d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((Arrays.hashCode(this.f14582c) + 31) * 31) + this.f14581b.hashCode();
        String str = this.f14583d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14580a);
        m5.d.B(parcel, 2, this.f14581b.toString(), false);
        m5.d.r(parcel, 3, this.f14582c, false);
        m5.d.B(parcel, 4, this.f14583d, false);
        m5.d.J(G2, parcel);
    }
}
