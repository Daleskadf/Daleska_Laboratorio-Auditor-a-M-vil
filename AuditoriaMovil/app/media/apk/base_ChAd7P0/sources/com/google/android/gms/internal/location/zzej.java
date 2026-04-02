package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzej implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        zzeg zzegVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i7 = 1;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = f.M(readInt, parcel);
                    break;
                case 2:
                    zzegVar = (zzeg) f.k(parcel, readInt, zzeg.CREATOR);
                    break;
                case 3:
                    iBinder = f.L(readInt, parcel);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) f.k(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = f.L(readInt, parcel);
                    break;
                case 6:
                    iBinder3 = f.L(readInt, parcel);
                    break;
                case 7:
                default:
                    f.S(readInt, parcel);
                    break;
                case '\b':
                    str = f.l(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzei(i7, zzegVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzei[i7];
    }
}
