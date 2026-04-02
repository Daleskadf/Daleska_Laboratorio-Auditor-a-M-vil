package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbbs extends zzazo implements zzbbu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzd(zzbbr zzbbrVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbbrVar);
        zzdc(1, zza);
    }
}
