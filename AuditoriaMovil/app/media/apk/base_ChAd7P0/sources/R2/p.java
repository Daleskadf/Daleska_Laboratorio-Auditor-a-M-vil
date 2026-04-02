package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class p extends X2.a {
    public static final Parcelable.Creator<p> CREATOR = new N2.f(23);

    /* renamed from: a  reason: collision with root package name */
    public final String f4728a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4729b;

    public p(String str, String str2) {
        I.j(str, "Account identifier cannot be null");
        String trim = str.trim();
        I.f(trim, "Account identifier cannot be empty");
        this.f4728a = trim;
        I.e(str2);
        this.f4729b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!I.m(this.f4728a, pVar.f4728a) || !I.m(this.f4729b, pVar.f4729b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4728a, this.f4729b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f4728a, false);
        m5.d.B(parcel, 2, this.f4729b, false);
        m5.d.J(G2, parcel);
    }
}
