package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdno {
    private final zzgep zza;
    private final zzdob zzb;
    private final zzdog zzc;

    public zzdno(zzgep zzgepVar, zzdob zzdobVar, zzdog zzdogVar) {
        this.zza = zzgepVar;
        this.zzb = zzdobVar;
        this.zzc = zzdogVar;
    }

    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar, final JSONObject jSONObject) {
        ListenableFuture zzn;
        final ListenableFuture zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdnm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdky zzdkyVar = new zzdky();
                JSONObject jSONObject2 = jSONObject;
                zzdkyVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdkyVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                zzffz zzffzVar2 = zzffzVar;
                zzdkyVar.zzV(optString);
                zzfgi zzfgiVar = zzffzVar2.zza.zza;
                if (zzfgiVar.zzg.contains(Integer.toString(zzdkyVar.zzc()))) {
                    if (zzdkyVar.zzc() == 3) {
                        if (zzdkyVar.zzA() == null) {
                            throw new zzekh(1, "No custom template id for custom template ad response.");
                        }
                        if (!zzfgiVar.zzh.contains(zzdkyVar.zzA())) {
                            throw new zzekh(1, "Unexpected custom template id in the response.");
                        }
                    }
                    zzffn zzffnVar2 = zzffnVar;
                    zzdkyVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                    String optString2 = jSONObject2.optString("headline", null);
                    if (zzffnVar2.zzN) {
                        com.google.android.gms.ads.internal.zzu.zzp();
                        optString2 = com.google.android.gms.ads.internal.util.zzt.zzy() + " : " + optString2;
                    }
                    zzdkyVar.zzZ("headline", optString2);
                    zzdkyVar.zzZ("body", jSONObject2.optString("body", null));
                    zzdkyVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdkyVar.zzZ("store", jSONObject2.optString("store", null));
                    zzdkyVar.zzZ(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                    zzdkyVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdkyVar;
                }
                throw new zzekh(1, "Invalid template ID: " + zzdkyVar.zzc());
            }
        });
        final ListenableFuture zzf = this.zzb.zzf(jSONObject, "images");
        zzffq zzffqVar = zzffzVar.zzb.zzb;
        zzdob zzdobVar = this.zzb;
        final ListenableFuture zzg = zzdobVar.zzg(jSONObject, "images", zzffnVar, zzffqVar);
        final ListenableFuture zze = zzdobVar.zze(jSONObject, "secondary_image");
        final ListenableFuture zze2 = zzdobVar.zze(jSONObject, "app_icon");
        final ListenableFuture zzd = zzdobVar.zzd(jSONObject, "attribution");
        final ListenableFuture zzh = this.zzb.zzh(jSONObject, zzffnVar, zzffzVar.zzb.zzb);
        final ListenableFuture zza = this.zzc.zza(jSONObject, "custom_assets");
        if (!jSONObject.optBoolean("enable_omid")) {
            zzn = zzgee.zzh(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzgee.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzgee.zzh(null);
                } else {
                    final zzdob zzdobVar2 = this.zzb;
                    zzn = zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdnq
                        @Override // com.google.android.gms.internal.ads.zzgdl
                        public final ListenableFuture zza(Object obj) {
                            return zzdob.this.zzc(optString, obj);
                        }
                    }, zzcbr.zze);
                }
            }
        }
        final ListenableFuture listenableFuture = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
            arrayList.add(listenableFuture);
        }
        return zzgee.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdnn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdky zzdkyVar = (zzdky) zzb.get();
                zzdkyVar.zzP((List) zzf.get());
                zzdkyVar.zzM((zzbhe) zze2.get());
                zzdkyVar.zzQ((zzbhe) zze.get());
                zzdkyVar.zzJ((zzbgx) zzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdkyVar.zzS(zzdob.zzj(jSONObject2));
                zzdkyVar.zzL(zzdob.zzi(jSONObject2));
                zzcgm zzcgmVar = (zzcgm) zzh.get();
                if (zzcgmVar != null) {
                    zzdkyVar.zzad(zzcgmVar);
                    zzdkyVar.zzac(zzcgmVar.zzF());
                    zzdkyVar.zzab(zzcgmVar.zzq());
                }
                zzcgm zzcgmVar2 = (zzcgm) zzg.get();
                if (zzcgmVar2 != null) {
                    zzdkyVar.zzO(zzcgmVar2);
                    zzdkyVar.zzae(zzcgmVar2.zzF());
                }
                ListenableFuture listenableFuture2 = listenableFuture;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
                    zzdkyVar.zzU(listenableFuture2);
                    zzdkyVar.zzX(new zzcbw());
                } else {
                    zzcgm zzcgmVar3 = (zzcgm) listenableFuture2.get();
                    if (zzcgmVar3 != null) {
                        zzdkyVar.zzT(zzcgmVar3);
                    }
                }
                for (zzdof zzdofVar : (List) zza.get()) {
                    if (zzdofVar.zza != 1) {
                        zzdkyVar.zzN(zzdofVar.zzb, zzdofVar.zzd);
                    } else {
                        zzdkyVar.zzZ(zzdofVar.zzb, zzdofVar.zzc);
                    }
                }
                return zzdkyVar;
            }
        }, this.zza);
    }
}
