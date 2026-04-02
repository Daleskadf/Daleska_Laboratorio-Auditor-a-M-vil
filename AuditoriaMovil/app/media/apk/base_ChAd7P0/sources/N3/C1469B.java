package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: n3.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469B extends AbstractC1497l {
    public static final Parcelable.Creator<C1469B> CREATOR = new U(4);

    /* renamed from: X  reason: collision with root package name */
    public final W f14169X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1491f f14170Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Long f14171Z;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14172a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f14173b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14174c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f14175d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f14176e;
    public final C1479L f;

    public C1469B(byte[] bArr, Double d7, String str, ArrayList arrayList, Integer num, C1479L c1479l, String str2, C1491f c1491f, Long l8) {
        com.google.android.gms.common.internal.I.i(bArr);
        this.f14172a = bArr;
        this.f14173b = d7;
        com.google.android.gms.common.internal.I.i(str);
        this.f14174c = str;
        this.f14175d = arrayList;
        this.f14176e = num;
        this.f = c1479l;
        this.f14171Z = l8;
        if (str2 != null) {
            try {
                this.f14169X = W.a(str2);
            } catch (V e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f14169X = null;
        }
        this.f14170Y = c1491f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1469B)) {
            return false;
        }
        C1469B c1469b = (C1469B) obj;
        if (Arrays.equals(this.f14172a, c1469b.f14172a) && com.google.android.gms.common.internal.I.m(this.f14173b, c1469b.f14173b) && com.google.android.gms.common.internal.I.m(this.f14174c, c1469b.f14174c)) {
            ArrayList arrayList = this.f14175d;
            ArrayList arrayList2 = c1469b.f14175d;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && com.google.android.gms.common.internal.I.m(this.f14176e, c1469b.f14176e) && com.google.android.gms.common.internal.I.m(this.f, c1469b.f) && com.google.android.gms.common.internal.I.m(this.f14169X, c1469b.f14169X) && com.google.android.gms.common.internal.I.m(this.f14170Y, c1469b.f14170Y) && com.google.android.gms.common.internal.I.m(this.f14171Z, c1469b.f14171Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f14172a)), this.f14173b, this.f14174c, this.f14175d, this.f14176e, this.f, this.f14169X, this.f14170Y, this.f14171Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String w2;
        int G2 = m5.d.G(20293, parcel);
        m5.d.r(parcel, 2, this.f14172a, false);
        m5.d.s(parcel, 3, this.f14173b);
        m5.d.B(parcel, 4, this.f14174c, false);
        m5.d.F(parcel, 5, this.f14175d, false);
        m5.d.y(parcel, 6, this.f14176e);
        m5.d.A(parcel, 7, this.f, i7, false);
        W w7 = this.f14169X;
        if (w7 == null) {
            w2 = null;
        } else {
            w2 = w7.toString();
        }
        m5.d.B(parcel, 8, w2, false);
        m5.d.A(parcel, 9, this.f14170Y, i7, false);
        m5.d.z(parcel, 10, this.f14171Z);
        m5.d.J(G2, parcel);
    }
}
