package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzea implements zzfk {
    private static final zzea zza = new zzea();

    private zzea() {
    }

    public static zzea zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final zzfj zzb(Class cls) {
        if (zzeh.class.isAssignableFrom(cls)) {
            try {
                return (zzfj) zzeh.zzJ(cls.asSubclass(zzeh.class)).zzg(3, null, null);
            } catch (Exception e7) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final boolean zzc(Class cls) {
        return zzeh.class.isAssignableFrom(cls);
    }
}
