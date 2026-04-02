package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzml  reason: invalid package */
/* loaded from: classes.dex */
public final class zzml implements zzbe {
    private static final String zza = "zzml";
    private final zzbe zzb;

    public zzml(String str) {
        this.zzb = zzmj.zza(str);
    }

    private static void zza() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        try {
            return this.zzb.zzb(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e7) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e7);
            zza();
            return this.zzb.zzb(bArr, bArr2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            return this.zzb.zza(bArr, bArr2);
        } catch (GeneralSecurityException e7) {
            e = e7;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return this.zzb.zza(bArr, bArr2);
        } catch (ProviderException e8) {
            e = e8;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return this.zzb.zza(bArr, bArr2);
        } catch (BadPaddingException e9) {
            throw e9;
        }
    }
}
