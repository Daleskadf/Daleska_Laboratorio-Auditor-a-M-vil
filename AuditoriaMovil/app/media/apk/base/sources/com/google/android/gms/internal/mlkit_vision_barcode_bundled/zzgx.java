package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
final class zzgx extends zzgy {
    public zzgx(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzc(Object obj, long j, boolean z7) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzgz.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzd(Object obj, long j, byte b5) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j, b5);
        } else {
            zzgz.zzE(obj, j, b5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zze(Object obj, long j, double d7) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final boolean zzg(Object obj, long j) {
        if (zzgz.zzb) {
            return zzgz.zzt(obj, j);
        }
        return zzgz.zzu(obj, j);
    }
}
