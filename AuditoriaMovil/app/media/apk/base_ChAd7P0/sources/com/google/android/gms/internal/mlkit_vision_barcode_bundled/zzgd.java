package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.api.f;
import java.nio.charset.Charset;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgd extends zzdf {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, f.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzdf zzd;
    private final zzdf zze;
    private final int zzf;
    private final int zzg;

    public static int zzc(int i7) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i7 >= 47) {
            return f.API_PRIORITY_OTHER;
        }
        return iArr[i7];
    }

    public static zzdf zzy(zzdf zzdfVar, zzdf zzdfVar2) {
        if (zzdfVar2.zzd() == 0) {
            return zzdfVar;
        }
        if (zzdfVar.zzd() == 0) {
            return zzdfVar2;
        }
        int zzd = zzdfVar2.zzd() + zzdfVar.zzd();
        if (zzd < 128) {
            return zzz(zzdfVar, zzdfVar2);
        }
        if (zzdfVar instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzdfVar;
            if (zzdfVar2.zzd() + zzgdVar.zze.zzd() < 128) {
                return new zzgd(zzgdVar.zzd, zzz(zzgdVar.zze, zzdfVar2));
            }
            if (zzgdVar.zzd.zzf() > zzgdVar.zze.zzf() && zzgdVar.zzg > zzdfVar2.zzf()) {
                return new zzgd(zzgdVar.zzd, new zzgd(zzgdVar.zze, zzdfVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1)) {
            return new zzgd(zzdfVar, zzdfVar2);
        }
        return zzfz.zza(new zzfz(null), zzdfVar, zzdfVar2);
    }

    private static zzdf zzz(zzdf zzdfVar, zzdf zzdfVar2) {
        int zzd = zzdfVar.zzd();
        int zzd2 = zzdfVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzdfVar.zzv(bArr, 0, 0, zzd);
        zzdfVar2.zzv(bArr, 0, zzd, zzd2);
        return new zzde(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        if (this.zzc != zzdfVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzp = zzp();
        int zzp2 = zzdfVar.zzp();
        if (zzp != 0 && zzp2 != 0 && zzp != zzp2) {
            return false;
        }
        zzgb zzgbVar = new zzgb(this, null);
        zzdd next = zzgbVar.next();
        zzgb zzgbVar2 = new zzgb(zzdfVar, null);
        zzdd next2 = zzgbVar2.next();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int zzd = next.zzd() - i7;
            int zzd2 = next2.zzd() - i8;
            int min = Math.min(zzd, zzd2);
            if (i7 == 0) {
                zzg = next.zzg(next2, i8, min);
            } else {
                zzg = next2.zzg(next, i7, min);
            }
            if (!zzg) {
                return false;
            }
            i9 += min;
            int i10 = this.zzc;
            if (i9 >= i10) {
                if (i9 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgbVar.next();
                i7 = 0;
            } else {
                i7 += min;
            }
            if (min == zzd2) {
                next2 = zzgbVar2.next();
                i8 = 0;
            } else {
                i8 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfx(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i7) {
        zzdf.zzu(i7, this.zzc);
        return zzb(i7);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zzb(int i7) {
        int i8 = this.zzf;
        if (i7 < i8) {
            return this.zzd.zzb(i7);
        }
        return this.zze.zzb(i7 - i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zze(byte[] bArr, int i7, int i8, int i9) {
        int i10 = i7 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            this.zzd.zze(bArr, i7, i8, i9);
        } else if (i7 >= i11) {
            this.zze.zze(bArr, i7 - i11, i8, i9);
        } else {
            int i12 = i11 - i7;
            this.zzd.zze(bArr, i7, i8, i12);
            this.zze.zze(bArr, 0, i8 + i12, i9 - i12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzh() {
        if (this.zzc >= zzc(this.zzg)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzi(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzi(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.zze.zzi(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.zze.zzi(this.zzd.zzi(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzj(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzj(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.zze.zzj(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.zze.zzj(this.zzd.zzj(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i7, int i8) {
        int zzo = zzdf.zzo(i7, i8, this.zzc);
        if (zzo == 0) {
            return zzdf.zzb;
        }
        if (zzo == this.zzc) {
            return this;
        }
        int i9 = this.zzf;
        if (i8 <= i9) {
            return this.zzd.zzk(i7, i8);
        }
        if (i7 >= i9) {
            return this.zze.zzk(i7 - i9, i8 - i9);
        }
        zzdf zzdfVar = this.zzd;
        return new zzgd(zzdfVar.zzk(i7, zzdfVar.zzd()), this.zze.zzk(0, i8 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final String zzl(Charset charset) {
        return new String(zzw(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zzm(zzcx zzcxVar) {
        this.zzd.zzm(zzcxVar);
        this.zze.zzm(zzcxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        zzdf zzdfVar = this.zzd;
        zzdf zzdfVar2 = this.zze;
        if (zzdfVar2.zzj(zzdfVar.zzj(0, 0, this.zzf), 0, zzdfVar2.zzd()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdb zzq() {
        return new zzfx(this);
    }

    private zzgd(zzdf zzdfVar, zzdf zzdfVar2) {
        this.zzd = zzdfVar;
        this.zze = zzdfVar2;
        int zzd = zzdfVar.zzd();
        this.zzf = zzd;
        this.zzc = zzdfVar2.zzd() + zzd;
        this.zzg = Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1;
    }
}
