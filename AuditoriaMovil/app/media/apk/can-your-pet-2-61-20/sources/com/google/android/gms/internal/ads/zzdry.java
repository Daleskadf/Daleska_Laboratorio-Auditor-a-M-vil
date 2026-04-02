package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdry {
    private final zzfhe zza;
    private final zzdrv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdry(zzfhe zzfheVar, zzdrv zzdrvVar) {
        this.zza = zzfheVar;
        this.zzb = zzdrvVar;
    }

    final zzbqo zza() throws RemoteException {
        zzbqo zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbsn zzb(String str) throws RemoteException {
        zzbsn zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfhg zzc(String str, JSONObject jSONObject) throws zzfgp {
        zzbqr zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbrp(new AdMobAdapter());
            } else if (!"com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbqo zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            } else {
                zzb = new zzbrp(new zzbtg());
            }
            zzfhg zzfhgVar = new zzfhg(zzb);
            this.zzb.zzc(str, zzfhgVar);
            return zzfhgVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjl)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfgp(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
