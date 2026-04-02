package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class zzpz {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzpy zzpyVar = (zzpy) obj;
        zzpx zzpxVar = (zzpx) obj2;
        if (!zzpyVar.isEmpty()) {
            Iterator it = zzpyVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }
}
