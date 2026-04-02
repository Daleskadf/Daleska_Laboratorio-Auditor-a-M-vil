package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.measurement.internal.zziq;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import org.checkerframework.dataflow.qual.Pure;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgz extends zznd implements zzai {
    final LruCache<String, com.google.android.gms.internal.measurement.zzb> zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;
    private final Map<String, Set<String>> zzd;
    private final Map<String, Map<String, Boolean>> zze;
    private final Map<String, Map<String, Boolean>> zzg;
    private final Map<String, zzfo.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb(String str, String str2) {
        Integer num;
        zzt();
        zzv(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(String str) {
        String zza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zza)) {
            return 0L;
        }
        try {
            return Long.parseLong(zza);
        } catch (NumberFormatException e) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzfz.zza(str), e);
            return 0L;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzgz zzgzVar, String str) {
        zzgzVar.zzak();
        Preconditions.checkNotEmpty(str);
        if (zzgzVar.zzl(str)) {
            if (zzgzVar.zzh.containsKey(str) && zzgzVar.zzh.get(str) != null) {
                zzgzVar.zza(str, zzgzVar.zzh.get(str));
            } else {
                zzgzVar.zzv(str);
            }
            return zzgzVar.zza.snapshot().get(str);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
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

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
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

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzgz zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzit zza(String str, zziq.zza zzaVar) {
        zzt();
        zzv(str);
        zzfo.zza zzb = zzb(str);
        if (zzb == null) {
            return zzit.UNINITIALIZED;
        }
        for (zzfo.zza.zzb zzbVar : zzb.zzf()) {
            if (zza(zzbVar.zzc()) == zzaVar) {
                int i = zzhh.zzc[zzbVar.zzb().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return zzit.GRANTED;
                    }
                    return zzit.UNINITIALIZED;
                }
                return zzit.DENIED;
            }
        }
        return zzit.UNINITIALIZED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziq.zza zzb(String str, zziq.zza zzaVar) {
        zzt();
        zzv(str);
        zzfo.zza zzb = zzb(str);
        if (zzb == null) {
            return null;
        }
        for (zzfo.zza.zzc zzcVar : zzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    private static zziq.zza zza(zzfo.zza.zze zzeVar) {
        int i = zzhh.zzb[zzeVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return zziq.zza.AD_PERSONALIZATION;
                }
                return zziq.zza.AD_USER_DATA;
            }
            return zziq.zza.ANALYTICS_STORAGE;
        }
        return zziq.zza.AD_STORAGE;
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzmi zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzng zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zznr g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfo.zza zzb(String str) {
        zzt();
        zzv(str);
        zzfo.zzd zzc = zzc(str);
        if (zzc == null || !zzc.zzp()) {
            return null;
        }
        return zzc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfo.zzd zzc(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzv(str);
        return this.zzh.get(str);
    }

    private final zzfo.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfo.zzd.zzg();
        }
        try {
            zzfo.zzd zzdVar = (zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) ((zzfo.zzd.zza) zznr.zza(zzfo.zzd.zze(), bArr)).zzah());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzq() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzkd e) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfz.zza(str), e);
            return zzfo.zzd.zzg();
        } catch (RuntimeException e2) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfz.zza(str), e2);
            return zzfo.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzai
    public final String zza(String str, String str2) {
        zzt();
        zzv(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzf(String str) {
        zzt();
        zzv(str);
        return this.zzj.get(str);
    }

    private static Map<String, String> zza(zzfo.zzd zzdVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzdVar != null) {
            for (zzfo.zzg zzgVar : zzdVar.zzn()) {
                arrayMap.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<String> zzg(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SortedSet<String> zzh(String str) {
        zzt();
        zzv(str);
        TreeSet treeSet = new TreeSet();
        zzfo.zza zzb = zzb(str);
        if (zzb == null) {
            return treeSet;
        }
        for (zzfo.zza.zzf zzfVar : zzb.zzc()) {
            treeSet.add(zzfVar.zzb());
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgz(zzni zzniVar) {
        super(zzniVar);
        this.zzc = new ArrayMap();
        this.zzd = new ArrayMap();
        this.zze = new ArrayMap();
        this.zzg = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zzj = new ArrayMap();
        this.zzk = new ArrayMap();
        this.zzl = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zza = new zzhc(this, 20);
        this.zzb = new zzhf(this);
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    private final void zza(String str, zzfo.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzaVar != null) {
            for (zzfo.zzb zzbVar : zzaVar.zze()) {
                hashSet.add(zzbVar.zzb());
            }
            for (int i = 0; i < zzaVar.zza(); i++) {
                zzfo.zzc.zza zzca = zzaVar.zza(i).zzca();
                if (zzca.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String zzb = zzca.zzb();
                    String zzb2 = zziu.zzb(zzca.zzb());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zzca = zzca.zza(zzb2);
                        zzaVar.zza(i, zzca);
                    }
                    if (zzca.zze() && zzca.zzc()) {
                        arrayMap.put(zzb, true);
                    }
                    if (zzca.zzf() && zzca.zzd()) {
                        arrayMap2.put(zzca.zzb(), true);
                    }
                    if (zzca.zzg()) {
                        if (zzca.zza() < 2 || zzca.zza() > 65535) {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzca.zzb(), Integer.valueOf(zzca.zza()));
                        } else {
                            arrayMap3.put(zzca.zzb(), Integer.valueOf(zzca.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, arrayMap);
        this.zzg.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    private final void zzv(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzan zzf = zzh().zzf(str);
            if (zzf == null) {
                this.zzc.put(str, null);
                this.zze.put(str, null);
                this.zzd.put(str, null);
                this.zzg.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
            zzfo.zzd.zza zzca = zza(str, zzf.zza).zzca();
            zza(str, zzca);
            this.zzc.put(str, zza((zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah())));
            this.zzh.put(str, (zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah()));
            zza(str, (zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah()));
            this.zzj.put(str, zzca.zzc());
            this.zzk.put(str, zzf.zzb);
            this.zzl.put(str, zzf.zzc);
        }
    }

    private final void zza(final String str, zzfo.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzgc.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzhe(zzgz.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzha
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzgz zzgzVar = zzgz.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgy
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzgz zzgzVar2 = zzgz.this;
                            String str3 = str2;
                            zzg zze = zzgzVar2.zzh().zze(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 92000L);
                            if (zze != null) {
                                String zzaf = zze.zzaf();
                                if (zzaf != null) {
                                    hashMap.put("app_version", zzaf);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zze.zze()));
                                hashMap.put("dynamite_version", Long.valueOf(zze.zzo()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(zzgz.this.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            for (zzgc.zzb zzbVar2 : zzcVar.zza().zzd()) {
                zzj().zzp().zza("EES program activity", zzbVar2.zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(String str) {
        zzt();
        zzfo.zzd zzc = zzc(str);
        if (zzc == null) {
            return false;
        }
        return zzc.zzo();
    }

    public final boolean zzl(String str) {
        zzfo.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(String str, zziq.zza zzaVar) {
        zzt();
        zzv(str);
        zzfo.zza zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        Iterator<zzfo.zza.zzb> it = zzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfo.zza.zzb next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfo.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzn(String str) {
        zzt();
        zzv(str);
        zzfo.zza zzb = zzb(str);
        return zzb == null || !zzb.zzh() || zzb.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzg.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if (zzm(str) && zzny.zzg(str2)) {
            return true;
        }
        if (zzo(str) && zzny.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfo.zzd.zza zzca = zza(str, bArr).zzca();
        if (zzca == null) {
            return false;
        }
        zza(str, zzca);
        zza(str, (zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah()));
        this.zzh.put(str, (zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah()));
        this.zzj.put(str, zzca.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah())));
        zzh().zza(str, new ArrayList(zzca.zzd()));
        try {
            zzca.zzb();
            bArr = ((zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah())).zzbx();
        } catch (RuntimeException e) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzfz.zza(str), e);
        }
        zzal zzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzh.zzt();
        zzh.zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzh.e_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzfz.zza(str));
            }
        } catch (SQLiteException e2) {
            zzh.zzj().zzg().zza("Error storing remote config. appId", zzfz.zza(str), e2);
        }
        this.zzh.put(str, (zzfo.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzr(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzs(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzt(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("os_version") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzu(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("user_id");
    }
}
