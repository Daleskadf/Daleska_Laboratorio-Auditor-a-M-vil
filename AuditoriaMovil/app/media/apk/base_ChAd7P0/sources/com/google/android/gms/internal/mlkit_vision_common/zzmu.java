package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i7, int i8, long j, int i9, int i10, int i11, int i12) {
        zzmjVar.zzc(zzc(i7, i8, j, i9, i10, i11, i12), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i7, int i8, long j, int i9, int i10, int i11, int i12) {
        zzmjVar.zzc(zzc(i7, i8, j, i9, i10, i11, i12), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i7, int i8, long j, int i9, int i10, int i11, int i12) {
        return new zzmt(i7, i8, i11, i9, i10, SystemClock.elapsedRealtime() - j, i12);
    }
}
