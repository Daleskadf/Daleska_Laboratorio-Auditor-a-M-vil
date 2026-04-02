package com.google.android.gms.tagmanager;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zze extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zza.toString();
    private final zzd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(zzd zzdVar) {
        super(zza, new String[0]);
        this.zzb = zzdVar;
        zzdVar.zzc();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzc = this.zzb.zzc();
        return zzc == null ? zzfu.zza() : zzfu.zzb(zzc);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
