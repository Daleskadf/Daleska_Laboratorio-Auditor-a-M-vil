package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzdu extends zzdy {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdu() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdu(zzdt zzdtVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzfw.zzf(obj, j);
        if (list instanceof zzds) {
            unmodifiableList = ((zzds) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzer) || !(list instanceof zzdk)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzdk zzdkVar = (zzdk) list;
                if (zzdkVar.zzc()) {
                    zzdkVar.zzb();
                    return;
                }
                return;
            }
        }
        zzfw.zzs(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zzb(Object obj, Object obj2, long j) {
        zzdr zzdrVar;
        List list = (List) zzfw.zzf(obj2, j);
        int size = list.size();
        List list2 = (List) zzfw.zzf(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzds) {
                list2 = new zzdr(size);
            } else if (!(list2 instanceof zzer) || !(list2 instanceof zzdk)) {
                list2 = new ArrayList(size);
            } else {
                list2 = ((zzdk) list2).zzd(size);
            }
            zzfw.zzs(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzfw.zzs(obj, j, arrayList);
                zzdrVar = arrayList;
            } else if (list2 instanceof zzfr) {
                zzdr zzdrVar2 = new zzdr(list2.size() + size);
                zzdrVar2.addAll(zzdrVar2.size(), (zzfr) list2);
                zzfw.zzs(obj, j, zzdrVar2);
                zzdrVar = zzdrVar2;
            } else if ((list2 instanceof zzer) && (list2 instanceof zzdk)) {
                zzdk zzdkVar = (zzdk) list2;
                if (!zzdkVar.zzc()) {
                    list2 = zzdkVar.zzd(list2.size() + size);
                    zzfw.zzs(obj, j, list2);
                }
            }
            list2 = zzdrVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzfw.zzs(obj, j, list);
    }
}
