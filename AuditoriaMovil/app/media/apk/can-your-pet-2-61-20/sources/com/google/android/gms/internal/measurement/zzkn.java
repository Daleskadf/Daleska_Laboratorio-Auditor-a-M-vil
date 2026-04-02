package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
abstract class zzkn {
    private static final zzkn zza = new zzkq();
    private static final zzkn zzb = new zzks();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkn zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkn zzb() {
        return zzb;
    }

    private zzkn() {
    }
}
