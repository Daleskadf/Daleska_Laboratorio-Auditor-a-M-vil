package com.google.android.gms.measurement.internal;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhe implements com.google.android.gms.internal.measurement.zzo {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzgz zzb;

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.zzb.zzc;
        Map map2 = (Map) map.get(this.zza);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhe(zzgz zzgzVar, String str) {
        this.zza = str;
        this.zzb = zzgzVar;
    }
}
