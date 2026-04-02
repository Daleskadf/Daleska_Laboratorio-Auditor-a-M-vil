package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqu {
    private final zzduh zza;
    private final zzffz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqu(zzduh zzduhVar, zzffz zzffzVar) {
        this.zza = zzduhVar;
        this.zzb = zzffzVar;
    }

    public final void zza(long j, int i) {
        zzdug zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i2 = i - 1;
        zza.zzb("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzf();
    }
}
