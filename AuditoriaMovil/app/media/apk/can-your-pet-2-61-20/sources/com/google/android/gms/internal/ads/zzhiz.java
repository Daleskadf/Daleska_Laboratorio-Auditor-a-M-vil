package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhiz extends zzhir {
    private static final zzhje zza = zzhiw.zza(Collections.emptyMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhiz(Map map, zzhix zzhixVar) {
        super(map);
    }

    public static zzhiy zzc(int i) {
        return new zzhiy(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzhis.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhje) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
