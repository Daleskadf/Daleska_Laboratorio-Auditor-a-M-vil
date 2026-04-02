package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzapl {
    public static Pair zza(zzadg zzadgVar) throws IOException {
        zzadgVar.zzj();
        zzapk zzd = zzd(1684108385, zzadgVar, new zzfo(8));
        ((zzact) zzadgVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzadgVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzapj zzb(zzadg zzadgVar) throws IOException {
        byte[] bArr;
        zzfo zzfoVar = new zzfo(16);
        zzapk zzd = zzd(1718449184, zzadgVar, zzfoVar);
        zzek.zzf(zzd.zzb >= 16);
        zzact zzactVar = (zzact) zzadgVar;
        zzactVar.zzm(zzfoVar.zzM(), 0, 16, false);
        zzfoVar.zzK(0);
        int zzk = zzfoVar.zzk();
        int zzk2 = zzfoVar.zzk();
        int zzj = zzfoVar.zzj();
        int zzj2 = zzfoVar.zzj();
        int zzk3 = zzfoVar.zzk();
        int zzk4 = zzfoVar.zzk();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzactVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzfx.zzf;
        }
        byte[] bArr2 = bArr;
        zzactVar.zzo((int) (zzadgVar.zze() - zzadgVar.zzf()), false);
        return new zzapj(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr2);
    }

    public static boolean zzc(zzadg zzadgVar) throws IOException {
        zzfo zzfoVar = new zzfo(8);
        int i = zzapk.zza(zzadgVar, zzfoVar).zza;
        if (i == 1380533830 || i == 1380333108) {
            ((zzact) zzadgVar).zzm(zzfoVar.zzM(), 0, 4, false);
            zzfoVar.zzK(0);
            int zzg = zzfoVar.zzg();
            if (zzg != 1463899717) {
                zzfe.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
                return false;
            }
            return true;
        }
        return false;
    }

    private static zzapk zzd(int i, zzadg zzadgVar, zzfo zzfoVar) throws IOException {
        zzapk zza = zzapk.zza(zzadgVar, zzfoVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzfe.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j > 2147483647L) {
                int i3 = zza.zza;
                throw zzcc.zzc("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            ((zzact) zzadgVar).zzo((int) j, false);
            zza = zzapk.zza(zzadgVar, zzfoVar);
        }
    }
}
