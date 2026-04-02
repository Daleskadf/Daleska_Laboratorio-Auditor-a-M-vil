package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzarb {
    public static final boolean zza = zzarc.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzarc.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzara(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        List list;
        this.zzc = true;
        long j = this.zzb.size() == 0 ? 0L : ((zzara) this.zzb.get(list.size() - 1)).zzc - ((zzara) this.zzb.get(0)).zzc;
        if (j > 0) {
            long j2 = ((zzara) this.zzb.get(0)).zzc;
            zzarc.zza("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzara zzaraVar : this.zzb) {
                long j3 = zzaraVar.zzc;
                zzarc.zza("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzaraVar.zzb), zzaraVar.zza);
                j2 = j3;
            }
        }
    }
}
