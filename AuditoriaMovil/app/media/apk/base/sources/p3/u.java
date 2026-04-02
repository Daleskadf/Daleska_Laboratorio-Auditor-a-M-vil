package p3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.internal.location.zze;
import java.util.Arrays;
import n3.c0;
/* loaded from: classes.dex */
public final class u extends X2.a {
    public static final Parcelable.Creator<u> CREATOR = new c0(13);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15137a;

    /* renamed from: b  reason: collision with root package name */
    public final zze f15138b;

    public u(boolean z7, zze zzeVar) {
        this.f15137a = z7;
        this.f15138b = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f15137a != uVar.f15137a || !com.google.android.gms.common.internal.I.m(this.f15138b, uVar.f15138b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15137a)});
    }

    public final String toString() {
        StringBuilder l8 = Y.l("LocationAvailabilityRequest[");
        if (this.f15137a) {
            l8.append("bypass, ");
        }
        zze zzeVar = this.f15138b;
        if (zzeVar != null) {
            l8.append("impersonation=");
            l8.append(zzeVar);
            l8.append(", ");
        }
        l8.setLength(l8.length() - 2);
        l8.append(']');
        return l8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f15137a ? 1 : 0);
        m5.d.A(parcel, 2, this.f15138b, i7, false);
        m5.d.J(G2, parcel);
    }
}
