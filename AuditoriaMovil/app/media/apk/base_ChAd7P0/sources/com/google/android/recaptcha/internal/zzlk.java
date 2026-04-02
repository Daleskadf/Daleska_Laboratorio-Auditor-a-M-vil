package com.google.android.recaptcha.internal;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzlk(byte[] bArr, int i7, int i8) {
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

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b5) {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            this.zzd = i7 + 1;
            bArr[i7] = b5;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i8);
            this.zzd += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i8)), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i7, boolean z7) {
        zzt(i7 << 3);
        zzb(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i7, zzle zzleVar) {
        zzt((i7 << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i7, int i8) {
        zzt((i7 << 3) | 5);
        zzg(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
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
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i7, long j) {
        zzt((i7 << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.recaptcha.internal.zzln
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
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i7, int i8) {
        zzt(i7 << 3);
        zzk(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i7) {
        if (i7 >= 0) {
            zzt(i7);
        } else {
            zzv(i7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i7, int i8) {
        zzc(bArr, 0, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzm(int i7, zzoi zzoiVar, zzow zzowVar) {
        zzt((i7 << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i7, zzoi zzoiVar) {
        zzt(11);
        zzs(2, i7);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i7, zzle zzleVar) {
        zzt(11);
        zzs(2, i7);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i7, String str) {
        zzt((i7 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i7 = this.zzd;
        try {
            int zzA = zzln.zzA(str.length() * 3);
            int zzA2 = zzln.zzA(str.length());
            if (zzA2 == zzA) {
                int i8 = i7 + zzA2;
                this.zzd = i8;
                int zzb = zzpv.zzb(str, this.zzb, i8, this.zzc - i8);
                this.zzd = i7;
                zzt((zzb - i7) - zzA2);
                this.zzd = zzb;
                return;
            }
            zzt(zzpv.zzc(str));
            byte[] bArr = this.zzb;
            int i9 = this.zzd;
            this.zzd = zzpv.zzb(str, bArr, i9, this.zzc - i9);
        } catch (zzpu e7) {
            this.zzd = i7;
            zzD(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(e8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i7, int i8) {
        zzt((i7 << 3) | i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i7, int i8) {
        zzt(i7 << 3);
        zzt(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i7) {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                bArr[i8] = (byte) ((i7 | RecognitionOptions.ITF) & 255);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
            }
        }
        byte[] bArr2 = this.zzb;
        int i9 = this.zzd;
        this.zzd = i9 + 1;
        bArr2[i9] = (byte) i7;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i7, long j) {
        zzt(i7 << 3);
        zzv(j);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j) {
        boolean z7;
        z7 = zzln.zzc;
        if (!z7 || this.zzc - this.zzd < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    bArr[i7] = (byte) ((((int) j) | RecognitionOptions.ITF) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
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
                zzps.zzn(bArr3, i10, (byte) i9);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzps.zzn(bArr4, i11, (byte) ((i9 | RecognitionOptions.ITF) & 255));
            j >>>= 7;
        }
    }
}
