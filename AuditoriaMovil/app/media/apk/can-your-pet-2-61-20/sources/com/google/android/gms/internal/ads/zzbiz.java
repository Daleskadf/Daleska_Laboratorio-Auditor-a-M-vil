package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbiz extends zzazo implements zzbjb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzA() throws RemoteException {
        zzdc(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, bundle);
        zzdc(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzC() throws RemoteException {
        zzdc(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzcsVar);
        zzdc(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzdgVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzF(zzbiy zzbiyVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbiyVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final boolean zzG() throws RemoteException {
        Parcel zzdb = zzdb(30, zza());
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final boolean zzH() throws RemoteException {
        Parcel zzdb = zzdb(24, zza());
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, bundle);
        Parcel zzdb = zzdb(16, zza);
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final double zze() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final Bundle zzf() throws RemoteException {
        Parcel zzdb = zzdb(20, zza());
        Bundle bundle = (Bundle) zzazq.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel zzdb = zzdb(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final zzbgx zzi() throws RemoteException {
        zzbgx zzbgvVar;
        Parcel zzdb = zzdb(14, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbgvVar = queryLocalInterface instanceof zzbgx ? (zzbgx) queryLocalInterface : new zzbgv(readStrongBinder);
        }
        zzdb.recycle();
        return zzbgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final zzbhb zzj() throws RemoteException {
        zzbhb zzbgzVar;
        Parcel zzdb = zzdb(29, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbgzVar = queryLocalInterface instanceof zzbhb ? (zzbhb) queryLocalInterface : new zzbgz(readStrongBinder);
        }
        zzdb.recycle();
        return zzbgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final zzbhe zzk() throws RemoteException {
        zzbhe zzbhcVar;
        Parcel zzdb = zzdb(5, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbhcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbhcVar = queryLocalInterface instanceof zzbhe ? (zzbhe) queryLocalInterface : new zzbhc(readStrongBinder);
        }
        zzdb.recycle();
        return zzbhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzdb = zzdb(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzdb = zzdb(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzn() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzo() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzp() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzq() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzs() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzt() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final List zzu() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzazq.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final List zzv() throws RemoteException {
        Parcel zzdb = zzdb(23, zza());
        ArrayList zzb = zzazq.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzw() throws RemoteException {
        zzdc(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzx() throws RemoteException {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzcwVar);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, bundle);
        zzdc(15, zza);
    }
}
