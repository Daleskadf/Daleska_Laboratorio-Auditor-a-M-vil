package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzk {
    private static final zzgzk zzb = new zzgzk(true);
    final zzhct zza = new zzhcj(16);
    private boolean zzc;
    private boolean zzd;

    private zzgzk() {
    }

    static int zza(zzhdn zzhdnVar, int i, Object obj) {
        int zzD = zzgza.zzD(i << 3);
        if (zzhdnVar == zzhdn.GROUP) {
            zzhbl zzhblVar = (zzhbl) obj;
            byte[] bArr = zzhai.zzd;
            if (zzhblVar instanceof zzgxr) {
                zzgxr zzgxrVar = (zzgxr) zzhblVar;
                throw null;
            }
            zzD += zzD;
        }
        return zzD + zzb(zzhdnVar, obj);
    }

    static int zzb(zzhdn zzhdnVar, Object obj) {
        int zzd;
        int zzD;
        zzhdn zzhdnVar2 = zzhdn.DOUBLE;
        zzhdo zzhdoVar = zzhdo.INT;
        switch (zzhdnVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i = zzgza.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i2 = zzgza.zzf;
                return 4;
            case 2:
                return zzgza.zzE(((Long) obj).longValue());
            case 3:
                return zzgza.zzE(((Long) obj).longValue());
            case 4:
                return zzgza.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i3 = zzgza.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i4 = zzgza.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i5 = zzgza.zzf;
                return 1;
            case 8:
                if (obj instanceof zzgyj) {
                    int i6 = zzgza.zzf;
                    zzd = ((zzgyj) obj).zzd();
                    zzD = zzgza.zzD(zzd);
                    break;
                } else {
                    return zzgza.zzC((String) obj);
                }
            case 9:
                int i7 = zzgza.zzf;
                return ((zzhbl) obj).zzaY();
            case 10:
                if (obj instanceof zzhaq) {
                    int i8 = zzgza.zzf;
                    zzd = ((zzhaq) obj).zza();
                    zzD = zzgza.zzD(zzd);
                    break;
                } else {
                    return zzgza.zzz((zzhbl) obj);
                }
            case 11:
                if (obj instanceof zzgyj) {
                    int i9 = zzgza.zzf;
                    zzd = ((zzgyj) obj).zzd();
                    zzD = zzgza.zzD(zzd);
                    break;
                } else {
                    int i10 = zzgza.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzgza.zzD(zzd);
                    break;
                }
            case 12:
                return zzgza.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgzz) {
                    return zzgza.zzE(((zzgzz) obj).zza());
                }
                return zzgza.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i11 = zzgza.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i12 = zzgza.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgza.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgza.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzgzj zzgzjVar, Object obj) {
        zzhdn zzd = zzgzjVar.zzd();
        int zza = zzgzjVar.zza();
        if (zzgzjVar.zzg()) {
            List<Object> list = (List) obj;
            int i = 0;
            if (zzgzjVar.zzf()) {
                if (list.isEmpty()) {
                    return 0;
                }
                for (Object obj2 : list) {
                    i += zzb(zzd, obj2);
                }
                return zzgza.zzD(zza << 3) + i + zzgza.zzD(i);
            }
            for (Object obj3 : list) {
                i += zza(zzd, zza, obj3);
            }
            return i;
        }
        return zza(zzd, zza, obj);
    }

    public static zzgzk zze() {
        return zzb;
    }

    private static Object zzm(Object obj) {
        if (obj instanceof zzhbq) {
            return ((zzhbq) obj).zzc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzn(Map.Entry entry) {
        zzhbl zzbr;
        zzgzj zzgzjVar = (zzgzj) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzhaq;
        if (zzgzjVar.zzg()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zzf = zzf(zzgzjVar);
            if (zzf == null) {
                zzf = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zzf).add(zzm(obj));
            }
            this.zza.put(zzgzjVar, zzf);
        } else if (zzgzjVar.zze() == zzhdo.MESSAGE) {
            Object zzf2 = zzf(zzgzjVar);
            if (zzf2 == null) {
                this.zza.put(zzgzjVar, zzm(value));
                if (z) {
                    this.zzd = true;
                }
            } else if (!z) {
                if (zzf2 instanceof zzhbq) {
                    zzbr = zzgzjVar.zzc((zzhbq) zzf2, (zzhbq) value);
                } else {
                    zzhbk zzcZ = ((zzhbl) zzf2).zzcZ();
                    zzgzjVar.zzb(zzcZ, (zzhbl) value);
                    zzbr = zzcZ.zzbr();
                }
                this.zza.put(zzgzjVar, zzbr);
            } else {
                zzhaq zzhaqVar = (zzhaq) value;
                throw null;
            }
        } else {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzgzjVar, zzm(value));
        }
    }

    private static boolean zzo(Map.Entry entry) {
        zzgzj zzgzjVar = (zzgzj) entry.getKey();
        if (zzgzjVar.zze() == zzhdo.MESSAGE) {
            if (zzgzjVar.zzg()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!zzp(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return zzp(entry.getValue());
        }
        return true;
    }

    private static boolean zzp(Object obj) {
        if (obj instanceof zzhbm) {
            return ((zzhbm) obj).zzbw();
        }
        if (obj instanceof zzhaq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzq(Map.Entry entry) {
        int i;
        int zzD;
        int zzD2;
        zzgzj zzgzjVar = (zzgzj) entry.getKey();
        Object value = entry.getValue();
        if (zzgzjVar.zze() != zzhdo.MESSAGE || zzgzjVar.zzg() || zzgzjVar.zzf()) {
            return zzc(zzgzjVar, value);
        }
        if (value instanceof zzhaq) {
            int zza = ((zzgzj) entry.getKey()).zza();
            int zzD3 = zzgza.zzD(8);
            i = zzD3 + zzD3;
            zzD = zzgza.zzD(16) + zzgza.zzD(zza);
            int zzD4 = zzgza.zzD(24);
            int zza2 = ((zzhaq) value).zza();
            zzD2 = zzD4 + zzgza.zzD(zza2) + zza2;
        } else {
            int zza3 = ((zzgzj) entry.getKey()).zza();
            int zzD5 = zzgza.zzD(8);
            i = zzD5 + zzD5;
            zzD = zzgza.zzD(16) + zzgza.zzD(zza3);
            zzD2 = zzgza.zzD(24) + zzgza.zzz((zzhbl) value);
        }
        return i + zzD + zzD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzr(com.google.android.gms.internal.ads.zzgzj r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzhdn r0 = r4.zzd()
            byte[] r1 = com.google.android.gms.internal.ads.zzhai.zzd
            r5.getClass()
            com.google.android.gms.internal.ads.zzhdn r1 = com.google.android.gms.internal.ads.zzhdn.DOUBLE
            com.google.android.gms.internal.ads.zzhdo r1 = com.google.android.gms.internal.ads.zzhdo.INT
            com.google.android.gms.internal.ads.zzhdo r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbl
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhaq
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzz
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgyj
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.ads.zzhdn r4 = r4.zzd()
            com.google.android.gms.internal.ads.zzhdo r4 = r4.zza()
            r2 = 1
            r1[r2] = r4
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzk.zzr(com.google.android.gms.internal.ads.zzgzj, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgzk zzgzkVar = new zzgzk();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzgzkVar.zzk((zzgzj) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgzkVar.zzk((zzgzj) entry.getKey(), entry.getValue());
        }
        zzgzkVar.zzd = this.zzd;
        return zzgzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgzk) {
            return this.zza.equals(((zzgzk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zzq(this.zza.zzg(i2));
        }
        for (Map.Entry entry : this.zza.zzc()) {
            i += zzq(entry);
        }
        return i;
    }

    public final Object zzf(zzgzj zzgzjVar) {
        Object obj = this.zza.get(zzgzjVar);
        if (obj instanceof zzhaq) {
            zzhaq zzhaqVar = (zzhaq) obj;
            throw null;
        }
        return obj;
    }

    public final Iterator zzg() {
        return this.zzd ? new zzhap(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzh(zzgzj zzgzjVar, Object obj) {
        List list;
        if (!((zzgzs) zzgzjVar).zzd) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zzr(zzgzjVar, obj);
        Object zzf = zzf(zzgzjVar);
        if (zzf == null) {
            list = new ArrayList();
            this.zza.put(zzgzjVar, list);
        } else {
            list = (List) zzf;
        }
        list.add(obj);
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            if (zzg.getValue() instanceof zzgzv) {
                ((zzgzv) zzg.getValue()).zzbV();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzgzk zzgzkVar) {
        for (int i = 0; i < zzgzkVar.zza.zzb(); i++) {
            zzn(zzgzkVar.zza.zzg(i));
        }
        for (Map.Entry entry : zzgzkVar.zza.zzc()) {
            zzn(entry);
        }
    }

    public final void zzk(zzgzj zzgzjVar, Object obj) {
        if (zzgzjVar.zzg()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzr(zzgzjVar, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            zzr(zzgzjVar, obj);
        }
        if (obj instanceof zzhaq) {
            this.zzd = true;
        }
        this.zza.put(zzgzjVar, obj);
    }

    public final boolean zzl() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzo(this.zza.zzg(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.zza.zzc()) {
            if (!zzo(entry)) {
                return false;
            }
        }
        return true;
    }

    private zzgzk(boolean z) {
        zzi();
        zzi();
    }
}
