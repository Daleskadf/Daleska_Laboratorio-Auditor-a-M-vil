package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbwo extends zzazo implements zzbwq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zze(zzbwi zzbwiVar, zzbwt zzbwtVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbwiVar);
        zzazq.zzf(zza, zzbwtVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzf(zzbwe zzbweVar, zzbwt zzbwtVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbweVar);
        zzazq.zzf(zza, zzbwtVar);
        zzdc(1, zza);
    }
}
