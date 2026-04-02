package com.google.android.gms.internal.location;

import H4.e1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0758g;
import com.google.android.gms.location.LocationRequest;
import j3.f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzeh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        long j = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 5) {
                    if (c8 != '\b') {
                        if (c8 != '\t') {
                            switch (c8) {
                                case 11:
                                    z9 = f.F(readInt, parcel);
                                    continue;
                                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                    z10 = f.F(readInt, parcel);
                                    continue;
                                case '\r':
                                    str = f.l(readInt, parcel);
                                    continue;
                                case 14:
                                    j = f.O(readInt, parcel);
                                    continue;
                                default:
                                    f.S(readInt, parcel);
                                    continue;
                            }
                        } else {
                            z8 = f.F(readInt, parcel);
                        }
                    } else {
                        z7 = f.F(readInt, parcel);
                    }
                } else {
                    arrayList = f.p(parcel, readInt, C0758g.CREATOR);
                }
            } else {
                locationRequest = (LocationRequest) f.k(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        f.s(T7, parcel);
        return new zzeg(locationRequest, arrayList, z7, z8, z9, z10, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzeg[i7];
    }
}
