package n5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import org.apache.tika.utils.StringUtils;
/* renamed from: n5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1534a extends zzeh implements zzfn {
    private static final C1534a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private zzeo zze = zzeh.zzP();
    private String zzg = StringUtils.EMPTY;
    private zzdf zzh = zzdf.zzb;

    static {
        C1534a c1534a = new C1534a();
        zzb = c1534a;
        zzeh.zzV(C1534a.class, c1534a);
    }

    public static C1534a a(byte[] bArr, zzds zzdsVar) {
        return (C1534a) zzeh.zzL(zzb, bArr, zzdsVar);
    }

    public final zzeo b() {
        return this.zze;
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
                            this.zzi = b5;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzeb(zzb);
                }
                return new C1534a();
            }
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", l.class, "zzf", h.f14382b, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
