package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzagv implements Parcelable.Creator<zzagw> {
    @Override // android.os.Parcelable.Creator
    public final zzagw createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        String str2 = null;
        Long l8 = null;
        String str3 = null;
        Long l9 = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 2) {
                if (c8 != 3) {
                    if (c8 != 4) {
                        if (c8 != 5) {
                            if (c8 != 6) {
                                f.S(readInt, parcel);
                            } else {
                                l9 = f.P(readInt, parcel);
                            }
                        } else {
                            str3 = f.l(readInt, parcel);
                        }
                    } else {
                        l8 = f.P(readInt, parcel);
                    }
                } else {
                    str2 = f.l(readInt, parcel);
                }
            } else {
                str = f.l(readInt, parcel);
            }
        }
        f.s(T7, parcel);
        return new zzagw(str, str2, l8, str3, l9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagw[] newArray(int i7) {
        return new zzagw[i7];
    }
}
