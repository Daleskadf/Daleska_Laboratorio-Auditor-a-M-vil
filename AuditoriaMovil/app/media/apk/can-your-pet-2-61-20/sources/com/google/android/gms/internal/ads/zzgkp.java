package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgkp extends zzggs {
    private final zzgkv zza;
    private final zzgxn zzb;
    private final zzgxm zzc;
    @Nullable
    private final Integer zzd;

    private zzgkp(zzgkv zzgkvVar, zzgxn zzgxnVar, zzgxm zzgxmVar, @Nullable Integer num) {
        this.zza = zzgkvVar;
        this.zzb = zzgxnVar;
        this.zzc = zzgxmVar;
        this.zzd = num;
    }

    public static zzgkp zza(zzgku zzgkuVar, zzgxn zzgxnVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgxm zzb;
        zzgku zzgkuVar2 = zzgku.zzc;
        if (zzgkuVar != zzgkuVar2 && num == null) {
            String obj = zzgkuVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgkuVar != zzgkuVar2 || num == null) {
            if (zzgxnVar.zza() == 32) {
                zzgkv zzc = zzgkv.zzc(zzgkuVar);
                if (zzc.zzb() == zzgkuVar2) {
                    zzb = zzgxm.zzb(new byte[0]);
                } else if (zzc.zzb() == zzgku.zzb) {
                    zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (zzc.zzb() == zzgku.zza) {
                    zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
                }
                return new zzgkp(zzc, zzgxnVar, zzb, num);
            }
            int zza = zzgxnVar.zza();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }

    public final zzgkv zzb() {
        return this.zza;
    }

    public final zzgxm zzc() {
        return this.zzc;
    }

    public final zzgxn zzd() {
        return this.zzb;
    }

    @Nullable
    public final Integer zze() {
        return this.zzd;
    }
}
