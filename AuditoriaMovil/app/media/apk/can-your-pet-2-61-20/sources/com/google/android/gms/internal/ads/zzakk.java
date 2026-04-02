package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakk extends zzaku {
    private zzads zza;
    private zzakj zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final long zza(zzfo zzfoVar) {
        if (zzd(zzfoVar.zzM())) {
            int i = (zzfoVar.zzM()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int zza = zzado.zza(zzfoVar, i);
                zzfoVar.zzK(0);
                return zza;
            }
            zzfoVar.zzL(4);
            zzfoVar.zzw();
            int zza2 = zzado.zza(zzfoVar, i);
            zzfoVar.zzK(0);
            return zza2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaku
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) {
        byte[] zzM = zzfoVar.zzM();
        zzads zzadsVar = this.zza;
        if (zzadsVar == null) {
            zzads zzadsVar2 = new zzads(zzM, 17);
            this.zza = zzadsVar2;
            zzakrVar.zza = zzadsVar2.zzc(Arrays.copyOfRange(zzM, 9, zzfoVar.zze()), null);
            return true;
        } else if ((zzM[0] & Byte.MAX_VALUE) == 3) {
            zzadr zzb = zzadp.zzb(zzfoVar);
            zzads zzf = zzadsVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzakj(zzf, zzb);
            return true;
        } else if (zzd(zzM)) {
            zzakj zzakjVar = this.zzb;
            if (zzakjVar != null) {
                zzakjVar.zza(j);
                zzakrVar.zzb = this.zzb;
            }
            zzakrVar.zza.getClass();
            return false;
        } else {
            return true;
        }
    }
}
