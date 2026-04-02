package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpt */
/* loaded from: classes.dex */
public final class zzpt {
    private final Map<zzpu, zznh<?, ?>> zza;
    private final Map<zzpv, zznd<?>> zzb;
    private final Map<zzpu, zzou<?, ?>> zzc;
    private final Map<zzpv, zzoq<?>> zzd;

    /* JADX INFO: Access modifiers changed from: private */
    public zzpt(zzps zzpsVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzpsVar.zza;
        this.zza = new HashMap(map);
        map2 = zzpsVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzpsVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzpsVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final <SerializationT extends zzpq> zzbo zza(SerializationT serializationt, zzcm zzcmVar) {
        zzpv zzpvVar = new zzpv(serializationt.getClass(), serializationt.zzb());
        if (this.zzb.containsKey(zzpvVar)) {
            return this.zzb.get(zzpvVar).zza(serializationt, zzcmVar);
        }
        throw new GeneralSecurityException(AbstractC0059i.M("No Key Parser for requested key type ", String.valueOf(zzpvVar), " available"));
    }

    public final <SerializationT extends zzpq> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzpv(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzpq> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzpv(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzpq> zzcg zza(SerializationT serializationt) {
        zzpv zzpvVar = new zzpv(serializationt.getClass(), serializationt.zzb());
        if (this.zzd.containsKey(zzpvVar)) {
            return this.zzd.get(zzpvVar).zza(serializationt);
        }
        throw new GeneralSecurityException(AbstractC0059i.M("No Parameters Parser for requested key type ", String.valueOf(zzpvVar), " available"));
    }

    public final <KeyT extends zzbo, SerializationT extends zzpq> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzcm zzcmVar) {
        zzpu zzpuVar = new zzpu(keyt.getClass(), cls);
        if (this.zza.containsKey(zzpuVar)) {
            return (SerializationT) this.zza.get(zzpuVar).zza(keyt, zzcmVar);
        }
        throw new GeneralSecurityException(AbstractC0059i.M("No Key serializer for ", String.valueOf(zzpuVar), " available"));
    }

    public final <ParametersT extends zzcg, SerializationT extends zzpq> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        zzpu zzpuVar = new zzpu(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzpuVar)) {
            return (SerializationT) this.zzc.get(zzpuVar).zza(parameterst);
        }
        throw new GeneralSecurityException(AbstractC0059i.M("No Key Format serializer for ", String.valueOf(zzpuVar), " available"));
    }
}
