package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzawg implements Runnable {
    final /* synthetic */ zzawh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawg(zzawh zzawhVar) {
        this.zza = zzawhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfpp zzfppVar;
        Object obj2;
        obj = this.zza.zzp;
        synchronized (obj) {
            z = this.zza.zzq;
            if (z) {
                return;
            }
            this.zza.zzq = true;
            try {
                zzawh.zzj(this.zza);
            } catch (Exception e) {
                zzfppVar = this.zza.zzh;
                zzfppVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzp;
            synchronized (obj2) {
                this.zza.zzq = false;
            }
        }
    }
}
