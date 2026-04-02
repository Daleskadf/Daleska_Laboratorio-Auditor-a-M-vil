package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyp  reason: invalid package */
/* loaded from: classes.dex */
final class zzyp<JcePrimitiveT> implements zzyq<JcePrimitiveT> {
    private final zzys<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyq
    public final JcePrimitiveT zza(String str) {
        Exception exc = null;
        for (Provider provider : zzym.zza("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzyp(zzys<JcePrimitiveT> zzysVar) {
        this.zza = zzysVar;
    }
}
