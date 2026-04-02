package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhav extends zzhaz {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhav() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhav(zzhau zzhauVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzhas zzhasVar;
        List arrayList;
        List list = (List) zzhdh.zzh(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzhat) {
                arrayList = new zzhas(i);
            } else if (!(list instanceof zzhbu) || !(list instanceof zzhah)) {
                arrayList = new ArrayList(i);
            } else {
                arrayList = ((zzhah) list).zzf(i);
            }
            zzhdh.zzv(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzhdh.zzv(obj, j, arrayList2);
            zzhasVar = arrayList2;
        } else if (!(list instanceof zzhdc)) {
            if ((list instanceof zzhbu) && (list instanceof zzhah)) {
                zzhah zzhahVar = (zzhah) list;
                if (zzhahVar.zzc()) {
                    return list;
                }
                zzhah zzf = zzhahVar.zzf(list.size() + i);
                zzhdh.zzv(obj, j, zzf);
                return zzf;
            }
            return list;
        } else {
            zzhas zzhasVar2 = new zzhas(list.size() + i);
            zzhasVar2.addAll(zzhasVar2.size(), (zzhdc) list);
            zzhdh.zzv(obj, j, zzhasVar2);
            zzhasVar = zzhasVar2;
        }
        return zzhasVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhaz
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzhdh.zzh(obj, j);
        if (list instanceof zzhat) {
            unmodifiableList = ((zzhat) list).zzd();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzhbu) || !(list instanceof zzhah)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzhah zzhahVar = (zzhah) list;
                if (zzhahVar.zzc()) {
                    zzhahVar.zzb();
                    return;
                }
                return;
            }
        }
        zzhdh.zzv(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzhdh.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzhdh.zzv(obj, j, list);
    }
}
