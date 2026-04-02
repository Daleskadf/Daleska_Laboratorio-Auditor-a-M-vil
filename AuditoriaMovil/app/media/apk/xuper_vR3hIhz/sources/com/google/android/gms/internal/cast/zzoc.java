package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzoc extends zzob {
    protected final byte[] zza;

    public zzoc(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzoe) || zzd() != ((zzoe) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzoc) {
            zzoc zzocVar = (zzoc) obj;
            int zzk = zzk();
            int zzk2 = zzocVar.zzk();
            if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzocVar.zzd()) {
                if (zzd <= zzocVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzocVar.zza;
                    zzocVar.zzc();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < zzd) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                int zzd2 = zzocVar.zzd();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: 0, ");
                sb.append(zzd);
                sb.append(", ");
                sb.append(zzd2);
                throw new IllegalArgumentException(sb.toString());
            }
            int zzd3 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(zzd);
            sb2.append(zzd3);
            throw new IllegalArgumentException(sb2.toString());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final int zze(int i10, int i11, int i12) {
        return zzph.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final zzoe zzf(int i10, int i11) {
        zzoe.zzj(0, i11, zzd());
        if (i11 == 0) {
            return zzoe.zzb;
        }
        return new zznz(this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final void zzh(zznu zznuVar) {
        ((zzoj) zznuVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final boolean zzi() {
        return zzrr.zze(this.zza, 0, zzd());
    }
}
