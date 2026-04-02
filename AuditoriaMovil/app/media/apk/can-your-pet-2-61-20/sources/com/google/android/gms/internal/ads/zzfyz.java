package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfyz extends zzfzc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyz() {
        super(null);
    }

    static final zzfzc zzg(int i) {
        zzfzc zzfzcVar;
        zzfzc zzfzcVar2;
        zzfzc zzfzcVar3;
        if (i < 0) {
            zzfzcVar3 = zzfzc.zzb;
            return zzfzcVar3;
        } else if (i > 0) {
            zzfzcVar2 = zzfzc.zzc;
            return zzfzcVar2;
        } else {
            zzfzcVar = zzfzc.zza;
            return zzfzcVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzb(int i, int i2) {
        return zzg(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzc(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        return zzg(i < 0 ? -1 : i > 0 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzd(Object obj, Object obj2, Comparator comparator) {
        return zzg(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zze(boolean z, boolean z2) {
        return zzg(zzgch.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzf(boolean z, boolean z2) {
        return zzg(zzgch.zza(z2, z));
    }
}
