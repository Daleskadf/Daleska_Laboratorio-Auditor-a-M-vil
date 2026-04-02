package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznq  reason: invalid package */
/* loaded from: classes.dex */
public final class zznq {
    private HashMap<String, String> zza = new HashMap<>();

    public final zznr zza() {
        if (this.zza != null) {
            zznr zznrVar = new zznr(DesugarCollections.unmodifiableMap(this.zza));
            this.zza = null;
            return zznrVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
