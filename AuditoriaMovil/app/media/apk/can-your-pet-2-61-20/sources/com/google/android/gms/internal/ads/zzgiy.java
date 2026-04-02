package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgiy extends zzggs {
    private final zzgjd zza;
    private final zzgxn zzb;
    private final zzgxm zzc;
    @Nullable
    private final Integer zzd;

    private zzgiy(zzgjd zzgjdVar, zzgxn zzgxnVar, zzgxm zzgxmVar, @Nullable Integer num) {
        this.zza = zzgjdVar;
        this.zzb = zzgxnVar;
        this.zzc = zzgxmVar;
        this.zzd = num;
    }

    public static zzgiy zza(zzgjc zzgjcVar, zzgxn zzgxnVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgxm zzb;
        zzgjc zzgjcVar2 = zzgjc.zzc;
        if (zzgjcVar != zzgjcVar2 && num == null) {
            String obj = zzgjcVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgjcVar != zzgjcVar2 || num == null) {
            if (zzgxnVar.zza() == 32) {
                zzgjd zzc = zzgjd.zzc(zzgjcVar);
                if (zzc.zzb() == zzgjcVar2) {
                    zzb = zzgxm.zzb(new byte[0]);
                } else if (zzc.zzb() == zzgjc.zzb) {
                    zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (zzc.zzb() == zzgjc.zza) {
                    zzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
                }
                return new zzgiy(zzc, zzgxnVar, zzb, num);
            }
            int zza = zzgxnVar.zza();
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }

    public final zzgjd zzb() {
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
