package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaga extends zzadu {
    final /* synthetic */ zzaef zza;
    final /* synthetic */ zzagb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaga(zzagb zzagbVar, zzaef zzaefVar, zzaef zzaefVar2) {
        super(zzaefVar);
        this.zza = zzaefVar2;
        this.zzb = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        long j2;
        long j3;
        zzaed zzg = this.zza.zzg(j);
        zzaeg zzaegVar = zzg.zza;
        long j4 = zzaegVar.zzc;
        j2 = this.zzb.zzb;
        zzaeg zzaegVar2 = new zzaeg(zzaegVar.zzb, j4 + j2);
        zzaeg zzaegVar3 = zzg.zzb;
        long j5 = zzaegVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzaed(zzaegVar2, new zzaeg(zzaegVar3.zzb, j5 + j3));
    }
}
