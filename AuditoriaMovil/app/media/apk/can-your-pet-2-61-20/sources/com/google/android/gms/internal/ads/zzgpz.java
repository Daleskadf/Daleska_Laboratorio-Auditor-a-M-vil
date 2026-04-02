package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgpz implements zzggj {
    private static final zzgpz zza = new zzgpz();

    private zzgpz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd() throws GeneralSecurityException {
        zzgnr.zza().zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final Class zza() {
        return zzgpw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final Class zzb() {
        return zzgpw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* bridge */ /* synthetic */ Object zzc(zzgos zzgosVar) throws GeneralSecurityException {
        if (zzgosVar.zzb() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        for (List<zzgoq> list : zzgosVar.zze()) {
            for (zzgoq zzgoqVar : list) {
                zzgpw zzgpwVar = (zzgpw) zzgoqVar.zze();
            }
        }
        return new zzgpy(zzgosVar, null);
    }
}
