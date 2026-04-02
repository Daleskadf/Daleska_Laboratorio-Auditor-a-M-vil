package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekf {
    private final zzfha zza;
    private final zzdrv zzb;
    private final zzduh zzc;

    public zzekf(zzfha zzfhaVar, zzdrv zzdrvVar, zzduh zzduhVar) {
        this.zza = zzfhaVar;
        this.zzb = zzdrvVar;
        this.zzc = zzduhVar;
    }

    public final void zza(zzffq zzffqVar, zzffn zzffnVar, int i, @Nullable zzegn zzegnVar, long j) {
        zzdru zzdruVar;
        zzdug zza = this.zzc.zza();
        zza.zzd(zzffqVar);
        zza.zzc(zzffnVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j));
        zza.zzb("sc", Integer.toString(i));
        if (zzegnVar != null) {
            zza.zzb("arec", Integer.toString(zzegnVar.zzb().zza));
            String zza2 = this.zza.zza(zzegnVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdrv zzdrvVar = this.zzb;
        Iterator it = zzffnVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdruVar = null;
                break;
            }
            zzdruVar = zzdrvVar.zza((String) it.next());
            if (zzdruVar != null) {
                break;
            }
        }
        if (zzdruVar != null) {
            zza.zzb("ancn", zzdruVar.zza);
            zzbtc zzbtcVar = zzdruVar.zzb;
            if (zzbtcVar != null) {
                zza.zzb("adapter_v", zzbtcVar.toString());
            }
            zzbtc zzbtcVar2 = zzdruVar.zzc;
            if (zzbtcVar2 != null) {
                zza.zzb("adapter_sv", zzbtcVar2.toString());
            }
        }
        zza.zzf();
    }
}
