package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzep;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzen  reason: invalid package */
/* loaded from: classes.dex */
public class zzen extends zzcp {
    private final zzep zza;
    private final zzzn zzb;
    private final Integer zzc;

    private zzen(zzep zzepVar, zzzn zzznVar, Integer num) {
        this.zza = zzepVar;
        this.zzb = zzznVar;
        this.zzc = num;
    }

    public static zzen zza(zzep zzepVar, Integer num) {
        zzzn zza;
        if (zzepVar.zzb() == zzep.zza.zza) {
            if (num != null) {
                zza = zzzn.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzepVar.zzb() != zzep.zza.zzb) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzepVar.zzb())));
        } else {
            if (num == null) {
                zza = zzzn.zza(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        }
        return new zzen(zzepVar, zza, num);
    }

    public final zzep zzb() {
        return this.zza;
    }

    public final zzzn zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzc;
    }
}
