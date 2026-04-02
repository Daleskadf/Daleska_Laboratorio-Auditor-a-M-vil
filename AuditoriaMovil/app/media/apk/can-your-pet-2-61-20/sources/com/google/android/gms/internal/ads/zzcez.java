package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcez implements zzbky {
    private static final Integer zzb(Map map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt((String) map.get(str)));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcey zzceyVar;
        zzcdn zzcdnVar = (zzcdn) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcer zzy = com.google.android.gms.ads.internal.zzu.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zzd(zzcdnVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcdm zzcdmVar = new zzcdm((String) map.get("flags"));
        boolean z = zzcdmVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzceq zzceqVar = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzceq zzceqVar2 = (zzceq) it.next();
                    if (zzceqVar2.zza == zzcdnVar && str.equals(zzceqVar2.zze())) {
                        zzceqVar = zzceqVar2;
                        break;
                    }
                }
            } else {
                zzceqVar = zzy.zza(zzcdnVar);
            }
            if (zzceqVar != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache task is already running.");
                return;
            } else if (zzcdnVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzcdnVar.zzA(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzcdnVar.zzy(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzcdnVar.zzx(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzcek zzcekVar = zzcdnVar.zzj().zzb;
                if (intValue > 0) {
                    int i2 = zzcdmVar.zzh;
                    int zzu = zzcde.zzu();
                    if (zzu < i2) {
                        zzceyVar = new zzcfh(zzcdnVar, zzcdmVar);
                    } else if (zzu < zzcdmVar.zzb) {
                        zzceyVar = new zzcfe(zzcdnVar, zzcdmVar);
                    } else {
                        zzceyVar = new zzcfc(zzcdnVar);
                    }
                } else {
                    zzceyVar = new zzcfb(zzcdnVar);
                }
                new zzceq(zzcdnVar, zzceyVar, str, strArr).zzb();
            }
        } else {
            zzceq zza = zzy.zza(zzcdnVar);
            if (zza == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache must specify a source.");
                return;
            }
            zzceyVar = zza.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzceyVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzceyVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzceyVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzceyVar.zzq(zzb8.intValue());
        }
    }
}
