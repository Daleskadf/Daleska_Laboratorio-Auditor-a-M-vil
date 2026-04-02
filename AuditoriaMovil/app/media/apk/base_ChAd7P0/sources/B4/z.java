package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class z extends X2.a {
    public static final Parcelable.Creator<z> CREATOR = new C0595c(5);

    /* renamed from: a  reason: collision with root package name */
    public final List f8306a;

    /* renamed from: b  reason: collision with root package name */
    public final List f8307b;

    public z(ArrayList arrayList, ArrayList arrayList2) {
        this.f8306a = arrayList == null ? new ArrayList() : arrayList;
        this.f8307b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f8306a, false);
        m5.d.F(parcel, 2, this.f8307b, false);
        m5.d.J(G2, parcel);
    }
}
