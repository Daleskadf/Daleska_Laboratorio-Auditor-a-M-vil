package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdr  reason: invalid package */
/* loaded from: classes.dex */
public final class zzdr extends zzcr {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zza zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdr$zza */
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdr$zzb */
    /* loaded from: classes.dex */
    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zza zzd;

        public final zzb zza(int i7) {
            this.zzb = 12;
            return this;
        }

        public final zzb zzb(int i7) {
            if (i7 != 16 && i7 != 24 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        public final zzb zzc(int i7) {
            this.zzc = 16;
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zza.zzc;
        }

        public final zzb zza(zza zzaVar) {
            this.zzd = zzaVar;
            return this;
        }

        public final zzdr zza() {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzd != null) {
                    if (this.zzb != null) {
                        if (this.zzc != null) {
                            return new zzdr(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
                        }
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    throw new GeneralSecurityException("IV size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static zzb zze() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdr)) {
            return false;
        }
        zzdr zzdrVar = (zzdr) obj;
        if (zzdrVar.zza != this.zza || zzdrVar.zzb != this.zzb || zzdrVar.zzc != this.zzc || zzdrVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzdr.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i7 = this.zzb;
        int i8 = this.zzc;
        int i9 = this.zza;
        return "AesGcm Parameters (variant: " + valueOf + ", " + i7 + "-byte IV, " + i8 + "-byte tag, and " + i9 + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzd != zza.zzc) {
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

    public final int zzd() {
        return this.zzc;
    }

    public final zza zzf() {
        return this.zzd;
    }

    private zzdr(int i7, int i8, int i9, zza zzaVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = zzaVar;
    }
}
