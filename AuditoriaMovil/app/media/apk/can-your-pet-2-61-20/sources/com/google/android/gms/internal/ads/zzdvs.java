package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvs extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzdvm zza;
    final /* synthetic */ zzdvt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvs(zzdvt zzdvtVar, zzdvm zzdvmVar) {
        this.zza = zzdvmVar;
        this.zzb = zzdvtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j;
        zzdvt zzdvtVar = this.zzb;
        zzdvm zzdvmVar = this.zza;
        j = zzdvtVar.zza;
        zzdvmVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j;
        zzdvt zzdvtVar = this.zzb;
        zzdvm zzdvmVar = this.zza;
        j = zzdvtVar.zza;
        zzdvmVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        long j;
        zzdvt zzdvtVar = this.zzb;
        zzdvm zzdvmVar = this.zza;
        j = zzdvtVar.zza;
        zzdvmVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdvt zzdvtVar = this.zzb;
        zzdvm zzdvmVar = this.zza;
        j = zzdvtVar.zza;
        zzdvmVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        long j;
        zzdvt zzdvtVar = this.zzb;
        zzdvm zzdvmVar = this.zza;
        j = zzdvtVar.zza;
        zzdvmVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j;
        zzdvt zzdvtVar = this.zzb;
        zzdvm zzdvmVar = this.zza;
        j = zzdvtVar.zza;
        zzdvmVar.zzg(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
