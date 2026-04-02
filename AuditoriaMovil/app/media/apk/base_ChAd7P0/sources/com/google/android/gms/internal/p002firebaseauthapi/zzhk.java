package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhk  reason: invalid package */
/* loaded from: classes.dex */
public final class zzhk {
    private static final zzij.zza zza = zzij.zza.zzb;
    private final SecretKey zzb;

    public zzhk(byte[] bArr) {
        if (zza.zza()) {
            this.zzb = zzgl.zzb(bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3) {
        if (bArr.length == 12) {
            if (bArr2.length >= i7 + 16) {
                AlgorithmParameterSpec zza2 = zzgl.zza(bArr);
                Cipher zza3 = zzgl.zza();
                zza3.init(2, this.zzb, zza2);
                if (bArr3 != null && bArr3.length != 0) {
                    zza3.updateAAD(bArr3);
                }
                return zza3.doFinal(bArr2, i7, bArr2.length - i7);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3) {
        if (bArr.length == 12) {
            AlgorithmParameterSpec zza2 = zzgl.zza(bArr);
            Cipher zza3 = zzgl.zza();
            zza3.init(1, this.zzb, zza2);
            if (bArr3 != null && bArr3.length != 0) {
                zza3.updateAAD(bArr3);
            }
            int outputSize = zza3.getOutputSize(bArr2.length);
            if (outputSize <= f.API_PRIORITY_OTHER - i7) {
                byte[] bArr4 = new byte[i7 + outputSize];
                if (zza3.doFinal(bArr2, 0, bArr2.length, bArr4, i7) == outputSize) {
                    return bArr4;
                }
                throw new GeneralSecurityException("not enough data written");
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
