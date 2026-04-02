package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdr;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzky  reason: invalid package */
/* loaded from: classes.dex */
final class zzky implements zzla {
    private final int zza;

    public zzky(zzdr zzdrVar) {
        if (zzdrVar.zzb() == 12) {
            if (zzdrVar.zzd() == 16) {
                if (zzdrVar.zzf() == zzdr.zza.zzc) {
                    this.zza = zzdrVar.zzc();
                    return;
                }
                throw new GeneralSecurityException("invalid variant");
            }
            throw new GeneralSecurityException("invalid tag size");
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        if (bArr2.length >= i7) {
            if (bArr.length == this.zza) {
                SecretKey zzb = zzgl.zzb(bArr);
                int i8 = i7 + 12;
                if (bArr2.length >= i7 + 28) {
                    AlgorithmParameterSpec zza = zzgl.zza(bArr2, i7, 12);
                    Cipher zza2 = zzgl.zza();
                    zza2.init(2, zzb, zza);
                    return zza2.doFinal(bArr2, i8, (bArr2.length - i7) - 12);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            throw new GeneralSecurityException("invalid key size");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
