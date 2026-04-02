package x3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import org.apache.tika.utils.StringUtils;
/* renamed from: x3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1989c extends zzeh implements zzfn {
    private static final C1989c zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private zzdf zzf;
    private String zzg;
    private zzdf zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        C1989c c1989c = new C1989c();
        zzb = c1989c;
        zzeh.zzV(C1989c.class, c1989c);
    }

    public C1989c() {
        zzdf zzdfVar = zzdf.zzb;
        this.zzf = zzdfVar;
        this.zzg = StringUtils.EMPTY;
        this.zzh = zzdfVar;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static C1988b a() {
        return (C1988b) zzb.zzG();
    }

    public static /* synthetic */ void b(C1989c c1989c, zzdf zzdfVar) {
        zzdfVar.getClass();
        c1989c.zzd |= 2;
        c1989c.zzf = zzdfVar;
    }

    public static /* synthetic */ void c(C1989c c1989c, zzdf zzdfVar) {
        zzdfVar.getClass();
        c1989c.zzd |= 8;
        c1989c.zzh = zzdfVar;
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
                return new C1989c();
            }
            return zzeh.zzS(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
