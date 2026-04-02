package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        zzh zzhVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i7 = 1;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        if (c8 != 4) {
                            f.S(readInt, parcel);
                        } else {
                            iBinder2 = f.L(readInt, parcel);
                        }
                    } else {
                        iBinder = f.L(readInt, parcel);
                    }
                } else {
                    zzhVar = (zzh) f.k(parcel, readInt, zzh.CREATOR);
                }
            } else {
                i7 = f.M(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzj(i7, zzhVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzj[i7];
    }
}
