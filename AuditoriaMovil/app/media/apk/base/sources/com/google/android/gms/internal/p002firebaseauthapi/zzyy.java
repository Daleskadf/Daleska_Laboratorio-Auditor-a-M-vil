package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.MessageDigest;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyy  reason: invalid package */
/* loaded from: classes.dex */
public final class zzyy implements zzys<MessageDigest> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ MessageDigest zza(String str, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
