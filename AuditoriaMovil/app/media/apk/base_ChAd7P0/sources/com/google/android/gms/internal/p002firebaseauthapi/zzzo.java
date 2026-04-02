package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzo  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzo {
    private final zzzn zza;

    private zzzo(zzzn zzznVar) {
        this.zza = zzznVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzzo zza(byte[] bArr, zzcm zzcmVar) {
        if (zzcmVar != null) {
            return new zzzo(zzzn.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzzo zza(int i7) {
        return new zzzo(zzzn.zza(zzpp.zza(i7)));
    }

    public final byte[] zza(zzcm zzcmVar) {
        if (zzcmVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
