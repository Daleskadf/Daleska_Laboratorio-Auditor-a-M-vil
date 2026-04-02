package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbzj implements zzbzo {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhet zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbzl zzi;
    private final zzbzk zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbzj(Context context, VersionInfoParcel versionInfoParcel, zzbzl zzbzlVar, String str, zzbzk zzbzkVar) {
        Preconditions.checkNotNull(zzbzlVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbzkVar;
        this.zzi = zzbzlVar;
        for (String str2 : zzbzlVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhet zzc2 = zzhhn.zzc();
        zzc2.zzj(zzhgs.OCTAGON_AD);
        zzc2.zzk(str);
        zzc2.zzh(str);
        zzheu zzc3 = zzhev.zzc();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        zzc2.zzg((zzhev) zzc3.zzbr());
        zzhgy zzc4 = zzhgz.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = versionInfoParcel.afmaVersion;
        if (str4 != null) {
            zzc4.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhgz) zzc4.zzbr());
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final zzbzl zza() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzhgw zzhgwVar;
        ListenableFuture zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhgwVar = (zzhgw) this.zze.get(str);
                            }
                            if (zzhgwVar == null) {
                                zzbzn.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzhgwVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbga.zzb.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgee.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzj(zzhgs.OCTAGON_AD_SB_MATCH);
            }
        }
        boolean z = this.zza;
        if ((!z || !this.zzi.zzg) && ((!this.zzm || !this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgee.zzh(null);
        }
        synchronized (this.zzj) {
            for (zzhgw zzhgwVar2 : this.zze.values()) {
                this.zzd.zzc((zzhgx) zzhgwVar2.zzbr());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbzn.zzb()) {
                String zzm2 = this.zzd.zzm();
                String zzl = this.zzd.zzl();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzm2 + "\n  clickUrl: " + zzl + "\n  resources: \n");
                for (zzhgx zzhgxVar : this.zzd.zzn()) {
                    sb.append("    [");
                    sb.append(zzhgxVar.zzc());
                    sb.append("] ");
                    sb.append(zzhgxVar.zzg());
                }
                zzbzn.zza(sb.toString());
            }
            ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbq(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhhn) this.zzd.zzbr()).zzaV());
            if (zzbzn.zzb()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzn.zza("Pinged SB successfully.");
                    }
                }, zzcbr.zza);
            }
            zzm = zzgee.zzm(zzb2, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbzh
                @Override // com.google.android.gms.internal.ads.zzfwf
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    int i2 = zzbzj.zzb;
                    return null;
                }
            }, zzcbr.zzf);
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zzd(String str, Map map, int i) {
        zzhgv zzhgvVar;
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3 && (zzhgvVar = zzhgv.AD_RESOURCE_AUTO_CLICK_DESTINATION) != null) {
                    ((zzhgw) this.zze.get(str)).zzb(zzhgvVar);
                }
                return;
            }
            zzhgw zze = zzhgx.zze();
            zzhgv zzb2 = zzhgv.zzb(i);
            if (zzb2 != null) {
                zze.zzb(zzb2);
            }
            zze.zzc(this.zze.size());
            zze.zze(str);
            zzhfk zzc2 = zzhfn.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhfi zzc3 = zzhfj.zzc();
                        zzc3.zza(zzgyj.zzw(str2));
                        zzc3.zzb(zzgyj.zzw(str3));
                        zzc2.zza((zzhfj) zzc3.zzbr());
                    }
                }
            }
            zze.zzd((zzhfn) zzc2.zzbr());
            this.zze.put(str, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzn = zzgee.zzn(zzgee.zzh(Collections.emptyMap()), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzbze
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return zzbzj.this.zzb((Map) obj);
                }
            }, zzcbr.zzf);
            ListenableFuture zzo = zzgee.zzo(zzn, 10L, TimeUnit.SECONDS, zzcbr.zzd);
            zzgee.zzr(zzn, new zzbzi(this, zzo), zzcbr.zzf);
            zzc.add(zzo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgyg zzt = zzgyj.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhet zzhetVar = this.zzd;
            zzhgl zzc2 = zzhgp.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(zzhgo.TYPE_CREATIVE);
            zzhetVar.zzi((zzhgp) zzc2.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbzo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbzl r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L93
            com.google.android.gms.ads.internal.zzu.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbzn.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbzf r8 = new com.google.android.gms.internal.ads.zzbzf
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzgep r0 = com.google.android.gms.internal.ads.zzcbr.zza
            r0.execute(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzj.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
