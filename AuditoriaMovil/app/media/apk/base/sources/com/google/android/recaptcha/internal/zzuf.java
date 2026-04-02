package com.google.android.recaptcha.internal;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class zzuf extends zznd implements zzoj {
    private static final zzuf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private zznk zzg = zznd.zzB();

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zznd.zzI(zzuf.class, zzufVar);
        zzls zzg = zzls.zzg();
        zzpw zzpwVar = zzpw.zzi;
        zznd.zzs(zzg, StringUtils.EMPTY, null, null, 490775251, zzpwVar, String.class);
        zznd.zzs(zzls.zzg(), StringUtils.EMPTY, null, null, 490775252, zzpwVar, String.class);
    }

    private zzuf() {
    }

    public final int zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (i8 != 6) {
                                return null;
                            }
                            zzoq zzoqVar = zzd;
                            if (zzoqVar == null) {
                                synchronized (zzuf.class) {
                                    try {
                                        zzoqVar = zzd;
                                        if (zzoqVar == null) {
                                            zzoqVar = new zzmy(zzb);
                                            zzd = zzoqVar;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            return zzoqVar;
                        }
                        return zzb;
                    }
                    return new zzuc(null);
                }
                return new zzuf();
            }
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", zzue.class});
        }
        return (byte) 1;
    }

    public final List zzj() {
        return this.zzg;
    }

    public final int zzk() {
        int i7;
        switch (this.zze) {
            case 0:
                i7 = 2;
                break;
            case 1:
                i7 = 3;
                break;
            case 2:
                i7 = 4;
                break;
            case 3:
                i7 = 5;
                break;
            case 4:
                i7 = 6;
                break;
            case 5:
                i7 = 7;
                break;
            case 6:
                i7 = 8;
                break;
            case 7:
                i7 = 9;
                break;
            case 8:
                i7 = 10;
                break;
            case 9:
                i7 = 11;
                break;
            case 10:
                i7 = 12;
                break;
            case 11:
                i7 = 13;
                break;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                i7 = 14;
                break;
            case 13:
                i7 = 15;
                break;
            case 14:
                i7 = 16;
                break;
            case 15:
                i7 = 17;
                break;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                i7 = 18;
                break;
            case 17:
                i7 = 19;
                break;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                i7 = 20;
                break;
            case 19:
                i7 = 21;
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                i7 = 22;
                break;
            case 21:
                i7 = 23;
                break;
            case 22:
                i7 = 24;
                break;
            case 23:
                i7 = 25;
                break;
            case 24:
                i7 = 26;
                break;
            case 25:
                i7 = 27;
                break;
            case 26:
                i7 = 28;
                break;
            case 27:
                i7 = 29;
                break;
            case 28:
                i7 = 30;
                break;
            case 29:
                i7 = 31;
                break;
            case 30:
                i7 = 32;
                break;
            case 31:
                i7 = 33;
                break;
            case RecognitionOptions.EAN_13 /* 32 */:
                i7 = 34;
                break;
            case 33:
                i7 = 35;
                break;
            case 34:
                i7 = 36;
                break;
            case 35:
                i7 = 37;
                break;
            case 36:
                i7 = 38;
                break;
            case 37:
                i7 = 39;
                break;
            case 38:
                i7 = 40;
                break;
            case 39:
                i7 = 41;
                break;
            case 40:
                i7 = 42;
                break;
            case 41:
                i7 = 43;
                break;
            default:
                i7 = 0;
                break;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }
}
