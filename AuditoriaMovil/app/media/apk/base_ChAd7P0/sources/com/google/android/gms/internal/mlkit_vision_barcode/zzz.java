package com.google.android.gms.internal.mlkit_vision_barcode;

import H4.e1;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzz implements Parcelable.Creator {
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
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = f.l(readInt, parcel);
                    break;
                case 3:
                    str2 = f.l(readInt, parcel);
                    break;
                case 4:
                    str3 = f.l(readInt, parcel);
                    break;
                case 5:
                    str4 = f.l(readInt, parcel);
                    break;
                case 6:
                    str5 = f.l(readInt, parcel);
                    break;
                case 7:
                    str6 = f.l(readInt, parcel);
                    break;
                case '\b':
                    str7 = f.l(readInt, parcel);
                    break;
                case '\t':
                    str8 = f.l(readInt, parcel);
                    break;
                case '\n':
                    str9 = f.l(readInt, parcel);
                    break;
                case 11:
                    str10 = f.l(readInt, parcel);
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    str11 = f.l(readInt, parcel);
                    break;
                case '\r':
                    str12 = f.l(readInt, parcel);
                    break;
                case 14:
                    str13 = f.l(readInt, parcel);
                    break;
                case 15:
                    str14 = f.l(readInt, parcel);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzm(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzm[i7];
    }
}
