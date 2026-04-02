package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzbp {
    private final zzcg zza;

    private zzbp(zzcg zzcgVar) {
        this.zza = zzcgVar;
    }

    public static zzbp zza(zzcg zzcgVar) {
        return new zzbp(zzcgVar);
    }

    private final zzwf zzb() {
        try {
            zzcg zzcgVar = this.zza;
            if (zzcgVar instanceof zznp) {
                return ((zznp) zzcgVar).zzb().zza();
            }
            return ((zzpm) zzom.zza().zza((zzom) this.zza, (Class<zzpq>) zzpm.class)).zza();
        } catch (GeneralSecurityException e7) {
            throw new zzpw("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(this.zza)), e7);
        }
    }

    public final zzcg zza() {
        zzcg zzcgVar = this.zza;
        return zzcgVar != null ? zzcgVar : zzco.zza(zzb().zzk());
    }
}
