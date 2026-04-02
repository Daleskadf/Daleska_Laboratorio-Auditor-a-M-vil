package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
public final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i7, int i8, zzfm zzfmVar, boolean z7, int[] iArr2, int i9, int i10, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        boolean z8 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzi = iArr2;
        this.zzj = i9;
        this.zzk = i10;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (zzL(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzB(Object obj, Object obj2, int i7) {
        if (!zzI(obj2, i7)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzs = zzs(i7) & 1048575;
        Object object = unsafe.getObject(obj2, zzs);
        if (object != null) {
            zzge zzv = zzv(i7);
            if (!zzI(obj, i7)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, zzs, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, zzs, zze);
                }
                zzD(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzs);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, zzs, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
    }

    private final void zzC(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (!zzM(obj2, i8, i7)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzs = zzs(i7) & 1048575;
        Object object = unsafe.getObject(obj2, zzs);
        if (object != null) {
            zzge zzv = zzv(i7);
            if (!zzM(obj, i8, i7)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, zzs, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, zzs, zze);
                }
                zzE(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzs);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, zzs, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
    }

    private final void zzD(Object obj, int i7) {
        int zzp = zzp(i7);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzgz.zzq(obj, j, (1 << (zzp >>> 20)) | zzgz.zzc(obj, j));
    }

    private final void zzE(Object obj, int i7, int i8) {
        zzgz.zzq(obj, zzp(i8) & 1048575, i7);
    }

    private final void zzF(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzs(i7) & 1048575, obj2);
        zzD(obj, i7);
    }

    private final void zzG(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzs(i8) & 1048575, obj2);
        zzE(obj, i7, i8);
    }

    private final boolean zzH(Object obj, Object obj2, int i7) {
        if (zzI(obj, i7) == zzI(obj2, i7)) {
            return true;
        }
        return false;
    }

    private final boolean zzI(Object obj, int i7) {
        int zzp = zzp(i7);
        long j = zzp & 1048575;
        if (j == 1048575) {
            int zzs = zzs(i7);
            long j8 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzgz.zza(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzgz.zzb(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzgz.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzgz.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzgz.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzgz.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzgz.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzgz.zzw(obj, j8);
                case 8:
                    Object zzf = zzgz.zzf(obj, j8);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzdf) {
                        if (zzdf.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzgz.zzf(obj, j8) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzdf.zzb.equals(zzgz.zzf(obj, j8))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzgz.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzgz.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzgz.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzgz.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzgz.zzc(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzgz.zzd(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzgz.zzf(obj, j8) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzgz.zzc(obj, j) & (1 << (zzp >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzJ(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzI(obj, i7);
        }
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzK(Object obj, int i7, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, i7 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i7, int i8) {
        if (zzgz.zzc(obj, zzp(i8) & 1048575) == i7) {
            return true;
        }
        return false;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzgz.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i7, Object obj, zzhh zzhhVar) {
        if (obj instanceof String) {
            zzhhVar.zzG(i7, (String) obj);
        } else {
            zzhhVar.zzd(i7, (zzdf) obj);
        }
    }

    public static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar == zzgt.zzc()) {
            zzgt zzf = zzgt.zzf();
            zzehVar.zzc = zzf;
            return zzf;
        }
        return zzgtVar;
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
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp zzl(java.lang.Class r32, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj r33, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs r36, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt r37, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh r38) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzgz.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzgz.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzgz.zzf(obj, j)).intValue();
    }

    private final int zzp(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzq(int i7, int i8) {
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

    private static int zzr(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzs(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzgz.zzf(obj, j)).longValue();
    }

    private final zzel zzu(int i7) {
        int i8 = i7 / 3;
        return (zzel) this.zzd[i8 + i8 + 1];
    }

    private final zzge zzv(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzge zzgeVar = (zzge) objArr[i9];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzb2 = zzfu.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private final Object zzx(Object obj, int i7) {
        zzge zzv = zzv(i7);
        int zzs = zzs(i7) & 1048575;
        if (!zzI(obj, i7)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i7, int i8) {
        zzge zzv = zzv(i8);
        if (!zzM(obj, i7, i8)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i8) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
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
            int zzs = zzs(i12);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i15 = iArr[i12];
            int i16 = iArr[i12 + 2];
            int i17 = i16 & i11;
            if (zzr <= 17) {
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
            int i18 = zzs & i11;
            if (zzr >= zzdy.zzJ.zza()) {
                zzdy.zzW.zza();
            }
            long j = i18;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        long j8 = unsafe.getLong(obj, j);
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(j8);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        long j9 = unsafe.getLong(obj, j);
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(j9);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(unsafe.getInt(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(i15 << 3, 1, i13);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzdf) {
                            zzA2 = zzdn.zzA(i19);
                            zzd = ((zzdf) object).zzd();
                            zzA3 = zzdn.zzA(zzd);
                            i13 += zzA3 + zzd + zzA2;
                            break;
                        } else {
                            zzA = zzdn.zzA(i19);
                            zzB = zzdn.zzz((String) object);
                            i13 += zzB + zzA;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzh = zzgg.zzh(i15, unsafe.getObject(obj, j), zzv(i12));
                        i13 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzA2 = zzdn.zzA(i15 << 3);
                        zzd = ((zzdf) unsafe.getObject(obj, j)).zzd();
                        zzA3 = zzdn.zzA(zzd);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(unsafe.getInt(obj, j), zzdn.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(unsafe.getInt(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        i13 = Y.c(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        int i20 = unsafe.getInt(obj, j);
                        i13 = Y.c((i20 >> 31) ^ (i20 + i20), zzdn.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        long j10 = unsafe.getLong(obj, j);
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB((j10 >> 63) ^ (j10 + j10));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i12, i7, z7 ? 1 : 0, i8)) {
                        zzw = zzdn.zzw(i15, (zzfm) unsafe.getObject(obj, j), zzv(i12));
                        i13 += zzw;
                        break;
                    } else {
                        break;
                    }
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    zzh = zzgg.zzd(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 19:
                    zzh = zzgg.zzb(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    List list = (List) unsafe.getObject(obj, j);
                    int i21 = zzgg.zza;
                    if (list.size() != 0) {
                        i9 = (zzdn.zzA(i15 << 3) * list.size()) + zzgg.zzg(list);
                        i13 += i9;
                        break;
                    }
                    i9 = z8;
                    i13 += i9;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i22 = zzgg.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzgg.zzl(list2);
                        zzA4 = zzdn.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i23 = zzgg.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzgg.zzf(list3);
                        zzA4 = zzdn.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 23:
                    zzh = zzgg.zzd(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 24:
                    zzh = zzgg.zzb(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 25:
                    int i24 = zzgg.zza;
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    if (size2 != 0) {
                        i9 = (zzdn.zzA(i15 << 3) + 1) * size2;
                        i13 += i9;
                        break;
                    }
                    i9 = z8;
                    i13 += i9;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i25 = zzgg.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        zzA5 = zzdn.zzA(i15 << 3) * size3;
                        if (r02 instanceof zzey) {
                            zzey zzeyVar = (zzey) r02;
                            for (int i26 = z8; i26 < size3; i26++) {
                                Object zza2 = zzeyVar.zza();
                                if (zza2 instanceof zzdf) {
                                    int zzd2 = ((zzdf) zza2).zzd();
                                    zzA5 = Y.c(zzd2, zzd2, zzA5);
                                } else {
                                    zzA5 = zzdn.zzz((String) zza2) + zzA5;
                                }
                            }
                        } else {
                            for (int i27 = z8; i27 < size3; i27++) {
                                Object obj2 = r02.get(i27);
                                if (obj2 instanceof zzdf) {
                                    int zzd3 = ((zzdf) obj2).zzd();
                                    zzA5 = Y.c(zzd3, zzd3, zzA5);
                                } else {
                                    zzA5 = zzdn.zzz((String) obj2) + zzA5;
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
                    zzge zzv = zzv(i12);
                    int i28 = zzgg.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        zzA6 = z8;
                    } else {
                        zzA6 = zzdn.zzA(i15 << 3) * size4;
                        for (int i29 = z8; i29 < size4; i29++) {
                            Object obj3 = r03.get(i29);
                            if (obj3 instanceof zzex) {
                                int zza3 = ((zzex) obj3).zza();
                                zzA6 = Y.c(zza3, zza3, zzA6);
                            } else {
                                zzA6 = zzdn.zzy((zzfm) obj3, zzv) + zzA6;
                            }
                        }
                    }
                    i13 += zzA6;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i30 = zzgg.zza;
                    int size5 = r04.size();
                    if (size5 != 0) {
                        zzA5 = zzdn.zzA(i15 << 3) * size5;
                        for (int i31 = z8; i31 < r04.size(); i31++) {
                            int zzd4 = ((zzdf) r04.get(i31)).zzd();
                            zzA5 = Y.c(zzd4, zzd4, zzA5);
                        }
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 29:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i32 = zzgg.zza;
                    size = list4.size();
                    if (size != 0) {
                        zzl = zzgg.zzk(list4);
                        zzA4 = zzdn.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 30:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i33 = zzgg.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzl = zzgg.zza(list5);
                        zzA4 = zzdn.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 31:
                    zzh = zzgg.zzb(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case RecognitionOptions.EAN_13 /* 32 */:
                    zzh = zzgg.zzd(i15, (List) unsafe.getObject(obj, j), z8);
                    i13 += zzh;
                    break;
                case 33:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i34 = zzgg.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzl = zzgg.zzi(list6);
                        zzA4 = zzdn.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 34:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i35 = zzgg.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzl = zzgg.zzj(list7);
                        zzA4 = zzdn.zzA(i15 << 3);
                        zzA5 = (zzA4 * size) + zzl;
                        i13 += zzA5;
                        break;
                    }
                    zzA5 = z8;
                    i13 += zzA5;
                case 35:
                    zzA2 = zzgg.zze((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzA2 = zzgg.zzc((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzA2 = zzgg.zzg((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzA2 = zzgg.zzl((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzA2 = zzgg.zzf((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzA2 = zzgg.zze((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzA2 = zzgg.zzc((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i36 = zzgg.zza;
                    zzA2 = ((List) unsafe.getObject(obj, j)).size();
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzA2 = zzgg.zzk((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzA2 = zzgg.zza((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzA2 = zzgg.zzc((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzA2 = zzgg.zze((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzA2 = zzgg.zzi((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzA2 = zzgg.zzj((List) unsafe.getObject(obj, j));
                    if (zzA2 > 0) {
                        zzd = zzdn.zzA(i15 << 3);
                        zzA3 = zzdn.zzA(zzA2);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzge zzv2 = zzv(i12);
                    int i37 = zzgg.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        i10 = z8;
                    } else {
                        boolean z10 = z8;
                        i10 = z10;
                        for (int i38 = z10; i38 < size6; i38++) {
                            i10 += zzdn.zzw(i15, (zzfm) r05.get(i38), zzv2);
                        }
                    }
                    i13 += i10;
                    break;
                case 50:
                    zzfg zzfgVar = (zzfg) unsafe.getObject(obj, j);
                    zzff zzffVar = (zzff) zzw(i12);
                    if (zzfgVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzfgVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i15, i12)) {
                        long zzt = zzt(obj, j);
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(zzt);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i15, i12)) {
                        long zzt2 = zzt(obj, j);
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(zzt2);
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i15, i12)) {
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(zzo(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(i15 << 3, 1, i13);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i15, i12)) {
                        int i39 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzdf) {
                            zzA2 = zzdn.zzA(i39);
                            zzd = ((zzdf) object2).zzd();
                            zzA3 = zzdn.zzA(zzd);
                            i13 += zzA3 + zzd + zzA2;
                            break;
                        } else {
                            zzA = zzdn.zzA(i39);
                            zzB = zzdn.zzz((String) object2);
                            i13 += zzB + zzA;
                            break;
                        }
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzM(obj, i15, i12)) {
                        zzh = zzgg.zzh(i15, unsafe.getObject(obj, j), zzv(i12));
                        i13 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i15, i12)) {
                        zzA2 = zzdn.zzA(i15 << 3);
                        zzd = ((zzdf) unsafe.getObject(obj, j)).zzd();
                        zzA3 = zzdn.zzA(zzd);
                        i13 += zzA3 + zzd + zzA2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(zzo(obj, j), zzdn.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i15, i12)) {
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB(zzo(obj, j));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(i15 << 3, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i15, i12)) {
                        i13 = Y.c(i15 << 3, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i15, i12)) {
                        int zzo = zzo(obj, j);
                        i13 = Y.c((zzo >> 31) ^ (zzo + zzo), zzdn.zzA(i15 << 3), i13);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i15, i12)) {
                        long zzt3 = zzt(obj, j);
                        zzA = zzdn.zzA(i15 << 3);
                        zzB = zzdn.zzB((zzt3 >> 63) ^ (zzt3 + zzt3));
                        i13 += zzB + zzA;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i15, i12)) {
                        zzw = zzdn.zzw(i15, (zzfm) unsafe.getObject(obj, j), zzv(i12));
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
        int zza4 = ((zzeh) obj).zzc.zza() + i13;
        if (this.zzh) {
            zzdx zzdxVar = ((zzed) obj).zzb;
            int zzc = zzdxVar.zza.zzc();
            int i40 = 0;
            for (int i41 = 0; i41 < zzc; i41++) {
                Map.Entry zzg = zzdxVar.zza.zzg(i41);
                i40 += zzdx.zza((zzdw) ((zzgi) zzg).zza(), zzg.getValue());
            }
            for (Map.Entry entry2 : zzdxVar.zza.zzd()) {
                i40 += zzdx.zza((zzdw) entry2.getKey(), entry2.getValue());
            }
            return zza4 + i40;
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int i8;
        int floatToIntBits;
        int zzc;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzs = zzs(i11);
            int[] iArr = this.zzc;
            int i12 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i13 = iArr[i11];
            long j = i12;
            int i14 = 37;
            switch (zzr) {
                case 0:
                    i7 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzgz.zza(obj, j));
                    byte[] bArr = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 1:
                    i8 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(zzgz.zzb(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr2 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr3 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 4:
                    i7 = i10 * 53;
                    zzc = zzgz.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr4 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 6:
                    i7 = i10 * 53;
                    zzc = zzgz.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 7:
                    i8 = i10 * 53;
                    floatToIntBits = zzep.zza(zzgz.zzw(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 8:
                    i8 = i10 * 53;
                    floatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object zzf = zzgz.zzf(obj, j);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i10 = i9 + i14;
                    break;
                case 10:
                    i8 = i10 * 53;
                    floatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 11:
                    i7 = i10 * 53;
                    zzc = zzgz.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i10 * 53;
                    zzc = zzgz.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 13:
                    i7 = i10 * 53;
                    zzc = zzgz.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr5 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 15:
                    i7 = i10 * 53;
                    zzc = zzgz.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    i7 = i10 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr6 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object zzf2 = zzgz.zzf(obj, j);
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
                    floatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 50:
                    i8 = i10 * 53;
                    floatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 51:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzo(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzo(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzep.zza(zzN(obj, j));
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzM(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzo(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzo(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzo(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzo(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzeh) obj).zzc.hashCode() + (i10 * 53);
        if (this.zzh) {
            return (hashCode * 53) + ((zzed) obj).zzb.zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:567:0x0e34, code lost:
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0ee4, code lost:
        if (r0 == 1048575) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0ee6, code lost:
        r41.putInt(r45, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0eec, code lost:
        r0 = r9.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0ef0, code lost:
        if (r0 >= r9.zzk) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0ef2, code lost:
        r1 = r9.zzi;
        r4 = r9.zzc;
        r1 = r1[r0];
        r4 = r4[r1];
        r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r45, r9.zzs(r1) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0f04, code lost:
        if (r4 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0f0b, code lost:
        if (r9.zzu(r1) != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0f0d, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0f10, code lost:
        r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg) r4;
        r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzff) r9.zzw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0f18, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0f1b, code lost:
        if (r10 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0f1d, code lost:
        if (r8 != r11) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0f25, code lost:
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0f26, code lost:
        if (r8 > r11) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0f28, code lost:
        if (r2 != r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0f2a, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0f30, code lost:
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0e41  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0251  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:269:0x072f -> B:270:0x0730). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r45, byte[] r46, int r47, int r48, int r49, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu r50) {
        /*
            Method dump skipped, instructions count: 4034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzeh) {
                zzeh zzehVar = (zzeh) obj;
                zzehVar.zzW(f.API_PRIORITY_OTHER);
                zzehVar.zza = 0;
                zzehVar.zzU();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int zzs = zzs(i7);
                int i8 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = i8;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                ((zzeo) zzgz.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzfg) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i7], i7)) {
                        zzv(i7).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i7)) {
                    zzv(i7).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzs = zzs(i7);
            int i8 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i9 = iArr[i7];
            long j = i8;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i7)) {
                        zzgz.zzo(obj, j, zzgz.zza(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i7)) {
                        zzgz.zzp(obj, j, zzgz.zzb(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i7)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i7)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i7)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i7)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i7)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i7)) {
                        zzgz.zzm(obj, j, zzgz.zzw(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i7)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i7);
                    break;
                case 10:
                    if (zzI(obj2, i7)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i7)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzI(obj2, i7)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i7)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i7)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i7)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzI(obj2, i7)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i7);
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
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj, j);
                    zzeo zzeoVar2 = (zzeo) zzgz.zzf(obj2, j);
                    int size = zzeoVar.size();
                    int size2 = zzeoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVar.zzc()) {
                            zzeoVar = zzeoVar.zzd(size2 + size);
                        }
                        zzeoVar.addAll(zzeoVar2);
                    }
                    if (size > 0) {
                        zzeoVar2 = zzeoVar;
                    }
                    zzgz.zzs(obj, j, zzeoVar2);
                    break;
                case 50:
                    int i10 = zzgg.zza;
                    zzgz.zzs(obj, j, zzfh.zza(zzgz.zzf(obj, j), zzgz.zzf(obj2, j)));
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
                    if (zzM(obj2, i9, i7)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzE(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    zzC(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case RecognitionOptions.EAN_8 /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i9, i7)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzE(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i7);
                    break;
            }
        }
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i7, int i8, zzcu zzcuVar) {
        zzc(obj, bArr, i7, i8, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0745  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r25, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh r26) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzs = zzs(i7);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i7) && Double.doubleToLongBits(zzgz.zza(obj, j)) == Double.doubleToLongBits(zzgz.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i7) && Float.floatToIntBits(zzgz.zzb(obj, j)) == Float.floatToIntBits(zzgz.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i7) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i7) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i7) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i7) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i7) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i7) && zzgz.zzw(obj, j) == zzgz.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i7) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i7) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i7) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i7) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzH(obj, obj2, i7) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i7) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i7) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i7) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzH(obj, obj2, i7) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i7) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
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
                    zzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
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
                    long zzp = zzp(i7) & 1048575;
                    if (zzgz.zzc(obj, zzp) == zzgz.zzc(obj2, zzp) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i12 = iArr[i10];
            int i13 = iArr2[i12];
            int zzs = zzs(i12);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr != 60 && zzr != 68) {
                        if (zzr != 49) {
                            if (zzr == 50 && !((zzfg) zzgz.zzf(obj, zzs & 1048575)).isEmpty()) {
                                zzff zzffVar = (zzff) zzw(i12);
                                throw null;
                            }
                        }
                    } else if (zzM(obj, i13, i12) && !zzK(obj, zzs, zzv(i12))) {
                        return false;
                    }
                }
                List list = (List) zzgz.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzge zzv = zzv(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzv.zzk(list.get(i17))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzJ(obj, i12, i7, i8, i16) && !zzK(obj, zzs, zzv(i12))) {
                return false;
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        if (this.zzh && !((zzed) obj).zzb.zzk()) {
            return false;
        }
        return true;
    }
}
