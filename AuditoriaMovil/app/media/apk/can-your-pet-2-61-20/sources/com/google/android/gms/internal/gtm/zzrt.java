package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzrt {
    private final Map zza = new HashMap();
    private zzam zzb;

    private zzrt() {
    }

    public final zzrr zza() {
        return new zzrr(this.zza, this.zzb, null);
    }

    public final zzrt zzb(String str, zzam zzamVar) {
        this.zza.put(str, zzamVar);
        return this;
    }

    public final zzrt zzc(zzam zzamVar) {
        this.zzb = zzamVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrt(zzrs zzrsVar) {
    }
}
