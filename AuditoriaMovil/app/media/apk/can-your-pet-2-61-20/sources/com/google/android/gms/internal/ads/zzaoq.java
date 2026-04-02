package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaoq implements zzaco {
    private final zzfv zza;
    private final zzfo zzb = new zzfo();
    private final int zzc;

    public zzaoq(int i, zzfv zzfvVar, int i2) {
        this.zzc = i;
        this.zza = zzfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final zzacn zza(zzadg zzadgVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzf = zzadgVar.zzf();
        int min = (int) Math.min(112800L, zzadgVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, min, false);
        zzfo zzfoVar = this.zzb;
        int zze = zzfoVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzfoVar.zzb() >= 188 && (zza2 = (zza = zzapc.zza(zzfoVar.zzM(), zzfoVar.zzd(), zze)) + 188) <= zze) {
            long zzb = zzapc.zzb(zzfoVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 <= j) {
                    j4 = zza;
                    if (100000 + zzb2 <= j) {
                        j3 = zzb2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzacn.zzd(zzb2, zzf);
                }
                return zzacn.zze(zzf + j4);
            }
            zzfoVar.zzK(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? zzacn.zzf(j3, zzf + j2) : zzacn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzb() {
        byte[] bArr = zzfx.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
