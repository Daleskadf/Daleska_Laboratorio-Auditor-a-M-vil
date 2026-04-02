package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbnk extends zzazp implements zzbnl {
    public zzbnk() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbno zzbnmVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzdq zzb = zzb();
            parcel2.writeNoException();
            zzazq.zzf(parcel2, zzb);
            return true;
        } else if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        } else if (i == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbnmVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbnmVar = queryLocalInterface instanceof zzbno ? (zzbno) queryLocalInterface : new zzbnm(readStrongBinder);
            }
            zzazq.zzc(parcel);
            zzf(asInterface, zzbnmVar);
            parcel2.writeNoException();
            return true;
        } else if (i == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzazq.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        } else if (i != 7) {
            return false;
        } else {
            zzbhb zzc = zzc();
            parcel2.writeNoException();
            zzazq.zzf(parcel2, zzc);
            return true;
        }
    }
}
