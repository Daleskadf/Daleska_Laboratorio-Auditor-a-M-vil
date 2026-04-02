package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzggz {
    @Nullable
    private zzghl zza = null;
    @Nullable
    private zzgxn zzb = null;
    @Nullable
    private zzgxn zzc = null;
    @Nullable
    private Integer zzd = null;

    private zzggz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggz(zzggy zzggyVar) {
    }

    public final zzggz zza(zzgxn zzgxnVar) {
        this.zzb = zzgxnVar;
        return this;
    }

    public final zzggz zzb(zzgxn zzgxnVar) {
        this.zzc = zzgxnVar;
        return this;
    }

    public final zzggz zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzggz zzd(zzghl zzghlVar) {
        this.zza = zzghlVar;
        return this;
    }

    public final zzghb zze() throws GeneralSecurityException {
        zzgxm zzb;
        zzghl zzghlVar = this.zza;
        if (zzghlVar != null) {
            zzgxn zzgxnVar = this.zzb;
            if (zzgxnVar == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (zzghlVar.zzb() != zzgxnVar.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (zzghlVar.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (!this.zza.zza() || this.zzd != null) {
                if (this.zza.zza() || this.zzd == null) {
                    if (this.zza.zzh() == zzghj.zzc) {
                        zzb = zzgxm.zzb(new byte[0]);
                    } else if (this.zza.zzh() == zzghj.zzb) {
                        zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                    } else if (this.zza.zzh() != zzghj.zza) {
                        throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzh()))));
                    } else {
                        zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                    }
                    return new zzghb(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }
}
