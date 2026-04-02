package p3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import f3.AbstractC0992e;
import java.util.Arrays;
import n3.c0;
/* renamed from: p3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1664d extends X2.a {
    public static final Parcelable.Creator<C1664d> CREATOR = new c0(25);

    /* renamed from: X  reason: collision with root package name */
    public final WorkSource f15090X;

    /* renamed from: Y  reason: collision with root package name */
    public final zze f15091Y;

    /* renamed from: a  reason: collision with root package name */
    public final long f15092a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15093b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15094c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15095d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15096e;
    public final int f;

    public C1664d(long j, int i7, int i8, long j8, boolean z7, int i9, WorkSource workSource, zze zzeVar) {
        this.f15092a = j;
        this.f15093b = i7;
        this.f15094c = i8;
        this.f15095d = j8;
        this.f15096e = z7;
        this.f = i9;
        this.f15090X = workSource;
        this.f15091Y = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1664d)) {
            return false;
        }
        C1664d c1664d = (C1664d) obj;
        if (this.f15092a != c1664d.f15092a || this.f15093b != c1664d.f15093b || this.f15094c != c1664d.f15094c || this.f15095d != c1664d.f15095d || this.f15096e != c1664d.f15096e || this.f != c1664d.f || !com.google.android.gms.common.internal.I.m(this.f15090X, c1664d.f15090X) || !com.google.android.gms.common.internal.I.m(this.f15091Y, c1664d.f15091Y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15092a), Integer.valueOf(this.f15093b), Integer.valueOf(this.f15094c), Long.valueOf(this.f15095d)});
    }

    public final String toString() {
        String str;
        StringBuilder l8 = Y.l("CurrentLocationRequest[");
        l8.append(z.c(this.f15094c));
        long j = this.f15092a;
        if (j != Long.MAX_VALUE) {
            l8.append(", maxAge=");
            zzeo.zzc(j, l8);
        }
        long j8 = this.f15095d;
        if (j8 != Long.MAX_VALUE) {
            l8.append(", duration=");
            l8.append(j8);
            l8.append("ms");
        }
        int i7 = this.f15093b;
        if (i7 != 0) {
            l8.append(", ");
            l8.append(z.d(i7));
        }
        if (this.f15096e) {
            l8.append(", bypass");
        }
        int i8 = this.f;
        if (i8 != 0) {
            l8.append(", ");
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        str = "THROTTLE_NEVER";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "THROTTLE_ALWAYS";
                }
            } else {
                str = "THROTTLE_BACKGROUND";
            }
            l8.append(str);
        }
        WorkSource workSource = this.f15090X;
        if (!AbstractC0992e.a(workSource)) {
            l8.append(", workSource=");
            l8.append(workSource);
        }
        zze zzeVar = this.f15091Y;
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
        parcel.writeLong(this.f15092a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15093b);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15094c);
        m5.d.K(parcel, 4, 8);
        parcel.writeLong(this.f15095d);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f15096e ? 1 : 0);
        m5.d.A(parcel, 6, this.f15090X, i7, false);
        m5.d.K(parcel, 7, 4);
        parcel.writeInt(this.f);
        m5.d.A(parcel, 9, this.f15091Y, i7, false);
        m5.d.J(G2, parcel);
    }
}
