package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        int i7 = 0;
        String str = null;
        int i8 = 0;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        f.S(readInt, parcel);
                    } else {
                        i8 = f.M(readInt, parcel);
                    }
                } else {
                    str = f.l(readInt, parcel);
                }
            } else {
                i7 = f.M(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzav(i7, str, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzav[i7];
    }
}
