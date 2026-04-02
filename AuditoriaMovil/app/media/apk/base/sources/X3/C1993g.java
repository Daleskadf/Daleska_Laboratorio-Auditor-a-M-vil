package x3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
/* renamed from: x3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993g extends zzeh implements zzfn {
    private static final C1993g zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        C1993g c1993g = new C1993g();
        zzb = c1993g;
        zzeh.zzV(C1993g.class, c1993g);
    }

    public static C1992f a() {
        return (C1992f) zzb.zzG();
    }

    public static /* synthetic */ void b(C1993g c1993g, C1991e c1991e) {
        c1991e.getClass();
        zzeo zzeoVar = c1993g.zzd;
        if (!zzeoVar.zzc()) {
            c1993g.zzd = zzeh.zzQ(zzeoVar);
        }
        c1993g.zzd.add(c1991e);
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
                return new C1993g();
            }
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C1991e.class});
        }
        return (byte) 1;
    }
}
