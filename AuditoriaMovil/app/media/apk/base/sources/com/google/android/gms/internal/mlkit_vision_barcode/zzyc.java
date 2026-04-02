package com.google.android.gms.internal.mlkit_vision_barcode;

import H4.e1;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzxu zzxuVar = null;
        zzxx zzxxVar = null;
        zzxy zzxyVar = null;
        zzya zzyaVar = null;
        zzxz zzxzVar = null;
        zzxv zzxvVar = null;
        zzxr zzxrVar = null;
        zzxs zzxsVar = null;
        zzxt zzxtVar = null;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = f.M(readInt, parcel);
                    break;
                case 2:
                    str = f.l(readInt, parcel);
                    break;
                case 3:
                    str2 = f.l(readInt, parcel);
                    break;
                case 4:
                    bArr = f.f(readInt, parcel);
                    break;
                case 5:
                    pointArr = (Point[]) f.o(parcel, readInt, Point.CREATOR);
                    break;
                case 6:
                    i8 = f.M(readInt, parcel);
                    break;
                case 7:
                    zzxuVar = (zzxu) f.k(parcel, readInt, zzxu.CREATOR);
                    break;
                case '\b':
                    zzxxVar = (zzxx) f.k(parcel, readInt, zzxx.CREATOR);
                    break;
                case '\t':
                    zzxyVar = (zzxy) f.k(parcel, readInt, zzxy.CREATOR);
                    break;
                case '\n':
                    zzyaVar = (zzya) f.k(parcel, readInt, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) f.k(parcel, readInt, zzxz.CREATOR);
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    zzxvVar = (zzxv) f.k(parcel, readInt, zzxv.CREATOR);
                    break;
                case '\r':
                    zzxrVar = (zzxr) f.k(parcel, readInt, zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (zzxs) f.k(parcel, readInt, zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (zzxt) f.k(parcel, readInt, zzxt.CREATOR);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzyb(i7, str, str2, bArr, pointArr, i8, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzyb[i7];
    }
}
