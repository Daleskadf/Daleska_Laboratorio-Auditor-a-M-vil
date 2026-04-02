package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
abstract class zzmv<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(T t);

    abstract B zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zza(T t, T t2);

    abstract void zza(B b, int i, int i2);

    abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzii zziiVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zznv zznvVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzlx zzlxVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(T t, zznv zznvVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzd(Object obj);

    abstract T zze(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzlx zzlxVar) throws IOException {
        int zzd = zzlxVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzb(b, i, zzlxVar.zzl());
            return true;
        } else if (i2 == 1) {
            zza((zzmv<T, B>) b, i, zzlxVar.zzk());
            return true;
        } else if (i2 == 2) {
            zza((zzmv<T, B>) b, i, zzlxVar.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zza((zzmv<T, B>) b, i, zzlxVar.zzf());
                    return true;
                }
                throw zzkd.zza();
            }
            return false;
        } else {
            B zza = zza();
            int i3 = 4 | (i << 3);
            while (zzlxVar.zzc() != Integer.MAX_VALUE && zza((zzmv<T, B>) zza, zzlxVar)) {
            }
            if (i3 != zzlxVar.zzd()) {
                throw zzkd.zzb();
            }
            zza((zzmv<T, B>) b, i, (int) zze(zza));
            return true;
        }
    }
}
