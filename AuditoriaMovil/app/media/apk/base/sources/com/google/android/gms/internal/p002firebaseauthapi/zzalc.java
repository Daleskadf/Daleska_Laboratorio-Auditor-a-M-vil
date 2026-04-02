package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalc  reason: invalid package */
/* loaded from: classes.dex */
final class zzalc implements zzalk {
    private zzalk[] zza;

    public zzalc(zzalk... zzalkVarArr) {
        this.zza = zzalkVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final zzall zza(Class<?> cls) {
        zzalk[] zzalkVarArr;
        for (zzalk zzalkVar : this.zza) {
            if (zzalkVar.zzb(cls)) {
                return zzalkVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final boolean zzb(Class<?> cls) {
        for (zzalk zzalkVar : this.zza) {
            if (zzalkVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
