package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* loaded from: classes.dex */
final class zzfd implements zzfk {
    private final zzfk[] zza;

    public zzfd(zzfk... zzfkVarArr) {
        this.zza = zzfkVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final zzfj zzb(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            zzfk zzfkVar = this.zza[i7];
            if (zzfkVar.zzc(cls)) {
                return zzfkVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final boolean zzc(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.zza[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
