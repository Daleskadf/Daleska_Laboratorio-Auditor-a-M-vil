package s3;

import D.AbstractC0059i;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* renamed from: s3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1776d extends X2.a {
    public static final Parcelable.Creator<C1776d> CREATOR = new C1770E(6);

    /* renamed from: a  reason: collision with root package name */
    public final int f15592a;

    /* renamed from: b  reason: collision with root package name */
    public final C1774b f15593b;

    /* renamed from: c  reason: collision with root package name */
    public final Float f15594c;

    public C1776d(int i7, C1774b c1774b, Float f) {
        boolean z7;
        boolean z8 = true;
        if (f != null && f.floatValue() > 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i7 == 3) {
            z8 = (c1774b == null || !z7) ? false : z8;
            i7 = 3;
        }
        I.a("Invalid Cap: type=" + i7 + " bitmapDescriptor=" + c1774b + " bitmapRefWidth=" + f, z8);
        this.f15592a = i7;
        this.f15593b = c1774b;
        this.f15594c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776d)) {
            return false;
        }
        C1776d c1776d = (C1776d) obj;
        if (this.f15592a == c1776d.f15592a && I.m(this.f15593b, c1776d.f15593b) && I.m(this.f15594c, c1776d.f15594c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15592a), this.f15593b, this.f15594c});
    }

    public final C1776d k() {
        boolean z7;
        boolean z8 = false;
        int i7 = this.f15592a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        Log.w("d", "Unknown Cap type: " + i7);
                        return this;
                    }
                    C1774b c1774b = this.f15593b;
                    if (c1774b != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    I.k("bitmapDescriptor must not be null", z7);
                    Float f = this.f15594c;
                    if (f != null) {
                        z8 = true;
                    }
                    I.k("bitmapRefWidth must not be null", z8);
                    return new C1779g(c1774b, f.floatValue());
                }
                return new C1775c(1);
            }
            return new C1775c(2);
        }
        return new C1775c(0);
    }

    public String toString() {
        return AbstractC0059i.B(new StringBuilder("[Cap: type="), this.f15592a, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15592a);
        C1774b c1774b = this.f15593b;
        if (c1774b == null) {
            asBinder = null;
        } else {
            asBinder = c1774b.f15590a.asBinder();
        }
        m5.d.v(parcel, 3, asBinder);
        m5.d.u(parcel, 4, this.f15594c);
        m5.d.J(G2, parcel);
    }
}
