package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzr {
    private final zzcik zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzfgi zzd;
    private final Executor zze;
    private final String zzf;
    private final zzflh zzg;
    private final zzfgx zzh;
    private final zzduc zzi;

    public zzdzr(zzcik zzcikVar, Context context, VersionInfoParcel versionInfoParcel, zzfgi zzfgiVar, Executor executor, String str, zzflh zzflhVar, zzduc zzducVar) {
        this.zza = zzcikVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzfgiVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzflhVar;
        this.zzh = zzcikVar.zzx();
        this.zzi = zzducVar;
    }

    private final ListenableFuture zzc(final String str, final String str2) {
        zzfkw zza = zzfkv.zza(this.zzb, zzflo.CUI_NAME_ADREQUEST_PARSERESPONSE);
        zza.zzi();
        final zzbpg zza2 = com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzb, this.zzc, this.zza.zzz()).zza("google.afma.response.normalize", zzbpn.zza, zzbpn.zza);
        ListenableFuture zzn = zzgee.zzn(zzgee.zzn(zzgee.zzn(zzgee.zzh(""), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzo
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = str;
                String str5 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str4);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str5));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgee.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzp
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzbpg.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzdzr.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzflg.zzb(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzr.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(JSONObject jSONObject) throws Exception {
        return zzgee.zzh(new zzffz(new zzffw(this.zzd), zzffy.zza(new StringReader(jSONObject.toString()), null)));
    }
}
