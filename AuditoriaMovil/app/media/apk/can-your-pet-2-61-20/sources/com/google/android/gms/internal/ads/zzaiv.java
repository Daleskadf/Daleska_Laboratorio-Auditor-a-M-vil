package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaiv implements zzaiu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaiv(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaiv zzb(long j, long j2, zzadz zzadzVar, zzfo zzfoVar) {
        int zzm;
        zzfoVar.zzL(10);
        int zzg = zzfoVar.zzg();
        if (zzg <= 0) {
            return null;
        }
        int i = zzadzVar.zzd;
        long zzt = zzfx.zzt(zzg, (i >= 32000 ? 1152 : 576) * 1000000, i, RoundingMode.FLOOR);
        int zzq = zzfoVar.zzq();
        int zzq2 = zzfoVar.zzq();
        int zzq3 = zzfoVar.zzq();
        zzfoVar.zzL(2);
        long j3 = j2 + zzadzVar.zzc;
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        long j4 = j2;
        int i2 = 0;
        while (i2 < zzq) {
            long j5 = j3;
            long j6 = zzt;
            jArr[i2] = (i2 * zzt) / zzq;
            jArr2[i2] = Math.max(j4, j5);
            if (zzq3 == 1) {
                zzm = zzfoVar.zzm();
            } else if (zzq3 == 2) {
                zzm = zzfoVar.zzq();
            } else if (zzq3 == 3) {
                zzm = zzfoVar.zzo();
            } else if (zzq3 != 4) {
                return null;
            } else {
                zzm = zzfoVar.zzp();
            }
            j4 += zzm * zzq2;
            i2++;
            j3 = j5;
            zzq = zzq;
            zzt = j6;
        }
        long j7 = zzt;
        if (j != -1 && j != j4) {
            zzfe.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzaiv(jArr, jArr2, j7, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzd(long j) {
        return this.zza[zzfx.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        long[] jArr = this.zza;
        int zzc = zzfx.zzc(jArr, j, true, true);
        zzaeg zzaegVar = new zzaeg(jArr[zzc], this.zzb[zzc]);
        if (zzaegVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i = zzc + 1;
                return new zzaed(zzaegVar, new zzaeg(jArr2[i], this.zzb[i]));
            }
        }
        return new zzaed(zzaegVar, zzaegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
