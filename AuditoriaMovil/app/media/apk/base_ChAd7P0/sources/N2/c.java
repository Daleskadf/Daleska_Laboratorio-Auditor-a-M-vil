package N2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c extends X2.a {
    public static final Parcelable.Creator<c> CREATOR = new f(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f3390a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3391b;

    public c(int i7, ArrayList arrayList) {
        this.f3390a = i7;
        I.i(arrayList);
        this.f3391b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f3390a);
        m5.d.F(parcel, 2, this.f3391b, false);
        m5.d.J(G2, parcel);
    }
}
