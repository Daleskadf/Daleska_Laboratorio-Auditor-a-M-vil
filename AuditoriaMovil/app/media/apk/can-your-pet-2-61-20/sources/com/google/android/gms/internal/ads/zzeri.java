package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeri implements zzewr {
    private final zzgep zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeri(zzgep zzgepVar, Context context) {
        this.zza = zzgepVar;
        this.zzb = context;
    }

    private final Intent zzd() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkF)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            return this.zzb.registerReceiver(null, intentFilter);
        }
        registerReceiver = this.zzb.registerReceiver(null, intentFilter, 4);
        return registerReceiver;
    }

    private static final boolean zze(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            return intExtra == 2 || intExtra == 5;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeri.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzerj zzc() throws Exception {
        double intExtra;
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlG)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            if (Build.VERSION.SDK_INT < 23 || batteryManager == null) {
                z = zze(zzd());
            } else {
                z = batteryManager.isCharging();
            }
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            intExtra = zzd != null ? zzd.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / zzd.getIntExtra("scale", -1) : -1.0d;
            z = zze;
        }
        return new zzerj(intExtra, z);
    }
}
