package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhbv {
    private static final zzhbv zza = new zzhbv();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhch zzb = new zzhbd();

    private zzhbv() {
    }

    public static zzhbv zza() {
        return zza;
    }

    public final zzhcg zzb(Class cls) {
        zzhai.zzc(cls, "messageType");
        zzhcg zzhcgVar = (zzhcg) this.zzc.get(cls);
        if (zzhcgVar == null) {
            zzhcgVar = this.zzb.zza(cls);
            zzhai.zzc(cls, "messageType");
            zzhcg zzhcgVar2 = (zzhcg) this.zzc.putIfAbsent(cls, zzhcgVar);
            if (zzhcgVar2 != null) {
                return zzhcgVar2;
            }
        }
        return zzhcgVar;
    }
}
