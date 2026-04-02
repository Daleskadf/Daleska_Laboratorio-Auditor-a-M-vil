package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqs;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql  reason: invalid package */
/* loaded from: classes.dex */
public final class zzql extends zzqv {
    private final zzqs zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql$zza */
    /* loaded from: classes.dex */
    public static class zza {
        private zzqs zza;
        private zzzo zzb;
        private Integer zzc;

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzzo zzzoVar) {
            this.zzb = zzzoVar;
            return this;
        }

        public final zza zza(zzqs zzqsVar) {
            this.zza = zzqsVar;
            return this;
        }

        public final zzql zza() {
            zzzn zza;
            zzqs zzqsVar = this.zza;
            if (zzqsVar != null && this.zzb != null) {
                if (zzqsVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzqs.zzc.zzd) {
                        zza = zzor.zza;
                    } else if (this.zza.zzf() != zzqs.zzc.zzc && this.zza.zzf() != zzqs.zzc.zzb) {
                        if (this.zza.zzf() == zzqs.zzc.zza) {
                            zza = zzor.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                        }
                    } else {
                        zza = zzor.zza(this.zzc.intValue());
                    }
                    return new zzql(this.zza, this.zzb, zza, this.zzc);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzd;
    }

    public final zzqs zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final zzzo zze() {
        return this.zzb;
    }

    private zzql(zzqs zzqsVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzqsVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }
}
