package n5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class i extends zzeh implements zzfn {
    private static final i zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;

    static {
        i iVar = new i();
        zzb = iVar;
        zzeh.zzV(i.class, iVar);
    }

    public static i a() {
        return zzb;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
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
                return new i();
            }
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
