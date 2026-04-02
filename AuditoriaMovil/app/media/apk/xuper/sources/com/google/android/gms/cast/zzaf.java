package com.google.android.gms.cast;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaf implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ CastRemoteDisplayLocalService zzb;

    public zzaf(CastRemoteDisplayLocalService castRemoteDisplayLocalService, boolean z10) {
        this.zzb = castRemoteDisplayLocalService;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzx(this.zza);
    }
}
