package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaju  reason: invalid package */
/* loaded from: classes.dex */
final class zzaju {
    private final Object zza;
    private final int zzb;

    public zzaju(Object obj, int i7) {
        this.zza = obj;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaju)) {
            return false;
        }
        zzaju zzajuVar = (zzaju) obj;
        if (this.zza != zzajuVar.zza || this.zzb != zzajuVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
