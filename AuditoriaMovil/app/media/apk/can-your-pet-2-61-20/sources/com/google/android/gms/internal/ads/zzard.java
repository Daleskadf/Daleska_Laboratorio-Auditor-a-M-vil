package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzard implements zzaqp {
    private final Map zza = new HashMap();
    private final zzaqc zzb;
    private final BlockingQueue zzc;
    private final zzaqh zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzard(zzaqc zzaqcVar, BlockingQueue blockingQueue, zzaqh zzaqhVar) {
        this.zzd = zzaqhVar;
        this.zzb = zzaqcVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zza(zzaqq zzaqqVar) {
        Map map = this.zza;
        String zzj = zzaqqVar.zzj();
        List list = (List) map.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzarc.zzb) {
            zzarc.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        zzaqq zzaqqVar2 = (zzaqq) list.remove(0);
        this.zza.put(zzj, list);
        zzaqqVar2.zzu(this);
        try {
            this.zzc.put(zzaqqVar2);
        } catch (InterruptedException e) {
            zzarc.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzb(zzaqq zzaqqVar, zzaqw zzaqwVar) {
        List<zzaqq> list;
        zzapz zzapzVar = zzaqwVar.zzb;
        if (zzapzVar == null || zzapzVar.zza(System.currentTimeMillis())) {
            zza(zzaqqVar);
            return;
        }
        String zzj = zzaqqVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(zzj);
        }
        if (list != null) {
            if (zzarc.zzb) {
                zzarc.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            for (zzaqq zzaqqVar2 : list) {
                this.zzd.zzb(zzaqqVar2, zzaqwVar, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzc(zzaqq zzaqqVar) {
        Map map = this.zza;
        String zzj = zzaqqVar.zzj();
        if (map.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzaqqVar.zzm("waiting-for-response");
            list.add(zzaqqVar);
            this.zza.put(zzj, list);
            if (zzarc.zzb) {
                zzarc.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzaqqVar.zzu(this);
        if (zzarc.zzb) {
            zzarc.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}
