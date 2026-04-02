package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhcy {
    private static final zzhcy zza = new zzhcy(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhcy() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhcy(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzhcy zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhcy zze(zzhcy zzhcyVar, zzhcy zzhcyVar2) {
        int i = zzhcyVar.zzb + zzhcyVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhcyVar.zzc, i);
        System.arraycopy(zzhcyVar2.zzc, 0, copyOf, zzhcyVar.zzb, zzhcyVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhcyVar.zzd, i);
        System.arraycopy(zzhcyVar2.zzd, 0, copyOf2, zzhcyVar.zzb, zzhcyVar2.zzb);
        return new zzhcy(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhcy zzf() {
        return new zzhcy();
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzhcy)) {
            zzhcy zzhcyVar = (zzhcy) obj;
            int i = this.zzb;
            if (i == zzhcyVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzhcyVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzhcyVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzD;
        int zzE;
        int i;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.zzd[i4]).longValue();
                        i = zzgza.zzD(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzD2 = zzgza.zzD(i6 << 3);
                        int zzd = ((zzgyj) this.zzd[i4]).zzd();
                        i = zzD2 + zzgza.zzD(zzd) + zzd;
                    } else if (i7 == 3) {
                        int zzD3 = zzgza.zzD(i6 << 3);
                        zzD = zzD3 + zzD3;
                        zzE = ((zzhcy) this.zzd[i4]).zza();
                    } else if (i7 == 5) {
                        ((Integer) this.zzd[i4]).intValue();
                        i = zzgza.zzD(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzhak.zza());
                    }
                    i3 += i;
                } else {
                    int i8 = i6 << 3;
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzD = zzgza.zzD(i8);
                    zzE = zzgza.zzE(longValue);
                }
                i = zzD + zzE;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int zzD = zzgza.zzD(8);
                int zzD2 = zzgza.zzD(16) + zzgza.zzD(this.zzc[i3] >>> 3);
                int zzD3 = zzgza.zzD(24);
                int zzd = ((zzgyj) this.zzd[i3]).zzd();
                i2 += zzD + zzD + zzD2 + zzD3 + zzgza.zzD(zzd) + zzd;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhcy zzd(zzhcy zzhcyVar) {
        if (zzhcyVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhcyVar.zzb;
        zzn(i);
        System.arraycopy(zzhcyVar.zzc, 0, this.zzc, this.zzb, zzhcyVar.zzb);
        System.arraycopy(zzhcyVar.zzd, 0, this.zzd, this.zzb, zzhcyVar.zzb);
        this.zzb = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzhbn.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(int i, zzgyt zzgytVar) throws IOException {
        int zzm;
        zzg();
        int i2 = i & 7;
        if (i2 == 0) {
            zzj(i, Long.valueOf(zzgytVar.zzp()));
            return true;
        } else if (i2 == 1) {
            zzj(i, Long.valueOf(zzgytVar.zzo()));
            return true;
        } else if (i2 == 2) {
            zzj(i, zzgytVar.zzw());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzj(i, Integer.valueOf(zzgytVar.zzg()));
                    return true;
                }
                throw zzhak.zza();
            }
            return false;
        } else {
            zzhcy zzhcyVar = new zzhcy();
            do {
                zzm = zzgytVar.zzm();
                if (zzm == 0) {
                    break;
                }
            } while (zzhcyVar.zzk(zzm, zzgytVar));
            zzgytVar.zzz(4 | ((i >>> 3) << 3));
            zzj(i, zzhcyVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl(zzgzb zzgzbVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzgzbVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzm(zzgzb zzgzbVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgzbVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgzbVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgzbVar.zzd(i4, (zzgyj) obj);
                } else if (i3 == 3) {
                    zzgzbVar.zzF(i4);
                    ((zzhcy) obj).zzm(zzgzbVar);
                    zzgzbVar.zzh(i4);
                } else if (i3 == 5) {
                    zzgzbVar.zzk(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzhak.zza());
                }
            }
        }
    }
}
