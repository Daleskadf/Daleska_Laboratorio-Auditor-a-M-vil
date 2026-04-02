package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0758g;
import j3.f;
import java.util.List;
import p3.C1667g;
/* loaded from: classes.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        C1667g c1667g = zzh.zzb;
        List list = zzh.zza;
        String str = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        f.S(readInt, parcel);
                    } else {
                        str = f.l(readInt, parcel);
                    }
                } else {
                    list = f.p(parcel, readInt, C0758g.CREATOR);
                }
            } else {
                c1667g = (C1667g) f.k(parcel, readInt, C1667g.CREATOR);
            }
        }
        f.s(T7, parcel);
        return new zzh(c1667g, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzh[i7];
    }
}
