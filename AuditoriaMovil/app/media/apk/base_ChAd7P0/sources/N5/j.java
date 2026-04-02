package n5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class j extends zzeh implements zzfn {
    private static final j zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = StringUtils.EMPTY;
    private String zzg = StringUtils.EMPTY;

    static {
        j jVar = new j();
        zzb = jVar;
        zzeh.zzV(j.class, jVar);
    }

    public static j a() {
        return zzb;
    }

    public final int b() {
        int i7;
        int i8 = this.zzf;
        if (i8 != 0) {
            i7 = 2;
            if (i8 != 1) {
                if (i8 != 2) {
                    i7 = 4;
                    if (i8 != 3) {
                        i7 = i8 != 4 ? 0 : 5;
                    }
                } else {
                    i7 = 3;
                }
            }
        } else {
            i7 = 1;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
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
                return new j();
            }
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", h.f14383c, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
