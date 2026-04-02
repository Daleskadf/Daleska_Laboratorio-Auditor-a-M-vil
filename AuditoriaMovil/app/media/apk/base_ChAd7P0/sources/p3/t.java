package p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import n3.c0;
/* loaded from: classes.dex */
public final class t extends X2.a {
    public static final Parcelable.Creator<t> CREATOR = new c0(20);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15135a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15136b;

    public t(int i7, ArrayList arrayList) {
        this.f15135a = arrayList;
        this.f15136b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (com.google.android.gms.common.internal.I.m(this.f15135a, tVar.f15135a) && this.f15136b == tVar.f15136b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15135a, Integer.valueOf(this.f15136b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        com.google.android.gms.common.internal.I.i(parcel);
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f15135a, false);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15136b);
        m5.d.J(G2, parcel);
    }
}
