package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzhr implements Runnable {
    private final /* synthetic */ zzja zza;
    private final /* synthetic */ zzhm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhr(zzhm zzhmVar, zzja zzjaVar) {
        this.zza = zzjaVar;
        this.zzb = zzhmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhm.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}
