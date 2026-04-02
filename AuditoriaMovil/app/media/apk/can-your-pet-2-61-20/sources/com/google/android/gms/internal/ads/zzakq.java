package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakq extends zzaku {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzfo zzfoVar) {
        return zzk(zzfoVar, zza);
    }

    private static boolean zzk(zzfo zzfoVar, byte[] bArr) {
        if (zzfoVar.zzb() < 8) {
            return false;
        }
        int zzd = zzfoVar.zzd();
        byte[] bArr2 = new byte[8];
        zzfoVar.zzG(bArr2, 0, 8);
        zzfoVar.zzK(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final long zza(zzfo zzfoVar) {
        return zzg(zzaeb.zzd(zzfoVar.zzM()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaku
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) throws zzcc {
        if (zzk(zzfoVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfoVar.zzM(), zzfoVar.zze());
            int i = copyOf[9] & 255;
            List zze = zzaeb.zze(copyOf);
            if (zzakrVar.zza == null) {
                zzak zzakVar = new zzak();
                zzakVar.zzW("audio/opus");
                zzakVar.zzy(i);
                zzakVar.zzX(48000);
                zzakVar.zzL(zze);
                zzakrVar.zza = zzakVar.zzac();
                return true;
            }
        } else if (zzk(zzfoVar, zzb)) {
            zzek.zzb(zzakrVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzfoVar.zzL(8);
                zzby zzb2 = zzaes.zzb(zzfzn.zzl(zzaes.zzc(zzfoVar, false, false).zzb));
                if (zzb2 != null) {
                    zzak zzb3 = zzakrVar.zza.zzb();
                    zzb3.zzP(zzb2.zzd(zzakrVar.zza.zzk));
                    zzakrVar.zza = zzb3.zzac();
                }
            }
        } else {
            zzek.zzb(zzakrVar.zza);
            return false;
        }
        return true;
    }
}
