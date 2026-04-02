package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzede extends zzbwp {
    private final Context zza;
    private final zzeyf zzb;
    private final zzeyd zzc;
    private final zzedm zzd;
    private final zzgep zze;
    private final zzedj zzf;
    private final zzbxm zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzede(Context context, zzeyf zzeyfVar, zzeyd zzeydVar, zzedj zzedjVar, zzedm zzedmVar, zzgep zzgepVar, zzbxm zzbxmVar) {
        this.zza = context;
        this.zzb = zzeyfVar;
        this.zzc = zzeydVar;
        this.zzf = zzedjVar;
        this.zzd = zzedmVar;
        this.zze = zzgepVar;
        this.zzg = zzbxmVar;
    }

    private final void zzc(ListenableFuture listenableFuture, zzbwt zzbwtVar) {
        zzgee.zzr(zzgee.zzn(zzgdv.zzu(listenableFuture), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(zzfhj.zza((InputStream) obj));
            }
        }, zzcbr.zza), new zzedd(this, zzbwtVar), zzcbr.zzf);
    }

    public final ListenableFuture zzb(zzbwi zzbwiVar, int i) {
        ListenableFuture zzh;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbwiVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final zzedg zzedgVar = new zzedg(zzbwiVar.zza, zzbwiVar.zzb, hashMap, zzbwiVar.zzd, "", zzbwiVar.zze);
        zzeyd zzeydVar = this.zzc;
        zzeydVar.zza(new zzezl(zzbwiVar));
        boolean z = zzedgVar.zzf;
        zzeye zzb = zzeydVar.zzb();
        if (z) {
            String str2 = zzbwiVar.zza;
            String str3 = (String) zzbfz.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    for (String str4 : zzfxe.zzc(zzfwc.zzc(';')).zzd(str3)) {
                        if (host.endsWith(str4)) {
                            zzh = zzgee.zzm(zzb.zza().zza(new JSONObject(), new Bundle()), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzecw
                                @Override // com.google.android.gms.internal.ads.zzfwf
                                public final Object apply(Object obj) {
                                    zzedg zzedgVar2 = zzedg.this;
                                    zzedm.zza(zzedgVar2.zzc, (JSONObject) obj);
                                    return zzedgVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzgee.zzh(zzedgVar);
        zzfkn zzb2 = zzb.zzb();
        return zzgee.zzn(zzb2.zzb(zzfkh.HTTP, zzh).zze(new zzedi(this.zza, "", this.zzg, i)).zza(), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                zzedh zzedhVar = (zzedh) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzedhVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str5 : zzedhVar.zzb.keySet()) {
                        if (str5 != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str6 : (List) zzedhVar.zzb.get(str5)) {
                                if (str6 != null) {
                                    jSONArray.put(str6);
                                }
                            }
                            jSONObject2.put(str5, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzedhVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzedhVar.zzd);
                    return zzgee.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zze(zzbwi zzbwiVar, zzbwt zzbwtVar) {
        zzc(zzb(zzbwiVar, Binder.getCallingUid()), zzbwtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzf(zzbwe zzbweVar, zzbwt zzbwtVar) {
        zzexu zzexuVar = new zzexu(zzbweVar, Binder.getCallingUid());
        zzeyf zzeyfVar = this.zzb;
        zzeyfVar.zza(zzexuVar);
        final zzeyg zzb = zzeyfVar.zzb();
        zzfkn zzb2 = zzb.zzb();
        zzfjs zza = zzb2.zzb(zzfkh.GMS_SIGNALS, zzgee.zzi()).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                Void r3 = (Void) obj;
                return zzeyg.this.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzecz
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzecy
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbwtVar);
        if (((Boolean) zzbft.zzf.zze()).booleanValue()) {
            final zzedm zzedmVar = this.zzd;
            Objects.requireNonNull(zzedmVar);
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedc
                @Override // java.lang.Runnable
                public final void run() {
                    zzedm.this.zzb();
                }
            }, this.zze);
        }
    }
}
