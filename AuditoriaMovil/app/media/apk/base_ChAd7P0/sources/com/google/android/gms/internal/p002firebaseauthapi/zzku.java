package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzku  reason: invalid package */
/* loaded from: classes.dex */
final class zzku implements zzll {
    private final int zza;

    public zzku(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(b.e(i7, "Unsupported key length: "));
        }
        this.zza = i7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzc() {
        int i7 = this.zza;
        if (i7 != 16) {
            if (i7 == 32) {
                return zzlu.zzj;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzlu.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzhk(bArr).zza(bArr2, bArr3, i7, bArr4);
        }
        throw new InvalidAlgorithmParameterException(b.e(bArr.length, "Unexpected key length: "));
    }
}
