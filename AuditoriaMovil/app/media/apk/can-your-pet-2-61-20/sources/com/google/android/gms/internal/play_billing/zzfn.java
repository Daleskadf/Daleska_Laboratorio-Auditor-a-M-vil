package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzfn {
    private static final zzfn zza = new zzfn(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzfn() {
        this(0, new int[8], new Object[8], true);
    }

    private zzfn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzfn zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zze(zzfn zzfnVar, zzfn zzfnVar2) {
        int i = zzfnVar.zzb + zzfnVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzfnVar.zzc, i);
        System.arraycopy(zzfnVar2.zzc, 0, copyOf, zzfnVar.zzb, zzfnVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzfnVar.zzd, i);
        System.arraycopy(zzfnVar2.zzd, 0, copyOf2, zzfnVar.zzb, zzfnVar2.zzb);
        return new zzfn(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zzf() {
        return new zzfn(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
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
        if (obj != null && (obj instanceof zzfn)) {
            zzfn zzfnVar = (zzfn) obj;
            int i = this.zzb;
            if (i == zzfnVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzfnVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzfnVar.zzd;
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
        int zzw;
        int zzx;
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
                        i = zzck.zzw(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzw2 = zzck.zzw(i6 << 3);
                        int zzd = ((zzcc) this.zzd[i4]).zzd();
                        i = zzw2 + zzck.zzw(zzd) + zzd;
                    } else if (i7 == 3) {
                        int zzw3 = zzck.zzw(i6 << 3);
                        zzw = zzw3 + zzw3;
                        zzx = ((zzfn) this.zzd[i4]).zza();
                    } else if (i7 == 5) {
                        ((Integer) this.zzd[i4]).intValue();
                        i = zzck.zzw(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzdn.zza());
                    }
                    i3 += i;
                } else {
                    int i8 = i6 << 3;
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzw = zzck.zzw(i8);
                    zzx = zzck.zzx(longValue);
                }
                i = zzw + zzx;
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
                int zzw = zzck.zzw(8);
                int zzw2 = zzck.zzw(16) + zzck.zzw(this.zzc[i3] >>> 3);
                int zzw3 = zzck.zzw(24);
                int zzd = ((zzcc) this.zzd[i3]).zzd();
                i2 += zzw + zzw + zzw2 + zzw3 + zzck.zzw(zzd) + zzd;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfn zzd(zzfn zzfnVar) {
        if (zzfnVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzfnVar.zzb;
        zzl(i);
        System.arraycopy(zzfnVar.zzc, 0, this.zzc, this.zzb, zzfnVar.zzb);
        System.arraycopy(zzfnVar.zzd, 0, this.zzd, this.zzb, zzfnVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
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
            zzem.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzge zzgeVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgeVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgeVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgeVar.zzd(i4, (zzcc) obj);
                } else if (i3 == 3) {
                    zzgeVar.zzE(i4);
                    ((zzfn) obj).zzk(zzgeVar);
                    zzgeVar.zzh(i4);
                } else if (i3 == 5) {
                    zzgeVar.zzk(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzdn.zza());
                }
            }
        }
    }
}
