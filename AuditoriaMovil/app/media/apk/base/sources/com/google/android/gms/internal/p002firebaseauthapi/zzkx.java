package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkx  reason: invalid package */
/* loaded from: classes.dex */
final class zzkx implements zzll {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzc() {
        return zzlu.zzk;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, byte[] bArr4) {
        if (bArr.length == 32) {
            if (zzhn.zza()) {
                return zzhn.zza(bArr).zza(bArr2, bArr3, i7, bArr4);
            }
            return new zzhl(bArr).zza(bArr2, Arrays.copyOfRange(bArr3, i7, bArr3.length), bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
