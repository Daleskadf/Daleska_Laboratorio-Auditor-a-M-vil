package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcbu;
import com.google.android.gms.internal.ads.zzdug;
import com.google.android.gms.internal.ads.zzduh;
import com.google.android.gms.internal.ads.zzfkv;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzgdl;
import com.google.android.gms.internal.ads.zzgee;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ ListenableFuture zzd(Long l, zzduh zzduhVar, zzflk zzflkVar, zzfkw zzfkwVar, JSONObject jSONObject) throws Exception {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzu.zzo().zzi().zzt(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzduhVar, "cld_s", zzu.zzB().elapsedRealtime() - l.longValue());
            }
        }
        zzfkwVar.zzg(optBoolean);
        zzflkVar.zzb(zzfkwVar.zzm());
        return zzgee.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzduh zzduhVar, String str, long j) {
        if (zzduhVar != null) {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzmk)).booleanValue()) {
                zzdug zza = zzduhVar.zza();
                zza.zzb("action", "lat_init");
                zza.zzb(str, Long.toString(j));
                zza.zzf();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzflk zzflkVar, zzduh zzduhVar, Long l) {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzflkVar, zzduhVar, l);
    }

    final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcbb zzcbbVar, String str, String str2, Runnable runnable, final zzflk zzflkVar, final zzduh zzduhVar, final Long l) {
        PackageInfo packageInfo;
        if (zzu.zzB().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzu.zzB().elapsedRealtime();
        if (zzcbbVar != null && !TextUtils.isEmpty(zzcbbVar.zzc())) {
            if (zzu.zzB().currentTimeMillis() - zzcbbVar.zza() <= ((Long) zzba.zzc().zza(zzbdz.zzea)).longValue() && zzcbbVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            final zzfkw zza = zzfkv.zza(context, zzflo.CUI_NAME_SDKINIT_CLD);
            zza.zzi();
            zzbpg zza2 = zzu.zzf().zza(this.zza, versionInfoParcel, zzflkVar).zza("google.afma.config.fetchAppSettings", zzbpn.zza, zzbpn.zza);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbdq zzbdqVar = zzbdz.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                ListenableFuture zzb = zza2.zzb(jSONObject);
                ListenableFuture zzn = zzgee.zzn(zzb, new zzgdl() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzgdl
                    public final ListenableFuture zza(Object obj) {
                        return zzf.zzd(l, zzduhVar, zzflkVar, zza, (JSONObject) obj);
                    }
                }, zzcbr.zzf);
                if (runnable != null) {
                    zzb.addListener(runnable, zzcbr.zzf);
                }
                if (l != null) {
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzf.zzf(zzduhVar, "cld_r", zzu.zzB().elapsedRealtime() - l.longValue());
                        }
                    }, zzcbr.zzf);
                }
                if (((Boolean) zzba.zzc().zza(zzbdz.zzhJ)).booleanValue()) {
                    zzcbu.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                } else {
                    zzcbu.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error requesting application settings", e);
                zza.zzh(e);
                zza.zzg(false);
                zzflkVar.zzb(zza.zzm());
            }
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzcbb zzcbbVar, zzflk zzflkVar) {
        zzb(context, versionInfoParcel, false, zzcbbVar, zzcbbVar != null ? zzcbbVar.zzb() : null, str, null, zzflkVar, null, null);
    }
}
