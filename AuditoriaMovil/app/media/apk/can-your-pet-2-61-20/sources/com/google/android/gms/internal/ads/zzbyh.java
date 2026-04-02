package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbyh extends zzazo implements zzbyj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final Bundle zzb() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        Bundle bundle = (Bundle) zzazq.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbyg zzd() throws RemoteException {
        zzbyg zzbyeVar;
        Parcel zzdb = zzdb(11, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbyeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbyeVar = queryLocalInterface instanceof zzbyg ? (zzbyg) queryLocalInterface : new zzbye(readStrongBinder);
        }
        zzdb.recycle();
        return zzbyeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, zzbyqVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, zzbyqVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzazq.zza;
        zza.writeInt(z ? 1 : 0);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzddVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzdgVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzk(zzbym zzbymVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbymVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzl(zzbyx zzbyxVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbyxVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzp(zzbyr zzbyrVar) throws RemoteException {
        throw null;
    }
}
