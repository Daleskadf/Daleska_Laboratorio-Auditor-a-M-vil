package x3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
/* renamed from: x3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987a extends zzeh implements zzfn {
    private static final C1987a zzb;
    private int zzd;
    private C1995i zze;
    private C1989c zzf;
    private l zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh, x3.a] */
    static {
        ?? zzehVar = new zzeh();
        zzb = zzehVar;
        zzeh.zzV(C1987a.class, zzehVar);
    }

    public static C1996j a() {
        return (C1996j) zzb.zzG();
    }

    public static /* synthetic */ void b(C1987a c1987a, C1995i c1995i) {
        c1995i.getClass();
        c1987a.zze = c1995i;
        c1987a.zzd |= 1;
    }

    public static /* synthetic */ void c(C1987a c1987a, C1989c c1989c) {
        c1989c.getClass();
        c1987a.zzf = c1989c;
        c1987a.zzd |= 2;
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
            return zzeh.zzS(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
