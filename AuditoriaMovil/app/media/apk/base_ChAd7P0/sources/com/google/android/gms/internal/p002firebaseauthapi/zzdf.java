package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdf  reason: invalid package */
/* loaded from: classes.dex */
public final class zzdf extends zzcp {
    private final zzdk zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdf$zza */
    /* loaded from: classes.dex */
    public static class zza {
        private zzdk zza;
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

        public final zza zza(zzdk zzdkVar) {
            this.zza = zzdkVar;
            return this;
        }

        public final zzdf zza() {
            zzzn zzb;
            zzdk zzdkVar = this.zza;
            if (zzdkVar != null && this.zzb != null) {
                if (zzdkVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzdk.zzb.zzc) {
                        zzb = zzor.zza;
                    } else if (this.zza.zzf() == zzdk.zzb.zzb) {
                        zzb = zzor.zza(this.zzc.intValue());
                    } else if (this.zza.zzf() == zzdk.zzb.zza) {
                        zzb = zzor.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                    return new zzdf(this.zza, this.zzb, zzb, this.zzc);
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

    public final zzdk zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final zzzo zze() {
        return this.zzb;
    }

    private zzdf(zzdk zzdkVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzdkVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }
}
