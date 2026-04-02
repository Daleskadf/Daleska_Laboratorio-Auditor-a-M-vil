package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgj {
    private static zzgi zza;

    public static synchronized zzgi zza() {
        zzgi zzgiVar;
        synchronized (zzgj.class) {
            if (zza == null) {
                zza(new zzgl());
            }
            zzgiVar = zza;
        }
        return zzgiVar;
    }

    private static synchronized void zza(zzgi zzgiVar) {
        synchronized (zzgj.class) {
            if (zza != null) {
                throw new IllegalStateException("init() already called");
            }
            zza = zzgiVar;
        }
    }
}
