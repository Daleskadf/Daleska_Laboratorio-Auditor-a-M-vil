package com.google.android.gms.internal.cast;
/* loaded from: classes.dex */
final class zzpr extends zzps {
    public /* synthetic */ zzpr(zzpp zzppVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast.zzps
    public final void zza(Object obj, long j10) {
        ((zzpg) zzrn.zzf(obj, j10)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // com.google.android.gms.internal.cast.zzps
    public final <E> void zzb(Object obj, Object obj2, long j10) {
        zzpg<E> zzpgVar = (zzpg) zzrn.zzf(obj, j10);
        zzpg<E> zzpgVar2 = (zzpg) zzrn.zzf(obj2, j10);
        int size = zzpgVar.size();
        int size2 = zzpgVar2.size();
        zzpg<E> zzpgVar3 = zzpgVar;
        zzpgVar3 = zzpgVar;
        if (size > 0 && size2 > 0) {
            boolean zzc = zzpgVar.zzc();
            zzpg<E> zzpgVar4 = zzpgVar;
            if (!zzc) {
                zzpgVar4 = zzpgVar.zzg(size2 + size);
            }
            zzpgVar4.addAll(zzpgVar2);
            zzpgVar3 = zzpgVar4;
        }
        if (size > 0) {
            zzpgVar2 = zzpgVar3;
        }
        zzrn.zzs(obj, j10, zzpgVar2);
    }

    private zzpr() {
        super(null);
    }
}
