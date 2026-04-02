package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzggw implements zzgfj {
    private final zzgos zza;
    private final zzgrt zzb;
    private final zzgrt zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggw(zzgos zzgosVar, zzggv zzggvVar) {
        zzgrt zzgrtVar;
        this.zza = zzgosVar;
        if (zzgosVar.zzg()) {
            zzgru zzb = zzgnp.zza().zzb();
            zzgrz zza = zzgnh.zza(zzgosVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzgrtVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzgrtVar = zzgnh.zza;
            this.zzb = zzgrtVar;
        }
        this.zzc = zzgrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgoq zzgoqVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = ((zzgfj) zzgoqVar.zze()).zza(bArr, bArr2);
                    zzgoqVar.zza();
                    int length = bArr.length;
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgoq zzgoqVar2 : this.zza.zzf(zzgfo.zza)) {
            try {
                byte[] zza2 = ((zzgfj) zzgoqVar2.zze()).zza(bArr, bArr2);
                zzgoqVar2.zza();
                int length2 = bArr.length;
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
