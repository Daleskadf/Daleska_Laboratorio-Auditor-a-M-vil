package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqu;
import com.google.android.gms.internal.ads.zzaqz;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbj implements zzaqu {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(zzbq zzbqVar, String str, zzbn zzbnVar) {
        this.zza = str;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zza(zzaqz zzaqzVar) {
        String zzaqzVar2 = zzaqzVar.toString();
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load URL: " + this.zza + "\n" + zzaqzVar2);
        this.zzb.zza((Object) null);
    }
}
