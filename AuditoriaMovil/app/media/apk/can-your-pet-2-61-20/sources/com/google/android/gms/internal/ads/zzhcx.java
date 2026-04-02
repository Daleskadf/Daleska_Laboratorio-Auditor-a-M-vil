package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzhcx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(Object obj, int i, zzgyj zzgyjVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzq(zzhby zzhbyVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzr(Object obj, zzgzb zzgzbVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzs(Object obj, zzgzb zzgzbVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(Object obj, zzhby zzhbyVar) throws IOException {
        int zzd = zzhbyVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzhbyVar.zzl());
            return true;
        } else if (i2 == 1) {
            zzi(obj, i, zzhbyVar.zzk());
            return true;
        } else if (i2 == 2) {
            zzk(obj, i, zzhbyVar.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzh(obj, i, zzhbyVar.zzf());
                    return true;
                }
                throw zzhak.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            int i3 = i << 3;
            while (zzhbyVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzhbyVar)) {
            }
            if ((4 | i3) != zzhbyVar.zzd()) {
                throw zzhak.zzb();
            }
            zzg(zzf);
            zzj(obj, i, zzf);
            return true;
        }
    }
}
