package com.google.android.gms.internal.measurement;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class zzim {
    public static zzii zza(zzii zziiVar) {
        if (!(zziiVar instanceof zzik) && !(zziiVar instanceof zzij)) {
            if (zziiVar instanceof Serializable) {
                return new zzij(zziiVar);
            }
            return new zzik(zziiVar);
        }
        return zziiVar;
    }

    public static zzii zzb(Object obj) {
        return new zzil(obj);
    }
}
