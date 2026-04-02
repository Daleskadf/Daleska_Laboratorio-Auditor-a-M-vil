package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import j$.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeg  reason: invalid package */
/* loaded from: classes.dex */
public final class zzeg extends zzcr {
    private final zza zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeg$zza */
    /* loaded from: classes.dex */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzeg(zza zzaVar) {
        this.zza = zzaVar;
    }

    public static zzeg zza(zza zzaVar) {
        return new zzeg(zzaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzeg) || ((zzeg) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzeg.class, this.zza);
    }

    public final String toString() {
        return AbstractC0059i.M("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.zza), ")");
    }

    public final zza zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
