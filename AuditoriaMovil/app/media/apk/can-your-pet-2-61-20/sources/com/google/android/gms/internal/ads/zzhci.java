package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhci {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzhcx zzc;
    private static final zzhcx zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzhcx zzhcxVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzhcxVar = (zzhcx) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzhcxVar;
        zzd = new zzhcz();
    }

    public static void zzA(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzp(i, list, z);
    }

    public static void zzB(int i, List list, zzgzb zzgzbVar, zzhcg zzhcgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgzbVar.zzq(i, list.get(i2), zzhcgVar);
        }
    }

    public static void zzC(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzs(i, list, z);
    }

    public static void zzD(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzu(i, list, z);
    }

    public static void zzE(int i, List list, zzgzb zzgzbVar, zzhcg zzhcgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgzbVar.zzv(i, list.get(i2), zzhcgVar);
        }
    }

    public static void zzF(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzy(i, list, z);
    }

    public static void zzG(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzA(i, list, z);
    }

    public static void zzH(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzC(i, list, z);
    }

    public static void zzI(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzE(i, list, z);
    }

    public static void zzJ(int i, List list, zzgzb zzgzbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzH(i, list);
    }

    public static void zzK(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzJ(i, list, z);
    }

    public static void zzL(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzL(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(zzgzwVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgza.zzD(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgza.zzD(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(zzgzwVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(zzhbaVar.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, Object obj, zzhcg zzhcgVar) {
        int i2 = i << 3;
        if (obj instanceof zzhar) {
            int zzD = zzgza.zzD(i2);
            int zza2 = ((zzhar) obj).zza();
            return zzD + zzgza.zzD(zza2) + zza2;
        }
        return zzgza.zzD(i2) + zzgza.zzA((zzhbl) obj, zzhcgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            i = 0;
            while (i2 < size) {
                int zzd2 = zzgzwVar.zzd(i2);
                i += zzgza.zzD((zzd2 >> 31) ^ (zzd2 + zzd2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgza.zzD((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            i = 0;
            while (i2 < size) {
                long zza2 = zzhbaVar.zza(i2);
                i += zzgza.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgza.zzE((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            i = 0;
            while (i2 < size) {
                i += zzgza.zzD(zzgzwVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgza.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(zzhbaVar.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgza.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzhcx zzm() {
        return zzc;
    }

    public static zzhcx zzn() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzo(Object obj, int i, List list, zzhab zzhabVar, Object obj2, zzhcx zzhcxVar) {
        if (zzhabVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzhabVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, intValue, obj2, zzhcxVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzhabVar.zza(intValue2)) {
                    obj2 = zzp(obj, i, intValue2, obj2, zzhcxVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Object obj, int i, int i2, Object obj2, zzhcx zzhcxVar) {
        if (obj2 == null) {
            obj2 = zzhcxVar.zzc(obj);
        }
        zzhcxVar.zzl(obj2, i, i2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzgzk zzb2 = zzgzgVar.zzb(obj2);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzgzgVar.zzc(obj).zzj(zzb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzr(zzhcx zzhcxVar, Object obj, Object obj2) {
        zzhcxVar.zzo(obj, zzhcxVar.zze(zzhcxVar.zzd(obj), zzhcxVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzgzv.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzt(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzu(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzc(i, list, z);
    }

    public static void zzv(int i, List list, zzgzb zzgzbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zze(i, list);
    }

    public static void zzw(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzg(i, list, z);
    }

    public static void zzx(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzj(i, list, z);
    }

    public static void zzy(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzl(i, list, z);
    }

    public static void zzz(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzn(i, list, z);
    }
}
