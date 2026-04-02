package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzok  reason: invalid package */
/* loaded from: classes.dex */
public final class zzok {
    private static final zzok zza = new zzok();
    private final Map<String, zzcg> zzb = new HashMap();

    public static zzok zza() {
        return zza;
    }

    private final synchronized void zza(String str, zzcg zzcgVar) {
        try {
            if (this.zzb.containsKey(str)) {
                if (this.zzb.get(str).equals(zzcgVar)) {
                    return;
                }
                String valueOf = String.valueOf(this.zzb.get(str));
                String valueOf2 = String.valueOf(zzcgVar);
                throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
            }
            this.zzb.put(str, zzcgVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza(Map<String, zzcg> map) {
        for (Map.Entry<String, zzcg> entry : map.entrySet()) {
            zza(entry.getKey(), entry.getValue());
        }
    }
}
