package com.google.android.gms.internal.ads;

import java.math.BigInteger;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakh implements zzaef {
    final /* synthetic */ zzaki zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzakh(zzaki zzakiVar, zzakg zzakgVar) {
        this.zza = zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        zzaku zzakuVar;
        long j;
        zzaki zzakiVar = this.zza;
        zzakuVar = zzakiVar.zzd;
        j = zzakiVar.zzf;
        return zzakuVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        zzaku zzakuVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzaki zzakiVar = this.zza;
        zzakuVar = zzakiVar.zzd;
        long zzg = zzakuVar.zzg(j);
        j2 = zzakiVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaki zzakiVar2 = this.zza;
        j3 = zzakiVar2.zzc;
        j4 = zzakiVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = this.zza.zzf;
        long longValue = j2 + multiply.divide(BigInteger.valueOf(j5)).longValue();
        zzaki zzakiVar3 = this.zza;
        j6 = zzakiVar3.zzb;
        j7 = zzakiVar3.zzc;
        zzaeg zzaegVar = new zzaeg(j, Math.max(j6, Math.min(longValue - 30000, j7 - 1)));
        return new zzaed(zzaegVar, zzaegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
