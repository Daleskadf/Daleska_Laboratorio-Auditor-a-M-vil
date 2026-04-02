package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbwk extends zzazo implements zzbwm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(zzbxd zzbxdVar, zzbww zzbwwVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbxdVar);
        zzazq.zzf(zza, zzbwwVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(zzbxd zzbxdVar, zzbww zzbwwVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbxdVar);
        zzazq.zzf(zza, zzbwwVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(zzbxd zzbxdVar, zzbww zzbwwVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbxdVar);
        zzazq.zzf(zza, zzbwwVar);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh(String str, zzbww zzbwwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzazq.zzf(zza, zzbwwVar);
        zzdc(7, zza);
    }
}
