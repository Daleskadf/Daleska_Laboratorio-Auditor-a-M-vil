package com.google.android.recaptcha.internal;

import F6.C0081c0;
import F6.C0097k0;
import F6.D;
import F6.H;
import F6.P;
import K6.e;
import K6.o;
import M6.f;
import h3.AbstractC1079a;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class zzbi {
    private final D zza;
    private final D zzb;
    private final D zzc;
    private final D zzd;

    public zzbi() {
        C0097k0 c0097k0 = new C0097k0(null);
        f fVar = P.f1237a;
        this.zza = new e(AbstractC1079a.q(c0097k0, o.f2797a));
        e b5 = H.b(new C0081c0(Executors.newSingleThreadExecutor()));
        H.q(b5, null, new zzbh(null), 3);
        this.zzb = b5;
        this.zzc = H.b(P.f1238b);
        e b7 = H.b(new C0081c0(Executors.newSingleThreadExecutor()));
        H.q(b7, null, new zzbg(null), 3);
        this.zzd = b7;
    }

    public final D zza() {
        return this.zzc;
    }

    public final D zzb() {
        return this.zza;
    }

    public final D zzc() {
        return this.zzd;
    }

    public final D zzd() {
        return this.zzb;
    }
}
