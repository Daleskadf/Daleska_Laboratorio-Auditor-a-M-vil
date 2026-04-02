package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;
/* renamed from: n3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496k extends AbstractC1497l {
    public static final Parcelable.Creator<C1496k> CREATOR = new U(23);

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1506u f14231a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14232b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14233c;

    public C1496k(int i7, String str, int i8) {
        try {
            this.f14231a = EnumC1506u.d(i7);
            this.f14232b = str;
            this.f14233c = i8;
        } catch (C1505t e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1496k)) {
            return false;
        }
        C1496k c1496k = (C1496k) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14231a, c1496k.f14231a) || !com.google.android.gms.common.internal.I.m(this.f14232b, c1496k.f14232b) || !com.google.android.gms.common.internal.I.m(Integer.valueOf(this.f14233c), Integer.valueOf(c1496k.f14233c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14231a, this.f14232b, Integer.valueOf(this.f14233c)});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zza.zza("errorCode", this.f14231a.a());
        String str = this.f14232b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        int a7 = this.f14231a.a();
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(a7);
        m5.d.B(parcel, 3, this.f14232b, false);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f14233c);
        m5.d.J(G2, parcel);
    }
}
