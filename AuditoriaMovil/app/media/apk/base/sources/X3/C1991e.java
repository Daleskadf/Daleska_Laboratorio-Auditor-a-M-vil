package x3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
/* renamed from: x3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1991e extends zzeh implements zzfn {
    private static final C1991e zzb;
    private int zzd;
    private zzem zze = zzeh.zzM();
    private zzem zzf = zzeh.zzM();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C1991e c1991e = new C1991e();
        zzb = c1991e;
        zzeh.zzV(C1991e.class, c1991e);
    }

    public static C1990d a() {
        return (C1990d) zzb.zzG();
    }

    public static /* synthetic */ void b(C1991e c1991e, int i7) {
        c1991e.zzd |= 2;
        c1991e.zzh = i7;
    }

    public static /* synthetic */ void c(C1991e c1991e, float f) {
        zzem zzemVar = c1991e.zze;
        if (!zzemVar.zzc()) {
            c1991e.zze = zzeh.zzN(zzemVar);
        }
        c1991e.zze.zzh(f);
    }

    public static /* synthetic */ void d(C1991e c1991e, float f) {
        zzem zzemVar = c1991e.zzf;
        if (!zzemVar.zzc()) {
            c1991e.zzf = zzeh.zzN(zzemVar);
        }
        c1991e.zzf.zzh(f);
    }

    public static /* synthetic */ void e(C1991e c1991e, int i7) {
        c1991e.zzd |= 1;
        c1991e.zzg = i7;
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
                return new C1991e();
            }
            return zzeh.zzS(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
