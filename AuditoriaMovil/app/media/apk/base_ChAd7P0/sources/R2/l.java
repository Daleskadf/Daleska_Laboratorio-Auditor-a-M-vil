package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l extends X2.a {
    public static final Parcelable.Creator<l> CREATOR = new N2.f(20);

    /* renamed from: a  reason: collision with root package name */
    public final p f4716a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4717b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4718c;

    public l(p pVar, String str, int i7) {
        I.i(pVar);
        this.f4716a = pVar;
        this.f4717b = str;
        this.f4718c = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!I.m(this.f4716a, lVar.f4716a) || !I.m(this.f4717b, lVar.f4717b) || this.f4718c != lVar.f4718c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4716a, this.f4717b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f4716a, i7, false);
        m5.d.B(parcel, 2, this.f4717b, false);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f4718c);
        m5.d.J(G2, parcel);
    }
}
