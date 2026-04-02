package com.google.android.gms.internal.location;

import W2.d;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        zze zzeVar = null;
        int i7 = 0;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 3) {
                    if (c8 != 4) {
                        if (c8 != 6) {
                            if (c8 != 7) {
                                if (c8 != '\b') {
                                    f.S(readInt, parcel);
                                } else {
                                    arrayList = f.p(parcel, readInt, d.CREATOR);
                                }
                            } else {
                                zzeVar = (zze) f.k(parcel, readInt, zze.CREATOR);
                            }
                        } else {
                            str3 = f.l(readInt, parcel);
                        }
                    } else {
                        str2 = f.l(readInt, parcel);
                    }
                } else {
                    str = f.l(readInt, parcel);
                }
            } else {
                i7 = f.M(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zze(i7, str, str2, str3, arrayList, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zze[i7];
    }
}
