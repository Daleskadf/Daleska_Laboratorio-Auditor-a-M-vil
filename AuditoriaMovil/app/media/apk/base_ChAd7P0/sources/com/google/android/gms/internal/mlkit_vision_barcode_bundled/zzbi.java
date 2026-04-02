package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        zzat zzatVar = null;
        String str = null;
        String str2 = null;
        zzau[] zzauVarArr = null;
        zzar[] zzarVarArr = null;
        String[] strArr = null;
        zzam[] zzamVarArr = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzatVar = (zzat) f.k(parcel, readInt, zzat.CREATOR);
                    break;
                case 2:
                    str = f.l(readInt, parcel);
                    break;
                case 3:
                    str2 = f.l(readInt, parcel);
                    break;
                case 4:
                    zzauVarArr = (zzau[]) f.o(parcel, readInt, zzau.CREATOR);
                    break;
                case 5:
                    zzarVarArr = (zzar[]) f.o(parcel, readInt, zzar.CREATOR);
                    break;
                case 6:
                    strArr = f.m(readInt, parcel);
                    break;
                case 7:
                    zzamVarArr = (zzam[]) f.o(parcel, readInt, zzam.CREATOR);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzap(zzatVar, str, str2, zzauVarArr, zzarVarArr, strArr, zzamVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzap[i7];
    }
}
