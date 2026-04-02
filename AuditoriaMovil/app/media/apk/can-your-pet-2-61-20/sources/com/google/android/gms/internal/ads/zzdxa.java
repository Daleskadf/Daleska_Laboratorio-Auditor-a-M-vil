package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdxa {
    private final zzdwk zza;
    private final zzdrv zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxa(zzdwk zzdwkVar, zzdrv zzdrvVar) {
        this.zza = zzdwkVar;
        this.zzb = zzdrvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdru zza;
        zzbtc zzbtcVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbmw zzbmwVar = (zzbmw) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjk)).booleanValue()) {
                    zzdru zza2 = this.zzb.zza(zzbmwVar.zza);
                    if (zza2 != null && (zzbtcVar = zza2.zzc) != null) {
                        str = zzbtcVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjl)).booleanValue() && (zza = this.zzb.zza(zzbmwVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbmwVar.zza;
                    list2.add(new zzdwz(str3, str2, this.zzb.zzb(str3), zzbmwVar.zzb ? 1 : 0, zzbmwVar.zzd, zzbmwVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbmwVar.zza;
                list22.add(new zzdwz(str32, str2, this.zzb.zzb(str32), zzbmwVar.zzb ? 1 : 0, zzbmwVar.zzd, zzbmwVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            for (zzdwz zzdwzVar : this.zzd) {
                jSONArray.put(zzdwzVar.zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdwy(this));
    }
}
