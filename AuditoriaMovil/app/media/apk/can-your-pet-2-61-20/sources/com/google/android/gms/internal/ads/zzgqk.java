package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgqk {
    @Nullable
    private Integer zza = null;
    @Nullable
    private Integer zzb = null;
    private zzgql zzc = null;
    private zzgqm zzd = zzgqm.zzd;

    private zzgqk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgqk(zzgqj zzgqjVar) {
    }

    public final zzgqk zza(zzgql zzgqlVar) {
        this.zzc = zzgqlVar;
        return this;
    }

    public final zzgqk zzb(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgqk zzc(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzgqk zzd(zzgqm zzgqmVar) {
        this.zzd = zzgqmVar;
        return this;
    }

    public final zzgqo zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    if (this.zzd == null) {
                        throw new GeneralSecurityException("variant is not set");
                    }
                    if (num.intValue() < 16) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
                    }
                    int intValue = this.zzb.intValue();
                    zzgql zzgqlVar = this.zzc;
                    if (intValue < 10) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                    }
                    if (zzgqlVar == zzgql.zza) {
                        if (intValue > 20) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                        }
                    } else if (zzgqlVar == zzgql.zzb) {
                        if (intValue > 28) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                        }
                    } else if (zzgqlVar == zzgql.zzc) {
                        if (intValue > 32) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                        }
                    } else if (zzgqlVar == zzgql.zzd) {
                        if (intValue > 48) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                        }
                    } else if (zzgqlVar != zzgql.zze) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                    } else {
                        if (intValue > 64) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                        }
                    }
                    return new zzgqo(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }
}
