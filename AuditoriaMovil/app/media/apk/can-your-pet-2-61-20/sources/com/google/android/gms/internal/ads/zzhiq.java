package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzhiq {
    final LinkedHashMap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhiq(int i) {
        this.zza = zzhis.zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhiq zza(Object obj, zzhje zzhjeVar) {
        zzhjd.zza(obj, "key");
        zzhjd.zza(zzhjeVar, "provider");
        this.zza.put(obj, zzhjeVar);
        return this;
    }
}
