package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzow;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzw {
    private String zza;
    private boolean zzb;
    private zzfu.zzl zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzu zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet zza(zzw zzwVar) {
        return zzwVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    public final zzfu.zzc zza(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        zzfu.zzc.zza zzb = zzfu.zzc.zzb();
        zzb.zza(i);
        zzb.zza(this.zzb);
        zzfu.zzl zzlVar = this.zzc;
        if (zzlVar != null) {
            zzb.zza(zzlVar);
        }
        zzfu.zzl.zza zzd = zzfu.zzl.zze().zzb(zznr.zza(this.zzd)).zzd(zznr.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.zzf.size());
            for (Integer num : this.zzf.keySet()) {
                int intValue = num.intValue();
                Long l = this.zzf.get(Integer.valueOf(intValue));
                if (l != null) {
                    arrayList.add((zzfu.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzfu.zzd.zzc().zza(intValue).zza(l.longValue()).zzah()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.zzg == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.zzg.size());
            for (Integer num2 : this.zzg.keySet()) {
                zzfu.zzm.zza zza = zzfu.zzm.zzc().zza(num2.intValue());
                List<Long> list = this.zzg.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    zza.zza(list);
                }
                arrayList2.add((zzfu.zzm) ((com.google.android.gms.internal.measurement.zzjv) zza.zzah()));
            }
        }
        zzd.zzc(arrayList2);
        zzb.zza(zzd);
        return (zzfu.zzc) ((com.google.android.gms.internal.measurement.zzjv) zzb.zzah());
    }

    private zzw(zzu zzuVar, String str) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzw(zzu zzuVar, String str, zzfu.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zzlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzz zzzVar) {
        int zza = zzzVar.zza();
        if (zzzVar.zzc != null) {
            this.zze.set(zza, zzzVar.zzc.booleanValue());
        }
        if (zzzVar.zzd != null) {
            this.zzd.set(zza, zzzVar.zzd.booleanValue());
        }
        if (zzzVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzzVar.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzzVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzzVar.zzc()) {
                list.clear();
            }
            if (zzow.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbj) && zzzVar.zzb()) {
                list.clear();
            }
            if (zzow.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbj)) {
                long longValue2 = zzzVar.zzf.longValue() / 1000;
                if (list.contains(Long.valueOf(longValue2))) {
                    return;
                }
                list.add(Long.valueOf(longValue2));
                return;
            }
            list.add(Long.valueOf(zzzVar.zzf.longValue() / 1000));
        }
    }
}
