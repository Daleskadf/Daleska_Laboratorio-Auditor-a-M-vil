package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        boolean z7 = false;
        zzbt zzbtVar = null;
        zzbv zzbvVar = null;
        boolean z8 = false;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        if (c8 != 4) {
                            f.S(readInt, parcel);
                        } else {
                            z8 = f.F(readInt, parcel);
                        }
                    } else {
                        z7 = f.F(readInt, parcel);
                    }
                } else {
                    zzbvVar = (zzbv) f.k(parcel, readInt, zzbv.CREATOR);
                }
            } else {
                zzbtVar = (zzbt) f.k(parcel, readInt, zzbt.CREATOR);
            }
        }
        f.s(T7, parcel);
        return new zzbc(zzbtVar, zzbvVar, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbc[i7];
    }
}
