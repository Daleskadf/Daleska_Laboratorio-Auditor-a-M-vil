package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbwl extends zzazp implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbww zzbwwVar = null;
        if (i == 1) {
            zzbwb zzbwbVar = (zzbwb) zzazq.zza(parcel, zzbwb.CREATOR);
            zzazq.zzc(parcel);
            parcel2.writeNoException();
            zzazq.zze(parcel2, null);
        } else if (i == 2) {
            zzbwb zzbwbVar2 = (zzbwb) zzazq.zza(parcel, zzbwb.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbwn) {
                    zzbwn zzbwnVar = (zzbwn) queryLocalInterface;
                }
            }
            zzazq.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbxd zzbxdVar = (zzbxd) zzazq.zza(parcel, zzbxd.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwwVar = queryLocalInterface2 instanceof zzbww ? (zzbww) queryLocalInterface2 : new zzbwu(readStrongBinder2);
            }
            zzazq.zzc(parcel);
            zzg(zzbxdVar, zzbwwVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbxd zzbxdVar2 = (zzbxd) zzazq.zza(parcel, zzbxd.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwwVar = queryLocalInterface3 instanceof zzbww ? (zzbww) queryLocalInterface3 : new zzbwu(readStrongBinder3);
            }
            zzazq.zzc(parcel);
            zzf(zzbxdVar2, zzbwwVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbxd zzbxdVar3 = (zzbxd) zzazq.zza(parcel, zzbxd.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwwVar = queryLocalInterface4 instanceof zzbww ? (zzbww) queryLocalInterface4 : new zzbwu(readStrongBinder4);
            }
            zzazq.zzc(parcel);
            zze(zzbxdVar3, zzbwwVar);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwwVar = queryLocalInterface5 instanceof zzbww ? (zzbww) queryLocalInterface5 : new zzbwu(readStrongBinder5);
            }
            zzazq.zzc(parcel);
            zzh(readString, zzbwwVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
