package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaix implements zzaiu {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzaix(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzaix zzb(long j, zzaiw zzaiwVar, long j2) {
        zzadz zzadzVar;
        long j3 = zzaiwVar.zzb;
        if (j3 == -1) {
            j3 = -1;
        }
        long zzs = zzfx.zzs((j3 * zzadzVar.zzg) - 1, zzaiwVar.zza.zzd);
        long j4 = zzaiwVar.zzc;
        if (j4 == -1 || zzaiwVar.zzf == null) {
            return new zzaix(j2, zzaiwVar.zza.zzc, zzs, -1L, null);
        }
        if (j != -1) {
            long j5 = j2 + j4;
            if (j != j5) {
                zzfe.zzf("XingSeeker", "XING data size mismatch: " + j + ", " + j5);
            }
        }
        return new zzaix(j2, zzaiwVar.zza.zzc, zzs, zzaiwVar.zzc, zzaiwVar.zzf);
    }

    private final long zze(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzd(long j) {
        if (zzh()) {
            long j2 = j - this.zza;
            if (j2 <= this.zzb) {
                return 0L;
            }
            long[] jArr = this.zzf;
            zzek.zzb(jArr);
            double d = (j2 * 256.0d) / this.zzd;
            int zzc = zzfx.zzc(jArr, (long) d, true, true);
            long zze = zze(zzc);
            long j3 = jArr[zzc];
            int i = zzc + 1;
            long zze2 = zze(i);
            long j4 = zzc == 99 ? 256L : jArr[i];
            return zze + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (zze2 - zze));
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        if (!zzh()) {
            zzaeg zzaegVar = new zzaeg(0L, this.zza + this.zzb);
            return new zzaed(zzaegVar, zzaegVar);
        }
        long max = Math.max(0L, Math.min(j, this.zzc));
        double d = (max * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzf;
                zzek.zzb(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.zzd;
        zzaeg zzaegVar2 = new zzaeg(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new zzaed(zzaegVar2, zzaegVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return this.zzf != null;
    }
}
