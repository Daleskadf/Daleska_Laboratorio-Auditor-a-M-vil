package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzef implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        int i7 = 0;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        if (c8 != 4) {
                            if (c8 != 6) {
                                f.S(readInt, parcel);
                            } else {
                                str = f.l(readInt, parcel);
                            }
                        } else {
                            pendingIntent = (PendingIntent) f.k(parcel, readInt, PendingIntent.CREATOR);
                        }
                    } else {
                        iBinder2 = f.L(readInt, parcel);
                    }
                } else {
                    iBinder = f.L(readInt, parcel);
                }
            } else {
                i7 = f.M(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzee(i7, iBinder, iBinder2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzee[i7];
    }
}
