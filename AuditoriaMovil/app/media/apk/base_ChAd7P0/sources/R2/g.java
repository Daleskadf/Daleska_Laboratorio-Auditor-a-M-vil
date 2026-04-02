package R2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
/* loaded from: classes.dex */
public final class g extends X2.a {
    public static final Parcelable.Creator<g> CREATOR = new N2.f(11);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f4708a;

    public g(PendingIntent pendingIntent) {
        I.i(pendingIntent);
        this.f4708a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f4708a, i7, false);
        m5.d.J(G2, parcel);
    }
}
