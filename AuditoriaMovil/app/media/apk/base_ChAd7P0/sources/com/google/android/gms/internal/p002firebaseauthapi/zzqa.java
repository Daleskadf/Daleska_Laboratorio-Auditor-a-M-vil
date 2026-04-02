package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqf;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqa  reason: invalid package */
/* loaded from: classes.dex */
public final class zzqa extends zzqv {
    private final zzqf zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqa$zza */
    /* loaded from: classes.dex */
    public static class zza {
        private zzqf zza;
        private zzzo zzb;
        private Integer zzc;

        public final zza zza(zzzo zzzoVar) {
            this.zzb = zzzoVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzqf zzqfVar) {
            this.zza = zzqfVar;
            return this;
        }

        public final zzqa zza() {
            zzzn zza;
            zzqf zzqfVar = this.zza;
            if (zzqfVar != null && this.zzb != null) {
                if (zzqfVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zze() == zzqf.zza.zzd) {
                        zza = zzor.zza;
                    } else if (this.zza.zze() != zzqf.zza.zzc && this.zza.zze() != zzqf.zza.zzb) {
                        if (this.zza.zze() == zzqf.zza.zza) {
                            zza = zzor.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                        }
                    } else {
                        zza = zzor.zza(this.zzc.intValue());
                    }
                    return new zzqa(this.zza, this.zzb, zza, this.zzc);
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

    public final zzqf zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final zzzo zze() {
        return this.zzb;
    }

    private zzqa(zzqf zzqfVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzqfVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }
}
