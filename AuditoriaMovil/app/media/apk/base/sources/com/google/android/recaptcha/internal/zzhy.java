package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import m6.AbstractC1446g;
import m6.AbstractC1447h;
import m6.p;
/* loaded from: classes.dex */
public final class zzhy {
    private List zza = p.f14074a;

    public final long zza(long[] jArr) {
        Iterator it = AbstractC1447h.T(AbstractC1446g.Q(jArr), this.zza).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
            }
            return ((Number) next).longValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void zzb(long[] jArr) {
        this.zza = AbstractC1446g.Q(jArr);
    }
}
