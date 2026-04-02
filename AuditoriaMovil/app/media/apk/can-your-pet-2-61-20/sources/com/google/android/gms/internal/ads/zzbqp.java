package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbqp extends zzazo implements zzbqr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzazq.zzf(zza, zzbquVar);
        zzdc(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzazq.zzf(zza, zzbquVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzazq.zza;
        zza.writeInt(z ? 1 : 0);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final boolean zzM() throws RemoteException {
        Parcel zzdb = zzdb(22, zza());
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final boolean zzN() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbqz zzO() throws RemoteException {
        zzbqz zzbqzVar;
        Parcel zzdb = zzdb(15, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbqzVar = queryLocalInterface instanceof zzbqz ? (zzbqz) queryLocalInterface : new zzbqz(readStrongBinder);
        }
        zzdb.recycle();
        return zzbqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbra zzP() throws RemoteException {
        zzbra zzbraVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbraVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbraVar = queryLocalInterface instanceof zzbra ? (zzbra) queryLocalInterface : new zzbra(readStrongBinder);
        }
        zzdb.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzdb = zzdb(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbhy zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbqx zzj() throws RemoteException {
        zzbqx zzbqvVar;
        Parcel zzdb = zzdb(36, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbqvVar = queryLocalInterface instanceof zzbqx ? (zzbqx) queryLocalInterface : new zzbqv(readStrongBinder);
        }
        zzdb.recycle();
        return zzbqvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbrd zzk() throws RemoteException {
        zzbrd zzbrbVar;
        Parcel zzdb = zzdb(27, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbrbVar = queryLocalInterface instanceof zzbrd ? (zzbrd) queryLocalInterface : new zzbrb(readStrongBinder);
        }
        zzdb.recycle();
        return zzbrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbtc zzl() throws RemoteException {
        Parcel zzdb = zzdb(33, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(zzdb, zzbtc.CREATOR);
        zzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbtc zzm() throws RemoteException {
        Parcel zzdb = zzdb(34, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(zzdb, zzbtc.CREATOR);
        zzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbyb zzbybVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(null);
        zzazq.zzf(zza, zzbybVar);
        zza.writeString(str2);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzq(IObjectWrapper iObjectWrapper, zzbna zzbnaVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbnaVar);
        zza.writeTypedList(list);
        zzdc(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzr(IObjectWrapper iObjectWrapper, zzbyb zzbybVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbybVar);
        zza.writeStringList(list);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzazq.zzf(zza, zzbquVar);
        zzdc(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzqVar);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzf(zza, zzbquVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzqVar);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzf(zza, zzbquVar);
        zzdc(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzf(zza, zzbquVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar, zzbgt zzbgtVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzazq.zzf(zza, zzbquVar);
        zzazq.zzd(zza, zzbgtVar);
        zza.writeStringList(list);
        zzdc(14, zza);
    }
}
