package x3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
/* loaded from: classes.dex */
public final class o extends zzeh implements zzfn {
    private static final o zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh, x3.o] */
    static {
        ?? zzehVar = new zzeh();
        zzb = zzehVar;
        zzeh.zzV(o.class, zzehVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzeb(zzb);
                }
                return new zzeh();
            }
            return zzeh.zzS(zzb, "\u0001\u0000", null);
        }
        return (byte) 1;
    }
}
