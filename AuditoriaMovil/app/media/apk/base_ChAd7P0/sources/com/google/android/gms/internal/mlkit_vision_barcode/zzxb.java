package com.google.android.gms.internal.mlkit_vision_barcode;
/* loaded from: classes.dex */
public final class zzxb {
    private static zzxb zza;

    private zzxb() {
    }

    public static synchronized zzxb zza() {
        zzxb zzxbVar;
        synchronized (zzxb.class) {
            try {
                if (zza == null) {
                    zza = new zzxb();
                }
                zzxbVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzxbVar;
    }
}
