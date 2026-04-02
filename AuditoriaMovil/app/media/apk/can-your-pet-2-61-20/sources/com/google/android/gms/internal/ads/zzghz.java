package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzghz {
    @Nullable
    private zzgik zza = null;
    @Nullable
    private zzgxn zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzghz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzghz(zzghy zzghyVar) {
    }

    public final zzghz zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghz zzb(zzgxn zzgxnVar) {
        this.zzb = zzgxnVar;
        return this;
    }

    public final zzghz zzc(zzgik zzgikVar) {
        this.zza = zzgikVar;
        return this;
    }

    public final zzgib zzd() throws GeneralSecurityException {
        zzgxn zzgxnVar;
        zzgxm zzb;
        zzgik zzgikVar = this.zza;
        if (zzgikVar == null || (zzgxnVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgikVar.zzb() == zzgxnVar.zza()) {
            if (!zzgikVar.zza() || this.zzc != null) {
                if (this.zza.zza() || this.zzc == null) {
                    if (this.zza.zzd() == zzgii.zzc) {
                        zzb = zzgxm.zzb(new byte[0]);
                    } else if (this.zza.zzd() == zzgii.zzb) {
                        zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                    } else if (this.zza.zzd() != zzgii.zza) {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
                    } else {
                        zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    }
                    return new zzgib(this.zza, this.zzb, zzb, this.zzc, null);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
