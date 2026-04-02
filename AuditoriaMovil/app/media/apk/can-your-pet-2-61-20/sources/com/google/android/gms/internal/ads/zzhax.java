package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhax extends zzhaz {
    private zzhax() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhax(zzhaw zzhawVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhaz
    public final List zza(Object obj, long j) {
        zzhah zzhahVar = (zzhah) zzhdh.zzh(obj, j);
        if (zzhahVar.zzc()) {
            return zzhahVar;
        }
        int size = zzhahVar.size();
        zzhah zzf = zzhahVar.zzf(size == 0 ? 10 : size + size);
        zzhdh.zzv(obj, j, zzf);
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzb(Object obj, long j) {
        ((zzhah) zzhdh.zzh(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzc(Object obj, Object obj2, long j) {
        zzhah zzhahVar = (zzhah) zzhdh.zzh(obj, j);
        zzhah zzhahVar2 = (zzhah) zzhdh.zzh(obj2, j);
        int size = zzhahVar.size();
        int size2 = zzhahVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzhahVar.zzc()) {
                zzhahVar = zzhahVar.zzf(size2 + size);
            }
            zzhahVar.addAll(zzhahVar2);
        }
        if (size > 0) {
            zzhahVar2 = zzhahVar;
        }
        zzhdh.zzv(obj, j, zzhahVar2);
    }
}
