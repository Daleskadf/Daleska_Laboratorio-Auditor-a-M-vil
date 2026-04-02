package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlinx.coroutines.DebugKt;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzgv implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzby zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzgw zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgv(zzgw zzgwVar, com.google.android.gms.internal.measurement.zzby zzbyVar, ServiceConnection serviceConnection) {
        this.zza = zzbyVar;
        this.zzb = serviceConnection;
        this.zzc = zzgwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzgt zzgtVar = this.zzc.zza;
        str = this.zzc.zzb;
        com.google.android.gms.internal.measurement.zzby zzbyVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza = zzgtVar.zza(str, zzbyVar);
        zzgtVar.zza.zzl().zzt();
        zzgtVar.zza.zzy();
        if (zza != null) {
            long j = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzgtVar.zza.zzj().zzu().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzgtVar.zza.zzj().zzg().zza("No referrer defined in Install Referrer response");
                } else {
                    zzgtVar.zza.zzj().zzp().zza("InstallReferrer API result", string);
                    zzny zzt = zzgtVar.zza.zzt();
                    Bundle zza2 = zzt.zza(Uri.parse("?" + string), zzpc.zza() && zzgtVar.zza.zzf().zza(zzbf.zzct));
                    if (zza2 == null) {
                        zzgtVar.zza.zzj().zzg().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zza2.getString(FirebaseAnalytics.Param.MEDIUM);
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j2 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzgtVar.zza.zzj().zzg().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zza2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzgtVar.zza.zzn().zzd.zza()) {
                            zzgtVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzgtVar.zza.zzac()) {
                            zzgtVar.zza.zzn().zzd.zza(j);
                            zzgtVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zza2.putString("_cis", "referrer API v2");
                            zzgtVar.zza.zzp().zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", zza2, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzgtVar.zza.zza(), serviceConnection);
        }
    }
}
