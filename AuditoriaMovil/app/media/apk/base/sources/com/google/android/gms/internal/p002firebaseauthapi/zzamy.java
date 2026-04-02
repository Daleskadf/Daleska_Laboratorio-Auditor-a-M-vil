package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamy  reason: invalid package */
/* loaded from: classes.dex */
public final class zzamy {
    private static final zzamy zza = new zzamy(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamy() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzamy zzc() {
        return zza;
    }

    public static zzamy zzd() {
        return new zzamy();
    }

    private final void zzf() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamy)) {
            return false;
        }
        zzamy zzamyVar = (zzamy) obj;
        int i7 = this.zzb;
        if (i7 == zzamyVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamyVar.zzc;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzamyVar.zzd;
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
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.zzc;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.zzd;
        int i13 = this.zzb;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final int zza() {
        int zze;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            int i10 = this.zzc[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                zze = zzajo.zze(i11, ((Long) this.zzd[i9]).longValue());
            } else if (i12 == 1) {
                zze = zzajo.zza(i11, ((Long) this.zzd[i9]).longValue());
            } else if (i12 == 2) {
                zze = zzajo.zza(i11, (zzaiw) this.zzd[i9]);
            } else if (i12 == 3) {
                i8 = ((zzamy) this.zzd[i9]).zza() + (zzajo.zzg(i11) << 1) + i8;
            } else if (i12 == 5) {
                zze = zzajo.zzb(i11, ((Integer) this.zzd[i9]).intValue());
            } else {
                throw new IllegalStateException(zzakm.zza());
            }
            i8 = zze + i8;
        }
        this.zze = i8;
        return i8;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            i8 += zzajo.zzb(this.zzc[i9] >>> 3, (zzaiw) this.zzd[i9]);
        }
        this.zze = i8;
        return i8;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzamy(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z7;
    }

    public final void zzb(zzanm zzanmVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanmVar.zza() == 1) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                zza(this.zzc[i7], this.zzd[i7], zzanmVar);
            }
            return;
        }
        for (int i8 = this.zzb - 1; i8 >= 0; i8--) {
            zza(this.zzc[i8], this.zzd[i8], zzanmVar);
        }
    }

    public final zzamy zza(zzamy zzamyVar) {
        if (zzamyVar.equals(zza)) {
            return this;
        }
        zzf();
        int i7 = this.zzb + zzamyVar.zzb;
        zza(i7);
        System.arraycopy(zzamyVar.zzc, 0, this.zzc, this.zzb, zzamyVar.zzb);
        System.arraycopy(zzamyVar.zzd, 0, this.zzd, this.zzb, zzamyVar.zzb);
        this.zzb = i7;
        return this;
    }

    public static zzamy zza(zzamy zzamyVar, zzamy zzamyVar2) {
        int i7 = zzamyVar.zzb + zzamyVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzamyVar.zzc, i7);
        System.arraycopy(zzamyVar2.zzc, 0, copyOf, zzamyVar.zzb, zzamyVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzamyVar.zzd, i7);
        System.arraycopy(zzamyVar2.zzd, 0, copyOf2, zzamyVar.zzb, zzamyVar2.zzb);
        return new zzamy(i7, copyOf, copyOf2, true);
    }

    private final void zza(int i7) {
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

    public final void zza(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzalo.zza(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zza(int i7, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    public final void zza(zzanm zzanmVar) {
        if (zzanmVar.zza() == 2) {
            for (int i7 = this.zzb - 1; i7 >= 0; i7--) {
                zzanmVar.zza(this.zzc[i7] >>> 3, this.zzd[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzanmVar.zza(this.zzc[i8] >>> 3, this.zzd[i8]);
        }
    }

    private static void zza(int i7, Object obj, zzanm zzanmVar) {
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        if (i9 == 0) {
            zzanmVar.zzb(i8, ((Long) obj).longValue());
        } else if (i9 == 1) {
            zzanmVar.zza(i8, ((Long) obj).longValue());
        } else if (i9 == 2) {
            zzanmVar.zza(i8, (zzaiw) obj);
        } else if (i9 != 3) {
            if (i9 == 5) {
                zzanmVar.zzb(i8, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzakm.zza());
        } else if (zzanmVar.zza() == 1) {
            zzanmVar.zzb(i8);
            ((zzamy) obj).zzb(zzanmVar);
            zzanmVar.zza(i8);
        } else {
            zzanmVar.zza(i8);
            ((zzamy) obj).zzb(zzanmVar);
            zzanmVar.zzb(i8);
        }
    }
}
