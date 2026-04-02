package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbi  reason: invalid package */
/* loaded from: classes.dex */
public final class zzbi {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwl.zza zzaVar) {
        int i7 = zzbh.zza[zzaVar.zzf().ordinal()];
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                if (i7 == 4) {
                    return zza;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            return zzor.zzb(zzaVar.zza()).zzb();
        }
        return zzor.zza(zzaVar.zza()).zzb();
    }
}
