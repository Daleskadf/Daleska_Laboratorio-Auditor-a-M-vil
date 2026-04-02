package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzbe extends zzfs {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzQ.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzec.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzP.toString();
    private final DataLayer zzd;

    public zzbe(DataLayer dataLayer) {
        super(zza, zzb);
        this.zzd = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzfs
    public final void zzc(Map map) {
        String zzm;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar != null) {
            Object zzk = zzfu.zzk(zzamVar);
            if (zzk instanceof List) {
                for (Object obj : (List) zzk) {
                    if (obj instanceof Map) {
                        this.zzd.push((Map) obj);
                    }
                }
            }
        }
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar2 == null || (zzm = zzfu.zzm(zzfu.zzk(zzamVar2))) == zzfu.zzl()) {
            return;
        }
        this.zzd.zzd(zzm);
    }
}
