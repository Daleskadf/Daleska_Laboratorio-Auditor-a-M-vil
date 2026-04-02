package n5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class q extends zzeh implements zzfn {
    private static final q zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;
    private String zzg = StringUtils.EMPTY;
    private String zzh = StringUtils.EMPTY;
    private String zzi = StringUtils.EMPTY;
    private String zzj = StringUtils.EMPTY;
    private String zzk = StringUtils.EMPTY;
    private String zzl = StringUtils.EMPTY;
    private String zzm = StringUtils.EMPTY;
    private String zzn = StringUtils.EMPTY;
    private String zzo = StringUtils.EMPTY;
    private String zzp = StringUtils.EMPTY;
    private String zzq = StringUtils.EMPTY;
    private String zzr = StringUtils.EMPTY;

    static {
        q qVar = new q();
        zzb = qVar;
        zzeh.zzV(q.class, qVar);
    }

    public static q a() {
        return zzb;
    }

    public final String b() {
        return this.zzf;
    }

    public final String c() {
        return this.zzi;
    }

    public final String d() {
        return this.zzo;
    }

    public final String e() {
        return this.zzr;
    }

    public final String f() {
        return this.zzh;
    }

    public final String g() {
        return this.zzn;
    }

    public final String h() {
        return this.zzg;
    }

    public final String zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzl;
    }

    public final String zze() {
        return this.zzj;
    }

    public final String zzf() {
        return this.zzm;
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
                return new q();
            }
            return zzeh.zzS(zzb, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        return (byte) 1;
    }

    public final String zzh() {
        return this.zzq;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzp;
    }
}
