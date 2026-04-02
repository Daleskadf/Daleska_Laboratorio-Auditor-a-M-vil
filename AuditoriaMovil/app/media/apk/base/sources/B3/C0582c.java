package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: b3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T7 = j3.f.T(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z7 = false;
        String str2 = null;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            char c8 = (char) readInt;
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        if (c8 != 4) {
                            j3.f.S(readInt, parcel);
                        } else {
                            str = j3.f.l(readInt, parcel);
                        }
                    } else {
                        str2 = j3.f.l(readInt, parcel);
                    }
                } else {
                    z7 = j3.f.F(readInt, parcel);
                }
            } else {
                arrayList = j3.f.p(parcel, readInt, W2.d.CREATOR);
            }
        }
        j3.f.s(T7, parcel);
        return new C0580a(arrayList, z7, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0580a[i7];
    }
}
