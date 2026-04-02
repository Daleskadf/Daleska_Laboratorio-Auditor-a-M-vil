package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzpp {
    private static final ThreadLocal<SecureRandom> zza = new zzpo();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzb = zzb();
        zzb.nextLong();
        return zzb;
    }

    private static SecureRandom zzb() {
        Provider zza2 = zzmr.zza();
        if (zza2 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", zza2);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider zzb = zzmr.zzb();
        if (zzb != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", zzb);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    public static byte[] zza(int i7) {
        byte[] bArr = new byte[i7];
        zza.get().nextBytes(bArr);
        return bArr;
    }
}
