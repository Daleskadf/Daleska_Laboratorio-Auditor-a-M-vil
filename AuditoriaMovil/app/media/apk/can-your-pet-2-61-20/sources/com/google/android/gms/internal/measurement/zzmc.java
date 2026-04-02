package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmc {
    private static final Class<?> zza = zzd();
    private static final zzmv<?, ?> zzb = zzc();
    private static final zzmv<?, ?> zzc = new zzmx();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zza(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<zzii> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzf = size * zzjc.zzf(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzf += zzjc.zza(list.get(i2));
        }
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzjc.zzf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i = 0;
            while (i2 < size) {
                i += zzjc.zza(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjc.zza(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzb(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zza(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<zzli> list, zzma zzmaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjc.zza(i, list.get(i3), zzmaVar);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjc.zzf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i = 0;
            while (i2 < size) {
                i += zzjc.zzc(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjc.zzc(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzjc.zzf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i = 0;
            while (i2 < size) {
                i += zzjc.zzb(zzktVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjc.zzb(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, Object obj, zzma zzmaVar) {
        if (obj instanceof zzkm) {
            return zzjc.zzb(i, (zzkm) obj);
        }
        return zzjc.zzb(i, (zzli) obj, zzmaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<?> list, zzma zzmaVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzf = zzjc.zzf(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzkm) {
                zza2 = zzjc.zza((zzkm) obj);
            } else {
                zza2 = zzjc.zza((zzli) obj, zzmaVar);
            }
            zzf += zza2;
        }
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzjc.zzf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i = 0;
            while (i2 < size) {
                i += zzjc.zze(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjc.zze(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzjc.zzf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i = 0;
            while (i2 < size) {
                i += zzjc.zzd(zzktVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjc.zzd(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzf = zzjc.zzf(i) * size;
        if (list instanceof zzko) {
            zzko zzkoVar = (zzko) list;
            while (i2 < size) {
                Object zzb2 = zzkoVar.zzb(i2);
                if (zzb2 instanceof zzii) {
                    zza3 = zzjc.zza((zzii) zzb2);
                } else {
                    zza3 = zzjc.zza((String) zzb2);
                }
                zzf += zza3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzii) {
                    zza2 = zzjc.zza((zzii) obj);
                } else {
                    zza2 = zzjc.zza((String) obj);
                }
                zzf += zza2;
                i2++;
            }
        }
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzjc.zzf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i = 0;
            while (i2 < size) {
                i += zzjc.zzg(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjc.zzg(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzjc.zzf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i = 0;
            while (i2 < size) {
                i += zzjc.zze(zzktVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjc.zze(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    private static zzmv<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzmv) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zzmv<?, ?> zza() {
        return zzb;
    }

    public static zzmv<?, ?> zzb() {
        return zzc;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(Object obj, int i, List<Integer> list, zzjz zzjzVar, UB ub, zzmv<UT, UB> zzmvVar) {
        if (zzjzVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzjzVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(obj, i, intValue, ub, zzmvVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjzVar.zza(intValue2)) {
                    ub = (UB) zza(obj, i, intValue2, ub, zzmvVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(Object obj, int i, int i2, UB ub, zzmv<UT, UB> zzmvVar) {
        if (ub == null) {
            ub = zzmvVar.zzc(obj);
        }
        zzmvVar.zzb(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzjn<FT>> void zza(zzjk<FT> zzjkVar, T t, T t2) {
        zzjl<FT> zza2 = zzjkVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzjkVar.zzb(t).zza(zza2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzlb zzlbVar, T t, T t2, long j) {
        zznb.zza(t, j, zzlbVar.zza(zznb.zze(t, j), zznb.zze(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzmv<UT, UB> zzmvVar, T t, T t2) {
        zzmvVar.zzc(t, zzmvVar.zza(zzmvVar.zzd(t), zzmvVar.zzd(t2)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzjv.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Boolean> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zza(i, list, z);
    }

    public static void zza(int i, List<zzii> list, zznv zznvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zza(i, list);
    }

    public static void zzb(int i, List<Double> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzb(i, list, z);
    }

    public static void zzc(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zze(i, list, z);
    }

    public static void zzf(int i, List<Float> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzf(i, list, z);
    }

    public static void zza(int i, List<?> list, zznv zznvVar, zzma zzmaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zza(i, list, zzmaVar);
    }

    public static void zzg(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzg(i, list, z);
    }

    public static void zzh(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzh(i, list, z);
    }

    public static void zzb(int i, List<?> list, zznv zznvVar, zzma zzmaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzb(i, list, zzmaVar);
    }

    public static void zzi(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzi(i, list, z);
    }

    public static void zzj(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzj(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzk(i, list, z);
    }

    public static void zzl(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzl(i, list, z);
    }

    public static void zzb(int i, List<String> list, zznv zznvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzb(i, list);
    }

    public static void zzm(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzm(i, list, z);
    }

    public static void zzn(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzn(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
