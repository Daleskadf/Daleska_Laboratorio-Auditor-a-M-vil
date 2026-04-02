package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaew implements zzaef {
    final /* synthetic */ zzaez zza;
    private final long zzb;

    public zzaew(zzaez zzaezVar, long j) {
        this.zza = zzaezVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        zzafc[] zzafcVarArr;
        zzafc[] zzafcVarArr2;
        zzafc[] zzafcVarArr3;
        zzafcVarArr = this.zza.zzh;
        zzaed zza = zzafcVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzaez zzaezVar = this.zza;
            zzafcVarArr2 = zzaezVar.zzh;
            if (i >= zzafcVarArr2.length) {
                return zza;
            }
            zzafcVarArr3 = zzaezVar.zzh;
            zzaed zza2 = zzafcVarArr3[i].zza(j);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
