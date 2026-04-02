package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpn  reason: invalid package */
/* loaded from: classes.dex */
public final class zzpn implements zzpq {
    private final String zza;
    private final zzzn zzb;
    private final zzaiw zzc;
    private final zzwb.zza zzd;
    private final zzxd zze;
    private final Integer zzf;

    private zzpn(String str, zzzn zzznVar, zzaiw zzaiwVar, zzwb.zza zzaVar, zzxd zzxdVar, Integer num) {
        this.zza = str;
        this.zzb = zzznVar;
        this.zzc = zzaiwVar;
        this.zzd = zzaVar;
        this.zze = zzxdVar;
        this.zzf = num;
    }

    public static zzpn zza(String str, zzaiw zzaiwVar, zzwb.zza zzaVar, zzxd zzxdVar, Integer num) {
        if (zzxdVar == zzxd.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzpn(str, zzpy.zza(str), zzaiwVar, zzaVar, zzxdVar, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpq
    public final zzzn zzb() {
        return this.zzb;
    }

    public final zzxd zzc() {
        return this.zze;
    }

    public final zzaiw zzd() {
        return this.zzc;
    }

    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    public final zzwb.zza zza() {
        return this.zzd;
    }
}
