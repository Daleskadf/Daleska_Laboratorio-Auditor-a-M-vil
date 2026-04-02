package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class zzxn {
    public static zzxn zzg(Iterable iterable, int i7, int i8, float f) {
        Iterator it = iterable.iterator();
        int i9 = 0;
        int i10 = i7;
        int i11 = i8;
        int i12 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i10 = Math.min(i10, point.x);
            i11 = Math.min(i11, point.y);
            i9 = Math.max(i9, point.x);
            i12 = Math.max(i12, point.y);
        }
        float f4 = i7;
        float f8 = i8;
        return new zzxg((i10 + 0.0f) / f4, (i11 + 0.0f) / f8, (i9 + 0.0f) / f4, (i12 + 0.0f) / f8, 0.0f);
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public final float zzf() {
        if (zzh()) {
            return (zzd() - zze()) * (zzb() - zzc());
        }
        return 0.0f;
    }

    public final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }
}
