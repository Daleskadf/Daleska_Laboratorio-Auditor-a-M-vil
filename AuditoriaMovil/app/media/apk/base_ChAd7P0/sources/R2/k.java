package R2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class k extends X2.a {
    public static final Parcelable.Creator<k> CREATOR = new N2.f(19);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f4715a;

    public k(PendingIntent pendingIntent) {
        this.f4715a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return I.m(this.f4715a, ((k) obj).f4715a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4715a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f4715a, i7, false);
        m5.d.J(G2, parcel);
    }
}
