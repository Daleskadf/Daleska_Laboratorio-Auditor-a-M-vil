package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzde extends zzdd {
    protected final byte[] zza;

    public zzde(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf) || zzd() != ((zzdf) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzde) {
            zzde zzdeVar = (zzde) obj;
            int zzp = zzp();
            int zzp2 = zzdeVar.zzp();
            if (zzp != 0 && zzp2 != 0 && zzp != zzp2) {
                return false;
            }
            return zzg(zzdeVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zza, i7, bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdd
    public final boolean zzg(zzdf zzdfVar, int i7, int i8) {
        if (i8 <= zzdfVar.zzd()) {
            int i9 = i7 + i8;
            if (i9 <= zzdfVar.zzd()) {
                if (zzdfVar instanceof zzde) {
                    zzde zzdeVar = (zzde) zzdfVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzdeVar.zza;
                    int zzc = zzc() + i8;
                    int zzc2 = zzc();
                    int zzc3 = zzdeVar.zzc() + i7;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzdfVar.zzk(i7, i9).equals(zzk(0, i8));
            }
            int zzd = zzdfVar.zzd();
            throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + zzd);
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i8 + zzd2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzi(int i7, int i8, int i9) {
        return zzep.zzb(i7, this.zza, zzc() + i8, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzj(int i7, int i8, int i9) {
        int zzc = zzc() + i8;
        return zzhe.zzf(i7, this.zza, zzc, i9 + zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i7, int i8) {
        int zzo = zzdf.zzo(i7, i8, zzd());
        if (zzo == 0) {
            return zzdf.zzb;
        }
        return new zzda(this.zza, zzc() + i7, zzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zzm(zzcx zzcxVar) {
        ((zzdk) zzcxVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        int zzc = zzc();
        return zzhe.zzg(this.zza, zzc, zzd() + zzc);
    }
}
