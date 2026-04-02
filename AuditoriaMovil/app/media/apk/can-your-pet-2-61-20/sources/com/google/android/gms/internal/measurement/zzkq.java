package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkq extends zzkn {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zznb.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzkl zzklVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzko) {
                arrayList = new zzkl(i);
            } else if ((zzc instanceof zzlu) && (zzc instanceof zzke)) {
                arrayList = ((zzke) zzc).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zznb.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zznb.zza(obj, j, arrayList2);
            zzklVar = arrayList2;
        } else if (zzc instanceof zzna) {
            zzkl zzklVar2 = new zzkl(zzc.size() + i);
            zzklVar2.addAll((zzna) zzc);
            zznb.zza(obj, j, zzklVar2);
            zzklVar = zzklVar2;
        } else if ((zzc instanceof zzlu) && (zzc instanceof zzke)) {
            zzke zzkeVar = (zzke) zzc;
            if (zzkeVar.zzc()) {
                return zzc;
            }
            zzke zza2 = zzkeVar.zza(zzc.size() + i);
            zznb.zza(obj, j, zza2);
            return zza2;
        } else {
            return zzc;
        }
        return zzklVar;
    }

    private zzkq() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zznb.zze(obj, j);
        if (list instanceof zzko) {
            unmodifiableList = ((zzko) list).zzd();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzlu) && (list instanceof zzke)) {
                zzke zzkeVar = (zzke) list;
                if (zzkeVar.zzc()) {
                    zzkeVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zznb.zza(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zznb.zza(obj, j, zzc);
    }
}
