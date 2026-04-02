package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdvv extends zzbyp {
    final /* synthetic */ zzdvx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvv(zzdvx zzdvxVar) {
        this.zza = zzdvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zze(int i) throws RemoteException {
        zzdvm zzdvmVar;
        long j;
        zzdvx zzdvxVar = this.zza;
        zzdvmVar = zzdvxVar.zzb;
        j = zzdvxVar.zza;
        zzdvmVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdvm zzdvmVar;
        long j;
        zzdvx zzdvxVar = this.zza;
        zzdvmVar = zzdvxVar.zzb;
        j = zzdvxVar.zza;
        zzdvmVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzg() throws RemoteException {
        zzdvm zzdvmVar;
        long j;
        zzdvx zzdvxVar = this.zza;
        zzdvmVar = zzdvxVar.zzb;
        j = zzdvxVar.zza;
        zzdvmVar.zzp(j);
    }
}
