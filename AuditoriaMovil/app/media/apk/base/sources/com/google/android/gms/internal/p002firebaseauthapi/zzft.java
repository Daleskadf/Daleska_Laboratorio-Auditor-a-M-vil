package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzft  reason: invalid package */
/* loaded from: classes.dex */
public final class zzft extends zzcr {
    private final zza zza;
    private final int zzb;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzft$zza */
    /* loaded from: classes.dex */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("NO_PREFIX");
        private final String zzc;

        private zza(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    private zzft(zza zzaVar, int i7) {
        this.zza = zzaVar;
        this.zzb = i7;
    }

    public static zzft zza(zza zzaVar, int i7) {
        if (i7 >= 8 && i7 <= 12) {
            return new zzft(zzaVar, i7);
        }
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        if (zzftVar.zza != this.zza || zzftVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzft.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        int i7 = this.zzb;
        return "X-AES-GCM Parameters (variant: " + valueOf + "salt_size_bytes: " + i7 + ")";
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zza zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza != zza.zzb;
    }
}
