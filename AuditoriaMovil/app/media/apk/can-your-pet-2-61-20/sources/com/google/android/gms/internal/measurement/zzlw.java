package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlw {
    private static final zzlw zza = new zzlw();
    private final ConcurrentMap<Class<?>, zzma<?>> zzc = new ConcurrentHashMap();
    private final zzlz zzb = new zzkw();

    public static zzlw zza() {
        return zza;
    }

    public final <T> zzma<T> zza(Class<T> cls) {
        zzjy.zza(cls, "messageType");
        zzma<T> zzmaVar = (zzma<T>) this.zzc.get(cls);
        if (zzmaVar == null) {
            zzma<T> zza2 = this.zzb.zza(cls);
            zzjy.zza(cls, "messageType");
            zzjy.zza(zza2, "schema");
            zzma<T> zzmaVar2 = (zzma<T>) this.zzc.putIfAbsent(cls, zza2);
            return zzmaVar2 != null ? zzmaVar2 : zza2;
        }
        return zzmaVar;
    }

    public final <T> zzma<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzlw() {
    }
}
