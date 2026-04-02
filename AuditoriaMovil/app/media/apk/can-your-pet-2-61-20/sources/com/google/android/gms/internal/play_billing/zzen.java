package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzen<T> implements zzev<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzek zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdy zzl;
    private final zzfm zzm;
    private final zzcq zzn;
    private final zzep zzo;
    private final zzef zzp;

    private zzen(int[] iArr, Object[] objArr, int i, int i2, zzek zzekVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzep zzepVar, zzdy zzdyVar, zzfm zzfmVar, zzcq zzcqVar, zzef zzefVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzcqVar != null && zzcqVar.zzc(zzekVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzepVar;
        this.zzl = zzdyVar;
        this.zzm = zzfmVar;
        this.zzn = zzcqVar;
        this.zzg = zzekVar;
        this.zzp = zzefVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzs = zzs(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzs);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzev zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, zzs, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, zzs, zze);
                }
                zzD(obj, i);
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
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzs = zzs(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzs);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzev zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, zzs, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, zzs, zze);
                }
                zzE(obj, i2, i);
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
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzfw.zzq(obj, j, (1 << (zzp >>> 20)) | zzfw.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfw.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzfw.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfw.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfw.zzb(obj, j2)) != 0;
            case 2:
                return zzfw.zzd(obj, j2) != 0;
            case 3:
                return zzfw.zzd(obj, j2) != 0;
            case 4:
                return zzfw.zzc(obj, j2) != 0;
            case 5:
                return zzfw.zzd(obj, j2) != 0;
            case 6:
                return zzfw.zzc(obj, j2) != 0;
            case 7:
                return zzfw.zzw(obj, j2);
            case 8:
                Object zzf = zzfw.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzcc) {
                    return !zzcc.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzfw.zzf(obj, j2) != null;
            case 10:
                return !zzcc.zzb.equals(zzfw.zzf(obj, j2));
            case 11:
                return zzfw.zzc(obj, j2) != 0;
            case 12:
                return zzfw.zzc(obj, j2) != 0;
            case 13:
                return zzfw.zzc(obj, j2) != 0;
            case 14:
                return zzfw.zzd(obj, j2) != 0;
            case 15:
                return zzfw.zzc(obj, j2) != 0;
            case 16:
                return zzfw.zzd(obj, j2) != 0;
            case 17:
                return zzfw.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzI(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzev zzevVar) {
        return zzevVar.zzk(zzfw.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzdd) {
            return ((zzdd) obj).zzx();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfw.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfw.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzge zzgeVar) throws IOException {
        if (obj instanceof String) {
            zzgeVar.zzF(i, (String) obj);
        } else {
            zzgeVar.zzd(i, (zzcc) obj);
        }
    }

    static zzfn zzd(Object obj) {
        zzdd zzddVar = (zzdd) obj;
        zzfn zzfnVar = zzddVar.zzc;
        if (zzfnVar == zzfn.zzc()) {
            zzfn zzf = zzfn.zzf();
            zzddVar.zzc = zzf;
            return zzf;
        }
        return zzfnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.zzen zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzeh r34, com.google.android.gms.internal.play_billing.zzep r35, com.google.android.gms.internal.play_billing.zzdy r36, com.google.android.gms.internal.play_billing.zzfm r37, com.google.android.gms.internal.play_billing.zzcq r38, com.google.android.gms.internal.play_billing.zzef r39) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzeh, com.google.android.gms.internal.play_billing.zzep, com.google.android.gms.internal.play_billing.zzdy, com.google.android.gms.internal.play_billing.zzfm, com.google.android.gms.internal.play_billing.zzcq, com.google.android.gms.internal.play_billing.zzef):com.google.android.gms.internal.play_billing.zzen");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfw.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfw.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfw.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfw.zzf(obj, j)).longValue();
    }

    private final zzdh zzu(int i) {
        int i2 = i / 3;
        return (zzdh) this.zzd[i2 + i2 + 1];
    }

    private final zzev zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzev zzevVar = (zzev) objArr[i3];
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev zzb2 = zzes.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzev zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
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

    private final Object zzy(Object obj, int i, int i2) {
        zzev zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
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
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzw5;
        int zzd;
        int zzw6;
        int zzh;
        int zzg;
        int size;
        int zzw7;
        int zzw8;
        int zzw9;
        int zze;
        int zzw10;
        int zzw11;
        int i4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzs = zzs(i8);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (zzr <= 17) {
                if (i12 != i6) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i6 = i12;
                }
                i3 = 1 << (i11 >>> 20);
                i = i6;
                i2 = i7;
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i13 = zzs & i5;
            if (zzr >= zzcv.DOUBLE_LIST_PACKED.zza()) {
                zzcv.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw = zzck.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw2 = zzck.zzw(i10 << 3);
                        zzh = zzw2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(j2);
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(j3);
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(unsafe.getInt(obj, j));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw = zzck.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw2 = zzck.zzw(i10 << 3);
                        zzh = zzw2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw4 = zzck.zzw(i10 << 3);
                        zzh = zzw4 + 1;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzJ(obj, i8, i, i2, i3)) {
                        break;
                    } else {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzcc) {
                            zzw5 = zzck.zzw(i14);
                            zzd = ((zzcc) object).zzd();
                            zzw6 = zzck.zzw(zzd);
                            zzh = zzw5 + zzw6 + zzd;
                            i9 += zzh;
                            break;
                        } else {
                            zzw3 = zzck.zzw(i14);
                            zzx = zzck.zzv((String) object);
                            zzh = zzw3 + zzx;
                            i9 += zzh;
                        }
                    }
                case 9:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzh = zzex.zzh(i10, unsafe.getObject(obj, j), zzv(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw5 = zzck.zzw(i10 << 3);
                        zzd = ((zzcc) unsafe.getObject(obj, j)).zzd();
                        zzw6 = zzck.zzw(zzd);
                        zzh = zzw5 + zzw6 + zzd;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzw(i15);
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(unsafe.getInt(obj, j));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw2 = zzck.zzw(i10 << 3);
                        zzh = zzw2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw = zzck.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i16 = unsafe.getInt(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzw((i16 >> 31) ^ (i16 + i16));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getLong(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx((j4 >> 63) ^ (j4 + j4));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzh = zzck.zzt(i10, (zzek) unsafe.getObject(obj, j), zzv(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzex.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 19:
                    zzh = zzex.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzex.zza;
                    if (list.size() != 0) {
                        zzg = zzex.zzg(list) + (list.size() * zzck.zzw(i10 << 3));
                        i9 += zzg;
                        break;
                    }
                    zzg = 0;
                    i9 += zzg;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i18 = zzex.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzw3 = zzex.zzl(list2);
                        zzw7 = zzck.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i19 = zzex.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzw3 = zzex.zzf(list3);
                        zzw7 = zzck.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 23:
                    zzh = zzex.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 24:
                    zzh = zzex.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 25:
                    int i20 = zzex.zza;
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    if (size2 != 0) {
                        zzh = size2 * (zzck.zzw(i10 << 3) + 1);
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 26:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i21 = zzex.zza;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        zzg = zzck.zzw(i10 << 3) * size3;
                        if (list4 instanceof zzds) {
                            zzds zzdsVar = (zzds) list4;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzf = zzdsVar.zzf(i22);
                                if (zzf instanceof zzcc) {
                                    int zzd2 = ((zzcc) zzf).zzd();
                                    zzg += zzck.zzw(zzd2) + zzd2;
                                } else {
                                    zzg += zzck.zzv((String) zzf);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj2 = list4.get(i23);
                                if (obj2 instanceof zzcc) {
                                    int zzd3 = ((zzcc) obj2).zzd();
                                    zzg += zzck.zzw(zzd3) + zzd3;
                                } else {
                                    zzg += zzck.zzv((String) obj2);
                                }
                            }
                        }
                        i9 += zzg;
                        break;
                    }
                    zzg = 0;
                    i9 += zzg;
                case 27:
                    List list5 = (List) unsafe.getObject(obj, j);
                    zzev zzv = zzv(i8);
                    int i24 = zzex.zza;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        zzw8 = 0;
                    } else {
                        zzw8 = zzck.zzw(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj3 = list5.get(i25);
                            if (obj3 instanceof zzdq) {
                                int zza2 = ((zzdq) obj3).zza();
                                zzw8 += zzck.zzw(zza2) + zza2;
                            } else {
                                zzw8 += zzck.zzu((zzek) obj3, zzv);
                            }
                        }
                    }
                    i9 += zzw8;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i26 = zzex.zza;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        zzw9 = 0;
                    } else {
                        zzw9 = size5 * zzck.zzw(i10 << 3);
                        for (int i27 = 0; i27 < list6.size(); i27++) {
                            int zzd4 = ((zzcc) list6.get(i27)).zzd();
                            zzw9 += zzck.zzw(zzd4) + zzd4;
                        }
                    }
                    i9 += zzw9;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i28 = zzex.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzw3 = zzex.zzk(list7);
                        zzw7 = zzck.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 30:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i29 = zzex.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzw3 = zzex.zza(list8);
                        zzw7 = zzck.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 31:
                    zzh = zzex.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 32:
                    zzh = zzex.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i30 = zzex.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzw3 = zzex.zzi(list9);
                        zzw7 = zzck.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 34:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i31 = zzex.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzw3 = zzex.zzj(list10);
                        zzw7 = zzck.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 35:
                    zze = zzex.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zze = zzex.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zze = zzex.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zze = zzex.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zze = zzex.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zze = zzex.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zze = zzex.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i32 = zzex.zza;
                    zze = ((List) unsafe.getObject(obj, j)).size();
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zze = zzex.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zze = zzex.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zze = zzex.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zze = zzex.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zze = zzex.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zze = zzex.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzck.zzw(i10 << 3);
                        zzw11 = zzck.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    List list11 = (List) unsafe.getObject(obj, j);
                    zzev zzv2 = zzv(i8);
                    int i33 = zzex.zza;
                    int size6 = list11.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i4 += zzck.zzt(i10, (zzek) list11.get(i34), zzv2);
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    zzee zzeeVar = (zzee) unsafe.getObject(obj, j);
                    zzed zzedVar = (zzed) zzw(i8);
                    if (zzeeVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzeeVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i10, i8)) {
                        zzw = zzck.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i10, i8)) {
                        zzw2 = zzck.zzw(i10 << 3);
                        zzh = zzw2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i10, i8)) {
                        long zzt = zzt(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(zzt);
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i10, i8)) {
                        long zzt2 = zzt(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(zzt2);
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i10, i8)) {
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(zzo(obj, j));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i10, i8)) {
                        zzw = zzck.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i10, i8)) {
                        zzw2 = zzck.zzw(i10 << 3);
                        zzh = zzw2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i10, i8)) {
                        zzw4 = zzck.zzw(i10 << 3);
                        zzh = zzw4 + 1;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzM(obj, i10, i8)) {
                        break;
                    } else {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzcc) {
                            zzw5 = zzck.zzw(i35);
                            zzd = ((zzcc) object2).zzd();
                            zzw6 = zzck.zzw(zzd);
                            zzh = zzw5 + zzw6 + zzd;
                            i9 += zzh;
                            break;
                        } else {
                            zzw3 = zzck.zzw(i35);
                            zzx = zzck.zzv((String) object2);
                            zzh = zzw3 + zzx;
                            i9 += zzh;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i10, i8)) {
                        zzh = zzex.zzh(i10, unsafe.getObject(obj, j), zzv(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i10, i8)) {
                        zzw5 = zzck.zzw(i10 << 3);
                        zzd = ((zzcc) unsafe.getObject(obj, j)).zzd();
                        zzw6 = zzck.zzw(zzd);
                        zzh = zzw5 + zzw6 + zzd;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i10, i8)) {
                        int zzo = zzo(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzw(zzo);
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i10, i8)) {
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx(zzo(obj, j));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i10, i8)) {
                        zzw2 = zzck.zzw(i10 << 3);
                        zzh = zzw2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i10, i8)) {
                        zzw = zzck.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i10, i8)) {
                        int zzo2 = zzo(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzw((zzo2 >> 31) ^ (zzo2 + zzo2));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj, i10, i8)) {
                        long zzt3 = zzt(obj, j);
                        zzw3 = zzck.zzw(i10 << 3);
                        zzx = zzck.zzx((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzh = zzw3 + zzx;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i10, i8)) {
                        zzh = zzck.zzt(i10, (zzek) unsafe.getObject(obj, j), zzv(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = i;
            i7 = i2;
            z = false;
            i5 = 1048575;
        }
        zzfm zzfmVar = this.zzm;
        int zza3 = i9 + zzfmVar.zza(zzfmVar.zzd(obj));
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        return zza3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzs = zzs(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzfw.zza(obj, j));
                    byte[] bArr = zzdl.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzfw.zzb(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr2 = zzdl.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr3 = zzdl.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr4 = zzdl.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzdl.zza(zzfw.zzw(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzfw.zzf(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzfw.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr5 = zzdl.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr6 = zzdl.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzfw.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 18:
                case 19:
                case 20:
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
                case 32:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzdl.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzdl.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzdl.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzdl.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzdl.zza(zzN(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzfw.zzf(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzdl.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzdl.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.zzm.zzd(obj).hashCode();
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0ccf, code lost:
        if (r6 == 1048575) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0cd1, code lost:
        r13.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0cd5, code lost:
        r3 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0cd9, code lost:
        if (r3 >= r0.zzk) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0cdb, code lost:
        r5 = r0.zzi;
        r6 = r0.zzc;
        r5 = r5[r3];
        r6 = r6[r5];
        r6 = com.google.android.gms.internal.play_billing.zzfw.zzf(r7, r0.zzs(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0ced, code lost:
        if (r6 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0cf4, code lost:
        if (r0.zzu(r5) != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0cf6, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0cf9, code lost:
        r6 = (com.google.android.gms.internal.play_billing.zzee) r6;
        r1 = (com.google.android.gms.internal.play_billing.zzed) r0.zzw(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d01, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d02, code lost:
        if (r8 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d06, code lost:
        if (r1 != r37) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d0d, code lost:
        throw com.google.android.gms.internal.play_billing.zzdn.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d10, code lost:
        if (r1 > r37) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d12, code lost:
        if (r4 != r8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0d14, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d19, code lost:
        throw com.google.android.gms.internal.play_billing.zzdn.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:258:0x061b -> B:259:0x061c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:291:0x06c6 -> B:292:0x06c7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x0714 -> B:312:0x0715). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.zzbp r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbp):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final Object zze() {
        return ((zzdd) this.zzg).zzj();
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzdd) {
                zzdd zzddVar = (zzdd) obj;
                zzddVar.zzu(Integer.MAX_VALUE);
                zzddVar.zza = 0;
                zzddVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzs = zzs(i);
                int i2 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = i2;
                if (zzr != 9) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, this.zzc[i], i)) {
                            zzv(i).zzf(zzb.getObject(obj, j));
                        }
                    } else {
                        switch (zzr) {
                            case 18:
                            case 19:
                            case 20:
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
                            case 32:
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                this.zzl.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzee) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfw.zzo(obj, j, zzfw.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzfw.zzp(obj, j, zzfw.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzfw.zzm(obj, j, zzfw.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
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
                case 32:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzex.zza;
                    zzfw.zzs(obj, j, zzef.zza(zzfw.zzf(obj, j), zzfw.zzf(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj2, i3, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzex.zzp(this.zzm, obj, obj2);
        if (this.zzh) {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbp zzbpVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzi(Object obj, zzge zzgeVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int zzs = zzs(i7);
            int[] iArr2 = this.zzc;
            int zzr = zzr(zzs);
            int i8 = iArr2[i7];
            if (zzr <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = zzs & i4;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzf(i8, zzfw.zza(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzo(i8, zzfw.zzb(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzt(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzJ(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzr(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzm(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzk(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzb(i8, zzfw.zzw(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzO(i8, unsafe.getObject(obj, j), zzgeVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzd(i8, (zzcc) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzH(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzi(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzw(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzy(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzA(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzC(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzex.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 19:
                    zzex.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 20:
                    zzex.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 21:
                    zzex.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 22:
                    zzex.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 23:
                    zzex.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 24:
                    zzex.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 25:
                    zzex.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzex.zza;
                    if (list != null && !list.isEmpty()) {
                        zzgeVar.zzG(i11, list);
                        break;
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzev zzv = zzv(i7);
                    int i14 = zzex.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((zzcl) zzgeVar).zzv(i13, list2.get(i15), zzv);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzex.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzgeVar.zze(i16, list3);
                        break;
                    }
                    break;
                case 29:
                    zzex.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 30:
                    zzex.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 31:
                    zzex.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 32:
                    zzex.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 33:
                    zzex.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 34:
                    zzex.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 35:
                    zzex.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 36:
                    zzex.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 37:
                    zzex.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 38:
                    zzex.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 39:
                    zzex.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 40:
                    zzex.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 41:
                    zzex.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 42:
                    zzex.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 43:
                    zzex.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 44:
                    zzex.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 45:
                    zzex.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 46:
                    zzex.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 47:
                    zzex.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzex.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzev zzv2 = zzv(i7);
                    int i19 = zzex.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ((zzcl) zzgeVar).zzq(i18, list4.get(i20), zzv2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        zzed zzedVar = (zzed) zzw(i7);
                        throw null;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzf(i8, zzm(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzo(i8, zzn(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzt(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzJ(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzr(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzm(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzk(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzb(i8, zzN(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i8, i7)) {
                        zzO(i8, unsafe.getObject(obj, j), zzgeVar);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzd(i8, (zzcc) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzH(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzi(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzw(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzy(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzA(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzC(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        zzfm zzfmVar = this.zzm;
        zzfmVar.zzi(zzfmVar.zzd(obj), zzgeVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzfw.zza(obj, j)) == Double.doubleToLongBits(zzfw.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzfw.zzb(obj, j)) == Float.floatToIntBits(zzfw.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzfw.zzd(obj, j) == zzfw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzfw.zzd(obj, j) == zzfw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzfw.zzc(obj, j) == zzfw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzfw.zzd(obj, j) == zzfw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzfw.zzc(obj, j) == zzfw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzfw.zzw(obj, j) == zzfw.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzfw.zzc(obj, j) == zzfw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzfw.zzc(obj, j) == zzfw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzfw.zzc(obj, j) == zzfw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzfw.zzd(obj, j) == zzfw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzfw.zzc(obj, j) == zzfw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzfw.zzd(obj, j) == zzfw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
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
                case 32:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzF = zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 68:
                    long zzp = zzp(i) & 1048575;
                    if (zzfw.zzc(obj, zzp) == zzfw.zzc(obj2, zzp) && zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            if (this.zzh) {
                this.zzn.zza(obj);
                this.zzn.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i7, i6) && !zzK(obj, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzee) zzfw.zzf(obj, zzs & 1048575)).isEmpty()) {
                            zzed zzedVar = (zzed) zzw(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzfw.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzev zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, zzs, zzv(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        return true;
    }
}
