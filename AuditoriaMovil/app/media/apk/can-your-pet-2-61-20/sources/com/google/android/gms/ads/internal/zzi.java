package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqw;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzi implements zzfqw {
    final /* synthetic */ zzj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(zzj zzjVar) {
        this.zza = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zza(int i, long j) {
        zzfpp zzfppVar;
        zzfppVar = this.zza.zzi;
        zzfppVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzb(int i, long j, String str) {
        zzfpp zzfppVar;
        zzfppVar = this.zza.zzi;
        zzfppVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
