package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbyl extends zzazp implements zzbym {
    public zzbyl() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbyg zzbyeVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbyeVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbyeVar = queryLocalInterface instanceof zzbyg ? (zzbyg) queryLocalInterface : new zzbye(readStrongBinder);
                }
                zzazq.zzc(parcel);
                zzk(zzbyeVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzazq.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                zzazq.zzc(parcel);
                zzi((com.google.android.gms.ads.internal.client.zze) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
