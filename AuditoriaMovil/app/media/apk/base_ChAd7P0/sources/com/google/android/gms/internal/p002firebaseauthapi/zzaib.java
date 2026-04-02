package com.google.android.gms.internal.p002firebaseauthapi;

import H4.e1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j3.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaib  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaib implements Parcelable.Creator<zzaic> {
    @Override // android.os.Parcelable.Creator
    public final zzaic createFromParcel(Parcel parcel) {
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
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
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
                    z7 = f.F(readInt, parcel);
                    break;
                case 11:
                    z8 = f.F(readInt, parcel);
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    str9 = f.l(readInt, parcel);
                    break;
                case '\r':
                    str10 = f.l(readInt, parcel);
                    break;
                case 14:
                    str11 = f.l(readInt, parcel);
                    break;
                case 15:
                    str12 = f.l(readInt, parcel);
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    z9 = f.F(readInt, parcel);
                    break;
                case 17:
                    str13 = f.l(readInt, parcel);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzaic(str, str2, str3, str4, str5, str6, str7, str8, z7, z8, str9, str10, str11, str12, z9, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic[] newArray(int i7) {
        return new zzaic[i7];
    }
}
