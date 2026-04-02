package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlr extends zzat {
    private final /* synthetic */ zzld zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlr(zzld zzldVar, zzio zzioVar) {
        super(zzioVar);
        this.zza = zzldVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzat
    public final void zzb() {
        this.zza.zzj().zzu().zza("Tasks have been queued for a long time");
    }
}
