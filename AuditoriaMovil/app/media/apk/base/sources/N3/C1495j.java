package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;
/* renamed from: n3.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495j extends AbstractC1497l {
    public static final Parcelable.Creator<C1495j> CREATOR = new U(22);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14227a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14228b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14229c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f14230d;

    public C1495j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.internal.I.i(bArr);
        this.f14227a = bArr;
        com.google.android.gms.common.internal.I.i(bArr2);
        this.f14228b = bArr2;
        com.google.android.gms.common.internal.I.i(bArr3);
        this.f14229c = bArr3;
        com.google.android.gms.common.internal.I.i(strArr);
        this.f14230d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1495j)) {
            return false;
        }
        C1495j c1495j = (C1495j) obj;
        if (!Arrays.equals(this.f14227a, c1495j.f14227a) || !Arrays.equals(this.f14228b, c1495j.f14228b) || !Arrays.equals(this.f14229c, c1495j.f14229c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f14227a)), Integer.valueOf(Arrays.hashCode(this.f14228b)), Integer.valueOf(Arrays.hashCode(this.f14229c))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f14227a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f14228b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f14229c;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f14230d));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.r(parcel, 2, this.f14227a, false);
        m5.d.r(parcel, 3, this.f14228b, false);
        m5.d.r(parcel, 4, this.f14229c, false);
        m5.d.C(parcel, 5, this.f14230d, false);
        m5.d.J(G2, parcel);
    }
}
