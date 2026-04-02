package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdma implements GestureDetector.OnGestureListener {
    private final zzdkt zza;
    private final zzdlu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdma(zzdkt zzdktVar, zzdlu zzdluVar) {
        this.zza = zzdktVar;
        this.zzb = zzdluVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0008, B:10:0x001c, B:21:0x0066, B:23:0x006e, B:13:0x002f, B:16:0x0042, B:19:0x0056), top: B:31:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzdkt r0 = r6.zza     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            if (r0 != 0) goto L8
            goto L7b
        L8:
            float r0 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L7d
            float r2 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L7d
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3e
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L2b
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 1
            goto L66
        L2b:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L65
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 2
            goto L66
        L3e:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L52
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 8
            goto L66
        L52:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L65
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L7d
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L7d
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L7d
            r3 = 4
            goto L66
        L65:
            r7 = 0
        L66:
            com.google.android.gms.internal.ads.zzdkt r8 = r6.zza     // Catch: java.lang.Throwable -> L7d
            int r8 = r8.zza()     // Catch: java.lang.Throwable -> L7d
            if (r3 != r8) goto L7b
            com.google.android.gms.internal.ads.zzdkt r8 = r6.zza     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.zzdlu r9 = r6.zzb     // Catch: java.lang.Throwable -> L7d
            android.widget.FrameLayout r9 = r9.zzr()     // Catch: java.lang.Throwable -> L7d
            r8.zzD(r9, r7)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r6)
            return r1
        L7b:
            monitor-exit(r6)
            return r1
        L7d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdma.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
