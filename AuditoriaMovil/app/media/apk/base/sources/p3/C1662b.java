package p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n3.c0;
/* renamed from: p3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1662b extends X2.a {
    public static final Parcelable.Creator<C1662b> CREATOR = new c0(23);

    /* renamed from: a  reason: collision with root package name */
    public final int f15083a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15084b;

    public C1662b(int i7, int i8) {
        this.f15083a = i7;
        this.f15084b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1662b)) {
            return false;
        }
        C1662b c1662b = (C1662b) obj;
        if (this.f15083a == c1662b.f15083a && this.f15084b == c1662b.f15084b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15083a), Integer.valueOf(this.f15084b)});
    }

    public final String toString() {
        int i7 = this.f15083a;
        int length = String.valueOf(i7).length();
        int i8 = this.f15084b;
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(i8).length() + 1);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i7);
        sb.append(", mTransitionType=");
        sb.append(i8);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        com.google.android.gms.common.internal.I.i(parcel);
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f15083a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15084b);
        m5.d.J(G2, parcel);
    }
}
