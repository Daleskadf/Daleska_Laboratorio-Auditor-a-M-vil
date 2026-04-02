package n5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
/* loaded from: classes.dex */
public final class f extends zzeh implements zzfn {
    private static final f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        f fVar = new f();
        zzb = fVar;
        zzeh.zzV(f.class, fVar);
    }

    public static e c() {
        return (e) zzb.zzG();
    }

    public static /* synthetic */ void d(int i7, f fVar) {
        fVar.zzd |= 1;
        fVar.zze = i7;
    }

    public static /* synthetic */ void e(int i7, f fVar) {
        fVar.zzd |= 2;
        fVar.zzf = i7;
    }

    public final int a() {
        return this.zze;
    }

    public final int b() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i7, Object obj, Object obj2) {
        byte b5 = 1;
        int i8 = i7 - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (obj == null) {
                                b5 = 0;
                            }
                            this.zzg = b5;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzeb(zzb);
                }
                return new f();
            }
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
