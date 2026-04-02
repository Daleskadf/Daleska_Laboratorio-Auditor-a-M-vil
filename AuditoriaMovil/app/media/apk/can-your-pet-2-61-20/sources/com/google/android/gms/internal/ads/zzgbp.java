package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgbp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static zzgbo zzb(Set set, Set set2) {
        zzfwr.zzc(set, "set1");
        zzfwr.zzc(set2, "set2");
        return new zzgbj(set, set2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, zzfws zzfwsVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof zzgbk) {
                zzgbk zzgbkVar = (zzgbk) set;
                return new zzgbk(zzgbkVar.zza, zzfwv.zza(zzgbkVar.zzb, zzfwsVar));
            }
            set.getClass();
            return new zzgbk(set, zzfwsVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzgbk) {
            zzgbk zzgbkVar2 = (zzgbk) sortedSet;
            return new zzgbl((SortedSet) zzgbkVar2.zza, zzfwv.zza(zzgbkVar2.zzb, zzfwsVar));
        }
        sortedSet.getClass();
        return new zzgbl(sortedSet, zzfwsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgav) {
            collection = ((zzgav) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
