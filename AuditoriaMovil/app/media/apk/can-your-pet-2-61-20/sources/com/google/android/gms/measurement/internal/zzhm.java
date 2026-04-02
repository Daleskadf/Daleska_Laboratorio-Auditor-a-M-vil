package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpc;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public class zzhm implements zzio {
    private static volatile zzhm zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzab zzh;
    private final zzag zzi;
    private final zzgo zzj;
    private final zzfz zzk;
    private final zzhj zzl;
    private final zzmn zzm;
    private final zzny zzn;
    private final zzfy zzo;
    private final Clock zzp;
    private final zzky zzq;
    private final zzjc zzr;
    private final zzb zzs;
    private final zzkp zzt;
    private final String zzu;
    private zzfw zzv;
    private zzld zzw;
    private zzax zzx;
    private zzft zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzw()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool == null || !bool.booleanValue()) {
            if (zzad()) {
                Boolean zzv = zzn().zzv();
                if (zzv != null) {
                    return zzv.booleanValue() ? 0 : 3;
                }
                Boolean zzf = this.zzi.zzf("firebase_analytics_collection_enabled");
                if (zzf != null) {
                    return zzf.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.zzad;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzac == null || this.zzac.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final Context zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final Clock zzb() {
        return this.zzp;
    }

    @Pure
    public final zzb zze() {
        zzb zzbVar = this.zzs;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final zzab zzd() {
        return this.zzh;
    }

    @Pure
    public final zzag zzf() {
        return this.zzi;
    }

    @Pure
    public final zzax zzg() {
        zza((zzip) this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzft zzh() {
        zza((zze) this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzfw zzi() {
        zza((zze) this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzfy zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final zzfz zzj() {
        zza((zzip) this.zzk);
        return this.zzk;
    }

    public final zzfz zzm() {
        zzfz zzfzVar = this.zzk;
        if (zzfzVar == null || !zzfzVar.zzaf()) {
            return null;
        }
        return this.zzk;
    }

    @Pure
    public final zzgo zzn() {
        zza((zzim) this.zzj);
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final zzhj zzl() {
        zza((zzip) this.zzl);
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SideEffectFree
    public final zzhj zzo() {
        return this.zzl;
    }

    public static zzhm zza(Context context, com.google.android.gms.internal.measurement.zzdq zzdqVar, Long l) {
        if (zzdqVar != null && (zzdqVar.zze == null || zzdqVar.zzf == null)) {
            zzdqVar = new com.google.android.gms.internal.measurement.zzdq(zzdqVar.zza, zzdqVar.zzb, zzdqVar.zzc, zzdqVar.zzd, null, null, zzdqVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzhm.class) {
                if (zzb == null) {
                    zzb = new zzhm(new zzja(context, zzdqVar, l));
                }
            }
        } else if (zzdqVar != null && zzdqVar.zzg != null && zzdqVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzdqVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    @Pure
    public final zzjc zzp() {
        zza((zze) this.zzr);
        return this.zzr;
    }

    @Pure
    private final zzkp zzai() {
        zza((zzip) this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzky zzq() {
        zza((zze) this.zzq);
        return this.zzq;
    }

    @Pure
    public final zzld zzr() {
        zza((zze) this.zzw);
        return this.zzw;
    }

    @Pure
    public final zzmn zzs() {
        zza((zze) this.zzm);
        return this.zzm;
    }

    @Pure
    public final zzny zzt() {
        zza((zzim) this.zzn);
        return this.zzn;
    }

    @Pure
    public final String zzu() {
        return this.zzd;
    }

    @Pure
    public final String zzv() {
        return this.zze;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzhm zzhmVar, zzja zzjaVar) {
        zzhmVar.zzl().zzt();
        zzax zzaxVar = new zzax(zzhmVar);
        zzaxVar.zzad();
        zzhmVar.zzx = zzaxVar;
        zzft zzftVar = new zzft(zzhmVar, zzjaVar.zzf);
        zzftVar.zzv();
        zzhmVar.zzy = zzftVar;
        zzfw zzfwVar = new zzfw(zzhmVar);
        zzfwVar.zzv();
        zzhmVar.zzv = zzfwVar;
        zzld zzldVar = new zzld(zzhmVar);
        zzldVar.zzv();
        zzhmVar.zzw = zzldVar;
        zzhmVar.zzn.zzae();
        zzhmVar.zzj.zzae();
        zzhmVar.zzy.zzw();
        zzhmVar.zzj().zzn().zza("App measurement initialized, version", 92000L);
        zzhmVar.zzj().zzn().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzad = zzftVar.zzad();
        if (TextUtils.isEmpty(zzhmVar.zzd)) {
            if (zzhmVar.zzt().zzd(zzad, zzhmVar.zzi.zzp())) {
                zzhmVar.zzj().zzn().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgb zzn = zzhmVar.zzj().zzn();
                zzn.zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + zzad);
            }
        }
        zzhmVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzhmVar.zzag != zzhmVar.zzai.get()) {
            zzhmVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzhmVar.zzag), Integer.valueOf(zzhmVar.zzai.get()));
        }
        zzhmVar.zzz = true;
    }

    private zzhm(zzja zzjaVar) {
        long currentTimeMillis;
        boolean z = false;
        Preconditions.checkNotNull(zzjaVar);
        zzab zzabVar = new zzab(zzjaVar.zza);
        this.zzh = zzabVar;
        zzfn.zza = zzabVar;
        Context context = zzjaVar.zza;
        this.zzc = context;
        this.zzd = zzjaVar.zzb;
        this.zze = zzjaVar.zzc;
        this.zzf = zzjaVar.zzd;
        this.zzg = zzjaVar.zzh;
        this.zzac = zzjaVar.zze;
        this.zzu = zzjaVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdq zzdqVar = zzjaVar.zzg;
        if (zzdqVar != null && zzdqVar.zzg != null) {
            Object obj = zzdqVar.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzdqVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhh.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        if (zzjaVar.zzi != null) {
            currentTimeMillis = zzjaVar.zzi.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        this.zzi = new zzag(this);
        zzgo zzgoVar = new zzgo(this);
        zzgoVar.zzad();
        this.zzj = zzgoVar;
        zzfz zzfzVar = new zzfz(this);
        zzfzVar.zzad();
        this.zzk = zzfzVar;
        zzny zznyVar = new zzny(this);
        zznyVar.zzad();
        this.zzn = zznyVar;
        this.zzo = new zzfy(new zziz(zzjaVar, this));
        this.zzs = new zzb(this);
        zzky zzkyVar = new zzky(this);
        zzkyVar.zzv();
        this.zzq = zzkyVar;
        zzjc zzjcVar = new zzjc(this);
        zzjcVar.zzv();
        this.zzr = zzjcVar;
        zzmn zzmnVar = new zzmn(this);
        zzmnVar.zzv();
        this.zzm = zzmnVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzad();
        this.zzt = zzkpVar;
        zzhj zzhjVar = new zzhj(this);
        zzhjVar.zzad();
        this.zzl = zzhjVar;
        if (zzjaVar.zzg != null && zzjaVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zzjc zzp = zzp();
            if (zzp.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) zzp.zza().getApplicationContext();
                if (zzp.zza == null) {
                    zzp.zza = new zzko(zzp);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzp.zza);
                    application.registerActivityLifecycleCallbacks(zzp.zza);
                    zzp.zzj().zzp().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzj().zzu().zza("Application context is not an Application");
        }
        zzhjVar.zzb(new zzhr(this, zzjaVar));
    }

    private static void zza(zzim zzimVar) {
        if (zzimVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zze zzeVar) {
        if (zzeVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzeVar.zzy()) {
            return;
        }
        String valueOf = String.valueOf(zzeVar.getClass());
        throw new IllegalStateException("Component not initialized: " + valueOf);
    }

    private static void zza(zzip zzipVar) {
        if (zzipVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzipVar.zzaf()) {
            return;
        }
        String valueOf = String.valueOf(zzipVar.getClass());
        throw new IllegalStateException("Component not initialized: " + valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzz() {
        this.zzai.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzn().zzo.zza(true);
        if (bArr == null || bArr.length == 0) {
            zzj().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzj().zzc().zza("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (zzpc.zza() && this.zzi.zza(zzbf.zzcs)) {
                if (!zzt().zzi(optString)) {
                    zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                bundle.putString("gbraid", optString3);
            } else if (!zzt().zzi(optString)) {
                zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.zzr.zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
            zzny zzt = zzt();
            if (TextUtils.isEmpty(optString) || !zzt.zza(optString, optDouble)) {
                return;
            }
            zzt.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaa() {
        this.zzag++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    public final void zzb(boolean z) {
        zzl().zzt();
        this.zzaf = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
        if (r1.zzk() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r1.zzk() != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdq r13) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhm.zza(com.google.android.gms.internal.measurement.zzdq):void");
    }

    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzac() {
        return zzc() == 0;
    }

    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    @Pure
    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaf() {
        if (!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().zzt();
        Boolean bool = this.zzaa;
        if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzt().zze("android.permission.INTERNET") && zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzx() || (zzny.zza(this.zzc) && zzny.zza(this.zzc, false))));
            this.zzaa = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                    z = false;
                }
                this.zzaa = Boolean.valueOf(z);
            }
        }
        return this.zzaa.booleanValue();
    }

    @Pure
    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() {
        zzl().zzt();
        zza((zzip) zzai());
        String zzad = zzh().zzad();
        Pair<String, Boolean> zza = zzn().zza(zzad);
        if (!this.zzi.zzu() || ((Boolean) zza.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza.first)) {
            zzj().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        } else if (!zzai().zzc()) {
            zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            zzld zzr = zzr();
            zzr.zzt();
            zzr.zzu();
            if (!zzr.zzao() || zzr.zzq().zzg() >= 234200) {
                zzjc zzp = zzp();
                zzp.zzt();
                zzaj zzaa = zzp.zzo().zzaa();
                Bundle bundle = zzaa != null ? zzaa.zza : null;
                if (bundle == null) {
                    int i = this.zzah;
                    this.zzah = i + 1;
                    boolean z = i < 10;
                    zzgb zzc = zzj().zzc();
                    String str = z ? "Retrying." : "Skipping.";
                    zzc.zza("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.zzah));
                    return z;
                }
                zziq zza2 = zziq.zza(bundle, 100);
                sb.append("&gcs=");
                sb.append(zza2.zzg());
                zzav zza3 = zzav.zza(bundle, 100);
                sb.append("&dma=");
                sb.append(zza3.zzd() == Boolean.FALSE ? 0 : 1);
                if (!TextUtils.isEmpty(zza3.zze())) {
                    sb.append("&dma_cps=");
                    sb.append(zza3.zze());
                }
                int i2 = zzav.zza(bundle) == Boolean.TRUE ? 0 : 1;
                sb.append("&npa=");
                sb.append(i2);
                zzj().zzp().zza("Consent query parameters to Bow", sb);
            }
            zzny zzt = zzt();
            zzh();
            URL zza4 = zzt.zza(92000L, zzad, (String) zza.first, zzn().zzp.zza() - 1, sb.toString());
            if (zza4 != null) {
                zzkp zzai = zzai();
                zzks zzksVar = new zzks() { // from class: com.google.android.gms.measurement.internal.zzho
                    @Override // com.google.android.gms.measurement.internal.zzks
                    public final void zza(String str2, int i3, Throwable th, byte[] bArr, Map map) {
                        zzhm.this.zza(str2, i3, th, bArr, map);
                    }
                };
                zzai.zzt();
                zzai.zzac();
                Preconditions.checkNotNull(zza4);
                Preconditions.checkNotNull(zzksVar);
                zzai.zzl().zza(new zzkr(zzai, zzad, zza4, null, null, zzksVar));
            }
            return false;
        }
    }
}
