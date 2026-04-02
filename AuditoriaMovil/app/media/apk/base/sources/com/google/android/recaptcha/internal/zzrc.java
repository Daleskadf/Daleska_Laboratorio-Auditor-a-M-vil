package com.google.android.recaptcha.internal;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class zzrc extends zznd implements zzoj {
    private static final zzrc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private Object zzg;
    private int zzh;
    private int zzi;
    private long zzn;
    private zzml zzo;
    private int zzp;
    private zzqq zzq;
    private zzro zzr;
    private zzpj zzt;
    private zzml zzu;
    private int zzw;
    private int zzf = 0;
    private String zzj = StringUtils.EMPTY;
    private String zzk = StringUtils.EMPTY;
    private String zzl = StringUtils.EMPTY;
    private String zzm = StringUtils.EMPTY;
    private String zzs = StringUtils.EMPTY;
    private zzni zzv = zznd.zzy();

    static {
        zzrc zzrcVar = new zzrc();
        zzb = zzrcVar;
        zznd.zzI(zzrc.class, zzrcVar);
    }

    private zzrc() {
    }

    public static /* synthetic */ void zzO(zzrc zzrcVar, int i7) {
        zzni zzniVar = zzrcVar.zzv;
        if (!zzniVar.zzc()) {
            zzrcVar.zzv = zznd.zzz(zzniVar);
        }
        zzrcVar.zzv.zzh(0);
    }

    public static /* synthetic */ void zzP(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzj = str;
    }

    public static /* synthetic */ void zzR(zzrc zzrcVar, zzqq zzqqVar) {
        zzrcVar.zzq = zzqqVar;
        zzrcVar.zze |= 2;
    }

    public static /* synthetic */ void zzS(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzk = str;
    }

    public static /* synthetic */ void zzT(zzrc zzrcVar, zzro zzroVar) {
        zzroVar.getClass();
        zzrcVar.zzr = zzroVar;
        zzrcVar.zze |= 4;
    }

    public static /* synthetic */ void zzU(zzrc zzrcVar, int i7) {
        zzrcVar.zze |= 32;
        zzrcVar.zzw = i7;
    }

    public static /* synthetic */ void zzab(zzrc zzrcVar, int i7) {
        if (i7 != 1) {
            zzrcVar.zzi = i7 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzra zzi() {
        return (zzra) zzb.zzq();
    }

    public static zzrc zzk() {
        return zzb;
    }

    public static zzrc zzl(byte[] bArr) {
        return (zzrc) zznd.zzx(zzb, bArr);
    }

    public final String zzM() {
        return this.zzk;
    }

    public final String zzN() {
        return this.zzl;
    }

    public final boolean zzX() {
        return (this.zze & 2) != 0;
    }

    public final int zzY() {
        int i7;
        switch (this.zzh) {
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
            default:
                i7 = 0;
                break;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    public final int zzZ() {
        int i7 = this.zzp;
        int i8 = i7 != 0 ? i7 != 1 ? i7 != 2 ? 0 : 4 : 3 : 2;
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    @Deprecated
    public final long zzf() {
        return this.zzn;
    }

    public final zzqq zzg() {
        zzqq zzqqVar = this.zzq;
        if (zzqqVar == null) {
            return zzqq.zzj();
        }
        return zzqqVar;
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
                                synchronized (zzrc.class) {
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
                    return new zzra(null);
                }
                return new zzrc();
            }
            return zznd.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzqg.class, "zzv", "zzw", "zzi"});
        }
        return (byte) 1;
    }
}
