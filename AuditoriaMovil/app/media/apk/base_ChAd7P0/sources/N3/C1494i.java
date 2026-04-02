package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;
/* renamed from: n3.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1494i extends AbstractC1497l {
    public static final Parcelable.Creator<C1494i> CREATOR = new U(21);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14222a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14223b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14224c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14225d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f14226e;

    public C1494i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.I.i(bArr);
        this.f14222a = bArr;
        com.google.android.gms.common.internal.I.i(bArr2);
        this.f14223b = bArr2;
        com.google.android.gms.common.internal.I.i(bArr3);
        this.f14224c = bArr3;
        com.google.android.gms.common.internal.I.i(bArr4);
        this.f14225d = bArr4;
        this.f14226e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1494i)) {
            return false;
        }
        C1494i c1494i = (C1494i) obj;
        if (!Arrays.equals(this.f14222a, c1494i.f14222a) || !Arrays.equals(this.f14223b, c1494i.f14223b) || !Arrays.equals(this.f14224c, c1494i.f14224c) || !Arrays.equals(this.f14225d, c1494i.f14225d) || !Arrays.equals(this.f14226e, c1494i.f14226e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f14222a)), Integer.valueOf(Arrays.hashCode(this.f14223b)), Integer.valueOf(Arrays.hashCode(this.f14224c)), Integer.valueOf(Arrays.hashCode(this.f14225d)), Integer.valueOf(Arrays.hashCode(this.f14226e))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f14222a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f14223b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f14224c;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.f14225d;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f14226e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.r(parcel, 2, this.f14222a, false);
        m5.d.r(parcel, 3, this.f14223b, false);
        m5.d.r(parcel, 4, this.f14224c, false);
        m5.d.r(parcel, 5, this.f14225d, false);
        m5.d.r(parcel, 6, this.f14226e, false);
        m5.d.J(G2, parcel);
    }
}
