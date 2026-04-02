package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakh  reason: invalid package */
/* loaded from: classes.dex */
final class zzakh implements zzalk {
    private static final zzakh zza = new zzakh();

    private zzakh() {
    }

    public static zzakh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final boolean zzb(Class<?> cls) {
        return zzakg.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final zzall zza(Class<?> cls) {
        if (zzakg.class.isAssignableFrom(cls)) {
            try {
                return (zzall) zzakg.zza((Class<zzakg>) cls.asSubclass(zzakg.class)).zza(zzakg.zze.zzc, (Object) null, (Object) null);
            } catch (Exception e7) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
