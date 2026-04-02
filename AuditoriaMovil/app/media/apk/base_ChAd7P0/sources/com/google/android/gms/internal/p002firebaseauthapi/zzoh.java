package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoh  reason: invalid package */
/* loaded from: classes.dex */
public final class zzoh {
    private static final zzoh zza = new zzoh();
    private final Map<Class<? extends zzcg>, zzog<? extends zzcg>> zzb = new HashMap();

    public static zzoh zza() {
        return zza;
    }

    public final synchronized <ParametersT extends zzcg> void zza(zzog<ParametersT> zzogVar, Class<ParametersT> cls) {
        try {
            zzog<? extends zzcg> zzogVar2 = this.zzb.get(cls);
            if (zzogVar2 != null && !zzogVar2.equals(zzogVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zzogVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
