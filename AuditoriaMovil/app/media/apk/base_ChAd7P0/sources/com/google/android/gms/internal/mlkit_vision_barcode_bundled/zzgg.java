package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.datastore.preferences.protobuf.Y;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgs zzb;

    static {
        int i7 = zzfu.zza;
        zzb = new zzgu();
    }

    public static void zzA(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzC(i7, list, z7);
        }
    }

    public static void zzB(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzE(i7, list, z7);
        }
    }

    public static void zzC(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzJ(i7, list, z7);
        }
    }

    public static void zzD(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzL(i7, list, z7);
        }
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zza(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(zzeiVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzb(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdn.zzA(i7 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdn.zzA(i7 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(zzeiVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzg(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(zzfbVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzh(int i7, Object obj, zzge zzgeVar) {
        int i8 = i7 << 3;
        if (obj instanceof zzex) {
            int zzA = zzdn.zzA(i8);
            int zza2 = ((zzex) obj).zza();
            return Y.c(zza2, zza2, zzA);
        }
        return zzdn.zzy((zzfm) obj, zzgeVar) + zzdn.zzA(i8);
    }

    public static int zzi(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            i7 = 0;
            while (i8 < size) {
                int zze = zzeiVar.zze(i8);
                i7 += zzdn.zzA((zze >> 31) ^ (zze + zze));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = ((Integer) list.get(i8)).intValue();
                i7 += zzdn.zzA((intValue >> 31) ^ (intValue + intValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzj(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            i7 = 0;
            while (i8 < size) {
                long zze = zzfbVar.zze(i8);
                i7 += zzdn.zzB((zze >> 63) ^ (zze + zze));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                long longValue = ((Long) list.get(i8)).longValue();
                i7 += zzdn.zzB((longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzk(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzA(zzeiVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzA(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzl(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(zzfbVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzdn.zzB(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static zzgs zzm() {
        return zzb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r5 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object zzn(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs r6) {
        /*
            if (r5 != 0) goto L12
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh) r2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt r5 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt.zzc()
            if (r5 != r6) goto L12
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt.zzf()
            r2.zzc = r5
        L12:
            long r0 = (long) r4
            int r2 = r3 << 3
            r3 = r5
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt r3 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.zzj(r2, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgg.zzn(java.lang.Object, int, int, java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs):java.lang.Object");
    }

    public static void zzo(zzdt zzdtVar, Object obj, Object obj2) {
        zzdx zzdxVar = ((zzed) obj2).zzb;
        if (!zzdxVar.zza.isEmpty()) {
            ((zzed) obj).zzc().zzh(zzdxVar);
        }
    }

    public static void zzp(zzgs zzgsVar, Object obj, Object obj2) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        zzgt zzgtVar2 = ((zzeh) obj2).zzc;
        if (!zzgt.zzc().equals(zzgtVar2)) {
            if (zzgt.zzc().equals(zzgtVar)) {
                zzgtVar = zzgt.zze(zzgtVar, zzgtVar2);
            } else {
                zzgtVar.zzd(zzgtVar2);
            }
        }
        zzehVar.zzc = zzgtVar;
    }

    public static void zzq(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzc(i7, list, z7);
        }
    }

    public static void zzr(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzg(i7, list, z7);
        }
    }

    public static void zzs(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzj(i7, list, z7);
        }
    }

    public static void zzt(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzl(i7, list, z7);
        }
    }

    public static void zzu(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzn(i7, list, z7);
        }
    }

    public static void zzv(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzp(i7, list, z7);
        }
    }

    public static void zzw(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzs(i7, list, z7);
        }
    }

    public static void zzx(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzu(i7, list, z7);
        }
    }

    public static void zzy(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzy(i7, list, z7);
        }
    }

    public static void zzz(int i7, List list, zzhh zzhhVar, boolean z7) {
        if (list != null && !list.isEmpty()) {
            zzhhVar.zzA(i7, list, z7);
        }
    }
}
