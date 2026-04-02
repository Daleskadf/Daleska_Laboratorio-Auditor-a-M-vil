package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzex {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzfm zzc;
    private static final zzfm zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzfm zzfmVar = null;
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
                zzfmVar = (zzfm) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzfmVar;
        zzd = new zzfo();
    }

    public static void zzA(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzz(i, list, z);
    }

    public static void zzB(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzB(i, list, z);
    }

    public static void zzC(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzD(i, list, z);
    }

    public static void zzD(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzI(i, list, z);
    }

    public static void zzE(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzK(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzde) {
            zzde zzdeVar = (zzde) list;
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(zzdeVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(((Integer) list.get(i2)).intValue());
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
        return size * (zzck.zzw(i << 3) + 4);
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
        return size * (zzck.zzw(i << 3) + 8);
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
        if (list instanceof zzde) {
            zzde zzdeVar = (zzde) list;
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(zzdeVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(((Integer) list.get(i2)).intValue());
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
        if (list instanceof zzdz) {
            zzdz zzdzVar = (zzdz) list;
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(zzdzVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, Object obj, zzev zzevVar) {
        int i2 = i << 3;
        if (obj instanceof zzdq) {
            int zzw = zzck.zzw(i2);
            int zza2 = ((zzdq) obj).zza();
            return zzw + zzck.zzw(zza2) + zza2;
        }
        return zzck.zzw(i2) + zzck.zzu((zzek) obj, zzevVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzde) {
            zzde zzdeVar = (zzde) list;
            i = 0;
            while (i2 < size) {
                int zze = zzdeVar.zze(i2);
                i += zzck.zzw((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzck.zzw((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zzdz) {
            zzdz zzdzVar = (zzdz) list;
            i = 0;
            while (i2 < size) {
                long zze = zzdzVar.zze(i2);
                i += zzck.zzx((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzck.zzx((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zzde) {
            zzde zzdeVar = (zzde) list;
            i = 0;
            while (i2 < size) {
                i += zzck.zzw(zzdeVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzck.zzw(((Integer) list.get(i2)).intValue());
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
        if (list instanceof zzdz) {
            zzdz zzdzVar = (zzdz) list;
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(zzdzVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzck.zzx(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzfm zzm() {
        return zzc;
    }

    public static zzfm zzn() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzo(Object obj, int i, int i2, Object obj2, zzfm zzfmVar) {
        if (obj2 == null) {
            obj2 = zzfmVar.zzc(obj);
        }
        zzfmVar.zzf(obj2, i, i2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(zzfm zzfmVar, Object obj, Object obj2) {
        zzfmVar.zzh(obj, zzfmVar.zze(zzfmVar.zzd(obj), zzfmVar.zzd(obj2)));
    }

    public static void zzq(Class cls) {
        Class cls2;
        if (!zzdd.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzr(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzg(i, list, z);
    }

    public static void zzt(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzj(i, list, z);
    }

    public static void zzu(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzl(i, list, z);
    }

    public static void zzv(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzn(i, list, z);
    }

    public static void zzw(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzp(i, list, z);
    }

    public static void zzx(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzs(i, list, z);
    }

    public static void zzy(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzu(i, list, z);
    }

    public static void zzz(int i, List list, zzge zzgeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgeVar.zzx(i, list, z);
    }
}
