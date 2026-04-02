package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpz;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzq extends BroadcastReceiver {
    private final zzhm zza;

    public zzq(zzhm zzhmVar) {
        this.zza = zzhmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.zza.zzj().zzu().zza("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.zza.zzj().zzu().zza("App receiver called with null action");
            return;
        }
        action.hashCode();
        if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final zzhm zzhmVar = this.zza;
            if (zzpz.zza() && zzhmVar.zzf().zzf(null, zzbf.zzcf)) {
                zzhmVar.zzj().zzp().zza("App receiver notified triggers are available");
                zzhmVar.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzs
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhm zzhmVar2 = zzhm.this;
                        if (!zzhmVar2.zzt().zzw()) {
                            zzhmVar2.zzj().zzu().zza("registerTrigger called but app not eligible");
                            return;
                        }
                        final zzjc zzp = zzhmVar2.zzp();
                        Objects.requireNonNull(zzp);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzp
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzjc.this.zzam();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        this.zza.zzj().zzu().zza("App receiver called with unknown action");
    }
}
