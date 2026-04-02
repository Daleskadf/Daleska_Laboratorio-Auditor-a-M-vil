package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkz  reason: invalid package */
/* loaded from: classes.dex */
public final class zzkz implements zzla {
    private final zzdc zza;
    private final int zzb;

    public zzkz(zzdc zzdcVar) {
        this.zza = zzdcVar;
        this.zzb = zzdcVar.zzc() + zzdcVar.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        byte[] bArr3;
        if (bArr2.length >= i7) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr2, i7, bArr2.length);
            zzbe zza = zzyn.zza(zzcx.zzb().zza(this.zza).zza(zzzo.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbl.zza())).zzb(zzzo.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzc() + this.zza.zzb()), zzbl.zza())).zza());
            bArr3 = zzkw.zza;
            return zza.zza(copyOfRange, bArr3);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
