package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbxu extends zzazo implements zzbxw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zze(zzbxq zzbxqVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbxqVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzf() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzh() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzi() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzj() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzk() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzl() throws RemoteException {
        zzdc(3, zza());
    }
}
