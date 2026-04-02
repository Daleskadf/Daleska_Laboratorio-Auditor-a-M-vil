package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqf  reason: invalid package */
/* loaded from: classes.dex */
public final class zzqf extends zzqy {
    private final int zza;
    private final int zzb;
    private final zza zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqf$zza */
    /* loaded from: classes.dex */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("LEGACY");
        public static final zza zzd = new zza("NO_PREFIX");
        private final String zze;

        private zza(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqf$zzb */
    /* loaded from: classes.dex */
    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private zza zzc;

        public final zzb zza(int i7) {
            if (i7 != 16 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 << 3)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        public final zzb zzb(int i7) {
            if (i7 >= 10 && 16 >= i7) {
                this.zzb = Integer.valueOf(i7);
                return this;
            }
            throw new GeneralSecurityException(b.e(i7, "Invalid tag size for AesCmacParameters: "));
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zza.zzd;
        }

        public final zzb zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzqf zza() {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        return new zzqf(num.intValue(), this.zzb.intValue(), this.zzc);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }
    }

    public static zzb zzd() {
        return new zzb();
    }

    private final int zzf() {
        int i7;
        zza zzaVar = this.zzc;
        if (zzaVar == zza.zzd) {
            return this.zzb;
        }
        if (zzaVar == zza.zza) {
            i7 = this.zzb;
        } else if (zzaVar == zza.zzb) {
            i7 = this.zzb;
        } else if (zzaVar == zza.zzc) {
            i7 = this.zzb;
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return i7 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqf)) {
            return false;
        }
        zzqf zzqfVar = (zzqf) obj;
        if (zzqfVar.zza != this.zza || zzqfVar.zzf() != zzf() || zzqfVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzqf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i7 = this.zzb;
        int i8 = this.zza;
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte tags, and ");
        return AbstractC0059i.B(sb, i8, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzc != zza.zzd) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zza zze() {
        return this.zzc;
    }

    private zzqf(int i7, int i8, zza zzaVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = zzaVar;
    }
}
