package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzea;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdt  reason: invalid package */
/* loaded from: classes.dex */
public final class zzdt extends zzcp {
    private final zzea zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdt$zza */
    /* loaded from: classes.dex */
    public static class zza {
        private zzea zza;
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

        public final zza zza(zzea zzeaVar) {
            this.zza = zzeaVar;
            return this;
        }

        public final zzdt zza() {
            zzzn zzb;
            zzea zzeaVar = this.zza;
            if (zzeaVar != null && this.zzb != null) {
                if (zzeaVar.zzb() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzd() == zzea.zzb.zzc) {
                        zzb = zzor.zza;
                    } else if (this.zza.zzd() == zzea.zzb.zzb) {
                        zzb = zzor.zza(this.zzc.intValue());
                    } else if (this.zza.zzd() == zzea.zzb.zza) {
                        zzb = zzor.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                    }
                    return new zzdt(this.zza, this.zzb, zzb, this.zzc);
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

    public final zzea zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final zzzo zze() {
        return this.zzb;
    }

    private zzdt(zzea zzeaVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzeaVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }
}
