package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzamw extends RuntimeException {
    public zzamw(zzaln zzalnVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzakm zza() {
        return new zzakm(getMessage());
    }
}
