package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzccp implements Runnable {
    final /* synthetic */ zzccr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccp(zzccr zzccrVar) {
        this.zza = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccs zzccsVar;
        boolean z;
        zzccs zzccsVar2;
        zzccs zzccsVar3;
        zzccr zzccrVar = this.zza;
        zzccsVar = zzccrVar.zzq;
        if (zzccsVar != null) {
            z = zzccrVar.zzr;
            if (!z) {
                zzccsVar3 = zzccrVar.zzq;
                zzccsVar3.zzg();
                this.zza.zzr = true;
            }
            zzccsVar2 = this.zza.zzq;
            zzccsVar2.zze();
        }
    }
}
