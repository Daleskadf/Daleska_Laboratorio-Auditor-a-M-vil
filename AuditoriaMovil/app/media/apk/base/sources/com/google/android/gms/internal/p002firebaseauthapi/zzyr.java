package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyr  reason: invalid package */
/* loaded from: classes.dex */
final class zzyr<JcePrimitiveT> implements zzyq<JcePrimitiveT> {
    private final zzys<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyq
    public final JcePrimitiveT zza(String str) {
        Exception exc = null;
        for (Provider provider : zzym.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    private zzyr(zzys<JcePrimitiveT> zzysVar) {
        this.zza = zzysVar;
    }
}
