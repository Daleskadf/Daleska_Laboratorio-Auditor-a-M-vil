package w3;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class p extends j implements q {
    @Override // w3.j
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        return false;
                    }
                    k.b(parcel);
                    b((Bundle) k.a(parcel, Bundle.CREATOR));
                    return true;
                }
                k.b(parcel);
                d((Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            }
            k.b(parcel);
            c((Bundle) k.a(parcel, Bundle.CREATOR));
            return true;
        }
        k.b(parcel);
        e((Bundle) k.a(parcel, Bundle.CREATOR));
        return true;
    }
}
