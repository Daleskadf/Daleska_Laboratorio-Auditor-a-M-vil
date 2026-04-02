package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhbo<T> implements zzhcg<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhdh.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhbl zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhaz zzm;
    private final zzhcx zzn;
    private final zzgzg zzo;
    private final zzhbr zzp;
    private final zzhbg zzq;

    private zzhbo(int[] iArr, Object[] objArr, int i, int i2, zzhbl zzhblVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzhbr zzhbrVar, zzhaz zzhazVar, zzhcx zzhcxVar, zzgzg zzgzgVar, zzhbg zzhbgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhblVar instanceof zzgzv;
        boolean z2 = false;
        if (zzgzgVar != null && zzgzgVar.zzi(zzhblVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzhbrVar;
        this.zzm = zzhazVar;
        this.zzn = zzhcxVar;
        this.zzo = zzgzgVar;
        this.zzg = zzhblVar;
        this.zzq = zzhbgVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhcg zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
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

    private final Object zzB(Object obj, int i, int i2) {
        zzhcg zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
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
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzu = zzu(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzu);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhcg zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzH(obj, i);
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
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzu = zzu(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzu);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhcg zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzI(obj, i2, i);
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
        }
    }

    private final void zzG(Object obj, int i, zzhby zzhbyVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzhdh.zzv(obj, j, zzhbyVar.zzu());
        } else if (!this.zzi) {
            zzhdh.zzv(obj, j, zzhbyVar.zzp());
        } else {
            zzhdh.zzv(obj, j, zzhbyVar.zzt());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzhdh.zzt(obj, j, (1 << (zzr >>> 20)) | zzhdh.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhdh.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzhdh.zzd(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhdh.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhdh.zzc(obj, j2)) != 0;
            case 2:
                return zzhdh.zzf(obj, j2) != 0;
            case 3:
                return zzhdh.zzf(obj, j2) != 0;
            case 4:
                return zzhdh.zzd(obj, j2) != 0;
            case 5:
                return zzhdh.zzf(obj, j2) != 0;
            case 6:
                return zzhdh.zzd(obj, j2) != 0;
            case 7:
                return zzhdh.zzz(obj, j2);
            case 8:
                Object zzh = zzhdh.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgyj) {
                    return !zzgyj.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzhdh.zzh(obj, j2) != null;
            case 10:
                return !zzgyj.zzb.equals(zzhdh.zzh(obj, j2));
            case 11:
                return zzhdh.zzd(obj, j2) != 0;
            case 12:
                return zzhdh.zzd(obj, j2) != 0;
            case 13:
                return zzhdh.zzd(obj, j2) != 0;
            case 14:
                return zzhdh.zzf(obj, j2) != 0;
            case 15:
                return zzhdh.zzd(obj, j2) != 0;
            case 16:
                return zzhdh.zzf(obj, j2) != 0;
            case 17:
                return zzhdh.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhcg zzhcgVar) {
        return zzhcgVar.zzk(zzhdh.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgzv) {
            return ((zzgzv) obj).zzce();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhdh.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhdh.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzgzb zzgzbVar) throws IOException {
        if (obj instanceof String) {
            zzgzbVar.zzG(i, (String) obj);
        } else {
            zzgzbVar.zzd(i, (zzgyj) obj);
        }
    }

    static zzhcy zzd(Object obj) {
        zzgzv zzgzvVar = (zzgzv) obj;
        zzhcy zzhcyVar = zzgzvVar.zzt;
        if (zzhcyVar == zzhcy.zzc()) {
            zzhcy zzf = zzhcy.zzf();
            zzgzvVar.zzt = zzf;
            return zzf;
        }
        return zzhcyVar;
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
    public static com.google.android.gms.internal.ads.zzhbo zzl(java.lang.Class r33, com.google.android.gms.internal.ads.zzhbi r34, com.google.android.gms.internal.ads.zzhbr r35, com.google.android.gms.internal.ads.zzhaz r36, com.google.android.gms.internal.ads.zzhcx r37, com.google.android.gms.internal.ads.zzgzg r38, com.google.android.gms.internal.ads.zzhbg r39) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzhbi, com.google.android.gms.internal.ads.zzhbr, com.google.android.gms.internal.ads.zzhaz, com.google.android.gms.internal.ads.zzhcx, com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzhbg):com.google.android.gms.internal.ads.zzhbo");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhdh.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhdh.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhdh.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhdh.zzh(obj, j)).longValue();
    }

    private final zzhab zzw(int i) {
        int i2 = i / 3;
        return (zzhab) this.zzd[i2 + i2 + 1];
    }

    private final zzhcg zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhcg zzhcgVar = (zzhcg) objArr[i3];
        if (zzhcgVar != null) {
            return zzhcgVar;
        }
        zzhcg zzb2 = zzhbv.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhcx zzhcxVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzhdh.zzh(obj, zzu(i) & 1048575);
        if (zzh == null || zzw(i) == null) {
            return obj2;
        }
        zzhbf zzhbfVar = (zzhbf) zzh;
        zzhbe zzhbeVar = (zzhbe) zzz(i);
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zzD;
        int zzD2;
        int zzD3;
        int zzE;
        int zzD4;
        int zzD5;
        int zzd;
        int zzD6;
        int zzh;
        int zzg;
        int size;
        int zzD7;
        int zzD8;
        int zzD9;
        int zze;
        int zzD10;
        int zzD11;
        int i4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzu = zzu(i8);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (zzt <= 17) {
                if (i12 != i6) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i6 = i12;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i13 = zzu & i5;
            if (zzt >= zzgzl.DOUBLE_LIST_PACKED.zza()) {
                zzgzl.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzgza.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzgza.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(j2);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(j3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(unsafe.getInt(obj, j));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzgza.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzgza.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD4 = zzgza.zzD(i10 << 3);
                        zzh = zzD4 + 1;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i8, i, i2, i3)) {
                        break;
                    } else {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgyj) {
                            zzD5 = zzgza.zzD(i14);
                            zzd = ((zzgyj) object).zzd();
                            zzD6 = zzgza.zzD(zzd);
                            zzh = zzD5 + zzD6 + zzd;
                            i9 += zzh;
                            break;
                        } else {
                            zzD3 = zzgza.zzD(i14);
                            zzE = zzgza.zzC((String) object);
                            zzh = zzD3 + zzE;
                            i9 += zzh;
                        }
                    }
                case 9:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzhci.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD5 = zzgza.zzD(i10 << 3);
                        zzd = ((zzgyj) unsafe.getObject(obj, j)).zzd();
                        zzD6 = zzgza.zzD(zzd);
                        zzh = zzD5 + zzD6 + zzd;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzD(i15);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(unsafe.getInt(obj, j));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzgza.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzgza.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i16 = unsafe.getInt(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzD((i16 >> 31) ^ (i16 + i16));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getLong(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE((j4 >> 63) ^ (j4 + j4));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzgza.zzy(i10, (zzhbl) unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzhci.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 19:
                    zzh = zzhci.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzhci.zza;
                    if (list.size() != 0) {
                        zzg = zzhci.zzg(list) + (list.size() * zzgza.zzD(i10 << 3));
                        i9 += zzg;
                        break;
                    }
                    zzg = 0;
                    i9 += zzg;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i18 = zzhci.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzD3 = zzhci.zzl(list2);
                        zzD7 = zzgza.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i19 = zzhci.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzD3 = zzhci.zzf(list3);
                        zzD7 = zzgza.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 23:
                    zzh = zzhci.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 24:
                    zzh = zzhci.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 25:
                    int i20 = zzhci.zza;
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    if (size2 != 0) {
                        zzh = size2 * (zzgza.zzD(i10 << 3) + 1);
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 26:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i21 = zzhci.zza;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        zzg = zzgza.zzD(i10 << 3) * size3;
                        if (list4 instanceof zzhat) {
                            zzhat zzhatVar = (zzhat) list4;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zze2 = zzhatVar.zze(i22);
                                if (zze2 instanceof zzgyj) {
                                    int zzd2 = ((zzgyj) zze2).zzd();
                                    zzg += zzgza.zzD(zzd2) + zzd2;
                                } else {
                                    zzg += zzgza.zzC((String) zze2);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj2 = list4.get(i23);
                                if (obj2 instanceof zzgyj) {
                                    int zzd3 = ((zzgyj) obj2).zzd();
                                    zzg += zzgza.zzD(zzd3) + zzd3;
                                } else {
                                    zzg += zzgza.zzC((String) obj2);
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
                    zzhcg zzx = zzx(i8);
                    int i24 = zzhci.zza;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        zzD8 = 0;
                    } else {
                        zzD8 = zzgza.zzD(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj3 = list5.get(i25);
                            if (obj3 instanceof zzhar) {
                                int zza2 = ((zzhar) obj3).zza();
                                zzD8 += zzgza.zzD(zza2) + zza2;
                            } else {
                                zzD8 += zzgza.zzA((zzhbl) obj3, zzx);
                            }
                        }
                    }
                    i9 += zzD8;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i26 = zzhci.zza;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        zzD9 = 0;
                    } else {
                        zzD9 = size5 * zzgza.zzD(i10 << 3);
                        for (int i27 = 0; i27 < list6.size(); i27++) {
                            int zzd4 = ((zzgyj) list6.get(i27)).zzd();
                            zzD9 += zzgza.zzD(zzd4) + zzd4;
                        }
                    }
                    i9 += zzD9;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i28 = zzhci.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzD3 = zzhci.zzk(list7);
                        zzD7 = zzgza.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 30:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i29 = zzhci.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzD3 = zzhci.zza(list8);
                        zzD7 = zzgza.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 31:
                    zzh = zzhci.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 32:
                    zzh = zzhci.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i30 = zzhci.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzD3 = zzhci.zzi(list9);
                        zzD7 = zzgza.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 34:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i31 = zzhci.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzD3 = zzhci.zzj(list10);
                        zzD7 = zzgza.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 35:
                    zze = zzhci.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zze = zzhci.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zze = zzhci.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zze = zzhci.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zze = zzhci.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zze = zzhci.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zze = zzhci.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i32 = zzhci.zza;
                    zze = ((List) unsafe.getObject(obj, j)).size();
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zze = zzhci.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zze = zzhci.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zze = zzhci.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zze = zzhci.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zze = zzhci.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zze = zzhci.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgza.zzD(i10 << 3);
                        zzD11 = zzgza.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    List list11 = (List) unsafe.getObject(obj, j);
                    zzhcg zzx2 = zzx(i8);
                    int i33 = zzhci.zza;
                    int size6 = list11.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i4 += zzgza.zzy(i10, (zzhbl) list11.get(i34), zzx2);
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    zzhbf zzhbfVar = (zzhbf) unsafe.getObject(obj, j);
                    zzhbe zzhbeVar = (zzhbe) zzz(i8);
                    if (zzhbfVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzhbfVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzgza.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzgza.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i10, i8)) {
                        long zzv = zzv(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(zzv);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i10, i8)) {
                        long zzv2 = zzv(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(zzv2);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i10, i8)) {
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(zzp(obj, j));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzgza.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzgza.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i10, i8)) {
                        zzD4 = zzgza.zzD(i10 << 3);
                        zzh = zzD4 + 1;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i10, i8)) {
                        break;
                    } else {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgyj) {
                            zzD5 = zzgza.zzD(i35);
                            zzd = ((zzgyj) object2).zzd();
                            zzD6 = zzgza.zzD(zzd);
                            zzh = zzD5 + zzD6 + zzd;
                            i9 += zzh;
                            break;
                        } else {
                            zzD3 = zzgza.zzD(i35);
                            zzE = zzgza.zzC((String) object2);
                            zzh = zzD3 + zzE;
                            i9 += zzh;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i10, i8)) {
                        zzh = zzhci.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i10, i8)) {
                        zzD5 = zzgza.zzD(i10 << 3);
                        zzd = ((zzgyj) unsafe.getObject(obj, j)).zzd();
                        zzD6 = zzgza.zzD(zzd);
                        zzh = zzD5 + zzD6 + zzd;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i10, i8)) {
                        int zzp = zzp(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzD(zzp);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i10, i8)) {
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE(zzp(obj, j));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzgza.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzgza.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i10, i8)) {
                        int zzp2 = zzp(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzD((zzp2 >> 31) ^ (zzp2 + zzp2));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i10, i8)) {
                        long zzv3 = zzv(obj, j);
                        zzD3 = zzgza.zzD(i10 << 3);
                        zzE = zzgza.zzE((zzv3 >> 63) ^ (zzv3 + zzv3));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i10, i8)) {
                        zzh = zzgza.zzy(i10, (zzhbl) unsafe.getObject(obj, j), zzx(i8));
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
        zzhcx zzhcxVar = this.zzn;
        int zza3 = i9 + zzhcxVar.zza(zzhcxVar.zzd(obj));
        if (this.zzh) {
            zzgzk zzb2 = this.zzo.zzb(obj);
            int i36 = 0;
            for (int i37 = 0; i37 < zzb2.zza.zzb(); i37++) {
                Map.Entry zzg2 = zzb2.zza.zzg(i37);
                i36 += zzgzk.zzc((zzgzj) zzg2.getKey(), zzg2.getValue());
            }
            for (Map.Entry entry2 : zzb2.zza.zzc()) {
                i36 += zzgzk.zzc((zzgzj) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i36;
        }
        return zza3;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzt) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhdh.zzb(obj, j));
                    byte[] bArr = zzhai.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhdh.zzc(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr2 = zzhai.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr3 = zzhai.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr4 = zzhai.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzhai.zza(zzhdh.zzz(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzhdh.zzh(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzh = zzhdh.zzh(obj, j);
                    if (zzh != null) {
                        i8 = zzh.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzh(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr5 = zzhai.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr6 = zzhai.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzh2 = zzhdh.zzh(obj, j);
                    if (zzh2 != null) {
                        i8 = zzh2.hashCode();
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
                    floatToIntBits = zzhdh.zzh(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzhdh.zzh(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzhai.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzhai.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzhai.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzhai.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhai.zza(zzS(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzhdh.zzh(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhdh.zzh(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhdh.zzh(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzhai.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzhai.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhdh.zzh(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzo.zzb(obj).zza.hashCode() : hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b63, code lost:
        if (r5 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b65, code lost:
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0b69, code lost:
        r11 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b6e, code lost:
        if (r11 >= r12.zzl) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b70, code lost:
        zzy(r34, r12.zzj[r11], null, r12.zzn, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b83, code lost:
        if (r9 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0b85, code lost:
        if (r6 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b8c, code lost:
        throw com.google.android.gms.internal.ads.zzhak.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b8d, code lost:
        if (r6 > r10) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b8f, code lost:
        if (r8 != r9) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0b91, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0b96, code lost:
        throw com.google.android.gms.internal.ads.zzhak.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x04c4 -> B:191:0x04c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x0564 -> B:224:0x0565). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:243:0x05b4 -> B:244:0x05b5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgxv r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final Object zze() {
        return ((zzgzv) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgzv) {
                zzgzv zzgzvVar = (zzgzv) obj;
                zzgzvVar.zzbU();
                zzgzvVar.zzbT();
                zzgzvVar.zzbW();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, this.zzc[i], i)) {
                            zzx(i).zzf(zzb.getObject(obj, j));
                        }
                    } else {
                        switch (zzt) {
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
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhbf) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzhdh.zzr(obj, j, zzhdh.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzhdh.zzs(obj, j, zzhdh.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzhdh.zzp(obj, j, zzhdh.zzz(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzhci.zza;
                    zzhdh.zzv(obj, j, zzhbg.zzb(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzF(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj2, i3, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzhci.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzhci.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0642 A[LOOP:2: B:172:0x063e->B:174:0x0642, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzhby r19, com.google.android.gms.internal.ads.zzgzf r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhby, com.google.android.gms.internal.ads.zzgzf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzt;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzhdh.zzb(obj, j)) == Double.doubleToLongBits(zzhdh.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzhdh.zzc(obj, j)) == Float.floatToIntBits(zzhdh.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzhdh.zzf(obj, j) == zzhdh.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzhdh.zzf(obj, j) == zzhdh.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzhdh.zzd(obj, j) == zzhdh.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzhdh.zzf(obj, j) == zzhdh.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzhdh.zzd(obj, j) == zzhdh.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzhdh.zzz(obj, j) == zzhdh.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzhdh.zzd(obj, j) == zzhdh.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzhdh.zzd(obj, j) == zzhdh.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzhdh.zzd(obj, j) == zzhdh.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzhdh.zzf(obj, j) == zzhdh.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzhdh.zzd(obj, j) == zzhdh.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzhdh.zzf(obj, j) == zzhdh.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
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
                    zzt = zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j));
                    break;
                case 50:
                    zzt = zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j));
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
                    long zzr = zzr(i) & 1048575;
                    if (zzhdh.zzd(obj, zzr) == zzhdh.zzd(obj2, zzr) && zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzt) {
                return false;
            }
        }
        if (this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            if (this.zzh) {
                return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
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
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i7, i6) && !zzP(obj, zzu, zzx(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzhbf) zzhdh.zzh(obj, zzu & 1048575)).isEmpty()) {
                            zzhbe zzhbeVar = (zzhbe) zzz(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzhdh.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhcg zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || this.zzo.zzb(obj).zzl();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0681  */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzm(java.lang.Object r24, com.google.android.gms.internal.ads.zzgzb r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzm(java.lang.Object, com.google.android.gms.internal.ads.zzgzb):void");
    }
}
