package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zziq;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzjc extends zze {
    protected zzko zza;
    final zzr zzb;
    private zziy zzc;
    private final Set<zzix> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzat zzj;
    private PriorityQueue<zzna> zzk;
    private zziq zzl;
    private final AtomicLong zzm;
    private long zzn;
    private boolean zzo;
    private zzat zzp;
    private SharedPreferences.OnSharedPreferenceChangeListener zzq;
    private zzat zzr;
    private final zznx zzs;

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzft zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfw zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzfy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzfz zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzjc zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzky zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzld zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmn zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    public final Boolean zzaa() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().zza(atomicReference, 15000L, "boolean test flag value", new zzjl(this, atomicReference));
    }

    public final Double zzab() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().zza(atomicReference, 15000L, "double test flag value", new zzkh(this, atomicReference));
    }

    public final Integer zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().zza(atomicReference, 15000L, "int test flag value", new zzki(this, atomicReference));
    }

    public final Long zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().zza(atomicReference, 15000L, "long test flag value", new zzkf(this, atomicReference));
    }

    public final String zzae() {
        return this.zzf.get();
    }

    public final String zzaf() {
        zzkv zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zzb;
        }
        return null;
    }

    public final String zzag() {
        zzkv zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zza;
        }
        return null;
    }

    public final String zzah() {
        if (this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            return new zzhg(zza(), this.zzu.zzx()).zza("google_app_id");
        } catch (IllegalStateException e) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final String zzai() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().zza(atomicReference, 15000L, "String test flag value", new zzjy(this, atomicReference));
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzab.zza()) {
            zzj().zzg().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzu.zzl().zza(atomicReference, 5000L, "get conditional user properties", new zzkb(this, atomicReference, null, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
                return new ArrayList<>();
            }
            return zzny.zzb((List<zzae>) list);
        }
    }

    public final List<zznt> zza(boolean z) {
        zzu();
        zzj().zzp().zza("Getting user properties (FE)");
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzab.zza()) {
            zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzu.zzl().zza(atomicReference, 5000L, "get user properties", new zzjv(this, atomicReference, z));
            List<zznt> list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
            return list;
        }
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzab.zza()) {
            zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzu.zzl().zza(atomicReference, 5000L, "get user properties", new zzke(this, atomicReference, null, str, str2, z));
            List<zznt> list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zznt zzntVar : list) {
                Object zza = zzntVar.zza();
                if (zza != null) {
                    arrayMap.put(zzntVar.zza, zza);
                }
            }
            return arrayMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PriorityQueue<zzna> zzaj() {
        Comparator comparing;
        if (this.zzk == null) {
            PathTreeWalk$$ExternalSyntheticApiModelOutline0.m1661m();
            comparing = Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zzjb
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzna) obj).zzb);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzje
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            });
            this.zzk = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(comparing);
        }
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzjc zzjcVar, zziq zziqVar, zziq zziqVar2) {
        if (zzoe.zza() && zzjcVar.zze().zza(zzbf.zzde)) {
            return;
        }
        boolean zza = zziqVar.zza(zziqVar2, zziq.zza.ANALYTICS_STORAGE, zziq.zza.AD_STORAGE);
        boolean zzb = zziqVar.zzb(zziqVar2, zziq.zza.ANALYTICS_STORAGE, zziq.zza.AD_STORAGE);
        if (zza || zzb) {
            zzjcVar.zzg().zzag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzjc zzjcVar, zziq zziqVar, long j, boolean z, boolean z2) {
        zzjcVar.zzt();
        zzjcVar.zzu();
        zziq zzn = zzjcVar.zzk().zzn();
        if (j <= zzjcVar.zzn && zziq.zza(zzn.zza(), zziqVar.zza())) {
            zzjcVar.zzj().zzn().zza("Dropped out-of-date consent setting, proposed settings", zziqVar);
        } else if (zzjcVar.zzk().zza(zziqVar)) {
            zzjcVar.zzj().zzp().zza("Setting storage consent. consent", zziqVar);
            zzjcVar.zzn = j;
            if (zzjcVar.zze().zza(zzbf.zzcp) && zzjcVar.zzo().zzan()) {
                zzjcVar.zzo().zzb(z);
            } else {
                zzjcVar.zzo().zza(z);
            }
            if (z2) {
                zzjcVar.zzo().zza(new AtomicReference<>());
            }
        } else {
            zzjcVar.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(zziqVar.zza()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(zzjc zzjcVar, int i) {
        if (zzjcVar.zzj == null) {
            zzjcVar.zzj = new zzjq(zzjcVar, zzjcVar.zzu);
        }
        zzjcVar.zzj.zza(i * 1000);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjc(zzhm zzhmVar) {
        super(zzhmVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzi = 1;
        this.zzo = true;
        this.zzs = new zzkg(this);
        this.zzf = new AtomicReference<>();
        this.zzl = zziq.zza;
        this.zzn = -1L;
        this.zzm = new AtomicLong(0L);
        this.zzb = new zzr(zzhmVar);
    }

    public final void zzak() {
        zzt();
        zzu();
        if (this.zzu.zzaf()) {
            Boolean zzf = zze().zzf("google_analytics_deferred_deep_link_enabled");
            if (zzf != null && zzf.booleanValue()) {
                zzj().zzc().zza("Deferred Deep Link feature enabled.");
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzjc.this.zzan();
                    }
                });
            }
            zzo().zzac();
            this.zzo = false;
            String zzw = zzk().zzw();
            if (TextUtils.isEmpty(zzw)) {
                return;
            }
            zzf().zzac();
            if (zzw.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", zzw);
            zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zza(String str, String str2, Bundle bundle) {
        long currentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzl().zzb(new zzkc(this, bundle2));
    }

    public final void zzal() {
        if (!(zza().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzam() {
        if (zzpz.zza() && zze().zza(zzbf.zzcf)) {
            if (zzl().zzg()) {
                zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
            } else if (zzab.zza()) {
                zzj().zzg().zza("Cannot get trigger URIs from main thread");
            } else {
                zzu();
                zzj().zzp().zza("Getting trigger URIs (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                zzl().zza(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzjc zzjcVar = zzjc.this;
                        AtomicReference<List<zzna>> atomicReference2 = atomicReference;
                        Bundle zza = zzjcVar.zzk().zzi.zza();
                        zzld zzo = zzjcVar.zzo();
                        if (zza == null) {
                            zza = new Bundle();
                        }
                        zzo.zza(atomicReference2, zza);
                    }
                });
                final List list = (List) atomicReference.get();
                if (list == null) {
                    zzj().zzg().zza("Timed out waiting for get trigger URIs");
                } else {
                    zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjc.this.zza(list);
                        }
                    });
                }
            }
        }
    }

    public final void zzan() {
        zzt();
        if (zzk().zzo.zza()) {
            zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long zza = zzk().zzp.zza();
        zzk().zzp.zza(1 + zza);
        if (zza >= 5) {
            zzj().zzu().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzk().zzo.zza(true);
            return;
        }
        if (this.zzp == null) {
            this.zzp = new zzjx(this, this.zzu);
        }
        this.zzp.zza(0L);
    }

    public final void zzao() {
        zzt();
        zzj().zzc().zza("Handle tcf update.");
        zzmy zza = zzmy.zza(zzk().zzc());
        zzj().zzp().zza("Tcf preferences read", zza);
        if (zzk().zza(zza)) {
            Bundle zza2 = zza.zza();
            zzj().zzp().zza("Consent generated from Tcf", zza2);
            if (zza2 != Bundle.EMPTY) {
                zza(zza2, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", zza.zzb());
            zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_tcf", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(List list) {
        boolean contains;
        zzt();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> zzh = zzk().zzh();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzna zznaVar = (zzna) it.next();
                contains = zzh.contains(zznaVar.zzc);
                if (!contains || zzh.get(zznaVar.zzc).longValue() < zznaVar.zzb) {
                    zzaj().add(zznaVar);
                }
            }
            zzap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            zzj().zzp().zza("IABTCF_TCString change picked up in listener.");
            ((zzat) Preconditions.checkNotNull(this.zzr)).zza(500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Bundle bundle) {
        if (bundle == null) {
            zzk().zzt.zza(new Bundle());
            return;
        }
        Bundle zza = zzk().zzt.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                zzq();
                if (zzny.zza(obj)) {
                    zzq();
                    zzny.zza(this.zzs, 27, (String) null, (String) null, 0);
                }
                zzj().zzv().zza("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzny.zzg(str)) {
                zzj().zzv().zza("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else if (zzq().zza("param", str, zze().zza((String) null, false), obj)) {
                zzq().zza(zza, str, obj);
            }
        }
        zzq();
        if (zzny.zza(zza, zze().zzg())) {
            zzq();
            zzny.zza(this.zzs, 26, (String) null, (String) null, 0);
            zzj().zzv().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzk().zzt.zza(zza);
        zzo().zza(zza);
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            zzn().zza(bundle2, j);
        } else {
            zzb(str3, str2, j, bundle2, z2, !z2 || this.zzc == null || zzny.zzg(str2), z, null);
        }
    }

    public final void zza(String str, String str2, Bundle bundle, String str3) {
        zzs();
        zzb(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str, String str2, Bundle bundle) {
        zzt();
        zza(str, str2, zzb().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzt();
        zza(str, str2, j, bundle, true, this.zzc == null || zzny.zzg(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean zza;
        String str4;
        long j2;
        String str5;
        String str6;
        boolean z4;
        int length;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzt();
        zzu();
        if (!this.zzu.zzac()) {
            zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> zzaf = zzg().zzaf();
        if (zzaf != null && !zzaf.contains(str2)) {
            zzj().zzc().zza("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zze) {
            this.zze = true;
            try {
                if (!this.zzu.zzag()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e) {
                    zzj().zzu().zza("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzj().zzn().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), zzb().currentTimeMillis());
            }
            if (zzpc.zza() && zze().zza(zzbf.zzcs) && bundle.containsKey("gbraid")) {
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_gbraid", bundle.getString("gbraid"), zzb().currentTimeMillis());
            }
        }
        if (z && zzny.zzj(str2)) {
            zzq().zza(bundle, zzk().zzt.zza());
        }
        if (!z3 && !"_iap".equals(str2)) {
            zzny zzt = this.zzu.zzt();
            int i = 2;
            if (zzt.zzc("event", str2)) {
                if (!zzt.zza("event", zziu.zza, zziu.zzb, str2)) {
                    i = 13;
                } else if (zzt.zza("event", 40, str2)) {
                    i = 0;
                }
            }
            if (i != 0) {
                zzj().zzh().zza("Invalid public event name. Event will not be logged (FE)", zzi().zza(str2));
                this.zzu.zzt();
                String zza2 = zzny.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zzny.zza(this.zzs, i, "_ev", zza2, length);
                return;
            }
        }
        zzkv zza3 = zzn().zza(false);
        if (zza3 != null && !bundle.containsKey("_sc")) {
            zza3.zzd = true;
        }
        zzny.zza(zza3, bundle, z && !z3);
        boolean equals = "am".equals(str);
        boolean zzg = zzny.zzg(str2);
        if (z && this.zzc != null && !zzg && !equals) {
            zzj().zzc().zza("Passing event to registered event handler (FE)", zzi().zza(str2), zzi().zza(bundle));
            Preconditions.checkNotNull(this.zzc);
            this.zzc.interceptEvent(str, str2, bundle, j);
        } else if (this.zzu.zzaf()) {
            int zza4 = zzq().zza(str2);
            if (zza4 != 0) {
                zzj().zzh().zza("Invalid event name. Event will not be logged (FE)", zzi().zza(str2));
                zzq();
                String zza5 = zzny.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zzny.zza(this.zzs, str3, zza4, "_ev", zza5, length);
                return;
            }
            Bundle zza6 = zzq().zza(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(zza6);
            if (zzn().zza(false) != null && "_ae".equals(str2)) {
                zzmt zzmtVar = zzp().zzb;
                long elapsedRealtime = zzmtVar.zzb.zzb().elapsedRealtime();
                long j3 = elapsedRealtime - zzmtVar.zza;
                zzmtVar.zza = elapsedRealtime;
                if (j3 > 0) {
                    zzq().zza(zza6, j3);
                }
            }
            if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) && "_ssr".equals(str2)) {
                zzny zzq = zzq();
                String string = zza6.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, zzq.zzk().zzq.zza())) {
                    zzq.zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                    z4 = false;
                } else {
                    zzq.zzk().zzq.zza(string);
                    z4 = true;
                }
                if (!z4) {
                    return;
                }
            } else if ("_ae".equals(str2)) {
                String zza7 = zzq().zzk().zzq.zza();
                if (!TextUtils.isEmpty(zza7)) {
                    zza6.putString("_ffr", zza7);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zza6);
            if (zze().zza(zzbf.zzcl)) {
                zza = zzp().zzaa();
            } else {
                zza = zzk().zzn.zza();
            }
            if (zzk().zzk.zza() > 0 && zzk().zza(j) && zza) {
                zzj().zzp().zza("Current session is expired, remove the session number, ID, and engagement time");
                j2 = 0;
                str4 = "_ae";
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", (Object) null, zzb().currentTimeMillis());
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", (Object) null, zzb().currentTimeMillis());
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", (Object) null, zzb().currentTimeMillis());
                zzk().zzl.zza(0L);
            } else {
                str4 = "_ae";
                j2 = 0;
            }
            if (zza6.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j2) == 1) {
                zzj().zzp().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzu.zzs().zza.zza(j, true);
            }
            ArrayList arrayList2 = new ArrayList(zza6.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                String str7 = (String) obj;
                if (str7 != null) {
                    zzq();
                    Bundle[] zzb = zzny.zzb(zza6.get(str7));
                    if (zzb != null) {
                        zza6.putParcelableArray(str7, zzb);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i3);
                if (i3 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z2) {
                    bundle2 = zzq().zza(bundle2, (String) null);
                }
                Bundle bundle3 = bundle2;
                zzo().zza(new zzbd(str6, new zzbc(bundle3), str, j), str3);
                if (!equals) {
                    for (zzix zzixVar : this.zzd) {
                        zzixVar.onEvent(str, str2, new Bundle(bundle3), j);
                    }
                }
                i3++;
            }
            if (zzn().zza(false) == null || !str4.equals(str2)) {
                return;
            }
            zzp().zza(true, true, zzb().elapsedRealtime());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzap() {
        zzna poll;
        MeasurementManagerFutures zzn;
        zzt();
        if (zzaj().isEmpty() || this.zzh || (poll = zzaj().poll()) == null || (zzn = zzq().zzn()) == null) {
            return;
        }
        this.zzh = true;
        zzj().zzp().zza("Registering trigger URI", poll.zza);
        ListenableFuture registerTriggerAsync = zzn.registerTriggerAsync(Uri.parse(poll.zza));
        if (registerTriggerAsync == null) {
            this.zzh = false;
            zzaj().add(poll);
            return;
        }
        if (!zze().zza(zzbf.zzcj)) {
            SparseArray<Long> zzh = zzk().zzh();
            zzh.put(poll.zzc, Long.valueOf(poll.zzb));
            zzk().zza(zzh);
        }
        Futures.addCallback(registerTriggerAsync, new zzjn(this, poll), new zzjo(this));
    }

    public final void zza(zzix zzixVar) {
        zzu();
        Preconditions.checkNotNull(zzixVar);
        if (this.zzd.add(zzixVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener already registered");
    }

    public final void zzaq() {
        zzt();
        zzj().zzc().zza("Register tcfPrefChangeListener.");
        if (this.zzq == null) {
            this.zzr = new zzju(this, this.zzu);
            this.zzq = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzjk
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    zzjc.this.zza(sharedPreferences, str);
                }
            };
        }
        zzk().zzc().registerOnSharedPreferenceChangeListener(this.zzq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j, boolean z) {
        zzt();
        zzu();
        zzj().zzc().zza("Resetting analytics data (FE)");
        zzmn zzp = zzp();
        zzp.zzt();
        zzp.zzb.zza();
        if (zzql.zza() && zze().zza(zzbf.zzbr)) {
            zzg().zzag();
        }
        boolean zzac = this.zzu.zzac();
        zzgo zzk = zzk();
        zzk.zzc.zza(j);
        if (!TextUtils.isEmpty(zzk.zzk().zzq.zza())) {
            zzk.zzq.zza(null);
        }
        zzk.zzk.zza(0L);
        zzk.zzl.zza(0L);
        if (!zzk.zze().zzw()) {
            zzk.zzb(!zzac);
        }
        zzk.zzr.zza(null);
        zzk.zzs.zza(0L);
        zzk.zzt.zza(null);
        if (z) {
            zzo().zzah();
        }
        zzp().zza.zza();
        this.zzo = !zzac;
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzl().zzb(new zzjt(this, str, str2, j, zzny.zza(bundle), z, z2, z3, str3));
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzl().zzb(new zzjw(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str) {
        this.zzf.set(str);
    }

    public final void zzb(Bundle bundle) {
        zza(bundle, zzb().currentTimeMillis());
    }

    public final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().zzu().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzir.zza(bundle2, "app_id", String.class, null);
        zzir.zza(bundle2, "origin", String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzir.zza(bundle2, "value", Object.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get("value");
        if (zzq().zzb(string) != 0) {
            zzj().zzg().zza("Invalid conditional user property name", zzi().zzc(string));
        } else if (zzq().zza(string, obj) != 0) {
            zzj().zzg().zza("Invalid conditional user property value", zzi().zzc(string), obj);
        } else {
            Object zzc = zzq().zzc(string, obj);
            if (zzc == null) {
                zzj().zzg().zza("Unable to normalize conditional user property value", zzi().zzc(string), obj);
                return;
            }
            zzir.zza(bundle2, zzc);
            long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
                zzj().zzg().zza("Invalid conditional user property timeout", zzi().zzc(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            if (j3 > 15552000000L || j3 < 1) {
                zzj().zzg().zza("Invalid conditional user property time to live", zzi().zzc(string), Long.valueOf(j3));
            } else {
                zzl().zzb(new zzjz(this, bundle2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Bundle bundle, int i, long j) {
        zzu();
        String zza = zziq.zza(bundle);
        if (zza != null) {
            zzj().zzv().zza("Ignoring invalid consent setting", zza);
            zzj().zzv().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean z = zze().zza(zzbf.zzcq) && zzl().zzg();
        zziq zza2 = zziq.zza(bundle, i);
        if (zza2.zzk()) {
            zza(zza2, j, z);
        }
        zzav zza3 = zzav.zza(bundle, i);
        if (zza3.zzg()) {
            zza(zza3, z);
        }
        Boolean zza4 = zzav.zza(bundle);
        if (zza4 != null) {
            zza(i == -30 ? "tcf" : "app", FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza4.toString(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzav zzavVar, boolean z) {
        zzkj zzkjVar = new zzkj(this, zzavVar);
        if (z) {
            zzt();
            zzkjVar.run();
            return;
        }
        zzl().zzb(zzkjVar);
    }

    public final void zza(zziy zziyVar) {
        zziy zziyVar2;
        zzt();
        zzu();
        if (zziyVar != null && zziyVar != (zziyVar2 = this.zzc)) {
            Preconditions.checkState(zziyVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zziyVar;
    }

    public final void zza(Boolean bool) {
        zzu();
        zzl().zzb(new zzkk(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zziq zziqVar) {
        zzt();
        boolean z = (zziqVar.zzj() && zziqVar.zzi()) || zzo().zzam();
        if (z != this.zzu.zzad()) {
            this.zzu.zzb(z);
            Boolean zzu = zzk().zzu();
            if (!z || zzu == null || zzu.booleanValue()) {
                zza(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Boolean bool, boolean z) {
        zzt();
        zzu();
        zzj().zzc().zza("Setting app measurement enabled (FE)", bool);
        zzk().zza(bool);
        if (z) {
            zzk().zzb(bool);
        }
        if (this.zzu.zzad() || !(bool == null || bool.booleanValue())) {
            zzar();
        }
    }

    public final void zza(zziq zziqVar, long j, boolean z) {
        zziq zziqVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        zziq zziqVar3 = zziqVar;
        zzu();
        int zza = zziqVar.zza();
        if (com.google.android.gms.internal.measurement.zzny.zza() && zze().zza(zzbf.zzcz)) {
            if (zza != -10 && zziqVar.zzc() == zzit.UNINITIALIZED && zziqVar.zzd() == zzit.UNINITIALIZED) {
                zzj().zzv().zza("Ignoring empty consent settings");
                return;
            }
        } else if (zza != -10 && zziqVar.zze() == null && zziqVar.zzf() == null) {
            zzj().zzv().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzg) {
            zziqVar2 = this.zzl;
            z2 = false;
            if (zziq.zza(zza, zziqVar2.zza())) {
                z3 = zziqVar.zzc(this.zzl);
                if (zziqVar.zzj() && !this.zzl.zzj()) {
                    z2 = true;
                }
                zziqVar3 = zziqVar.zzb(this.zzl);
                this.zzl = zziqVar3;
                z4 = z2;
                z2 = true;
            } else {
                z3 = false;
                z4 = false;
            }
        }
        if (!z2) {
            zzj().zzn().zza("Ignoring lower-priority consent settings, proposed settings", zziqVar3);
            return;
        }
        long andIncrement = this.zzm.getAndIncrement();
        if (z3) {
            zza((String) null);
            zzkm zzkmVar = new zzkm(this, zziqVar3, j, andIncrement, z4, zziqVar2);
            if (z) {
                zzt();
                zzkmVar.run();
                return;
            }
            zzl().zzc(zzkmVar);
            return;
        }
        zzkl zzklVar = new zzkl(this, zziqVar3, andIncrement, z4, zziqVar2);
        if (z) {
            zzt();
            zzklVar.run();
        } else if (zza == 30 || zza == -10) {
            zzl().zzc(zzklVar);
        } else {
            zzl().zzb(zzklVar);
        }
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        int i;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            i = zzq().zzb(str2);
        } else {
            zzny zzq = zzq();
            if (zzq.zzc("user property", str2)) {
                if (!zzq.zza("user property", zziv.zza, str2)) {
                    i = 15;
                } else if (zzq.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzq();
            String zza = zzny.zza(str2, 24, true);
            r7 = str2 != null ? str2.length() : 0;
            this.zzu.zzt();
            zzny.zza(this.zzs, i, "_ev", zza, r7);
        } else if (obj != null) {
            int zza2 = zzq().zza(str2, obj);
            if (zza2 != 0) {
                zzq();
                String zza3 = zzny.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    r7 = String.valueOf(obj).length();
                }
                this.zzu.zzt();
                zzny.zza(this.zzs, zza2, "_ev", zza3, r7);
                return;
            }
            Object zzc = zzq().zzc(str2, obj);
            if (zzc != null) {
                zza(str3, str2, j, zzc);
            }
        } else {
            zza(str3, str2, j, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzu();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long valueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    zzk().zzh.zza(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    zzj().zzp().zza("Setting _npa user property (which is the inverse of AD_PERSONALIZATION consent or allow_personalized_ads user property)", obj, str);
                }
            }
            if (obj == null) {
                zzk().zzh.zza("unset");
                str2 = "_npa";
            }
            zzj().zzp().zza("Setting _npa user property (which is the inverse of AD_PERSONALIZATION consent or allow_personalized_ads user property)", obj, str);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.zzu.zzac()) {
            zzj().zzp().zza("User property not set since app measurement is disabled");
        } else if (this.zzu.zzaf()) {
            zzo().zza(new zznt(str4, j, obj2, str));
        }
    }

    public final void zzb(zzix zzixVar) {
        zzu();
        Preconditions.checkNotNull(zzixVar);
        if (this.zzd.remove(zzixVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener had not been registered");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzar() {
        zzt();
        String zza = zzk().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zza("app", "_npa", (Object) null, zzb().currentTimeMillis());
            } else {
                zza("app", "_npa", Long.valueOf("true".equals(zza) ? 1L : 0L), zzb().currentTimeMillis());
            }
        }
        if (this.zzu.zzac() && this.zzo) {
            zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzak();
            zzp().zza.zza();
            zzl().zzb(new zzjs(this));
            return;
        }
        zzj().zzc().zza("Updating Scion state (FE)");
        zzo().zzaj();
    }
}
