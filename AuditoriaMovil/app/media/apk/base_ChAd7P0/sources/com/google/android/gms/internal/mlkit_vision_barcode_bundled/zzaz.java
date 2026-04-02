package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import H4.e1;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzaz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzar zzarVar = null;
        zzau zzauVar = null;
        zzav zzavVar = null;
        zzax zzaxVar = null;
        zzaw zzawVar = null;
        zzas zzasVar = null;
        zzao zzaoVar = null;
        zzap zzapVar = null;
        zzaq zzaqVar = null;
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
                    zzarVar = (zzar) f.k(parcel, readInt, zzar.CREATOR);
                    break;
                case '\b':
                    zzauVar = (zzau) f.k(parcel, readInt, zzau.CREATOR);
                    break;
                case '\t':
                    zzavVar = (zzav) f.k(parcel, readInt, zzav.CREATOR);
                    break;
                case '\n':
                    zzaxVar = (zzax) f.k(parcel, readInt, zzax.CREATOR);
                    break;
                case 11:
                    zzawVar = (zzaw) f.k(parcel, readInt, zzaw.CREATOR);
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    zzasVar = (zzas) f.k(parcel, readInt, zzas.CREATOR);
                    break;
                case '\r':
                    zzaoVar = (zzao) f.k(parcel, readInt, zzao.CREATOR);
                    break;
                case 14:
                    zzapVar = (zzap) f.k(parcel, readInt, zzap.CREATOR);
                    break;
                case 15:
                    zzaqVar = (zzaq) f.k(parcel, readInt, zzaq.CREATOR);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzay(i7, str, str2, bArr, pointArr, i8, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzay[i7];
    }
}
