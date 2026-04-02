package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgya implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgyj zzgyjVar = (zzgyj) obj;
        zzgyj zzgyjVar2 = (zzgyj) obj2;
        zzgyd it = zzgyjVar.iterator();
        zzgyd it2 = zzgyjVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgyjVar.zzd()).compareTo(Integer.valueOf(zzgyjVar2.zzd()));
    }
}
