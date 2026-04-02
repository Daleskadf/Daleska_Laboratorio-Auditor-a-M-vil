package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzew;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzex  reason: invalid package */
/* loaded from: classes.dex */
public class zzex extends zzcp {
    private final zzew zza;
    private final zzzn zzb;
    private final Integer zzc;

    private zzex(zzew zzewVar, zzzn zzznVar, Integer num) {
        this.zza = zzewVar;
        this.zzb = zzznVar;
        this.zzc = num;
    }

    public static zzex zza(zzew zzewVar, Integer num) {
        zzzn zzb;
        if (zzewVar.zzc() == zzew.zzc.zzb) {
            if (num == null) {
                zzb = zzor.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzewVar.zzc() != zzew.zzc.zza) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzewVar.zzc())));
        } else {
            if (num != null) {
                zzb = zzor.zzb(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        }
        return new zzex(zzewVar, zzb, num);
    }

    public final zzew zzb() {
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
