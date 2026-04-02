package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyPairGenerator;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzyw implements zzys<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
