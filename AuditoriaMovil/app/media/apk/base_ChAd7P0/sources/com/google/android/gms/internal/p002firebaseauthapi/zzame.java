package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzame  reason: invalid package */
/* loaded from: classes.dex */
public final class zzame {
    private static final zzamv<?, ?> zza = new zzamx();

    public static int zza(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajo.zza(i7, true) * size;
    }

    public static int zzb(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i7) * size) + zzb(list);
    }

    public static int zzc(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajo.zzb(i7, 0) * size;
    }

    public static int zzd(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajo.zza(i7, 0L) * size;
    }

    public static int zze(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i7) * size) + zze(list);
    }

    public static int zzf(int i7, List<Long> list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzajo.zzg(i7) * list.size()) + zzf(list);
    }

    public static int zzg(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i7) * size) + zzg(list);
    }

    public static int zzh(int i7, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i7) * size) + zzh(list);
    }

    public static int zzi(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i7) * size) + zzi(list);
    }

    public static int zzj(int i7, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i7) * size) + zzj(list);
    }

    public static void zzk(int i7, List<Integer> list, zzanm zzanmVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzanmVar.zzk(i7, list, z7);
        }
    }

    public static void zzl(int i7, List<Long> list, zzanm zzanmVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzanmVar.zzl(i7, list, z7);
        }
    }

    public static void zzm(int i7, List<Integer> list, zzanm zzanmVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzanmVar.zzm(i7, list, z7);
        }
    }

    public static void zzn(int i7, List<Long> list, zzanm zzanmVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzanmVar.zzn(i7, list, z7);
        }
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i7, List<zzaiw> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzajo.zzg(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzg += zzajo.zza(list.get(i8));
        }
        return zzg;
    }

    public static int zzb(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zza(zzakjVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zza(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static void zzc(int i7, List<Integer> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzc(i7, list, z7);
    }

    public static void zzd(int i7, List<Integer> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzd(i7, list, z7);
    }

    public static int zze(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzc(zzakjVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzc(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzf(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzb(zzakyVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzb(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzg(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzf(zzakjVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzf(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzh(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzd(zzakyVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzd(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzi(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzh(zzakjVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zzh(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzj(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zze(zzakyVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajo.zze(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zza(int i7, List<zzaln> list, zzamc<?> zzamcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += zzajo.zza(i7, list.get(i9), zzamcVar);
        }
        return i8;
    }

    public static int zzb(int i7, List<?> list, zzamc<?> zzamcVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzajo.zzg(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj instanceof zzakv) {
                zza2 = zzajo.zza((zzakv) obj);
            } else {
                zza2 = zzajo.zza((zzaln) obj, zzamcVar);
            }
            zzg = zza2 + zzg;
        }
        return zzg;
    }

    public static void zze(int i7, List<Long> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zze(i7, list, z7);
    }

    public static void zzf(int i7, List<Float> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzf(i7, list, z7);
    }

    public static void zzg(int i7, List<Integer> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzg(i7, list, z7);
    }

    public static void zzh(int i7, List<Long> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzh(i7, list, z7);
    }

    public static void zzi(int i7, List<Integer> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzi(i7, list, z7);
    }

    public static void zzj(int i7, List<Long> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzj(i7, list, z7);
    }

    public static int zza(int i7, Object obj, zzamc<?> zzamcVar) {
        if (obj instanceof zzakv) {
            return zzajo.zzb(i7, (zzakv) obj);
        }
        return zzajo.zzb(i7, (zzaln) obj, zzamcVar);
    }

    public static zzamv<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i7, List<Integer> list, zzakk zzakkVar, UB ub, zzamv<UT, UB> zzamvVar) {
        if (zzakkVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = list.get(i9);
                int intValue = num.intValue();
                if (zzakkVar.zza(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    ub = (UB) zza(obj, i7, intValue, ub, zzamvVar);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzakkVar.zza(intValue2)) {
                    ub = (UB) zza(obj, i7, intValue2, ub, zzamvVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i7, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int zzg = zzajo.zzg(i7) * size;
        if (list instanceof zzaku) {
            zzaku zzakuVar = (zzaku) list;
            while (i8 < size) {
                Object zza4 = zzakuVar.zza(i8);
                if (zza4 instanceof zzaiw) {
                    zza3 = zzajo.zza((zzaiw) zza4);
                } else {
                    zza3 = zzajo.zza((String) zza4);
                }
                zzg = zza3 + zzg;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof zzaiw) {
                    zza2 = zzajo.zza((zzaiw) obj);
                } else {
                    zza2 = zzajo.zza((String) obj);
                }
                zzg = zza2 + zzg;
                i8++;
            }
        }
        return zzg;
    }

    public static <UT, UB> UB zza(Object obj, int i7, int i8, UB ub, zzamv<UT, UB> zzamvVar) {
        if (ub == null) {
            ub = zzamvVar.zzc(obj);
        }
        zzamvVar.zzb(ub, i7, i8);
        return ub;
    }

    public static void zzb(int i7, List<Double> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i7, list, z7);
    }

    public static <T, FT extends zzaka<FT>> void zza(zzajx<FT> zzajxVar, T t7, T t8) {
        zzajy<FT> zza2 = zzajxVar.zza(t8);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzajxVar.zzb(t7).zza(zza2);
    }

    public static void zzb(int i7, List<?> list, zzanm zzanmVar, zzamc<?> zzamcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i7, list, (zzamc) zzamcVar);
    }

    public static void zzb(int i7, List<String> list, zzanm zzanmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i7, list);
    }

    public static <T> void zza(zzalg zzalgVar, T t7, T t8, long j) {
        zzana.zza(t7, j, zzalgVar.zza(zzana.zze(t7, j), zzana.zze(t8, j)));
    }

    public static <T, UT, UB> void zza(zzamv<UT, UB> zzamvVar, T t7, T t8) {
        zzamvVar.zzc(t7, zzamvVar.zza(zzamvVar.zzd(t7), zzamvVar.zzd(t8)));
    }

    public static void zza(Class<?> cls) {
        zzakg.class.isAssignableFrom(cls);
    }

    public static void zza(int i7, List<Boolean> list, zzanm zzanmVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i7, list, z7);
    }

    public static void zza(int i7, List<zzaiw> list, zzanm zzanmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i7, list);
    }

    public static void zza(int i7, List<?> list, zzanm zzanmVar, zzamc<?> zzamcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i7, list, (zzamc) zzamcVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
