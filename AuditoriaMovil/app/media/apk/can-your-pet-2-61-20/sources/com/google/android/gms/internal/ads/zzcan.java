package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcan extends zzazo implements zzcap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzazq.zzf(zza, iObjectWrapper3);
        Parcel zzdb = zzdb(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzf(IObjectWrapper iObjectWrapper, zzcat zzcatVar, zzcam zzcamVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzcatVar);
        zzazq.zzf(zza, zzcamVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzg(zzbvn zzbvnVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbvnVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbveVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbveVar);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbveVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbveVar);
        zzdc(5, zza);
    }
}
