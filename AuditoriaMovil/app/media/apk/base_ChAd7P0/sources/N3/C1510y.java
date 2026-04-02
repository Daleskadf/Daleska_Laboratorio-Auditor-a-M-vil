package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: n3.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1510y extends AbstractC1497l {
    public static final Parcelable.Creator<C1510y> CREATOR = new U(0);

    /* renamed from: X  reason: collision with root package name */
    public final C1498m f14254X;

    /* renamed from: Y  reason: collision with root package name */
    public final Integer f14255Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1479L f14256Z;

    /* renamed from: a  reason: collision with root package name */
    public final C1470C f14257a;

    /* renamed from: b  reason: collision with root package name */
    public final C1473F f14258b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14259c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f14260d;

    /* renamed from: e  reason: collision with root package name */
    public final Double f14261e;

    /* renamed from: e0  reason: collision with root package name */
    public final EnumC1490e f14262e0;
    public final ArrayList f;

    /* renamed from: f0  reason: collision with root package name */
    public final C1491f f14263f0;

    public C1510y(C1470C c1470c, C1473F c1473f, byte[] bArr, ArrayList arrayList, Double d7, ArrayList arrayList2, C1498m c1498m, Integer num, C1479L c1479l, String str, C1491f c1491f) {
        com.google.android.gms.common.internal.I.i(c1470c);
        this.f14257a = c1470c;
        com.google.android.gms.common.internal.I.i(c1473f);
        this.f14258b = c1473f;
        com.google.android.gms.common.internal.I.i(bArr);
        this.f14259c = bArr;
        com.google.android.gms.common.internal.I.i(arrayList);
        this.f14260d = arrayList;
        this.f14261e = d7;
        this.f = arrayList2;
        this.f14254X = c1498m;
        this.f14255Y = num;
        this.f14256Z = c1479l;
        if (str != null) {
            try {
                this.f14262e0 = EnumC1490e.a(str);
            } catch (C1489d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f14262e0 = null;
        }
        this.f14263f0 = c1491f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1510y)) {
            return false;
        }
        C1510y c1510y = (C1510y) obj;
        if (com.google.android.gms.common.internal.I.m(this.f14257a, c1510y.f14257a) && com.google.android.gms.common.internal.I.m(this.f14258b, c1510y.f14258b) && Arrays.equals(this.f14259c, c1510y.f14259c) && com.google.android.gms.common.internal.I.m(this.f14261e, c1510y.f14261e)) {
            ArrayList arrayList = this.f14260d;
            ArrayList arrayList2 = c1510y.f14260d;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.f;
                ArrayList arrayList4 = c1510y.f;
                if (((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && com.google.android.gms.common.internal.I.m(this.f14254X, c1510y.f14254X) && com.google.android.gms.common.internal.I.m(this.f14255Y, c1510y.f14255Y) && com.google.android.gms.common.internal.I.m(this.f14256Z, c1510y.f14256Z) && com.google.android.gms.common.internal.I.m(this.f14262e0, c1510y.f14262e0) && com.google.android.gms.common.internal.I.m(this.f14263f0, c1510y.f14263f0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14257a, this.f14258b, Integer.valueOf(Arrays.hashCode(this.f14259c)), this.f14260d, this.f14261e, this.f, this.f14254X, this.f14255Y, this.f14256Z, this.f14262e0, this.f14263f0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String enumC1490e;
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f14257a, i7, false);
        m5.d.A(parcel, 3, this.f14258b, i7, false);
        m5.d.r(parcel, 4, this.f14259c, false);
        m5.d.F(parcel, 5, this.f14260d, false);
        m5.d.s(parcel, 6, this.f14261e);
        m5.d.F(parcel, 7, this.f, false);
        m5.d.A(parcel, 8, this.f14254X, i7, false);
        m5.d.y(parcel, 9, this.f14255Y);
        m5.d.A(parcel, 10, this.f14256Z, i7, false);
        EnumC1490e enumC1490e2 = this.f14262e0;
        if (enumC1490e2 == null) {
            enumC1490e = null;
        } else {
            enumC1490e = enumC1490e2.toString();
        }
        m5.d.B(parcel, 11, enumC1490e, false);
        m5.d.A(parcel, 12, this.f14263f0, i7, false);
        m5.d.J(G2, parcel);
    }
}
