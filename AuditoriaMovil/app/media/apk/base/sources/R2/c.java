package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c extends X2.a {
    public static final Parcelable.Creator<c> CREATOR = new N2.f(15);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4696a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4697b;

    public c(String str, boolean z7) {
        if (z7) {
            I.i(str);
        }
        this.f4696a = z7;
        this.f4697b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4696a == cVar.f4696a && I.m(this.f4697b, cVar.f4697b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4696a), this.f4697b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f4696a ? 1 : 0);
        m5.d.B(parcel, 2, this.f4697b, false);
        m5.d.J(G2, parcel);
    }
}
