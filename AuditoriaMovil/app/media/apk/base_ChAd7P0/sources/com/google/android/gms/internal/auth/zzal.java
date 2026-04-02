package com.google.android.gms.internal.auth;

import O2.a;
import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.I;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
/* loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final r addWorkAccount(o oVar, String str) {
        return ((I) oVar).f9188b.doWrite((l) new zzae(this, a.f3847a, oVar, str));
    }

    public final r removeWorkAccount(o oVar, Account account) {
        return ((I) oVar).f9188b.doWrite((l) new zzag(this, a.f3847a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z7) {
        setWorkAuthenticatorEnabledWithResult(oVar, z7);
    }

    public final r setWorkAuthenticatorEnabledWithResult(o oVar, boolean z7) {
        return ((I) oVar).f9188b.doWrite((l) new zzac(this, a.f3847a, oVar, z7));
    }
}
