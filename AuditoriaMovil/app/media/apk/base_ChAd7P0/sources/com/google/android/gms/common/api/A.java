package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class A implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9144a;

    public /* synthetic */ A(int i7) {
        this.f9144a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9144a) {
            case 0:
                int T7 = j3.f.T(parcel);
                String str = null;
                int i7 = 0;
                while (parcel.dataPosition() < T7) {
                    int readInt = parcel.readInt();
                    char c8 = (char) readInt;
                    if (c8 != 1) {
                        if (c8 != 2) {
                            j3.f.S(readInt, parcel);
                        } else {
                            str = j3.f.l(readInt, parcel);
                        }
                    } else {
                        i7 = j3.f.M(readInt, parcel);
                    }
                }
                j3.f.s(T7, parcel);
                return new Scope(i7, str);
            default:
                int T8 = j3.f.T(parcel);
                String str2 = null;
                W2.b bVar = null;
                int i8 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < T8) {
                    int readInt2 = parcel.readInt();
                    char c9 = (char) readInt2;
                    if (c9 != 1) {
                        if (c9 != 2) {
                            if (c9 != 3) {
                                if (c9 != 4) {
                                    j3.f.S(readInt2, parcel);
                                } else {
                                    bVar = (W2.b) j3.f.k(parcel, readInt2, W2.b.CREATOR);
                                }
                            } else {
                                pendingIntent = (PendingIntent) j3.f.k(parcel, readInt2, PendingIntent.CREATOR);
                            }
                        } else {
                            str2 = j3.f.l(readInt2, parcel);
                        }
                    } else {
                        i8 = j3.f.M(readInt2, parcel);
                    }
                }
                j3.f.s(T8, parcel);
                return new Status(i8, str2, pendingIntent, bVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f9144a) {
            case 0:
                return new Scope[i7];
            default:
                return new Status[i7];
        }
    }
}
