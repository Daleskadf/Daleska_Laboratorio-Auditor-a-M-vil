package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzcd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        long j = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        if (c8 != 4) {
                            if (c8 != 5) {
                                f.S(readInt, parcel);
                            } else {
                                j = f.O(readInt, parcel);
                            }
                        } else {
                            i10 = f.M(readInt, parcel);
                        }
                    } else {
                        i9 = f.M(readInt, parcel);
                    }
                } else {
                    i8 = f.M(readInt, parcel);
                }
            } else {
                i7 = f.M(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzcc(i7, i8, i9, i10, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzcc[i7];
    }
}
