package com.google.android.gms.internal.mlkit_vision_barcode;
/* loaded from: classes.dex */
final class zzxg extends zzxn {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;

    public zzxg(float f, float f4, float f8, float f9, float f10) {
        this.zza = f;
        this.zzb = f4;
        this.zzc = f8;
        this.zzd = f9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxn) {
            zzxn zzxnVar = (zzxn) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(zzxnVar.zzc()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzxnVar.zze()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(zzxnVar.zzb()) && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxnVar.zzd())) {
                int floatToIntBits = Float.floatToIntBits(0.0f);
                zzxnVar.zza();
                if (floatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc)) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.zza + ", yMin=" + this.zzb + ", xMax=" + this.zzc + ", yMax=" + this.zzd + ", confidenceScore=0.0}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zza() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zze() {
        return this.zzb;
    }
}
