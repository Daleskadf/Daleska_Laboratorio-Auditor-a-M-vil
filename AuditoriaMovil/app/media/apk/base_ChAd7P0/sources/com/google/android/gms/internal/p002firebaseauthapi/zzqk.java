package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqk  reason: invalid package */
/* loaded from: classes.dex */
public final class zzqk implements zzpk<zzqh, zzqh> {
    private static final zzqk zza = new zzqk();

    private zzqk() {
    }

    public static void zzc() {
        zzon.zza().zza(zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpk
    public final Class<zzqh> zza() {
        return zzqh.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpk
    public final Class<zzqh> zzb() {
        return zzqh.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpk
    public final /* synthetic */ zzqh zza(zzpg<zzqh> zzpgVar) {
        if (zzpgVar != null) {
            if (zzpgVar.zzb() != null) {
                for (List<zzpi<zzqh>> list : zzpgVar.zzd()) {
                    for (zzpi<zzqh> zzpiVar : list) {
                        zzpiVar.zzd();
                    }
                }
                return new zzqj(zzpgVar);
            }
            throw new GeneralSecurityException("no primary in primitive set");
        }
        throw new GeneralSecurityException("primitive set must be non-null");
    }
}
