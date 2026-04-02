package d3;

import android.os.Parcel;
import android.os.Parcelable;
import c3.C0630b;
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = j3.f.T(parcel);
        String str = null;
        String str2 = null;
        C0630b c0630b = null;
        int i7 = 0;
        int i8 = 0;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = j3.f.M(readInt, parcel);
                    break;
                case 2:
                    i8 = j3.f.M(readInt, parcel);
                    break;
                case 3:
                    z7 = j3.f.F(readInt, parcel);
                    break;
                case 4:
                    i9 = j3.f.M(readInt, parcel);
                    break;
                case 5:
                    z8 = j3.f.F(readInt, parcel);
                    break;
                case 6:
                    str = j3.f.l(readInt, parcel);
                    break;
                case 7:
                    i10 = j3.f.M(readInt, parcel);
                    break;
                case '\b':
                    str2 = j3.f.l(readInt, parcel);
                    break;
                case '\t':
                    c0630b = (C0630b) j3.f.k(parcel, readInt, C0630b.CREATOR);
                    break;
                default:
                    j3.f.S(readInt, parcel);
                    break;
            }
        }
        j3.f.s(T7, parcel);
        return new C0896a(i7, i8, z7, i9, z8, str, i10, str2, c0630b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0896a[i7];
    }
}
