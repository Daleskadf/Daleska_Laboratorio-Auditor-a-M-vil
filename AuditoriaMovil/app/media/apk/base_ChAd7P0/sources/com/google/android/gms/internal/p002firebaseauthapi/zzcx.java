package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdc;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcx  reason: invalid package */
/* loaded from: classes.dex */
public final class zzcx extends zzcp {
    private final zzdc zza;
    private final zzzo zzb;
    private final zzzo zzc;
    private final zzzn zzd;
    private final Integer zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcx$zza */
    /* loaded from: classes.dex */
    public static class zza {
        private zzdc zza;
        private zzzo zzb;
        private zzzo zzc;
        private Integer zzd;

        public final zza zza(zzzo zzzoVar) {
            this.zzb = zzzoVar;
            return this;
        }

        public final zza zzb(zzzo zzzoVar) {
            this.zzc = zzzoVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdc zzdcVar) {
            this.zza = zzdcVar;
            return this;
        }

        public final zzcx zza() {
            zzzn zzb;
            zzdc zzdcVar = this.zza;
            if (zzdcVar != null) {
                if (this.zzb != null && this.zzc != null) {
                    if (zzdcVar.zzb() == this.zzb.zza()) {
                        if (this.zza.zzc() == this.zzc.zza()) {
                            if (this.zza.zza() && this.zzd == null) {
                                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                            }
                            if (!this.zza.zza() && this.zzd != null) {
                                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                            }
                            if (this.zza.zzh() == zzdc.zzc.zzc) {
                                zzb = zzor.zza;
                            } else if (this.zza.zzh() == zzdc.zzc.zzb) {
                                zzb = zzor.zza(this.zzd.intValue());
                            } else if (this.zza.zzh() == zzdc.zzc.zza) {
                                zzb = zzor.zzb(this.zzd.intValue());
                            } else {
                                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                            }
                            return new zzcx(this.zza, this.zzb, this.zzc, zzb, this.zzd);
                        }
                        throw new GeneralSecurityException("HMAC key size mismatch");
                    }
                    throw new GeneralSecurityException("AES key size mismatch");
                }
                throw new GeneralSecurityException("Cannot build without key material");
            }
            throw new GeneralSecurityException("Cannot build without parameters");
        }
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zze;
    }

    public final zzdc zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzd;
    }

    public final zzzo zze() {
        return this.zzb;
    }

    public final zzzo zzf() {
        return this.zzc;
    }

    private zzcx(zzdc zzdcVar, zzzo zzzoVar, zzzo zzzoVar2, zzzn zzznVar, Integer num) {
        this.zza = zzdcVar;
        this.zzb = zzzoVar;
        this.zzc = zzzoVar2;
        this.zzd = zzznVar;
        this.zze = num;
    }
}
