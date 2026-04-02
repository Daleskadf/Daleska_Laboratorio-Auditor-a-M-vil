package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import com.google.android.gms.internal.p002firebaseauthapi.zzfy;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzfv extends zzcp {
    private final zzfy zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    private zzfv(zzfy zzfyVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzfyVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }

    public static zzfv zza(zzfy.zza zzaVar, zzzo zzzoVar, Integer num) {
        zzzn zzb;
        zzfy.zza zzaVar2 = zzfy.zza.zzc;
        if (zzaVar == zzaVar2 || num != null) {
            if (zzaVar == zzaVar2 && num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            if (zzzoVar.zza() == 32) {
                zzfy zza = zzfy.zza(zzaVar);
                if (zza.zzb() == zzaVar2) {
                    zzb = zzor.zza;
                } else if (zza.zzb() == zzfy.zza.zzb) {
                    zzb = zzor.zza(num.intValue());
                } else if (zza.zzb() == zzfy.zza.zza) {
                    zzb = zzor.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zza.zzb())));
                }
                return new zzfv(zza, zzzoVar, zzb, num);
            }
            throw new GeneralSecurityException(b.e(zzzoVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        throw new GeneralSecurityException(AbstractC0059i.M("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
    }

    public final zzfy zzb() {
        return this.zza;
    }

    public final zzzn zzc() {
        return this.zzc;
    }

    public final zzzo zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzd;
    }
}
