package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f = 0.0f;
        byte[] bArr = null;
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
                                z9 = f.F(readInt, parcel);
                            }
                        } else {
                            f = f.J(readInt, parcel);
                        }
                    } else {
                        z8 = f.F(readInt, parcel);
                    }
                } else {
                    bArr = f.f(readInt, parcel);
                }
            } else {
                z7 = f.F(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzbr(z7, bArr, z8, f, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbr[i7];
    }
}
