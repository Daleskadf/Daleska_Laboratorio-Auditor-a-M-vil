package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgz implements Runnable {
    final /* synthetic */ zzhx zza;

    public zzgz(zzhx zzhxVar) {
        this.zza = zzhxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzb();
    }
}
