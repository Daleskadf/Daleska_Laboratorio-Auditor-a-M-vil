package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzh extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzH.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzV.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzZ.toString();
    private final Context zzd;

    public zzh(Context context) {
        super(zza, zzc);
        this.zzd = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar == null) {
            return zzfu.zza();
        }
        String zzm = zzfu.zzm(zzfu.zzk(zzamVar));
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        String zzm2 = zzamVar2 != null ? zzfu.zzm(zzfu.zzk(zzamVar2)) : null;
        Context context = this.zzd;
        String str = (String) zzcw.zza.get(zzm);
        if (str == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str = sharedPreferences != null ? sharedPreferences.getString(zzm, "") : "";
            zzcw.zza.put(zzm, str);
        }
        String zza2 = zzcw.zza(str, zzm2);
        return zza2 != null ? zzfu.zzb(zza2) : zzfu.zza();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
