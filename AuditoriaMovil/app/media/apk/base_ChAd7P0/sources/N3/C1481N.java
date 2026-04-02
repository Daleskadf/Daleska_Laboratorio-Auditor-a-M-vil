package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
/* renamed from: n3.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481N extends X2.a {
    public static final Parcelable.Creator<C1481N> CREATOR = new U(13);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f14187a;

    public C1481N(ArrayList arrayList) {
        this.f14187a = arrayList;
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof C1481N)) {
            return false;
        }
        C1481N c1481n = (C1481N) obj;
        ArrayList arrayList2 = this.f14187a;
        if ((arrayList2 != null || c1481n.f14187a != null) && (arrayList2 == null || (arrayList = c1481n.f14187a) == null || !arrayList2.containsAll(arrayList) || !c1481n.f14187a.containsAll(arrayList2))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f14187a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f14187a, false);
        m5.d.J(G2, parcel);
    }
}
