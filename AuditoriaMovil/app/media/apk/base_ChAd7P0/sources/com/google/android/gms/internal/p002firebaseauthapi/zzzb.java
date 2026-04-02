package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.security.Signature;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzb implements zzys<Signature> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ Signature zza(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
