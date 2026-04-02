package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyn  reason: invalid package */
/* loaded from: classes.dex */
public final class zzyn implements zzbe {
    private final zzzd zza;
    private final zzcd zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzyn(zzzd zzzdVar, zzcd zzcdVar, int i7, byte[] bArr) {
        this.zza = zzzdVar;
        this.zzb = zzcdVar;
        this.zzc = i7;
        this.zzd = bArr;
    }

    public static zzbe zza(zzcx zzcxVar) {
        return new zzyn(new zzxu(zzcxVar.zze().zza(zzbl.zza()), zzcxVar.zzc().zzd()), new zzzg(new zzze("HMAC".concat(String.valueOf(zzcxVar.zzc().zzg())), new SecretKeySpec(zzcxVar.zzf().zza(zzbl.zza()), "HMAC")), zzcxVar.zzc().zze()), zzcxVar.zzc().zze(), zzcxVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] zzb = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzyc.zza(this.zzd, zzb, this.zzb.zza(zzyc.zza(bArr2, zzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length >= i7 + bArr3.length) {
            if (zzpy.zza(bArr3, bArr)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                this.zzb.zza(copyOfRange2, zzyc.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
                return this.zza.zza(copyOfRange);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
