package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        zzbr zzbrVar = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                f.S(readInt, parcel);
            } else {
                zzbrVar = (zzbr) f.k(parcel, readInt, zzbr.CREATOR);
            }
        }
        f.s(T7, parcel);
        return new zzbe(zzbrVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbe[i7];
    }
}
