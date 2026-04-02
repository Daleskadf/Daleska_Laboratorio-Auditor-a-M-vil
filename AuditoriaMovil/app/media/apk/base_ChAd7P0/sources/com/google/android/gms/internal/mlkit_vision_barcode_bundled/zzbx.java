package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = f.l(readInt, parcel);
                    break;
                case 2:
                    str2 = f.l(readInt, parcel);
                    break;
                case 3:
                    str3 = f.l(readInt, parcel);
                    break;
                case 4:
                    str4 = f.l(readInt, parcel);
                    break;
                case 5:
                    str5 = f.l(readInt, parcel);
                    break;
                case 6:
                    str6 = f.l(readInt, parcel);
                    break;
                case 7:
                    str7 = f.l(readInt, parcel);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzat(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzat[i7];
    }
}
