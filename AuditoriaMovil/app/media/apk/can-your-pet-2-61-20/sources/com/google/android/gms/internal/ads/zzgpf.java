package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgpf {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgpf(zzgoz zzgozVar, zzgpe zzgpeVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgozVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgozVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgozVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgozVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgft zza(zzgoy zzgoyVar, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        zzgpb zzgpbVar = new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null);
        if (!this.zzb.containsKey(zzgpbVar)) {
            String obj = zzgpbVar.toString();
            throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
        }
        return ((zzgmw) this.zzb.get(zzgpbVar)).zza(zzgoyVar, zzggnVar);
    }

    public final zzggi zzb(zzgoy zzgoyVar) throws GeneralSecurityException {
        zzgpb zzgpbVar = new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null);
        if (!this.zzd.containsKey(zzgpbVar)) {
            String obj = zzgpbVar.toString();
            throw new GeneralSecurityException("No Parameters Parser for requested key type " + obj + " available");
        }
        return ((zzgny) this.zzd.get(zzgpbVar)).zza(zzgoyVar);
    }

    public final zzgoy zzc(zzgft zzgftVar, Class cls, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgftVar.getClass(), cls, null);
        if (!this.zza.containsKey(zzgpdVar)) {
            String obj = zzgpdVar.toString();
            throw new GeneralSecurityException("No Key serializer for " + obj + " available");
        }
        return ((zzgna) this.zza.get(zzgpdVar)).zza(zzgftVar, zzggnVar);
    }

    public final zzgoy zzd(zzggi zzggiVar, Class cls) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzggiVar.getClass(), cls, null);
        if (!this.zzc.containsKey(zzgpdVar)) {
            String obj = zzgpdVar.toString();
            throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
        }
        return ((zzgoc) this.zzc.get(zzgpdVar)).zza(zzggiVar);
    }

    public final boolean zzi(zzgoy zzgoyVar) {
        return this.zzb.containsKey(new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null));
    }

    public final boolean zzj(zzgoy zzgoyVar) {
        return this.zzd.containsKey(new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null));
    }
}
