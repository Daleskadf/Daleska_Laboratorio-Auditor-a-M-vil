package w3;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class u extends j implements v {
    @Override // w3.j
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            k.b(parcel);
            b((Bundle) k.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
