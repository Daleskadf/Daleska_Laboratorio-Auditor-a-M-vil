package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhcz extends zzhcx {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* synthetic */ int zza(Object obj) {
        return ((zzhcy) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzhcy) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgzv zzgzvVar = (zzgzv) obj;
        zzhcy zzhcyVar = zzgzvVar.zzt;
        if (zzhcyVar == zzhcy.zzc()) {
            zzhcy zzf = zzhcy.zzf();
            zzgzvVar.zzt = zzf;
            return zzf;
        }
        return zzhcyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzgzv) obj).zzt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzhcy.zzc().equals(obj2)) {
            return obj;
        }
        if (zzhcy.zzc().equals(obj)) {
            return zzhcy.zze((zzhcy) obj, (zzhcy) obj2);
        }
        ((zzhcy) obj).zzd((zzhcy) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhcx
    final /* synthetic */ Object zzf() {
        return zzhcy.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhcx
    final /* synthetic */ Object zzg(Object obj) {
        ((zzhcy) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhcx
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzhcy) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhcx
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzhcy) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhcx
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzhcy) obj).zzj((i << 3) | 3, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgyj zzgyjVar) {
        ((zzhcy) obj).zzj((i << 3) | 2, zzgyjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzhcy) obj).zzj(i << 3, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final void zzm(Object obj) {
        ((zzgzv) obj).zzt.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgzv) obj).zzt = (zzhcy) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgzv) obj).zzt = (zzhcy) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final boolean zzq(zzhby zzhbyVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* synthetic */ void zzr(Object obj, zzgzb zzgzbVar) throws IOException {
        ((zzhcy) obj).zzl(zzgzbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhcx
    public final /* synthetic */ void zzs(Object obj, zzgzb zzgzbVar) throws IOException {
        ((zzhcy) obj).zzm(zzgzbVar);
    }
}
