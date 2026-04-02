package n5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class l extends zzeh implements zzfn {
    private static final l zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private zzdf zzf;
    private String zzg;
    private d zzh;
    private int zzi;
    private p zzj;
    private r zzk;
    private zzco zzl;
    private g zzm;
    private j zzn;
    private i zzo;
    private t zzp;
    private o zzq;
    private q zzr;
    private m zzs;
    private zzeo zzt;
    private zzen zzu;
    private String zzv;
    private zzeo zzw;
    private boolean zzx;
    private double zzy;
    private zzdf zzz;

    static {
        l lVar = new l();
        zzb = lVar;
        zzeh.zzV(l.class, lVar);
    }

    public l() {
        zzdf zzdfVar = zzdf.zzb;
        this.zzf = zzdfVar;
        this.zzg = StringUtils.EMPTY;
        this.zzt = zzeh.zzP();
        this.zzu = zzeh.zzO();
        this.zzv = StringUtils.EMPTY;
        this.zzw = zzeh.zzP();
        this.zzx = true;
        this.zzz = zzdfVar;
    }

    public static /* synthetic */ void n(l lVar, int i7, f fVar) {
        fVar.getClass();
        zzeo zzeoVar = lVar.zzt;
        if (!zzeoVar.zzc()) {
            lVar.zzt = zzeh.zzQ(zzeoVar);
        }
        lVar.zzt.set(i7, fVar);
    }

    public final int a() {
        int s02 = f7.a.s0(this.zzi);
        if (s02 == 0) {
            return 1;
        }
        return s02;
    }

    public final int b() {
        return this.zzt.size();
    }

    public final o c() {
        o oVar = this.zzq;
        if (oVar == null) {
            return o.c();
        }
        return oVar;
    }

    public final p d() {
        p pVar = this.zzj;
        if (pVar == null) {
            return p.a();
        }
        return pVar;
    }

    public final q e() {
        q qVar = this.zzr;
        if (qVar == null) {
            return q.a();
        }
        return qVar;
    }

    public final r f() {
        r rVar = this.zzk;
        if (rVar == null) {
            return r.a();
        }
        return rVar;
    }

    public final t g() {
        t tVar = this.zzp;
        if (tVar == null) {
            return t.c();
        }
        return tVar;
    }

    public final g h() {
        g gVar = this.zzm;
        if (gVar == null) {
            return g.a();
        }
        return gVar;
    }

    public final i i() {
        i iVar = this.zzo;
        if (iVar == null) {
            return i.a();
        }
        return iVar;
    }

    public final j j() {
        j jVar = this.zzn;
        if (jVar == null) {
            return j.a();
        }
        return jVar;
    }

    public final zzdf k() {
        return this.zzf;
    }

    public final String l() {
        return this.zzg;
    }

    public final zzeo m() {
        return this.zzt;
    }

    public final boolean o() {
        if ((this.zzd & RecognitionOptions.AZTEC) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.zzd & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.zzd & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if ((this.zzd & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.zzd & RecognitionOptions.PDF417) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if ((this.zzd & RecognitionOptions.ITF) != 0) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if ((this.zzd & RecognitionOptions.QR_CODE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if ((this.zzd & RecognitionOptions.UPC_E) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.zzd & RecognitionOptions.UPC_A) != 0) {
            return true;
        }
        return false;
    }

    public final int x() {
        int I7 = android.support.v4.media.session.a.I(this.zze);
        if (I7 == 0) {
            return 1;
        }
        return I7;
    }

    public final zzco zzb() {
        zzco zzcoVar = this.zzl;
        if (zzcoVar == null) {
            return zzco.zzb();
        }
        return zzcoVar;
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
                            this.zzA = b5;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzeb(zzb);
                }
                return new l();
            }
            return zzeh.zzS(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", h.f14384d, "zzf", "zzg", "zzi", h.f14385e, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", f.class, "zzv", "zzw", f.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        return Byte.valueOf(this.zzA);
    }
}
