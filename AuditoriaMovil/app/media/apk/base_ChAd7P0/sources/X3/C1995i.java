package x3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhk;
import org.apache.tika.utils.StringUtils;
/* renamed from: x3.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1995i extends zzeh implements zzfn {
    private static final C1995i zzb;
    private int zzd;
    private C1993g zzj;
    private zzhk zzl;
    private String zze = StringUtils.EMPTY;
    private zzdf zzf = zzdf.zzb;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        C1995i c1995i = new C1995i();
        zzb = c1995i;
        zzeh.zzV(C1995i.class, c1995i);
    }

    public static C1994h a() {
        return (C1994h) zzb.zzG();
    }

    public static /* synthetic */ void b(C1995i c1995i, C1993g c1993g) {
        c1993g.getClass();
        c1995i.zzj = c1993g;
        c1995i.zzd |= 32;
    }

    public static /* synthetic */ void c(C1995i c1995i, zzdf zzdfVar) {
        zzdfVar.getClass();
        c1995i.zzd |= 2;
        c1995i.zzf = zzdfVar;
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
                return new C1995i();
            }
            return zzeh.zzS(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        return (byte) 1;
    }
}
