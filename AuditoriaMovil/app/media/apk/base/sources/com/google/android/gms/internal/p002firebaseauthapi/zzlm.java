package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlm  reason: invalid package */
/* loaded from: classes.dex */
public final class zzlm implements zzbm {
    private zzlm(zzzn zzznVar, zzlo zzloVar, zzlp zzlpVar, zzll zzllVar, zzzn zzznVar2) {
        zzznVar.zzb();
        zzznVar2.zzb();
    }

    public static zzbm zza(zzkf zzkfVar) {
        zzju zzb = zzkfVar.zzb();
        return new zzlm(zzkfVar.zzd(), zza(zzb.zze()), zza(zzb.zzd()), zza(zzb.zzb()), zzkfVar.zzc());
    }

    public static zzll zza(zzju.zza zzaVar) {
        if (zzaVar.equals(zzju.zza.zza)) {
            return new zzku(16);
        }
        if (zzaVar.equals(zzju.zza.zzb)) {
            return new zzku(32);
        }
        if (zzaVar.equals(zzju.zza.zzc)) {
            return new zzkx();
        }
        throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
    }

    public static zzlp zza(zzju.zze zzeVar) {
        if (zzeVar.equals(zzju.zze.zza)) {
            return new zzli("HmacSha256");
        }
        if (zzeVar.equals(zzju.zze.zzb)) {
            return new zzli("HmacSha384");
        }
        if (zzeVar.equals(zzju.zze.zzc)) {
            return new zzli("HmacSha512");
        }
        throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
    }

    public static zzlo zza(zzju.zzd zzdVar) {
        if (zzdVar.equals(zzju.zzd.zzd)) {
            return new zzme(new zzli("HmacSha256"));
        }
        if (zzdVar.equals(zzju.zzd.zza)) {
            return zzmb.zza(zzyl.NIST_P256);
        }
        if (zzdVar.equals(zzju.zzd.zzb)) {
            return zzmb.zza(zzyl.NIST_P384);
        }
        if (zzdVar.equals(zzju.zzd.zzc)) {
            return zzmb.zza(zzyl.NIST_P521);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }
}
