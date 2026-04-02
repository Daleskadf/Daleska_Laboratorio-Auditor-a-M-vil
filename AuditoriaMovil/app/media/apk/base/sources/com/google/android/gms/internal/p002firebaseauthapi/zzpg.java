package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpg  reason: invalid package */
/* loaded from: classes.dex */
public final class zzpg<P> {
    private final Map<zzzn, List<zzpi<P>>> zza;
    private final zzpi<P> zzb;
    private final Class<P> zzc;
    private final zznr zzd;

    public final zznr zza() {
        return this.zzd;
    }

    public final zzpi<P> zzb() {
        return this.zzb;
    }

    public final Class<P> zzc() {
        return this.zzc;
    }

    public final Collection<List<zzpi<P>>> zzd() {
        return this.zza.values();
    }

    public final List<zzpi<P>> zze() {
        return zza(zzbi.zza);
    }

    public final boolean zzf() {
        if (!this.zzd.zza().isEmpty()) {
            return true;
        }
        return false;
    }

    private zzpg(Map<zzzn, List<zzpi<P>>> map, List<zzpi<P>> list, zzpi<P> zzpiVar, zznr zznrVar, Class<P> cls) {
        this.zza = map;
        this.zzb = zzpiVar;
        this.zzc = cls;
        this.zzd = zznrVar;
    }

    public static <P> zzpj<P> zza(Class<P> cls) {
        return new zzpj<>(cls);
    }

    public final List<zzpi<P>> zza(byte[] bArr) {
        List<zzpi<P>> list = this.zza.get(zzzn.zza(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
