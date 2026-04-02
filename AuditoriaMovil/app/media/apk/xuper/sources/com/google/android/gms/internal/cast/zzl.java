package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzl {
    private static final Logger zza = new Logger("FeatureUsageAnalytics");
    private static final String zzb = "20.1.0";
    private static zzl zzc;
    private final zzd zzd;
    private final SharedPreferences zze;
    private final String zzf;
    private final Runnable zzg;
    private final Handler zzh;
    private final Set<zzju> zzi;
    private final Set<zzju> zzj;
    private long zzk;

    private zzl(SharedPreferences sharedPreferences, zzd zzdVar, String str) {
        this.zze = sharedPreferences;
        this.zzd = zzdVar;
        this.zzf = str;
        HashSet hashSet = new HashSet();
        this.zzi = hashSet;
        HashSet hashSet2 = new HashSet();
        this.zzj = hashSet2;
        this.zzh = new zzco(Looper.getMainLooper());
        this.zzg = new Runnable() { // from class: com.google.android.gms.internal.cast.zzk
            @Override // java.lang.Runnable
            public final void run() {
                zzl.zzc(zzl.this);
            }
        };
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        hashSet.clear();
        hashSet2.clear();
        this.zzk = 0L;
        if (zzb.equals(string) && str.equals(string2)) {
            this.zzk = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
            long zze = zze();
            HashSet hashSet3 = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    long j10 = this.zze.getLong(str2, 0L);
                    if (j10 != 0 && zze - j10 > 1209600000) {
                        hashSet3.add(str2);
                    } else if (str2.startsWith("feature_usage_timestamp_reported_feature_")) {
                        zzju zzf = zzf(str2.substring(41));
                        this.zzj.add(zzf);
                        this.zzi.add(zzf);
                    } else if (str2.startsWith("feature_usage_timestamp_detected_feature_")) {
                        this.zzi.add(zzf(str2.substring(41)));
                    }
                }
            }
            zzh(hashSet3);
            Preconditions.checkNotNull(this.zzh);
            Preconditions.checkNotNull(this.zzg);
            zzi();
            return;
        }
        HashSet hashSet4 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                hashSet4.add(str3);
            }
        }
        hashSet4.add("feature_usage_last_report_time");
        zzh(hashSet4);
        this.zze.edit().putString("feature_usage_sdk_version", zzb).putString("feature_usage_package_name", this.zzf).apply();
    }

    public static synchronized zzl zza(SharedPreferences sharedPreferences, zzd zzdVar, String str) {
        zzl zzlVar;
        synchronized (zzl.class) {
            if (zzc == null) {
                zzc = new zzl(sharedPreferences, zzdVar, str);
            }
            zzlVar = zzc;
        }
        return zzlVar;
    }

    @VisibleForTesting
    public static String zzb(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static /* synthetic */ void zzc(zzl zzlVar) {
        long j10;
        if (!zzlVar.zzi.isEmpty()) {
            if (true != zzlVar.zzj.equals(zzlVar.zzi)) {
                j10 = 86400000;
            } else {
                j10 = 172800000;
            }
            long zze = zzlVar.zze();
            long j11 = zzlVar.zzk;
            if (j11 != 0 && zze - j11 < j10) {
                return;
            }
            zza.d("Upload the feature usage report.", new Object[0]);
            zzkj zza2 = zzkk.zza();
            zza2.zzb(zzb);
            zza2.zza(zzlVar.zzf);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(zzlVar.zzi);
            zzkd zza3 = zzke.zza();
            zza3.zza(arrayList);
            zza3.zzb(zza2.zzp());
            zzkt zzc2 = zzku.zzc();
            zzc2.zzc(zza3.zzp());
            zzlVar.zzd.zzb(zzc2.zzp(), 243);
            SharedPreferences.Editor edit = zzlVar.zze.edit();
            if (!zzlVar.zzj.equals(zzlVar.zzi)) {
                zzlVar.zzj.clear();
                zzlVar.zzj.addAll(zzlVar.zzi);
                for (zzju zzjuVar : zzlVar.zzj) {
                    String num = Integer.toString(zzjuVar.zza());
                    String zzg = zzlVar.zzg(num);
                    String zzb2 = zzb("feature_usage_timestamp_reported_feature_", num);
                    if (!TextUtils.equals(zzg, zzb2)) {
                        long j12 = zzlVar.zze.getLong(zzg, 0L);
                        edit.remove(zzg);
                        if (j12 != 0) {
                            edit.putLong(zzb2, j12);
                        }
                    }
                }
            }
            zzlVar.zzk = zze;
            edit.putLong("feature_usage_last_report_time", zze).apply();
        }
    }

    public static void zzd(zzju zzjuVar) {
        zzl zzlVar = zzc;
        if (zzlVar == null) {
            return;
        }
        zzlVar.zze.edit().putLong(zzlVar.zzg(Integer.toString(zzjuVar.zza())), zzlVar.zze()).apply();
        zzlVar.zzi.add(zzjuVar);
        zzlVar.zzi();
    }

    private final long zze() {
        return DefaultClock.getInstance().currentTimeMillis();
    }

    private static zzju zzf(String str) {
        try {
            return zzju.zzb(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return zzju.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    private final String zzg(String str) {
        String zzb2 = zzb("feature_usage_timestamp_reported_feature_", str);
        if (this.zze.contains(zzb2)) {
            return zzb2;
        }
        return zzb("feature_usage_timestamp_detected_feature_", str);
    }

    private final void zzh(Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.zze.edit();
        for (String str : set) {
            edit.remove(str);
        }
        edit.apply();
    }

    private final void zzi() {
        this.zzh.post(this.zzg);
    }
}
