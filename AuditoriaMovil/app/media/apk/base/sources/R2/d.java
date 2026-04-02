package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d extends X2.a {
    public static final Parcelable.Creator<d> CREATOR = new N2.f(16);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4698a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4699b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4700c;

    public d(boolean z7, byte[] bArr, String str) {
        if (z7) {
            I.i(bArr);
            I.i(str);
        }
        this.f4698a = z7;
        this.f4699b = bArr;
        this.f4700c = str;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f4698a == dVar.f4698a && Arrays.equals(this.f4699b, dVar.f4699b) && ((str = this.f4700c) == (str2 = dVar.f4700c) || (str != null && str.equals(str2)))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4699b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4698a), this.f4700c}) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f4698a ? 1 : 0);
        m5.d.r(parcel, 2, this.f4699b, false);
        m5.d.B(parcel, 3, this.f4700c, false);
        m5.d.J(G2, parcel);
    }
}
