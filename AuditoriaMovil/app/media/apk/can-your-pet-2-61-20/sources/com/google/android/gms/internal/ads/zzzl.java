package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzzl {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzzm zzzmVar) {
        zzc(zzzmVar);
        this.zza.add(new zzzk(handler, zzzmVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzzk zzzkVar = (zzzk) it.next();
            z = zzzkVar.zzc;
            if (!z) {
                handler = zzzkVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzzm zzzmVar;
                        zzzmVar = zzzk.this.zzb;
                        zzzmVar.zzX(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzzm zzzmVar) {
        zzzm zzzmVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzzk zzzkVar = (zzzk) it.next();
            zzzmVar2 = zzzkVar.zzb;
            if (zzzmVar2 == zzzmVar) {
                zzzkVar.zzc();
                this.zza.remove(zzzkVar);
            }
        }
    }
}
