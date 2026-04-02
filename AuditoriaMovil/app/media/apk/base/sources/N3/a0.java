package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class a0 extends X2.a {
    public static final Parcelable.Creator<a0> CREATOR = new U(29);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f14204a;

    public a0(ArrayList arrayList) {
        com.google.android.gms.common.internal.I.i(arrayList);
        this.f14204a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        ArrayList arrayList = a0Var.f14204a;
        ArrayList arrayList2 = this.f14204a;
        if (!arrayList2.containsAll(arrayList) || !a0Var.f14204a.containsAll(arrayList2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f14204a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f14204a, false);
        m5.d.J(G2, parcel);
    }
}
