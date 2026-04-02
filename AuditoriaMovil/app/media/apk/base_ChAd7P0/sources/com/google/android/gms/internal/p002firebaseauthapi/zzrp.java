package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzrp implements zzqh {
    private static final zzij.zza zza = zzij.zza.zzb;

    public zzrp(zzql zzqlVar) {
        if (zza.zza()) {
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
