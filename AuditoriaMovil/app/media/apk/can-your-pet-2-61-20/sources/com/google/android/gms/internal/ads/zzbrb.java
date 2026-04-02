package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbrb extends zzazo implements zzbrd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzA() throws RemoteException {
        Parcel zzdb = zzdb(18, zza());
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzB() throws RemoteException {
        Parcel zzdb = zzdb(17, zza());
        boolean zzg = zzazq.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final double zze() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final float zzf() throws RemoteException {
        Parcel zzdb = zzdb(23, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final float zzg() throws RemoteException {
        Parcel zzdb = zzdb(25, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final float zzh() throws RemoteException {
        Parcel zzdb = zzdb(24, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final Bundle zzi() throws RemoteException {
        Parcel zzdb = zzdb(16, zza());
        Bundle bundle = (Bundle) zzazq.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.ads.internal.client.zzdq zzj() throws RemoteException {
        Parcel zzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbgx zzk() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        zzbgx zzj = zzbgw.zzj(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbhe zzl() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        zzbhe zzg = zzbhd.zzg(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzdb = zzdb(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final IObjectWrapper zzo() throws RemoteException {
        Parcel zzdb = zzdb(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzp() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzq() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzr() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzs() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzt() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzu() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final List zzv() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzazq.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzx() throws RemoteException {
        zzdc(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, iObjectWrapper2);
        zzazq.zzf(zza, iObjectWrapper3);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(22, zza);
    }
}
