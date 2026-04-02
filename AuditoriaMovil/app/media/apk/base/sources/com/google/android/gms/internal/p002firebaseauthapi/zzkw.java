package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzkw {
    private static final byte[] zza = new byte[0];

    public static zzla zza(zzjq zzjqVar) {
        zzcg zzb = zzjqVar.zzb();
        if (zzb instanceof zzdr) {
            return new zzky((zzdr) zzb);
        }
        if (zzb instanceof zzdc) {
            return new zzkz((zzdc) zzb);
        }
        if (zzb instanceof zzit) {
            return new zzlb((zzit) zzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(zzb)));
    }
}
