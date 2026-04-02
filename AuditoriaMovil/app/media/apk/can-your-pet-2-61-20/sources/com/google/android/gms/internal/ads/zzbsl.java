package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbsl extends zzazo implements zzbsn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final zzbtc zzf() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(zzdb, zzbtc.CREATOR);
        zzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final zzbtc zzg() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(zzdb, zzbtc.CREATOR);
        zzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbsq zzbsqVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzazq.zzd(zza, bundle);
        zzazq.zzd(zza, bundle2);
        zzazq.zzd(zza, zzqVar);
        zzazq.zzf(zza, zzbsqVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbry zzbryVar, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbryVar);
        zzazq.zzf(zza, zzbquVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsb zzbsbVar, zzbqu zzbquVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbsbVar);
        zzazq.zzf(zza, zzbquVar);
        zzazq.zzd(zza, zzqVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsb zzbsbVar, zzbqu zzbquVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbsbVar);
        zzazq.zzf(zza, zzbquVar);
        zzazq.zzd(zza, zzqVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbse zzbseVar, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbseVar);
        zzazq.zzf(zza, zzbquVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsh zzbshVar, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbshVar);
        zzazq.zzf(zza, zzbquVar);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsh zzbshVar, zzbqu zzbquVar, zzbgt zzbgtVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbshVar);
        zzazq.zzf(zza, zzbquVar);
        zzazq.zzd(zza, zzbgtVar);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsk zzbskVar, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbskVar);
        zzazq.zzf(zza, zzbquVar);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsk zzbskVar, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzd(zza, zzlVar);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbskVar);
        zzazq.zzf(zza, zzbquVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(24, zza);
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(15, zza);
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
