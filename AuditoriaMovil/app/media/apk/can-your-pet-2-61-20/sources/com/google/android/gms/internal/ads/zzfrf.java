package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfrf extends zzazo implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfrd zze(zzfrb zzfrbVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzfrbVar);
        Parcel zzdb = zzdb(1, zza);
        zzfrd zzfrdVar = (zzfrd) zzazq.zza(zzdb, zzfrd.CREATOR);
        zzdb.recycle();
        return zzfrdVar;
    }

    public final zzfrm zzf(zzfrk zzfrkVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzfrkVar);
        Parcel zzdb = zzdb(3, zza);
        zzfrm zzfrmVar = (zzfrm) zzazq.zza(zzdb, zzfrm.CREATOR);
        zzdb.recycle();
        return zzfrmVar;
    }

    public final void zzg(zzfqy zzfqyVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzfqyVar);
        zzdc(2, zza);
    }
}
