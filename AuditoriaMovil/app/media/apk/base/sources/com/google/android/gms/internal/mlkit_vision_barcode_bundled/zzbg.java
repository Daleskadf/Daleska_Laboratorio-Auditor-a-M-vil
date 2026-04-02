package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* loaded from: classes.dex */
public final class zzbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        String str = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = f.M(readInt, parcel);
                    break;
                case 2:
                    i8 = f.M(readInt, parcel);
                    break;
                case 3:
                    i9 = f.M(readInt, parcel);
                    break;
                case 4:
                    i10 = f.M(readInt, parcel);
                    break;
                case 5:
                    i11 = f.M(readInt, parcel);
                    break;
                case 6:
                    i12 = f.M(readInt, parcel);
                    break;
                case 7:
                    z7 = f.F(readInt, parcel);
                    break;
                case '\b':
                    str = f.l(readInt, parcel);
                    break;
                default:
                    f.S(readInt, parcel);
                    break;
            }
        }
        f.s(T7, parcel);
        return new zzan(i7, i8, i9, i10, i11, i12, z7, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzan[i7];
    }
}
