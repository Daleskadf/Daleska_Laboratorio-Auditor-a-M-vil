package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        int i7 = 0;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    f.S(readInt, parcel);
                } else {
                    str = f.l(readInt, parcel);
                }
            } else {
                i7 = f.M(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzbw(i7, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbw[i7];
    }
}
