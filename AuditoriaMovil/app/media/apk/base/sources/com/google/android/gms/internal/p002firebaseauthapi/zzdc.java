package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdc  reason: invalid package */
/* loaded from: classes.dex */
public final class zzdc extends zzcr {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzc zze;
    private final zza zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdc$zza */
    /* loaded from: classes.dex */
    public static final class zza {
        public static final zza zza = new zza("SHA1");
        public static final zza zzb = new zza("SHA224");
        public static final zza zzc = new zza("SHA256");
        public static final zza zzd = new zza("SHA384");
        public static final zza zze = new zza("SHA512");
        private final String zzf;

        private zza(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdc$zzb */
    /* loaded from: classes.dex */
    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private Integer zzd;
        private zza zze;
        private zzc zzf;

        public final zzb zza(int i7) {
            if (i7 != 16 && i7 != 24 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        public final zzb zzb(int i7) {
            if (i7 >= 16) {
                this.zzb = Integer.valueOf(i7);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i7)));
        }

        public final zzb zzc(int i7) {
            if (i7 >= 12 && i7 <= 16) {
                this.zzc = Integer.valueOf(i7);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i7)));
        }

        public final zzb zzd(int i7) {
            if (i7 >= 10) {
                this.zzd = Integer.valueOf(i7);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i7)));
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = zzc.zzc;
        }

        public final zzb zza(zza zzaVar) {
            this.zze = zzaVar;
            return this;
        }

        public final zzb zza(zzc zzcVar) {
            this.zzf = zzcVar;
            return this;
        }

        public final zzdc zza() {
            if (this.zza != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        Integer num = this.zzd;
                        if (num != null) {
                            if (this.zze != null) {
                                if (this.zzf != null) {
                                    int intValue = num.intValue();
                                    zza zzaVar = this.zze;
                                    if (zzaVar == zza.zza) {
                                        if (intValue > 20) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                        }
                                    } else if (zzaVar == zza.zzb) {
                                        if (intValue > 28) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                        }
                                    } else if (zzaVar == zza.zzc) {
                                        if (intValue > 32) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                        }
                                    } else if (zzaVar == zza.zzd) {
                                        if (intValue > 48) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                        }
                                    } else if (zzaVar != zza.zze) {
                                        throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                    } else {
                                        if (intValue > 64) {
                                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                        }
                                    }
                                    return new zzdc(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze);
                                }
                                throw new GeneralSecurityException("variant is not set");
                            }
                            throw new GeneralSecurityException("hash type is not set");
                        }
                        throw new GeneralSecurityException("tag size is not set");
                    }
                    throw new GeneralSecurityException("iv size is not set");
                }
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            throw new GeneralSecurityException("AES key size is not set");
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdc$zzc */
    /* loaded from: classes.dex */
    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("CRUNCHY");
        public static final zzc zzc = new zzc("NO_PREFIX");
        private final String zzd;

        private zzc(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static zzb zzf() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdc)) {
            return false;
        }
        zzdc zzdcVar = (zzdc) obj;
        if (zzdcVar.zza != this.zza || zzdcVar.zzb != this.zzb || zzdcVar.zzc != this.zzc || zzdcVar.zzd != this.zzd || zzdcVar.zze != this.zze || zzdcVar.zzf != this.zzf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzdc.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(this.zzf);
        int i7 = this.zzc;
        int i8 = this.zzd;
        int i9 = this.zza;
        int i10 = this.zzb;
        StringBuilder l8 = b.l("AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2, ", ");
        l8.append(i7);
        l8.append("-byte IV, and ");
        l8.append(i8);
        l8.append("-byte tags, and ");
        l8.append(i9);
        l8.append("-byte AES key, and ");
        l8.append(i10);
        l8.append("-byte HMAC key)");
        return l8.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zze != zzc.zzc) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zza zzg() {
        return this.zzf;
    }

    public final zzc zzh() {
        return this.zze;
    }

    private zzdc(int i7, int i8, int i9, int i10, zzc zzcVar, zza zzaVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = zzcVar;
        this.zzf = zzaVar;
    }
}
