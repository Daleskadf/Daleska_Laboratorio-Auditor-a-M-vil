package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgih {
    @Nullable
    private Integer zza = null;
    @Nullable
    private Integer zzb = null;
    @Nullable
    private Integer zzc = null;
    private zzgii zzd = zzgii.zzc;

    private zzgih() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgih(zzgig zzgigVar) {
    }

    public final zzgih zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgih zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgih zzd(zzgii zzgiiVar) {
        this.zzd = zzgiiVar;
        return this;
    }

    public final zzgik zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc == null) {
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    int intValue = num.intValue();
                    this.zzb.intValue();
                    this.zzc.intValue();
                    return new zzgik(intValue, 12, 16, this.zzd, null);
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final zzgih zzb(int i) throws GeneralSecurityException {
        if (i == 16 || i == 24 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
    }
}
