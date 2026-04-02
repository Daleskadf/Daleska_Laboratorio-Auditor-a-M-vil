package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzyb implements zzbe {
    private static final zzij.zza zza = zzij.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    private zzyb(byte[] bArr, zzzn zzznVar) {
        if (zza.zza()) {
            this.zzb = zzgl.zzb(bArr);
            this.zzc = zzznVar.zzb();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzbe zza(zzdm zzdmVar) {
        if (zzdmVar.zzc().zzb() == 12) {
            if (zzdmVar.zzc().zzd() == 16) {
                return new zzyb(zzdmVar.zze().zza(zzbl.zza()), zzdmVar.zzd());
            }
            throw new GeneralSecurityException(b.e(zzdmVar.zzc().zzd(), "Expected tag Size 16, got "));
        }
        throw new GeneralSecurityException(b.e(zzdmVar.zzc().zzb(), "Expected IV Size 12, got "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            byte[] zza2 = zzpp.zza(12);
            AlgorithmParameterSpec zza3 = zzgl.zza(zza2);
            Cipher zza4 = zzgl.zza();
            zza4.init(1, this.zzb, zza3);
            if (bArr2 != null && bArr2.length != 0) {
                zza4.updateAAD(bArr2);
            }
            int outputSize = zza4.getOutputSize(bArr.length);
            byte[] bArr3 = this.zzc;
            if (outputSize <= 2147483635 - bArr3.length) {
                byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
                System.arraycopy(zza2, 0, copyOf, this.zzc.length, 12);
                if (zza4.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + 12) == outputSize) {
                    return copyOf;
                }
                throw new GeneralSecurityException("not enough data written");
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new NullPointerException("plaintext is null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zzc;
            if (length >= bArr3.length + 28) {
                if (zzpy.zza(bArr3, bArr)) {
                    AlgorithmParameterSpec zza2 = zzgl.zza(bArr, this.zzc.length, 12);
                    Cipher zza3 = zzgl.zza();
                    zza3.init(2, this.zzb, zza2);
                    if (bArr2 != null && bArr2.length != 0) {
                        zza3.updateAAD(bArr2);
                    }
                    byte[] bArr4 = this.zzc;
                    return zza3.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
