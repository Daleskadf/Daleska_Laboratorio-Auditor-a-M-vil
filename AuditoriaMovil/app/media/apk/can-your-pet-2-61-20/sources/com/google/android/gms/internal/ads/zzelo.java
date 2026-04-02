package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzelo implements zzegl {
    private final zzems zza;
    private final zzdry zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelo(zzems zzemsVar, zzdry zzdryVar) {
        this.zza = zzemsVar;
        this.zzb = zzdryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegm zza(String str, JSONObject jSONObject) throws zzfgp {
        zzbsn zzbsnVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbE)).booleanValue()) {
            try {
                zzbsnVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Coundn't create RTB adapter: ", e);
                zzbsnVar = null;
            }
        } else {
            zzbsnVar = this.zza.zza(str);
        }
        if (zzbsnVar == null) {
            return null;
        }
        return new zzegm(zzbsnVar, new zzeif(), str);
    }
}
