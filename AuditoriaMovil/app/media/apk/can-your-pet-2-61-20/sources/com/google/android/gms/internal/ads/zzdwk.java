package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdwk {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdry zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdur zzl;
    private final VersionInfoParcel zzm;
    private final zzdfm zzo;
    private final zzflk zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcbw zze = new zzcbw();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();

    public zzdwk(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdry zzdryVar, ScheduledExecutorService scheduledExecutorService, zzdur zzdurVar, VersionInfoParcel versionInfoParcel, zzdfm zzdfmVar, zzflk zzflkVar) {
        this.zzh = zzdryVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdurVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdfmVar;
        this.zzp = zzflkVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzj(final zzdwk zzdwkVar, String str) {
        final zzfkw zza = zzfkv.zza(zzdwkVar.zzf, zzflo.CUI_NAME_SDKINIT_ADAPTERINIT);
        zza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfkw zza2 = zzfkv.zza(zzdwkVar.zzf, zzflo.CUI_NAME_SDKINIT_ADAPTERINIT);
                zza2.zzi();
                zza2.zze(next);
                final Object obj = new Object();
                final zzcbw zzcbwVar = new zzcbw();
                ListenableFuture zzo = zzgee.zzo(zzcbwVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbO)).longValue(), TimeUnit.SECONDS, zzdwkVar.zzk);
                zzdwkVar.zzl.zzc(next);
                zzdwkVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                Iterator<String> it = keys;
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwk.this.zzq(obj, zzcbwVar, next, elapsedRealtime, zza2);
                    }
                }, zzdwkVar.zzi);
                arrayList.add(zzo);
                final zzdwj zzdwjVar = new zzdwj(zzdwkVar, obj, next, elapsedRealtime, zza2, zzcbwVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i = 0;
                        while (i < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbng(optString, bundle));
                            i++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdwkVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfhg zzc = zzdwkVar.zzh.zzc(next, new JSONObject());
                        zzdwkVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwf
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdwk.this.zzn(next, zzdwjVar, zzc, arrayList2);
                            }
                        });
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                    }
                } catch (zzfgp unused2) {
                    zzdwjVar.zze("Failed to create Adapter.");
                }
                keys = it;
            }
            zzgee.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdwk.this.zzf(zza);
                    return null;
                }
            }, zzdwkVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdwkVar.zzo.zza("MalformedJson");
            zzdwkVar.zzl.zza("MalformedJson");
            zzdwkVar.zze.zzd(e2);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "AdapterInitializer.updateAdapterStatus");
            zzflk zzflkVar = zzdwkVar.zzp;
            zza.zzh(e2);
            zza.zzg(false);
            zzflkVar.zzb(zza.zzm());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgee.zzh(zzc);
        }
        final zzcbw zzcbwVar = new zzcbw();
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzp(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // java.lang.Runnable
            public final void run() {
                zzdwk.this.zzo(zzcbwVar);
            }
        });
        return zzcbwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbmw(str, z, i, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfkw zzfkwVar) throws Exception {
        this.zze.zzc(true);
        zzfkwVar.zzg(true);
        this.zzp.zzb(zzfkwVar.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbmw zzbmwVar = (zzbmw) this.zzn.get(str);
            arrayList.add(new zzbmw(str, zzbmwVar.zzb, zzbmwVar.zzc, zzbmwVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str, zzbna zzbnaVar, zzfhg zzfhgVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbnaVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfhgVar.zzi(context, zzbnaVar, list);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            }
        } catch (RemoteException e2) {
            throw new zzfxm(e2);
        } catch (zzfgp unused) {
            zzbnaVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(final zzcbw zzcbwVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwa
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzcbw zzcbwVar2 = zzcbwVar;
                if (!isEmpty) {
                    zzcbwVar2.zzc(zzc);
                } else {
                    zzcbwVar2.zzd(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcbw zzcbwVar, String str, long j, zzfkw zzfkwVar) {
        synchronized (obj) {
            if (!zzcbwVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzflk zzflkVar = this.zzp;
                zzfkwVar.zzc("Timeout");
                zzfkwVar.zzg(false);
                zzflkVar.zzb(zzfkwVar.zzm());
                zzcbwVar.zzc(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbfy.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbN)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdwk.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    ListenableFuture zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdwk.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbP)).longValue(), TimeUnit.SECONDS);
                    zzgee.zzr(zzu, new zzdwi(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbnd zzbndVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // java.lang.Runnable
            public final void run() {
                zzdwk zzdwkVar = zzdwk.this;
                try {
                    zzbndVar.zzb(zzdwkVar.zzg());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
