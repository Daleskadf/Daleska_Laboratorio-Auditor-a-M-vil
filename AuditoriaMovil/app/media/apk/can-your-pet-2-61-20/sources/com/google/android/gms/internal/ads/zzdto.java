package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdto implements zzdbl, zzdae, zzcyt, zzdgz {
    private final zzduc zza;
    private final zzdum zzb;

    public zzdto(zzduc zzducVar, zzdum zzdumVar) {
        this.zza = zzducVar;
        this.zzb = zzdumVar;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzc(str, String.valueOf(j));
            }
        }
    }

    private final void zzf(Bundle bundle, zzfzn zzfznVar) {
        int size = zzfznVar.size();
        for (int i = 0; i < size; i++) {
            zzdtr zzdtrVar = (zzdtr) zzfznVar.get(i);
            long j = bundle.getLong(zzdtrVar.zza().zza(), -1L);
            long j2 = bundle.getLong(zzdtrVar.zzb().zza(), -1L);
            if (j > 0 && j2 > 0) {
                this.zza.zzc(zzdtrVar.zzc(), String.valueOf(j2 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    @Override // com.google.android.gms.internal.ads.zzdgz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzap r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzhd
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r7 != 0) goto L3b
            com.google.android.gms.internal.ads.zzduc r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            r7.put(r1, r0)
            com.google.android.gms.internal.ads.zzduc r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.zzdum r7 = r6.zzb
            com.google.android.gms.internal.ads.zzduc r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        L3b:
            com.google.android.gms.internal.ads.zzbxd r2 = r7.zzc
            com.google.android.gms.internal.ads.zzbdq r3 = com.google.android.gms.internal.ads.zzbdz.zzcc
            com.google.android.gms.internal.ads.zzbdx r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6b
            if (r2 == 0) goto L6b
            android.os.Bundle r2 = r2.zzm
            if (r2 == 0) goto L6b
            com.google.android.gms.internal.ads.zzdtq r3 = com.google.android.gms.internal.ads.zzdtq.PUBLIC_API_CALLBACK
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.putLong(r3, r4)
            com.google.android.gms.internal.ads.zzfzn r3 = com.google.android.gms.internal.ads.zzdtr.zza
            r6.zzf(r2, r3)
        L6b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcc
            java.lang.String r3 = r7.zzb     // Catch: org.json.JSONException -> Lcc
            r2.<init>(r3)     // Catch: org.json.JSONException -> Lcc
            com.google.android.gms.internal.ads.zzduc r3 = r6.zza
            java.util.Map r3 = r3.zzb()
            r3.put(r1, r0)
            com.google.android.gms.internal.ads.zzduc r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzjA
            com.google.android.gms.internal.ads.zzbdx r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L94
            goto Lae
        L94:
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> La8
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> La8
            if (r1 == 0) goto La5
            java.lang.String r1 = "1"
            goto Lb0
        La5:
            java.lang.String r1 = "0"
            goto Lb0
        La8:
            r1 = move-exception
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
        Lae:
            java.lang.String r1 = "na"
        Lb0:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbxd r7 = r7.zzc
            if (r7 == 0) goto Lc0
            com.google.android.gms.internal.ads.zzduc r0 = r6.zza
            android.os.Bundle r7 = r7.zza
            r0.zze(r7)
        Lc0:
            com.google.android.gms.internal.ads.zzdum r7 = r6.zzb
            com.google.android.gms.internal.ads.zzduc r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        Lcc:
            com.google.android.gms.internal.ads.zzduc r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "sgf"
            r7.put(r1, r0)
            com.google.android.gms.internal.ads.zzduc r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.zzdum r7 = r6.zzb
            com.google.android.gms.internal.ads.zzduc r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdto.zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzap):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
        this.zza.zze(zzbxdVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
        this.zza.zzd(zzffzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhd)).booleanValue()) {
            this.zza.zzb().put("action", "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzf(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        this.zza.zzb().put("action", "loaded");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue()) {
            this.zza.zza().putLong(zzdtq.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzf(this.zza.zza(), zzdtr.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzmj)).booleanValue()) {
            this.zza.zzb().put("mafe", true != WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzf(this.zza.zzb());
    }
}
