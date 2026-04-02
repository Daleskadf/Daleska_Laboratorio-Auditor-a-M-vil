package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.z;
/* loaded from: classes.dex */
public abstract class zzao extends zzb implements zzap {
    public zzao() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static zzap zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (queryLocalInterface instanceof zzap) {
            return (zzap) queryLocalInterface;
        }
        return new zzan(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        zzc.zzc(parcel);
        z zzb = zzb(readInt, readInt2, readInt3);
        parcel2.writeNoException();
        if (zzb == null) {
            parcel2.writeInt(0);
        } else {
            parcel2.writeInt(1);
            zzb.writeToParcel(parcel2, 1);
        }
        return true;
    }
}
