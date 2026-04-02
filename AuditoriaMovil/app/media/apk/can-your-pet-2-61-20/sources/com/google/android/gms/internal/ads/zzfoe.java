package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzfoe {
    private final String zza;
    private zzfph zzb;
    private long zzc;
    private int zzd;

    public zzfoe(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfph(null);
    }

    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfnx.zza().zzg(zza(), this.zza, str);
    }

    public final void zze() {
        zzfnx.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfmz zzfmzVar) {
        zzfnx.zza().zzd(zza(), this.zza, zzfmzVar.zzb());
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfok.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfnx.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfnx.zza().zzg(zza(), this.zza, str);
        }
    }

    public void zzi(zzfnc zzfncVar, zzfna zzfnaVar) {
        zzj(zzfncVar, zzfnaVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzfnc zzfncVar, zzfna zzfnaVar, JSONObject jSONObject) {
        String zzh = zzfncVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfok.zze(jSONObject2, "environment", "app");
        zzfok.zze(jSONObject2, "adSessionType", zzfnaVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfok.zze(jSONObject3, "deviceType", str + "; " + str2);
        zzfok.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfok.zze(jSONObject3, "os", "Android");
        zzfok.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfok.zze(jSONObject2, "deviceCategory", zzfoj.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfok.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfok.zze(jSONObject4, "partnerName", zzfnaVar.zze().zzb());
        zzfok.zze(jSONObject4, "partnerVersion", zzfnaVar.zze().zzc());
        zzfok.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfok.zze(jSONObject5, "libraryVersion", "1.4.10-google_20240110");
        zzfok.zze(jSONObject5, "appId", zzfnv.zzb().zza().getApplicationContext().getPackageName());
        zzfok.zze(jSONObject2, "app", jSONObject5);
        if (zzfnaVar.zzf() != null) {
            zzfok.zze(jSONObject2, "contentUrl", zzfnaVar.zzf());
        }
        zzfok.zze(jSONObject2, "customReferenceData", zzfnaVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfnaVar.zzh().iterator();
        if (it.hasNext()) {
            zzfnj zzfnjVar = (zzfnj) it.next();
            throw null;
        } else {
            zzfnx.zza().zzi(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        }
    }

    public final void zzk(boolean z) {
        if (this.zzb.get() != null) {
            zzfnx.zza().zzh(zza(), this.zza, true != z ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzl(float f) {
        zzfnx.zza().zze(zza(), this.zza, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm(WebView webView) {
        this.zzb = new zzfph(webView);
    }

    public void zzn() {
    }
}
