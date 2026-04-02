package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        double d7 = 0.0d;
        double d8 = 0.0d;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    f.S(readInt, parcel);
                } else {
                    d8 = f.H(readInt, parcel);
                }
            } else {
                d7 = f.H(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzas(d7, d8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzas[i7];
    }
}
