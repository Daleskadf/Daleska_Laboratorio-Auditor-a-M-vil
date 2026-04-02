package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbbt extends zzazp implements zzbbu {
    public zzbbt() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbbu zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbbu ? (zzbbu) queryLocalInterface : new zzbbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbbr zzbbpVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbbpVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbbpVar = queryLocalInterface instanceof zzbbr ? (zzbbr) queryLocalInterface : new zzbbp(readStrongBinder);
            }
            zzazq.zzc(parcel);
            zzd(zzbbpVar);
        } else if (i == 2) {
            parcel.readInt();
            zzazq.zzc(parcel);
        } else if (i != 3) {
            return false;
        } else {
            zzazq.zzc(parcel);
            zzc((com.google.android.gms.ads.internal.client.zze) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
