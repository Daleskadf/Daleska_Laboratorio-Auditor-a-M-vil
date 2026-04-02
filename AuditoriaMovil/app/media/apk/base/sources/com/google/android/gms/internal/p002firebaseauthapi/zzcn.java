package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import com.google.android.gms.internal.p002firebaseauthapi.zzwo;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcn  reason: invalid package */
/* loaded from: classes.dex */
final class zzcn {
    static {
        Charset.forName("UTF-8");
    }

    public static zzwo zza(zzwl zzwlVar) {
        zzwo.zzb zza = zzwo.zza().zza(zzwlVar.zzb());
        for (zzwl.zza zzaVar : zzwlVar.zze()) {
            zza.zza((zzwo.zza) ((zzakg) zzwo.zza.zza().zza(zzaVar.zzb().zzf()).zza(zzaVar.zzc()).zza(zzaVar.zzf()).zza(zzaVar.zza()).zze()));
        }
        return (zzwo) ((zzakg) zza.zze());
    }

    public static void zzb(zzwl zzwlVar) {
        int zzb = zzwlVar.zzb();
        int i7 = 0;
        boolean z7 = false;
        boolean z8 = true;
        for (zzwl.zza zzaVar : zzwlVar.zze()) {
            if (zzaVar.zzc() == zzwc.ENABLED) {
                if (zzaVar.zzg()) {
                    if (zzaVar.zzf() != zzxd.UNKNOWN_PREFIX) {
                        if (zzaVar.zzc() != zzwc.UNKNOWN_STATUS) {
                            if (zzaVar.zza() == zzb) {
                                if (!z7) {
                                    z7 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (zzaVar.zzb().zzb() != zzwb.zza.ASYMMETRIC_PUBLIC) {
                                z8 = false;
                            }
                            i7++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zza())));
                }
            }
        }
        if (i7 != 0) {
            if (!z7 && !z8) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
