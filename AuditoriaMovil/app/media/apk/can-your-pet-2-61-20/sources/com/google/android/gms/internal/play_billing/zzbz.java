package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public class zzbz extends zzby {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbz(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcc) && zzd() == ((zzcc) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzbz) {
                zzbz zzbzVar = (zzbz) obj;
                int zzk = zzk();
                int zzk2 = zzbzVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd > zzbzVar.zzd()) {
                        int zzd2 = zzd();
                        throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
                    } else if (zzd <= zzbzVar.zzd()) {
                        if (zzbzVar instanceof zzbz) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzbzVar.zza;
                            zzbzVar.zzc();
                            int i = 0;
                            int i2 = 0;
                            while (i < zzd) {
                                if (bArr[i] != bArr2[i2]) {
                                    return false;
                                }
                                i++;
                                i2++;
                            }
                            return true;
                        }
                        return zzbzVar.zzf(0, zzd).equals(zzf(0, zzd));
                    } else {
                        int zzd3 = zzbzVar.zzd();
                        throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzd3);
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcc
    public byte zza(int i) {
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzcc
    public byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcc
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcc
    protected final int zze(int i, int i2, int i3) {
        return zzdl.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcc
    public final zzcc zzf(int i, int i2) {
        int zzj = zzj(0, i2, zzd());
        return zzj == 0 ? zzcc.zzb : new zzbw(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcc
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzcc
    public final void zzh(zzbs zzbsVar) throws IOException {
        ((zzch) zzbsVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.play_billing.zzcc
    public final boolean zzi() {
        return zzgb.zze(this.zza, 0, zzd());
    }
}
