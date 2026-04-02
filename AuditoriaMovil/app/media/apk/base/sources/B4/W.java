package b4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class W implements X2.b {
    public static final Parcelable.Creator<W> CREATOR = new C0595c(7);

    /* renamed from: a  reason: collision with root package name */
    public final C0599g f8227a;

    /* renamed from: b  reason: collision with root package name */
    public final V f8228b;

    /* renamed from: c  reason: collision with root package name */
    public final a4.K f8229c;

    public W(C0599g c0599g) {
        com.google.android.gms.common.internal.I.i(c0599g);
        this.f8227a = c0599g;
        ArrayList arrayList = c0599g.f8257e;
        this.f8228b = null;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!TextUtils.isEmpty(((C0596d) arrayList.get(i7)).f8240Z)) {
                this.f8228b = new V(((C0596d) arrayList.get(i7)).f8242b, ((C0596d) arrayList.get(i7)).f8240Z, c0599g.f8258e0);
            }
        }
        if (this.f8228b == null) {
            this.f8228b = new V(c0599g.f8258e0);
        }
        this.f8229c = c0599g.f8259f0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f8227a, i7, false);
        m5.d.A(parcel, 2, this.f8228b, i7, false);
        m5.d.A(parcel, 3, this.f8229c, i7, false);
        m5.d.J(G2, parcel);
    }

    public W(C0599g c0599g, V v6, a4.K k2) {
        this.f8227a = c0599g;
        this.f8228b = v6;
        this.f8229c = k2;
    }
}
