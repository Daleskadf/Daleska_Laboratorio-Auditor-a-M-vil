package com.google.android.gms.internal.mlkit_vision_barcode;
/* loaded from: classes.dex */
final class zzck {
    public static int zza(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
