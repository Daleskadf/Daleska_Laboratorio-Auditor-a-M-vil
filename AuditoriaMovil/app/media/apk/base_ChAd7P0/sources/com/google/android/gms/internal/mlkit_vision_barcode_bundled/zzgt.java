package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.datastore.preferences.protobuf.Y;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzgt {
    private static final zzgt zza = new zzgt(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgt(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z7;
    }

    public static zzgt zzc() {
        return zza;
    }

    public static zzgt zze(zzgt zzgtVar, zzgt zzgtVar2) {
        int i7 = zzgtVar.zzb + zzgtVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgtVar.zzc, i7);
        System.arraycopy(zzgtVar2.zzc, 0, copyOf, zzgtVar.zzb, zzgtVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgtVar.zzd, i7);
        System.arraycopy(zzgtVar2.zzd, 0, copyOf2, zzgtVar.zzb, zzgtVar2.zzb);
        return new zzgt(i7, copyOf, copyOf2, true);
    }

    public static zzgt zzf() {
        return new zzgt(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i7) {
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            int i8 = this.zzb;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgt)) {
            return false;
        }
        zzgt zzgtVar = (zzgt) obj;
        int i7 = this.zzb;
        if (i7 == zzgtVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgtVar.zzc;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgtVar.zzd;
                    int i9 = this.zzb;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i8 = i7 + 527;
        int[] iArr = this.zzc;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i8 * 31) + i10) * 31;
        Object[] objArr = this.zzd;
        int i13 = this.zzb;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int zzA2;
        int i7 = this.zze;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.zzb; i9++) {
                int i10 = this.zzc[i9];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    ((Integer) this.zzd[i9]).getClass();
                                    zzA2 = zzdn.zzA(i11 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new zzeq("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int zzA3 = zzdn.zzA(i11 << 3);
                                zzA = zzA3 + zzA3;
                                zzB = ((zzgt) this.zzd[i9]).zza();
                            }
                        } else {
                            int zzA4 = zzdn.zzA(i11 << 3);
                            int zzd = ((zzdf) this.zzd[i9]).zzd();
                            i8 = zzdn.zzA(zzd) + zzd + zzA4 + i8;
                        }
                    } else {
                        ((Long) this.zzd[i9]).getClass();
                        zzA2 = zzdn.zzA(i11 << 3) + 8;
                    }
                    i8 = zzA2 + i8;
                } else {
                    int i13 = i11 << 3;
                    long longValue = ((Long) this.zzd[i9]).longValue();
                    zzA = zzdn.zzA(i13);
                    zzB = zzdn.zzB(longValue);
                }
                i8 = zzB + zzA + i8;
            }
            this.zze = i8;
            return i8;
        }
        return i7;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.zzb; i9++) {
                int zzA = zzdn.zzA(8);
                int zzA2 = zzdn.zzA(this.zzc[i9] >>> 3) + zzdn.zzA(16);
                int zzA3 = zzdn.zzA(24);
                int zzd = ((zzdf) this.zzd[i9]).zzd();
                i8 += zzA + zzA + zzA2 + Y.c(zzd, zzd, zzA3);
            }
            this.zze = i8;
            return i8;
        }
        return i7;
    }

    public final zzgt zzd(zzgt zzgtVar) {
        if (zzgtVar.equals(zza)) {
            return this;
        }
        zzg();
        int i7 = this.zzb + zzgtVar.zzb;
        zzm(i7);
        System.arraycopy(zzgtVar.zzc, 0, this.zzc, this.zzb, zzgtVar.zzb);
        System.arraycopy(zzgtVar.zzd, 0, this.zzd, this.zzb, zzgtVar.zzb);
        this.zzb = i7;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzfo.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zzj(int i7, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    public final void zzk(zzhh zzhhVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzhhVar.zzw(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzl(zzhh zzhhVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i8 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i9 == 5) {
                                    zzhhVar.zzk(i10, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new zzeq("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                zzhhVar.zzF(i10);
                                ((zzgt) obj).zzl(zzhhVar);
                                zzhhVar.zzh(i10);
                            }
                        } else {
                            zzhhVar.zzd(i10, (zzdf) obj);
                        }
                    } else {
                        zzhhVar.zzm(i10, ((Long) obj).longValue());
                    }
                } else {
                    zzhhVar.zzt(i10, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzgt() {
        this(0, new int[8], new Object[8], true);
    }
}
