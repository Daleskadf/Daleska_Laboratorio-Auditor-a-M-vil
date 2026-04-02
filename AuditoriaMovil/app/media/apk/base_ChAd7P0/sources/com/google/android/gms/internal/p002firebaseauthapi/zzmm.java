package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmm  reason: invalid package */
/* loaded from: classes.dex */
final class zzmm implements zzbe {
    private final SecretKey zza;

    public zzmm(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.zza = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException(b.h("Keystore cannot load the key with ID: ", str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(RecognitionOptions.ITF, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.zza, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new BadPaddingException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.zza);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            byte[] iv = cipher.getIV();
            if (iv.length == 12) {
                System.arraycopy(iv, 0, bArr3, 0, 12);
                return bArr3;
            }
            throw new GeneralSecurityException("IV has unexpected length");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
