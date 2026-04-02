package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzab {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzak zzb;
    private Long zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzak zzakVar, boolean z) {
        this.zzb = zzakVar;
        this.zza = z;
    }

    public final boolean zza(Container container) {
        Clock clock;
        zzal zzalVar;
        if (!this.zza) {
            return !container.isDefault();
        }
        long lastRefreshTime = container.getLastRefreshTime();
        if (this.zzc == null) {
            zzalVar = this.zzb.zzi;
            this.zzc = Long.valueOf(zzalVar.zza());
        }
        clock = this.zzb.zza;
        return lastRefreshTime + this.zzc.longValue() >= clock.currentTimeMillis();
    }
}
