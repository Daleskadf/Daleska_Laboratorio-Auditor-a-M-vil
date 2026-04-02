package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        String str2 = null;
        int i7 = 0;
        String str3 = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 2) {
                if (c8 != 3) {
                    if (c8 != 4) {
                        if (c8 != 5) {
                            f.S(readInt, parcel);
                        } else {
                            str2 = f.l(readInt, parcel);
                        }
                    } else {
                        str3 = f.l(readInt, parcel);
                    }
                } else {
                    str = f.l(readInt, parcel);
                }
            } else {
                i7 = f.M(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzn(i7, str, str3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzn[i7];
    }
}
