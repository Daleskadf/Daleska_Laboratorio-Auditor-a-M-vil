package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcm  reason: invalid package */
/* loaded from: classes.dex */
public final class zzcm {
    private static final zzcm zza = new zzcm();

    private zzcm() {
    }

    public static zzcm zza() {
        return zza;
    }

    public static zzcm zza(zzcm zzcmVar) {
        if (zzcmVar != null) {
            return zzcmVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
