package com.google.android.gms.tagmanager;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzay implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(zzbd zzbdVar, List list, long j) {
        this.zzc = zzbdVar;
        this.zza = list;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzl(this.zza, this.zzb);
    }
}
