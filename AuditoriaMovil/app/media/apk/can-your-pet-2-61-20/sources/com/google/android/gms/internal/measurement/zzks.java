package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzks extends zzkn {
    private static <E> zzke<E> zzc(Object obj, long j) {
        return (zzke) zznb.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final <L> List<L> zza(Object obj, long j) {
        zzke zzc = zzc(obj, j);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzke zza = zzc.zza(size == 0 ? 10 : size << 1);
        zznb.zza(obj, j, zza);
        return zza;
    }

    private zzks() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.measurement.zzke] */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzke<E> zzc = zzc(obj, j);
        zzke<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzke<E> zzkeVar = zzc;
        zzkeVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzc3 = zzc.zzc();
            zzke<E> zzkeVar2 = zzc;
            if (!zzc3) {
                zzkeVar2 = zzc.zza(size2 + size);
            }
            zzkeVar2.addAll(zzc2);
            zzkeVar = zzkeVar2;
        }
        if (size > 0) {
            zzc2 = zzkeVar;
        }
        zznb.zza(obj, j, zzc2);
    }
}
