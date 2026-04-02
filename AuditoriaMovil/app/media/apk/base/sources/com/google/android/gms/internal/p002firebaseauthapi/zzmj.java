package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmj  reason: invalid package */
/* loaded from: classes.dex */
public final class zzmj {
    public static zzbe zza(String str) {
        return new zzmm(str, zza());
    }

    public static boolean zzb(String str) {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e7) {
            throw new GeneralSecurityException(e7);
        }
    }
}
