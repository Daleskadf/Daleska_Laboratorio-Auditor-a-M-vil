package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        int i7 = -1;
        int i8 = 0;
        short s7 = 0;
        int i9 = 0;
        long j = 0;
        float f = 0.0f;
        double d7 = 0.0d;
        double d8 = 0.0d;
        String str = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = f.l(readInt, parcel);
                    break;
                case 2:
                    j = f.O(readInt, parcel);
                    break;
                case 3:
                    f.h0(parcel, readInt, 4);
                    s7 = (short) parcel.readInt();
                    break;
                case 4:
                    d7 = f.H(readInt, parcel);
                    break;
                case 5:
                    d8 = f.H(readInt, parcel);
                    break;
                case 6:
                    f = f.J(readInt, parcel);
                    break;
                case 7:
                    i8 = f.M(readInt, parcel);
                    break;
                case '\b':
                    i9 = f.M(readInt, parcel);
                    break;
                case '\t':
                    i7 = f.M(readInt, parcel);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzek(str, i8, s7, d7, d8, f, j, i9, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzek[i7];
    }
}
