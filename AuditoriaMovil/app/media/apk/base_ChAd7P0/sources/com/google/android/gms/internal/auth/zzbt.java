package com.google.android.gms.internal.auth;

import T2.a;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.I;
/* loaded from: classes.dex */
public final class zzbt {
    public final r getSpatulaHeader(o oVar) {
        I.i(oVar);
        return ((com.google.android.gms.common.api.internal.I) oVar).f9188b.doWrite((l) new zzbs(this, oVar));
    }

    public final r performProxyRequest(o oVar, a aVar) {
        I.i(oVar);
        I.i(aVar);
        return ((com.google.android.gms.common.api.internal.I) oVar).f9188b.doWrite((l) new zzbq(this, oVar, aVar));
    }
}
