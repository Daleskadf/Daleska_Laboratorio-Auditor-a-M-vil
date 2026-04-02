package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzen implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = StringUtils.EMPTY;
        ArrayList arrayList = null;
        PendingIntent pendingIntent = null;
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
                    pendingIntent = (PendingIntent) f.k(parcel, readInt, PendingIntent.CREATOR);
                }
            } else {
                arrayList = f.n(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzem(arrayList, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzem[i7];
    }
}
