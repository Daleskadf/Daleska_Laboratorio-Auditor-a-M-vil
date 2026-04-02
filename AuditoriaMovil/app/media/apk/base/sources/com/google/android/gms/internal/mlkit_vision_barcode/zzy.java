package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        zzp zzpVar = null;
        String str = null;
        String str2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArr = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    zzpVar = (zzp) f.k(parcel, readInt, zzp.CREATOR);
                    break;
                case 3:
                    str = f.l(readInt, parcel);
                    break;
                case 4:
                    str2 = f.l(readInt, parcel);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) f.o(parcel, readInt, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) f.o(parcel, readInt, zzn.CREATOR);
                    break;
                case 7:
                    strArr = f.m(readInt, parcel);
                    break;
                case '\b':
                    zziVarArr = (zzi[]) f.o(parcel, readInt, zzi.CREATOR);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzl(zzpVar, str, str2, zzqVarArr, zznVarArr, strArr, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzl[i7];
    }
}
