package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfqa {
    private final Context zza;
    private final Looper zzb;

    public zzfqa(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfqq zza = zzfqu.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(zzfqt.BLOCKED_IMPRESSION);
        zzfqn zza2 = zzfqo.zza();
        zza2.zzb(str);
        zza2.zza(zzfqm.BLOCKED_REASON_BACKGROUND);
        zza.zzb(zza2);
        new zzfqb(this.zza, this.zzb, (zzfqu) zza.zzbr()).zza();
    }
}
