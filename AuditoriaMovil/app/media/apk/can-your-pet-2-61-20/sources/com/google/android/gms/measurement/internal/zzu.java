package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzoe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzu extends zznd {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzw> zzc;
    private Long zzd;
    private Long zze;

    private final zzw zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzw zzwVar = new zzw(this, this.zza);
        this.zzc.put(num, zzwVar);
        return zzwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<zzfu.zzc> zza(String str, List<zzfu.zze> list, List<zzfu.zzn> list2, Long l, Long l2) {
        return zza(str, list, list2, l, l2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0317 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfu.zzc> zza(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.zzfu.zze> r25, java.util.List<com.google.android.gms.internal.measurement.zzfu.zzn> r26, java.lang.Long r27, java.lang.Long r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    private final List<zzfu.zzc> zzu() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.zzc.keySet();
        keySet.removeAll(this.zzb);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            zzw zzwVar = this.zzc.get(Integer.valueOf(intValue));
            Preconditions.checkNotNull(zzwVar);
            zzfu.zzc zza = zzwVar.zza(intValue);
            arrayList.add(zza);
            zzal zzh = zzh();
            String str = this.zza;
            zzfu.zzl zzd = zza.zzd();
            zzh.zzak();
            zzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzd);
            byte[] zzbx = zzd.zzbx();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(intValue));
            contentValues.put("current_results", zzbx);
            try {
                if (zzh.e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzfz.zza(str));
                }
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error storing filter results. appId", zzfz.zza(str), e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(zzni zzniVar) {
        super(zzniVar);
    }

    private final void zza(List<zzfu.zze> list, boolean z) {
        zzaz zzazVar;
        int i;
        Map<Integer, List<zzfi.zzb>> map;
        long j;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        zzy zzyVar = new zzy(this);
        ArrayMap arrayMap = new ArrayMap();
        for (zzfu.zze zzeVar : list) {
            zzfu.zze zza = zzyVar.zza(this.zza, zzeVar);
            if (zza != null) {
                zzal zzh = zzh();
                String str2 = this.zza;
                String zzg = zza.zzg();
                zzaz zzd = zzh.zzd(str2, zzeVar.zzg());
                if (zzd == null) {
                    zzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzfz.zza(str2), zzh.zzi().zza(zzg));
                    zzazVar = new zzaz(str2, zzeVar.zzg(), 1L, 1L, 1L, zzeVar.zzd(), 0L, null, null, null, null);
                } else {
                    zzazVar = new zzaz(zzd.zza, zzd.zzb, zzd.zzc + 1, zzd.zzd + 1, zzd.zze + 1, zzd.zzf, zzd.zzg, zzd.zzh, zzd.zzi, zzd.zzj, zzd.zzk);
                }
                zzaz zzazVar2 = zzazVar;
                zzh().zza(zzazVar2);
                if (!zzoe.zza() || !zze().zzf(str, zzbf.zzdf) || !z) {
                    long j2 = zzazVar2.zzc;
                    String zzg2 = zza.zzg();
                    Map<Integer, List<zzfi.zzb>> map2 = (Map) arrayMap.get(zzg2);
                    if (map2 == null) {
                        map2 = zzh().zzf(this.zza, zzg2);
                        arrayMap.put(zzg2, map2);
                    }
                    Map<Integer, List<zzfi.zzb>> map3 = map2;
                    for (Integer num : map3.keySet()) {
                        int intValue = num.intValue();
                        if (this.zzb.contains(Integer.valueOf(intValue))) {
                            zzj().zzp().zza("Skipping failed audience ID", Integer.valueOf(intValue));
                        } else {
                            Iterator<zzfi.zzb> it = map3.get(Integer.valueOf(intValue)).iterator();
                            boolean z2 = true;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = intValue;
                                    map = map3;
                                    j = j2;
                                    break;
                                }
                                zzfi.zzb next = it.next();
                                zzaa zzaaVar = new zzaa(this, this.zza, intValue, next);
                                i = intValue;
                                map = map3;
                                j = j2;
                                z2 = zzaaVar.zza(this.zzd, this.zze, zza, j2, zzazVar2, zza(intValue, next.zzb()));
                                if (z2) {
                                    zza(Integer.valueOf(i)).zza(zzaaVar);
                                    intValue = i;
                                    map3 = map;
                                    j2 = j;
                                } else {
                                    this.zzb.add(Integer.valueOf(i));
                                    break;
                                }
                            }
                            if (!z2) {
                                this.zzb.add(Integer.valueOf(i));
                            }
                            map3 = map;
                            j2 = j;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0113, code lost:
        r5 = zzj().zzu();
        r7 = com.google.android.gms.measurement.internal.zzfz.zza(r13.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0125, code lost:
        if (r6.zzi() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0127, code lost:
        r8 = java.lang.Integer.valueOf(r6.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
        r5.zza("Invalid property filter ID. appId, id", r7, java.lang.String.valueOf(r8));
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zza(java.util.List<com.google.android.gms.internal.measurement.zzfu.zzn> r14) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.zza(java.util.List):void");
    }

    private final boolean zza(int i, int i2) {
        zzw zzwVar = this.zzc.get(Integer.valueOf(i));
        if (zzwVar == null) {
            return false;
        }
        return zzw.zza(zzwVar).get(i2);
    }
}
