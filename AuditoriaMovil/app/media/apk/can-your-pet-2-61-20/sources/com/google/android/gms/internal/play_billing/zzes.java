package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzes {
    private static final zzes zza = new zzes();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzew zzb = new zzec();

    private zzes() {
    }

    public static zzes zza() {
        return zza;
    }

    public final zzev zzb(Class cls) {
        zzdl.zzc(cls, "messageType");
        zzev zzevVar = (zzev) this.zzc.get(cls);
        if (zzevVar == null) {
            zzevVar = this.zzb.zza(cls);
            zzdl.zzc(cls, "messageType");
            zzev zzevVar2 = (zzev) this.zzc.putIfAbsent(cls, zzevVar);
            if (zzevVar2 != null) {
                return zzevVar2;
            }
        }
        return zzevVar;
    }
}
