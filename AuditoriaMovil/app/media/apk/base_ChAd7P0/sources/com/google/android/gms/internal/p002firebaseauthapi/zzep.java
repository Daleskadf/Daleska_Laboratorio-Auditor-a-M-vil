package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import j$.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzep  reason: invalid package */
/* loaded from: classes.dex */
public final class zzep extends zzcr {
    private final String zza;
    private final zza zzb;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzep$zza */
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

    private zzep(String str, zza zzaVar) {
        this.zza = str;
        this.zzb = zzaVar;
    }

    public static zzep zza(String str, zza zzaVar) {
        return new zzep(str, zzaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzep)) {
            return false;
        }
        zzep zzepVar = (zzep) obj;
        if (!zzepVar.zza.equals(this.zza) || !zzepVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzep.class, this.zza, this.zzb);
    }

    public final String toString() {
        return b.j("LegacyKmsAead Parameters (keyUri: ", this.zza, ", variant: ", String.valueOf(this.zzb), ")");
    }

    public final zza zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zzb != zza.zzb;
    }
}
