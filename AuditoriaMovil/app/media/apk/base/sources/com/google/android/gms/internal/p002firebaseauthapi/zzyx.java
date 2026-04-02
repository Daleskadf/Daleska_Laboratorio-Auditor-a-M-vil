package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyx  reason: invalid package */
/* loaded from: classes.dex */
public final class zzyx implements zzys<KeyFactory> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
