package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyg  reason: invalid package */
/* loaded from: classes.dex */
public final class zzyg {
    private ECPrivateKey zza;

    public zzyg(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i7, zzyk zzykVar) {
        byte[] zza = zzyc.zza(bArr, zzyi.zza(this.zza, zzyi.zza(this.zza.getParams(), zzykVar, bArr)));
        Mac zza2 = zzym.zzb.zza(str);
        if (i7 <= zza2.getMacLength() * 255) {
            if (bArr2 != null && bArr2.length != 0) {
                zza2.init(new SecretKeySpec(bArr2, str));
            } else {
                zza2.init(new SecretKeySpec(new byte[zza2.getMacLength()], str));
            }
            byte[] doFinal = zza2.doFinal(zza);
            byte[] bArr4 = new byte[i7];
            zza2.init(new SecretKeySpec(doFinal, str));
            byte[] bArr5 = new byte[0];
            int i8 = 1;
            int i9 = 0;
            while (true) {
                zza2.update(bArr5);
                zza2.update(bArr3);
                zza2.update((byte) i8);
                bArr5 = zza2.doFinal();
                if (bArr5.length + i9 < i7) {
                    System.arraycopy(bArr5, 0, bArr4, i9, bArr5.length);
                    i9 += bArr5.length;
                    i8++;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i9, i7 - i9);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
