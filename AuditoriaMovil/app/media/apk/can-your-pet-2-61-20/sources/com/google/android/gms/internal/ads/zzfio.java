package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfio implements zzgea {
    final /* synthetic */ zzfir zza;
    final /* synthetic */ zzfis zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfio(zzfis zzfisVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        this.zzb = zzfisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r4 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfis zzfisVar = this.zzb;
            i = zzfisVar.zzf;
            if (i == 1) {
                zzfisVar.zzh();
            }
        }
    }
}
