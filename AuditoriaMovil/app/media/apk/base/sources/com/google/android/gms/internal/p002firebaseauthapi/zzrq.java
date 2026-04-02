package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzrq implements zzqh {
    private static final zzij.zza zza = zzij.zza.zza;

    public zzrq(zzqa zzqaVar) {
        if (zza.zza()) {
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
