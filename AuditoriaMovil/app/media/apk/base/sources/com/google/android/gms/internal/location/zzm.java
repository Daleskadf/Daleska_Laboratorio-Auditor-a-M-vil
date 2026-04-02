package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j3.f;
/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        Status status = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                f.S(readInt, parcel);
            } else {
                status = (Status) f.k(parcel, readInt, Status.CREATOR);
            }
        }
        f.s(T7, parcel);
        return new zzl(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzl[i7];
    }
}
