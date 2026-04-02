package com.google.android.gms.tagmanager;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzax extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzi.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzca.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzaE.toString();
    private final DataLayer zzd;

    public zzax(DataLayer dataLayer) {
        super(zza, zzb);
        this.zzd = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        Object obj = this.zzd.get(zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzb))));
        if (obj == null) {
            com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
            return zzamVar != null ? zzamVar : zzfu.zza();
        }
        return zzfu.zzb(obj);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
