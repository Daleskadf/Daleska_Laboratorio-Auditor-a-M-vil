package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxx  reason: invalid package */
/* loaded from: classes.dex */
final class zzxx extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            return zzym.zza.zza("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
