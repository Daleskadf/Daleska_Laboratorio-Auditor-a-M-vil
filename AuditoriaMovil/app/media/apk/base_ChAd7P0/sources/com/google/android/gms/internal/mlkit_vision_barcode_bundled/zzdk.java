package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
final class zzdk extends zzdn {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzdk(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i8;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzb(byte b5) {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            this.zzd = i7 + 1;
            bArr[i7] = b5;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.zzb, this.zzd, i8);
            this.zzd += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i8)), e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzd(int i7, boolean z7) {
        zzt(i7 << 3);
        zzb(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zze(int i7, zzdf zzdfVar) {
        zzt((i7 << 3) | 2);
        zzt(zzdfVar.zzd());
        zzdfVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzf(int i7, int i8) {
        zzt((i7 << 3) | 5);
        zzg(i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzg(int i7) {
        try {
            byte[] bArr = this.zzb;
            int i8 = this.zzd;
            int i9 = i8 + 1;
            this.zzd = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.zzd = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.zzd = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.zzd = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzh(int i7, long j) {
        zzt((i7 << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            int i8 = i7 + 1;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) j) & 255);
            int i9 = i7 + 2;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i7 + 3;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i7 + 4;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i7 + 5;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i7 + 6;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i7 + 7;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.zzd = i7 + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzj(int i7, int i8) {
        zzt(i7 << 3);
        zzk(i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzk(int i7) {
        if (i7 >= 0) {
            zzt(i7);
        } else {
            zzv(i7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzl(byte[] bArr, int i7, int i8) {
        zzc(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzm(int i7, zzfm zzfmVar, zzge zzgeVar) {
        zzt((i7 << 3) | 2);
        zzt(((zzcq) zzfmVar).zzB(zzgeVar));
        zzgeVar.zzi(zzfmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzn(int i7, zzfm zzfmVar) {
        zzt(11);
        zzs(2, i7);
        zzt(26);
        zzt(zzfmVar.zzF());
        zzfmVar.zzab(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzo(int i7, zzdf zzdfVar) {
        zzt(11);
        zzs(2, i7);
        zze(3, zzdfVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzp(int i7, String str) {
        zzt((i7 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i7 = this.zzd;
        try {
            int zzA = zzdn.zzA(str.length() * 3);
            int zzA2 = zzdn.zzA(str.length());
            if (zzA2 == zzA) {
                int i8 = i7 + zzA2;
                this.zzd = i8;
                int zzd = zzhe.zzd(str, this.zzb, i8, this.zzc - i8);
                this.zzd = i7;
                zzt((zzd - i7) - zzA2);
                this.zzd = zzd;
                return;
            }
            zzt(zzhe.zze(str));
            byte[] bArr = this.zzb;
            int i9 = this.zzd;
            this.zzd = zzhe.zzd(str, bArr, i9, this.zzc - i9);
        } catch (zzhd e7) {
            this.zzd = i7;
            zzD(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzdl(e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzr(int i7, int i8) {
        zzt((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzs(int i7, int i8) {
        zzt(i7 << 3);
        zzt(i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzt(int i7) {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                bArr[i8] = (byte) ((i7 | RecognitionOptions.ITF) & 255);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
            }
        }
        byte[] bArr2 = this.zzb;
        int i9 = this.zzd;
        this.zzd = i9 + 1;
        bArr2[i9] = (byte) i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzu(int i7, long j) {
        zzt(i7 << 3);
        zzv(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzv(long j) {
        boolean z7;
        z7 = zzdn.zzc;
        if (!z7 || this.zzc - this.zzd < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    bArr[i7] = (byte) ((((int) j) | RecognitionOptions.ITF) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
                }
            }
            byte[] bArr2 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            bArr2[i8] = (byte) j;
            return;
        }
        while (true) {
            int i9 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i10 = this.zzd;
                this.zzd = 1 + i10;
                zzgz.zzn(bArr3, i10, (byte) i9);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzgz.zzn(bArr4, i11, (byte) ((i9 | RecognitionOptions.ITF) & 255));
            j >>>= 7;
        }
    }
}
