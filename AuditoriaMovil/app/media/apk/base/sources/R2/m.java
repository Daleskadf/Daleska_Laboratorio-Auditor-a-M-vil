package R2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class m extends X2.a {
    public static final Parcelable.Creator<m> CREATOR = new N2.f(21);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f4719a;

    public m(PendingIntent pendingIntent) {
        I.i(pendingIntent);
        this.f4719a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return I.m(this.f4719a, ((m) obj).f4719a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4719a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f4719a, i7, false);
        m5.d.J(G2, parcel);
    }
}
