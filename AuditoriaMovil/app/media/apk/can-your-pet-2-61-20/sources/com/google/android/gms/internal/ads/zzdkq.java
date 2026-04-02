package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdkq implements zzazy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdkt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkq(zzdkt zzdktVar, String str) {
        this.zza = str;
        this.zzb = zzdktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzdp(zzazx zzazxVar) {
        Map map;
        zzdmu zzdmuVar;
        zzdmu zzdmuVar2;
        zzdmu zzdmuVar3;
        zzdmu zzdmuVar4;
        Map map2;
        zzdmu zzdmuVar5;
        zzdmu zzdmuVar6;
        zzdmu zzdmuVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbJ)).booleanValue()) {
            if (zzazxVar.zzj) {
                zzdkt zzdktVar = this.zzb;
                String str = this.zza;
                map = zzdktVar.zzy;
                map.put(str, true);
                zzdkt zzdktVar2 = this.zzb;
                zzdmuVar = zzdktVar2.zzo;
                View zzf = zzdmuVar.zzf();
                zzdmuVar2 = this.zzb.zzo;
                Map zzl = zzdmuVar2.zzl();
                zzdmuVar3 = this.zzb.zzo;
                zzdktVar2.zzA(zzf, zzl, zzdmuVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzazxVar.zzj) {
                zzdkt zzdktVar3 = this.zzb;
                zzdmuVar4 = zzdktVar3.zzo;
                if (zzdmuVar4 == null) {
                    return;
                }
                map2 = zzdktVar3.zzy;
                map2.put(this.zza, true);
                zzdkt zzdktVar4 = this.zzb;
                zzdmuVar5 = zzdktVar4.zzo;
                View zzf2 = zzdmuVar5.zzf();
                zzdmuVar6 = this.zzb.zzo;
                Map zzl2 = zzdmuVar6.zzl();
                zzdmuVar7 = this.zzb.zzo;
                zzdktVar4.zzA(zzf2, zzl2, zzdmuVar7.zzm(), true);
            }
        }
    }
}
