package com.google.android.recaptcha.internal;

import H4.e1;
import H4.p1;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i7, int i8, zzoi zzoiVar, boolean z7, int[] iArr2, int i9, int i10, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzoiVar instanceof zznd;
        boolean z8 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzj = iArr2;
        this.zzk = i9;
        this.zzl = i10;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i7) {
        zzow zzx = zzx(i7);
        int zzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i7, int i8) {
        zzow zzx = zzx(i8);
        if (!zzR(obj, i7, i8)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i8) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i7) {
        if (!zzN(obj2, i7)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i7) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzow zzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (!zzR(obj2, i8, i7)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i7) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzow zzx = zzx(i7);
            if (!zzR(obj, i8, i7)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzI(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i7, zzov zzovVar) {
        long j = i7 & 1048575;
        if (zzM(i7)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i7) {
        int zzr = zzr(i7);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (zzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i7, int i8) {
        zzps.zzq(obj, zzr(i8) & 1048575, i7);
    }

    private final void zzJ(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzu(i7) & 1048575, obj2);
        zzH(obj, i7);
    }

    private final void zzK(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzu(i8) & 1048575, obj2);
        zzI(obj, i7, i8);
    }

    private final boolean zzL(Object obj, Object obj2, int i7) {
        if (zzN(obj, i7) == zzN(obj2, i7)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i7) {
        return (i7 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i7) {
        int zzr = zzr(i7);
        long j = zzr & 1048575;
        if (j == 1048575) {
            int zzu = zzu(i7);
            long j8 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzps.zza(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzps.zzb(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzps.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzps.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzps.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzps.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzps.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzps.zzw(obj, j8);
                case 8:
                    Object zzf = zzps.zzf(obj, j8);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzle) {
                        if (zzle.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzps.zzf(obj, j8) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzle.zzb.equals(zzps.zzf(obj, j8))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzps.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzps.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzps.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzps.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzps.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzps.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzps.zzf(obj, j8) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzps.zzc(obj, j) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzN(obj, i7);
        }
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i7, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i7 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i7, int i8) {
        if (zzps.zzc(obj, zzr(i8) & 1048575) == i7) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i7, (String) obj);
        } else {
            zzpyVar.zzd(i7, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar == zzpm.zzc()) {
            zzpm zzf = zzpm.zzf();
            zzndVar.zzc = zzf;
            return zzf;
        }
        return zzpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r32, com.google.android.recaptcha.internal.zzof r33, com.google.android.recaptcha.internal.zzoo r34, com.google.android.recaptcha.internal.zznv r35, com.google.android.recaptcha.internal.zzpl r36, com.google.android.recaptcha.internal.zzmp r37, com.google.android.recaptcha.internal.zzod r38) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i7) {
        if (i7 >= this.zze && i7 <= this.zzf) {
            return zzs(i7, 0);
        }
        return -1;
    }

    private final int zzr(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzs(int i7, int i8) {
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

    private static int zzt(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzu(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i7) {
        int i8 = i7 / 3;
        return (zznh) this.zzd[i8 + i8 + 1];
    }

    private final zzow zzx(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzow zzowVar = (zzow) objArr[i9];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zzpl zzplVar, Object obj3) {
        int i8 = this.zzc[i7];
        Object zzf = zzps.zzf(obj, zzu(i7) & 1048575);
        if (zzf == null || zzw(i7) == null) {
            return obj2;
        }
        zzoc zzocVar = (zzoc) zzf;
        zzob zzobVar = (zzob) zzz(i7);
        throw null;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v170, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v228, types: [int] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v48, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [int] */
    /* JADX WARN: Type inference failed for: r4v43, types: [int] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i7;
        boolean z7;
        int i8;
        int zzA;
        int zzB;
        int zzA2;
        int zzd;
        int zzA3;
        int zzh;
        int zzw;
        int size;
        int zzl;
        int zzA4;
        int i9;
        int zzA5;
        int zzA6;
        int i10;
        Unsafe unsafe = zzb;
        boolean z8 = false;
        int i11 = 1048575;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.zzc.length) {
            int zzu = zzu(i12);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i15 = iArr[i12];
            int i16 = iArr[i12 + 2];
            int i17 = i16 & i11;
            if (zzt <= 17) {
                if (i17 != i14) {
                    if (i17 == i11) {
                        z9 = z8;
                    } else {
                        z9 = unsafe.getInt(obj, i17);
                    }
                    i14 = i17;
                }
                i7 = i14;
                z7 = z9;
                i8 = 1 << (i16 >>> 20);
            } else {
                i7 = i14;
                z7 = z9;
                i8 = z8;
            }
            int i18 = zzu & i11;
            if (zzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j = i18;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        long j8 = unsafe.getLong(obj, j);
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(j8);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        long j9 = unsafe.getLong(obj, j);
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(j9);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(unsafe.getInt(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(i15 << 3, 1, i13);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzle) {
                            zzA2 = zzln.zzA(i19);
                            zzd = ((zzle) object).zzd();
                            zzA3 = zzln.zzA(zzd);
                            i13 += zzA3 + zzd + zzA2;
                            break;
                        } else {
                            zzA = zzln.zzA(i19);
                            zzB = zzln.zzz((String) object);
                            i13 += zzB + zzA;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzh = zzoy.zzh(i15, unsafe.getObject(obj, j), zzx(i12));
                        i13 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzA2 = zzln.zzA(i15 << 3);
                        zzd = ((zzle) unsafe.getObject(obj, j)).zzd();
                        zzA3 = zzln.zzA(zzd);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(unsafe.getInt(obj, j), zzln.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(unsafe.getInt(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.q(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        int i20 = unsafe.getInt(obj, j);
                        i13 = Y.q((i20 >> 31) ^ (i20 + i20), zzln.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        long j10 = unsafe.getLong(obj, j);
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB((j10 >> 63) ^ (j10 + j10));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzw = zzln.zzw(i15, (zzoi) unsafe.getObject(obj, j), zzx(i12));
                        i13 += zzw;
                        break;
                    } else {
                        break;
                    }
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    zzh = zzoy.zzd(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 19:
                    zzh = zzoy.zzb(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    List list = (List) unsafe.getObject(obj, j);
                    int i21 = zzoy.zza;
                    if (list.size() != 0) {
                        i9 = (zzln.zzA(i15 << 3) * list.size()) + zzoy.zzg(list);
                        i13 += i9;
                        break;
                    }
                    i9 = z8;
                    i13 += i9;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i22 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzoy.zzl(list2);
                        zzA4 = zzln.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i23 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzoy.zzf(list3);
                        zzA4 = zzln.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 23:
                    zzh = zzoy.zzd(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 24:
                    zzh = zzoy.zzb(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 25:
                    int i24 = zzoy.zza;
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    if (size2 != 0) {
                        i9 = (zzln.zzA(i15 << 3) + 1) * size2;
                        i13 += i9;
                        break;
                    }
                    i9 = z8;
                    i13 += i9;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i25 = zzoy.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        zzA5 = zzln.zzA(i15 << 3) * size3;
                        if (r02 instanceof zznu) {
                            zznu zznuVar = (zznu) r02;
                            for (int i26 = z8; i26 < size3; i26++) {
                                Object zzc = zznuVar.zzc();
                                if (zzc instanceof zzle) {
                                    int zzd2 = ((zzle) zzc).zzd();
                                    zzA5 = Y.q(zzd2, zzd2, zzA5);
                                } else {
                                    zzA5 = zzln.zzz((String) zzc) + zzA5;
                                }
                            }
                        } else {
                            for (int i27 = z8; i27 < size3; i27++) {
                                Object obj2 = r02.get(i27);
                                if (obj2 instanceof zzle) {
                                    int zzd3 = ((zzle) obj2).zzd();
                                    zzA5 = Y.q(zzd3, zzd3, zzA5);
                                } else {
                                    zzA5 = zzln.zzz((String) obj2) + zzA5;
                                }
                            }
                        }
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzow zzx = zzx(i12);
                    int i28 = zzoy.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        zzA6 = z8;
                    } else {
                        zzA6 = zzln.zzA(i15 << 3) * size4;
                        for (int i29 = z8; i29 < size4; i29++) {
                            Object obj3 = r03.get(i29);
                            if (obj3 instanceof zznt) {
                                int zza2 = ((zznt) obj3).zza();
                                zzA6 = Y.q(zza2, zza2, zzA6);
                            } else {
                                zzA6 = zzln.zzy((zzoi) obj3, zzx) + zzA6;
                            }
                        }
                    }
                    i13 += zzA6;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i30 = zzoy.zza;
                    int size5 = r04.size();
                    if (size5 != 0) {
                        zzA5 = zzln.zzA(i15 << 3) * size5;
                        for (int i31 = z8; i31 < r04.size(); i31++) {
                            int zzd4 = ((zzle) r04.get(i31)).zzd();
                            zzA5 = Y.q(zzd4, zzd4, zzA5);
                        }
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 29:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i32 = zzoy.zza;
                    size = list4.size();
                    if (size != 0) {
                        zzl = zzoy.zzk(list4);
                        zzA4 = zzln.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 30:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i33 = zzoy.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzl = zzoy.zza(list5);
                        zzA4 = zzln.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 31:
                    zzh = zzoy.zzb(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case RecognitionOptions.EAN_13 /* 32 */:
                    zzh = zzoy.zzd(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 33:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i34 = zzoy.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzl = zzoy.zzi(list6);
                        zzA4 = zzln.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 34:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i35 = zzoy.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzl = zzoy.zzj(list7);
                        zzA4 = zzln.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 35:
                    zzA2 = zzoy.zze((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzA2 = zzoy.zzc((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzA2 = zzoy.zzg((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzA2 = zzoy.zzl((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzA2 = zzoy.zzf((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzA2 = zzoy.zze((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzA2 = zzoy.zzc((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i36 = zzoy.zza;
                    zzA2 = ((List) unsafe.getObject(obj, j)).size();
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzA2 = zzoy.zzk((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzA2 = zzoy.zza((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzA2 = zzoy.zzc((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzA2 = zzoy.zze((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzA2 = zzoy.zzi((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzA2 = zzoy.zzj((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzln.zzA(i15 << 3);
                        zzA3 = zzln.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzow zzx2 = zzx(i12);
                    int i37 = zzoy.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        i10 = z8;
                    } else {
                        boolean z10 = z8;
                        i10 = z10;
                        for (int i38 = z10; i38 < size6; i38++) {
                            i10 += zzln.zzw(i15, (zzoi) r05.get(i38), zzx2);
                        }
                    }
                    i13 += i10;
                    break;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj, j);
                    zzob zzobVar = (zzob) zzz(i12);
                    if (zzocVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i12)) {
                        long zzv = zzv(obj, j);
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(zzv);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i12)) {
                        long zzv2 = zzv(obj, j);
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(zzv2);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i12)) {
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(zzp(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(i15 << 3, 1, i13);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i12)) {
                        int i39 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzle) {
                            zzA2 = zzln.zzA(i39);
                            zzd = ((zzle) object2).zzd();
                            zzA3 = zzln.zzA(zzd);
                            i13 += zzA3 + zzd + zzA2;
                            break;
                        } else {
                            zzA = zzln.zzA(i39);
                            zzB = zzln.zzz((String) object2);
                            i13 += zzB + zzA;
                            break;
                        }
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzR(obj, i15, i12)) {
                        zzh = zzoy.zzh(i15, unsafe.getObject(obj, j), zzx(i12));
                        i13 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i12)) {
                        zzA2 = zzln.zzA(i15 << 3);
                        zzd = ((zzle) unsafe.getObject(obj, j)).zzd();
                        zzA3 = zzln.zzA(zzd);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(zzp(obj, j), zzln.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i12)) {
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB(zzp(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i15, i12)) {
                        i13 = Y.q(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i12)) {
                        int zzp = zzp(obj, j);
                        i13 = Y.q((zzp >> 31) ^ (zzp + zzp), zzln.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i12)) {
                        long zzv3 = zzv(obj, j);
                        zzA = zzln.zzA(i15 << 3);
                        zzB = zzln.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i12)) {
                        zzw = zzln.zzw(i15, (zzoi) unsafe.getObject(obj, j), zzx(i12));
                        i13 += zzw;
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
            i14 = i7;
            z9 = z7;
            z8 = false;
            i11 = 1048575;
        }
        int zza3 = ((zznd) obj).zzc.zza() + i13;
        if (this.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            int zzc2 = zzmtVar.zza.zzc();
            int i40 = 0;
            for (int i41 = 0; i41 < zzc2; i41++) {
                Map.Entry zzg = zzmtVar.zza.zzg(i41);
                i40 += zzmt.zza((zzms) ((zzpa) zzg).zza(), zzg.getValue());
            }
            for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
                i40 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i40;
        }
        return zza3;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int i8;
        int floatToIntBits;
        int zzc;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzu = zzu(i11);
            int[] iArr = this.zzc;
            int i12 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i13 = iArr[i11];
            long j = i12;
            int i14 = 37;
            switch (zzt) {
                case 0:
                    i7 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 1:
                    i8 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 4:
                    i7 = i10 * 53;
                    zzc = zzps.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 6:
                    i7 = i10 * 53;
                    zzc = zzps.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 7:
                    i8 = i10 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 8:
                    i8 = i10 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object zzf = zzps.zzf(obj, j);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i10 = i9 + i14;
                    break;
                case 10:
                    i8 = i10 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 11:
                    i7 = i10 * 53;
                    zzc = zzps.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i10 * 53;
                    zzc = zzps.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 13:
                    i7 = i10 * 53;
                    zzc = zzps.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 15:
                    i7 = i10 * 53;
                    zzc = zzps.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    i7 = i10 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object zzf2 = zzps.zzf(obj, j);
                    if (zzf2 != null) {
                        i14 = zzf2.hashCode();
                    }
                    i10 = i9 + i14;
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
                    i8 = i10 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 50:
                    i8 = i10 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 51:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j));
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zznd) obj).zzc.hashCode() + (i10 * 53);
        if (this.zzh) {
            return (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0e07, code lost:
        if (r11 == 1048575) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0e09, code lost:
        r36.putInt(r7, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0e0f, code lost:
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0e14, code lost:
        if (r11 >= r6.zzl) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0e16, code lost:
        zzy(r34, r6.zzj[r11], null, r6.zzm, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0e2b, code lost:
        if (r9 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0e2d, code lost:
        if (r8 != r14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0e35, code lost:
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0e36, code lost:
        if (r8 > r14) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0e38, code lost:
        if (r10 != r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0e3a, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0e40, code lost:
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x069c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x05a0 -> B:192:0x05a1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x0647 -> B:225:0x0648). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x0699 -> B:245:0x069a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) {
        /*
            Method dump skipped, instructions count: 3834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(f.API_PRIORITY_OTHER);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int zzu = zzu(i7);
                int i8 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i8;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                                ((zznk) zzps.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i7], i7)) {
                        zzx(i7).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i7)) {
                    zzx(i7).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            int i8 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i9 = iArr[i7];
            long j = i8;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i7)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i7)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i7);
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
                    zznk zznkVar = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j, zznkVar2);
                    break;
                case 50:
                    int i10 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
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
                    if (zzR(obj2, i9, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    zzF(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case RecognitionOptions.EAN_8 /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i9, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i7);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r13, com.google.android.recaptcha.internal.zzov r14, com.google.android.recaptcha.internal.zzmo r15) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzov, com.google.android.recaptcha.internal.zzmo):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzkt zzktVar) {
        zzc(obj, bArr, i7, i8, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0745  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r25, com.google.android.recaptcha.internal.zzpy r26) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i7) && Double.doubleToLongBits(zzps.zza(obj, j)) == Double.doubleToLongBits(zzps.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i7) && Float.floatToIntBits(zzps.zzb(obj, j)) == Float.floatToIntBits(zzps.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i7) && zzps.zzw(obj, j) == zzps.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
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
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
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
                    long zzr = zzr(i7) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i12 = iArr[i10];
            int i13 = iArr2[i12];
            int zzu = zzu(i12);
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
            if ((268435456 & zzu) != 0 && !zzO(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzoc) zzps.zzf(obj, zzu & 1048575)).isEmpty()) {
                                zzob zzobVar = (zzob) zzz(i12);
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i13, i12) && !zzP(obj, zzu, zzx(i12))) {
                        return false;
                    }
                }
                List list = (List) zzps.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzx.zzl(list.get(i17))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzO(obj, i12, i7, i8, i16) && !zzP(obj, zzu, zzx(i12))) {
                return false;
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        if (this.zzh && !((zzna) obj).zzb.zzk()) {
            return false;
        }
        return true;
    }
}
