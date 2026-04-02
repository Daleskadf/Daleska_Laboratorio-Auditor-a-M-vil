package com.google.android.gms.internal.mlkit_vision_barcode;

import H4.e1;
import H4.p1;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j3.f;
/* loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        double d7 = 0.0d;
        int i7 = 0;
        int i8 = 0;
        boolean z7 = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i7 = f.M(readInt, parcel);
                    break;
                case 3:
                    str = f.l(readInt, parcel);
                    break;
                case 4:
                    str2 = f.l(readInt, parcel);
                    break;
                case 5:
                    i8 = f.M(readInt, parcel);
                    break;
                case 6:
                    pointArr = (Point[]) f.o(parcel, readInt, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) f.k(parcel, readInt, zzn.CREATOR);
                    break;
                case '\b':
                    zzqVar = (zzq) f.k(parcel, readInt, zzq.CREATOR);
                    break;
                case '\t':
                    zzrVar = (zzr) f.k(parcel, readInt, zzr.CREATOR);
                    break;
                case '\n':
                    zztVar = (zzt) f.k(parcel, readInt, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) f.k(parcel, readInt, zzs.CREATOR);
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    zzoVar = (zzo) f.k(parcel, readInt, zzo.CREATOR);
                    break;
                case '\r':
                    zzkVar = (zzk) f.k(parcel, readInt, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) f.k(parcel, readInt, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) f.k(parcel, readInt, zzm.CREATOR);
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    bArr = f.f(readInt, parcel);
                    break;
                case 17:
                    z7 = f.F(readInt, parcel);
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    d7 = f.H(readInt, parcel);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzu(i7, str, str2, i8, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArr, z7, d7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzu[i7];
    }
}
