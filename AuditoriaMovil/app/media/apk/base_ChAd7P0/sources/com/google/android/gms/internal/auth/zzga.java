package com.google.android.gms.internal.auth;

import H4.e1;
import H4.p1;
import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i7, int i8, zzfx zzfxVar, int i9, boolean z7, int[] iArr2, int i10, int i11, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzh = iArr2;
        this.zzi = i10;
        this.zzj = i11;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i7, int i8) {
        zzhj.zzn(obj, zzl(i8) & 1048575, i7);
    }

    private final void zzB(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzo(i7) & 1048575, obj2);
        zzz(obj, i7);
    }

    private final void zzC(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzo(i8) & 1048575, obj2);
        zzA(obj, i7, i8);
    }

    private final boolean zzD(Object obj, Object obj2, int i7) {
        if (zzE(obj, i7) == zzE(obj2, i7)) {
            return true;
        }
        return false;
    }

    private final boolean zzE(Object obj, int i7) {
        int zzl = zzl(i7);
        long j = zzl & 1048575;
        if (j == 1048575) {
            int zzo = zzo(i7);
            long j8 = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhj.zza(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzhj.zzb(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzhj.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzhj.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzhj.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzhj.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzhj.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzhj.zzt(obj, j8);
                case 8:
                    Object zzf = zzhj.zzf(obj, j8);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzef) {
                        if (zzef.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzhj.zzf(obj, j8) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzef.zzb.equals(zzhj.zzf(obj, j8))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzhj.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzhj.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzhj.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzhj.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzhj.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzhj.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzhj.zzf(obj, j8) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzhj.zzc(obj, j) & (1 << (zzl >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzF(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzE(obj, i7);
        }
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzG(Object obj, int i7, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i7 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i7, int i8) {
        if (zzhj.zzc(obj, zzl(i8) & 1048575) == i7) {
            return true;
        }
        return false;
    }

    public static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar == zzha.zza()) {
            zzha zzd = zzha.zzd();
            zzevVar.zzc = zzd;
            return zzd;
        }
        return zzhaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r31, com.google.android.gms.internal.auth.zzfu r32, com.google.android.gms.internal.auth.zzgc r33, com.google.android.gms.internal.auth.zzfl r34, com.google.android.gms.internal.auth.zzgz r35, com.google.android.gms.internal.auth.zzem r36, com.google.android.gms.internal.auth.zzfs r37) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzj(java.lang.Class, com.google.android.gms.internal.auth.zzfu, com.google.android.gms.internal.auth.zzgc, com.google.android.gms.internal.auth.zzfl, com.google.android.gms.internal.auth.zzgz, com.google.android.gms.internal.auth.zzem, com.google.android.gms.internal.auth.zzfs):com.google.android.gms.internal.auth.zzga");
    }

    private static int zzk(Object obj, long j) {
        return ((Integer) zzhj.zzf(obj, j)).intValue();
    }

    private final int zzl(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzm(int i7, int i8) {
        int length = (this.zzc.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.zzc[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzo(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzhj.zzf(obj, j)).longValue();
    }

    private final zzey zzq(int i7) {
        int i8 = i7 / 3;
        return (zzey) this.zzd[i8 + i8 + 1];
    }

    private final zzgi zzr(int i7) {
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzgi zzgiVar = (zzgi) this.zzd[i9];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private final Object zzt(Object obj, int i7) {
        zzgi zzr = zzr(i7);
        int zzo = zzo(i7) & 1048575;
        if (!zzE(obj, i7)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private final Object zzu(Object obj, int i7, int i8) {
        zzgi zzr = zzr(i8);
        if (!zzI(obj, i7, i8)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i8) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l8 = b.l("Field ", str, " for ", name, " not found. Known fields are ");
            l8.append(arrays);
            throw new RuntimeException(l8.toString());
        }
    }

    private static void zzw(Object obj) {
        if (zzH(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzx(Object obj, Object obj2, int i7) {
        if (!zzE(obj2, i7)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzo = zzo(i7) & 1048575;
        Object object = unsafe.getObject(obj2, zzo);
        if (object != null) {
            zzgi zzr = zzr(i7);
            if (!zzE(obj, i7)) {
                if (!zzH(object)) {
                    unsafe.putObject(obj, zzo, object);
                } else {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, zzo, zzd);
                }
                zzz(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzo);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, zzo, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
    }

    private final void zzy(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (!zzI(obj2, i8, i7)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzo = zzo(i7) & 1048575;
        Object object = unsafe.getObject(obj2, zzo);
        if (object != null) {
            zzgi zzr = zzr(i7);
            if (!zzI(obj, i8, i7)) {
                if (!zzH(object)) {
                    unsafe.putObject(obj, zzo, object);
                } else {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, zzo, zzd);
                }
                zzA(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzo);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, zzo, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
    }

    private final void zzz(Object obj, int i7) {
        int zzl = zzl(i7);
        long j = 1048575 & zzl;
        if (j == 1048575) {
            return;
        }
        zzhj.zzn(obj, j, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i7;
        long doubleToLongBits;
        int i8;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzo = zzo(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & zzo;
            int i12 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i7 = i9 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j));
                    byte[] bArr = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + zzc;
                    break;
                case 1:
                    i8 = i9 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j));
                    i9 = floatToIntBits + i8;
                    break;
                case 2:
                    i7 = i9 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr2 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + zzc;
                    break;
                case 3:
                    i7 = i9 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr3 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + zzc;
                    break;
                case 4:
                    i7 = i9 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i9 = i7 + zzc;
                    break;
                case 5:
                    i7 = i9 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr4 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + zzc;
                    break;
                case 6:
                    i7 = i9 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i9 = i7 + zzc;
                    break;
                case 7:
                    i8 = i9 * 53;
                    floatToIntBits = zzfa.zza(zzhj.zzt(obj, j));
                    i9 = floatToIntBits + i8;
                    break;
                case 8:
                    i8 = i9 * 53;
                    floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                    i9 = floatToIntBits + i8;
                    break;
                case 9:
                    Object zzf = zzhj.zzf(obj, j);
                    if (zzf != null) {
                        i12 = zzf.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i8 = i9 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i9 = floatToIntBits + i8;
                    break;
                case 11:
                    i7 = i9 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i9 = i7 + zzc;
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i9 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i9 = i7 + zzc;
                    break;
                case 13:
                    i7 = i9 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i9 = i7 + zzc;
                    break;
                case 14:
                    i7 = i9 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr5 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + zzc;
                    break;
                case 15:
                    i7 = i9 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i9 = i7 + zzc;
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    i7 = i9 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr6 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhj.zzf(obj, j);
                    if (zzf2 != null) {
                        i12 = zzf2.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case RecognitionOptions.EAN_13 /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i8 = i9 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i9 = floatToIntBits + i8;
                    break;
                case 50:
                    i8 = i9 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i9 = floatToIntBits + i8;
                    break;
                case 51:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i11, i10)) {
                        i8 = i9 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j)).floatValue());
                        i9 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzk(obj, j);
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzk(obj, j);
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i11, i10)) {
                        i8 = i9 * 53;
                        floatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j)).booleanValue());
                        i9 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i11, i10)) {
                        i8 = i9 * 53;
                        floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                        i9 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzI(obj, i11, i10)) {
                        i8 = i9 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i9 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i11, i10)) {
                        i8 = i9 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i9 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzk(obj, j);
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzk(obj, j);
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzk(obj, j);
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzk(obj, j);
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i11, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i11, i10)) {
                        i8 = i9 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i9 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzl.zzb(obj).hashCode() + (i9 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:564:0x0f32, code lost:
        if (r1 == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0f34, code lost:
        r43.putInt(r12, r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0f3a, code lost:
        r1 = r0.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0f3e, code lost:
        if (r1 >= r0.zzj) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0f40, code lost:
        r3 = r0.zzh[r1];
        r4 = r0.zzc[r3];
        r4 = com.google.android.gms.internal.auth.zzhj.zzf(r12, r0.zzo(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0f55, code lost:
        if (r4 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0f5c, code lost:
        if (r0.zzq(r3) != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0f5e, code lost:
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0f60, code lost:
        r4 = (com.google.android.gms.internal.auth.zzfr) r4;
        r1 = (com.google.android.gms.internal.auth.zzfq) r0.zzs(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0f68, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0f69, code lost:
        if (r9 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0f6b, code lost:
        if (r8 != r10) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0f72, code lost:
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0f73, code lost:
        if (r8 > r10) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0f75, code lost:
        if (r11 != r9) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0f77, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0f7c, code lost:
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0283  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x0790 -> B:272:0x0791). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:308:0x085f -> B:309:0x0860). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:329:0x08b0 -> B:330:0x08b1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r41, byte[] r42, int r43, int r44, int r45, com.google.android.gms.internal.auth.zzdt r46) {
        /*
            Method dump skipped, instructions count: 4110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (!zzH(obj)) {
            return;
        }
        if (obj instanceof zzev) {
            zzev zzevVar = (zzev) obj;
            zzevVar.zzl(f.API_PRIORITY_OTHER);
            zzevVar.zza = 0;
            zzevVar.zzj();
        }
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzo = zzo(i7);
            int i8 = 1048575 & zzo;
            int zzn = zzn(zzo);
            long j = i8;
            if (zzn != 9) {
                if (zzn != 60 && zzn != 68) {
                    switch (zzn) {
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        case 19:
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case RecognitionOptions.EAN_13 /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzk.zza(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzfr) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzI(obj, this.zzc[i7], i7)) {
                    zzr(i7).zze(zzb.getObject(obj, j));
                }
            }
            if (zzE(obj, i7)) {
                zzr(i7).zze(zzb.getObject(obj, j));
            }
        }
        this.zzl.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzo = zzo(i7);
            int i8 = this.zzc[i7];
            long j = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i7)) {
                        zzhj.zzl(obj, j, zzhj.zza(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i7)) {
                        zzhj.zzm(obj, j, zzhj.zzb(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i7)) {
                        zzhj.zzk(obj, j, zzhj.zzt(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i7);
                    break;
                case 10:
                    if (zzE(obj2, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i7);
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case RecognitionOptions.EAN_13 /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i9 = zzgk.zza;
                    zzhj.zzp(obj, j, zzfs.zza(zzhj.zzf(obj, j), zzhj.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzI(obj2, i8, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    zzy(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case RecognitionOptions.EAN_8 /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i8, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i7);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i7, int i8, zzdt zzdtVar) {
        zzb(obj, bArr, i7, i8, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzf;
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzo = zzo(i7);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i7) && Double.doubleToLongBits(zzhj.zza(obj, j)) == Double.doubleToLongBits(zzhj.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i7) && Float.floatToIntBits(zzhj.zzb(obj, j)) == Float.floatToIntBits(zzhj.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i7) && zzhj.zzt(obj, j) == zzhj.zzt(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case RecognitionOptions.EAN_13 /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    break;
                case 50:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                case 61:
                case 62:
                case 63:
                case RecognitionOptions.EAN_8 /* 64 */:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzl = zzl(i7) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzf) {
                return false;
            }
        }
        if (!this.zzl.zzb(obj).equals(this.zzl.zzb(obj2))) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.zzi) {
            int i12 = this.zzh[i10];
            int i13 = this.zzc[i12];
            int zzo = zzo(i12);
            int i14 = this.zzc[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = zzb.getInt(obj, i15);
                }
                i8 = i9;
                i7 = i15;
            } else {
                i7 = i11;
                i8 = i9;
            }
            if ((268435456 & zzo) != 0 && !zzF(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn != 60 && zzn != 68) {
                        if (zzn != 49) {
                            if (zzn == 50 && !((zzfr) zzhj.zzf(obj, zzo & 1048575)).isEmpty()) {
                                zzfq zzfqVar = (zzfq) zzs(i12);
                                throw null;
                            }
                        }
                    } else if (zzI(obj, i13, i12) && !zzG(obj, zzo, zzr(i12))) {
                        return false;
                    }
                }
                List list = (List) zzhj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgi zzr = zzr(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzr.zzi(list.get(i17))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzF(obj, i12, i7, i8, i16) && !zzG(obj, zzo, zzr(i12))) {
                return false;
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        return true;
    }
}
