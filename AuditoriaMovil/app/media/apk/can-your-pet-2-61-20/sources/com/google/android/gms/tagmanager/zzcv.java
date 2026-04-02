package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzcv extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzM.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzV.toString();
    private final Context zzc;

    public zzcv(Context context) {
        super(zza, new String[0]);
        this.zzc = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str = zzb;
        String zzb2 = zzcw.zzb(this.zzc, ((com.google.android.gms.internal.gtm.zzam) map.get(str)) != null ? zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(str))) : null);
        return zzb2 != null ? zzfu.zzb(zzb2) : zzfu.zza();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
