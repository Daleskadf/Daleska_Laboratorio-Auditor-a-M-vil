package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzm  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzm {
    private final BigInteger zza;

    private zzzm(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzzm zza(BigInteger bigInteger, zzcm zzcmVar) {
        if (zzcmVar != null) {
            return new zzzm(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzcm zzcmVar) {
        if (zzcmVar != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
