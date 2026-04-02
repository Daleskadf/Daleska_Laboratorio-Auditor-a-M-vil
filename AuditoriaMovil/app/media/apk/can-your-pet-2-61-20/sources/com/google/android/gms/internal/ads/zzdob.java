package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdob {
    private final Context zza;
    private final zzdnk zzb;
    private final zzawo zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbcx zzf;
    private final Executor zzg;
    private final zzbgt zzh;
    private final zzdot zzi;
    private final zzdri zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqd zzl;
    private final zzduh zzm;
    private final zzfmt zzn;
    private final zzefd zzo;
    private final zzefo zzp;
    private final zzfgm zzq;

    public zzdob(Context context, zzdnk zzdnkVar, zzawo zzawoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbcx zzbcxVar, Executor executor, zzfgi zzfgiVar, zzdot zzdotVar, zzdri zzdriVar, ScheduledExecutorService scheduledExecutorService, zzduh zzduhVar, zzfmt zzfmtVar, zzefd zzefdVar, zzdqd zzdqdVar, zzefo zzefoVar, zzfgm zzfgmVar) {
        this.zza = context;
        this.zzb = zzdnkVar;
        this.zzc = zzawoVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbcxVar;
        this.zzg = executor;
        this.zzh = zzfgiVar.zzi;
        this.zzi = zzdotVar;
        this.zzj = zzdriVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzduhVar;
        this.zzn = zzfmtVar;
        this.zzo = zzefdVar;
        this.zzl = zzdqdVar;
        this.zzp = zzefoVar;
        this.zzq = zzfgmVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfzn.zzm();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfzn.zzm();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfzn.zzk(arrayList);
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        return zzgee.zzf(listenableFuture, Exception.class, new zzgdl(null) { // from class: com.google.android.gms.internal.ads.zzdnz
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj2);
                return zzgee.zzh(null);
            }
        }, zzcbr.zzf);
    }

    private static ListenableFuture zzm(boolean z, final ListenableFuture listenableFuture, Object obj) {
        if (z) {
            return zzgee.zzn(listenableFuture, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdoa
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj2) {
                    return obj2 != null ? ListenableFuture.this : zzgee.zzg(new zzekh(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcbr.zzf);
        }
        return zzl(listenableFuture, null);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzgee.zzh(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzgee.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgee.zzh(new zzbgr(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgee.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdnr
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return new zzbgr(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final ListenableFuture zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgee.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzgee.zzm(zzgee.zzd(arrayList), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdnw
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbgr zzbgrVar : (List) obj) {
                    if (zzbgrVar != null) {
                        arrayList2.add(zzbgrVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzffn zzffnVar, zzffq zzffqVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzffnVar, zzffqVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgee.zzn(zzb, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdns
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                zzcgm zzcgmVar = (zzcgm) obj;
                if (zzcgmVar == null || zzcgmVar.zzq() == null) {
                    throw new zzekh(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzcbr.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbgo zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbgo(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzffn zzffnVar, zzffq zzffqVar, String str, String str2, Object obj) throws Exception {
        zzcgm zza = this.zzj.zza(zzqVar, zzffnVar, zzffqVar);
        final zzcbv zza2 = zzcbv.zza(zza);
        zzdqa zzb = this.zzl.zzb();
        zza.zzN().zzR(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzb, null, null, null, null);
        zza.zzae("/getNativeAdViewSignals", zzbkx.zzs);
        zza.zzae("/getNativeClickMeta", zzbkx.zzt);
        zza.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdnv
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcbv zzcbvVar = zzcbv.this;
                if (z) {
                    zzcbvVar.zzb();
                    return;
                }
                zzcbvVar.zzd(new zzekh(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzac(str, str2, null);
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzcgm zza = zzcgz.zza(this.zza, zzcie.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzcbv zza2 = zzcbv.zza(zza);
        zza.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdnx
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str2, String str3) {
                zzcbv.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeZ)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgee.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgee.zzm(zzo(optJSONArray, false, true), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdny
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return zzdob.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        zzbgt zzbgtVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbgtVar.zzb, zzbgtVar.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzffn zzffnVar, final zzffq zzffqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjQ)).booleanValue()) {
            return zzgee.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgee.zzh(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgee.zzh(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (!TextUtils.isEmpty(optString2)) {
            final ListenableFuture zzn = zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdnt
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return zzdob.this.zzb(zzk, zzffnVar, zzffqVar, optString, optString2, obj);
                }
            }, zzcbr.zze);
            return zzgee.zzn(zzn, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdnu
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    if (((zzcgm) obj) != null) {
                        return ListenableFuture.this;
                    }
                    throw new zzekh(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcbr.zzf);
        }
        return zzgee.zzh(null);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzffn zzffnVar, zzffq zzffqVar) {
        ListenableFuture zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbw.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzgee.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjP)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzgee.zzh(null);
                }
            } else if (!z) {
                zza = this.zzi.zza(optJSONObject);
                zzbdq zzbdqVar = zzbdz.zzdI;
                return zzl(zzgee.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdqVar)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzffnVar, zzffqVar);
            zzbdq zzbdqVar2 = zzbdz.zzdI;
            return zzl(zzgee.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdqVar2)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzg, zzffnVar, zzffqVar);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
