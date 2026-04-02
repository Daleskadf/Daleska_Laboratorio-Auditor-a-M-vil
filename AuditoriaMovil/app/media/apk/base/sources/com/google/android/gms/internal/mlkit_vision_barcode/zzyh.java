package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzyh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        zzxw zzxwVar = null;
        String str = null;
        String str2 = null;
        zzxx[] zzxxVarArr = null;
        zzxu[] zzxuVarArr = null;
        String[] strArr = null;
        zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzxwVar = (zzxw) f.k(parcel, readInt, zzxw.CREATOR);
                    break;
                case 2:
                    str = f.l(readInt, parcel);
                    break;
                case 3:
                    str2 = f.l(readInt, parcel);
                    break;
                case 4:
                    zzxxVarArr = (zzxx[]) f.o(parcel, readInt, zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (zzxu[]) f.o(parcel, readInt, zzxu.CREATOR);
                    break;
                case 6:
                    strArr = f.m(readInt, parcel);
                    break;
                case 7:
                    zzxpVarArr = (zzxp[]) f.o(parcel, readInt, zzxp.CREATOR);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzxs(zzxwVar, str, str2, zzxxVarArr, zzxuVarArr, strArr, zzxpVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzxs[i7];
    }
}
