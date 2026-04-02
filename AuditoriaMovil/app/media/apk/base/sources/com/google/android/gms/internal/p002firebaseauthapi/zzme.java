package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzme  reason: invalid package */
/* loaded from: classes.dex */
final class zzme implements zzlo {
    private final zzli zza;
    private final zzmd zzb;

    public zzme(zzli zzliVar) {
        zzmd zzmhVar;
        this.zza = zzliVar;
        try {
            zzmhVar = zzmf.zzb();
        } catch (GeneralSecurityException unused) {
            zzmhVar = new zzmh();
        }
        this.zzb = zzmhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] zza(byte[] bArr, zzlr zzlrVar) {
        byte[] zza = this.zzb.zza(zzlrVar.zza().zzb(), bArr);
        byte[] zza2 = zzyc.zza(bArr, zzlrVar.zzb().zzb());
        byte[] zza3 = zzlu.zza(zzlu.zzb);
        zzli zzliVar = this.zza;
        return zzliVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzliVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] zza() {
        if (Arrays.equals(this.zza.zzb(), zzlu.zzf)) {
            return zzlu.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
