package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgom {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgom(zzgoi zzgoiVar, zzgol zzgolVar) {
        Map map;
        Map map2;
        map = zzgoiVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgoiVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            String obj = cls.toString();
            throw new GeneralSecurityException("No input primitive class for " + obj + " available");
        }
        return ((zzggj) this.zzb.get(cls)).zza();
    }

    public final Object zzb(zzgft zzgftVar, Class cls) throws GeneralSecurityException {
        zzgok zzgokVar = new zzgok(zzgftVar.getClass(), cls, null);
        if (!this.zza.containsKey(zzgokVar)) {
            String obj = zzgokVar.toString();
            throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
        }
        return ((zzgog) this.zza.get(zzgokVar)).zza(zzgftVar);
    }

    public final Object zzc(zzgos zzgosVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzggj zzggjVar = (zzggj) this.zzb.get(cls);
        if (!zzgosVar.zzd().equals(zzggjVar.zza()) || !zzggjVar.zza().equals(zzgosVar.zzd())) {
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        return zzggjVar.zzc(zzgosVar);
    }
}
