package p3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import java.util.Arrays;
import n3.c0;
/* loaded from: classes.dex */
public final class k extends X2.a {
    public static final Parcelable.Creator<k> CREATOR = new c0(11);

    /* renamed from: a  reason: collision with root package name */
    public final long f15108a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15109b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15110c;

    /* renamed from: d  reason: collision with root package name */
    public final zze f15111d;

    public k(long j, int i7, boolean z7, zze zzeVar) {
        this.f15108a = j;
        this.f15109b = i7;
        this.f15110c = z7;
        this.f15111d = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f15108a != kVar.f15108a || this.f15109b != kVar.f15109b || this.f15110c != kVar.f15110c || !com.google.android.gms.common.internal.I.m(this.f15111d, kVar.f15111d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15108a), Integer.valueOf(this.f15109b), Boolean.valueOf(this.f15110c)});
    }

    public final String toString() {
        StringBuilder l8 = Y.l("LastLocationRequest[");
        long j = this.f15108a;
        if (j != Long.MAX_VALUE) {
            l8.append("maxAge=");
            zzeo.zzc(j, l8);
        }
        int i7 = this.f15109b;
        if (i7 != 0) {
            l8.append(", ");
            l8.append(z.d(i7));
        }
        if (this.f15110c) {
            l8.append(", bypass");
        }
        zze zzeVar = this.f15111d;
        if (zzeVar != null) {
            l8.append(", impersonation=");
            l8.append(zzeVar);
        }
        l8.append(']');
        return l8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 8);
        parcel.writeLong(this.f15108a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15109b);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15110c ? 1 : 0);
        m5.d.A(parcel, 5, this.f15111d, i7, false);
        m5.d.J(G2, parcel);
    }
}
