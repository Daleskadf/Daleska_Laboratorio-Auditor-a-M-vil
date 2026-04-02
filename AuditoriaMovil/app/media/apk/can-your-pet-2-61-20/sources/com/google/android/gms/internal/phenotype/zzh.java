package com.google.android.gms.internal.phenotype;

import android.content.Context;
/* loaded from: classes3.dex */
public final class zzh<T> {
    private static final Object zzak = new Object();
    private static Context zzal = null;
    private static boolean zzam = false;
    private static volatile Boolean zzan;
    private static volatile Boolean zzbq;

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:13:0x0018, B:15:0x001c, B:16:0x001f, B:17:0x0021, B:9:0x0010), top: B:23:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void init(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.phenotype.zzh.zzak
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L26
            r2 = 24
            if (r1 < r2) goto L10
            boolean r1 = androidx.print.PrintHelper$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L10
            goto L18
        L10:
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L17
            goto L18
        L17:
            r3 = r1
        L18:
            android.content.Context r1 = com.google.android.gms.internal.phenotype.zzh.zzal     // Catch: java.lang.Throwable -> L26
            if (r1 == r3) goto L1f
            r1 = 0
            com.google.android.gms.internal.phenotype.zzh.zzan = r1     // Catch: java.lang.Throwable -> L26
        L1f:
            com.google.android.gms.internal.phenotype.zzh.zzal = r3     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            r3 = 0
            com.google.android.gms.internal.phenotype.zzh.zzam = r3
            return
        L26:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.phenotype.zzh.init(android.content.Context):void");
    }

    public static void maybeInit(Context context) {
        if (zzal == null) {
            init(context);
        }
    }
}
