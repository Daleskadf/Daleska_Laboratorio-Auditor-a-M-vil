package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfc extends zzcey {
    public zzcfc(zzcdn zzcdnVar) {
        super(zzcdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzt(String str) {
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcdn zzcdnVar = (zzcdn) this.zzc.get();
        if (zzcdnVar != null && zzf != null) {
            zzcdnVar.zzt(zzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
