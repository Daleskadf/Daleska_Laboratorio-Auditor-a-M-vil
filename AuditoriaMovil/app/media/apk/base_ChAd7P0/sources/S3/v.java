package s3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class v extends X2.a {
    public static final Parcelable.Creator<v> CREATOR = new C1770E(16);

    /* renamed from: X  reason: collision with root package name */
    public boolean f15665X;

    /* renamed from: Y  reason: collision with root package name */
    public C1776d f15666Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1776d f15667Z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15668a;

    /* renamed from: b  reason: collision with root package name */
    public float f15669b;

    /* renamed from: c  reason: collision with root package name */
    public int f15670c;

    /* renamed from: d  reason: collision with root package name */
    public float f15671d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15672e;

    /* renamed from: e0  reason: collision with root package name */
    public int f15673e0;
    public boolean f;

    /* renamed from: f0  reason: collision with root package name */
    public ArrayList f15674f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f15675g0;

    public v() {
        this.f15669b = 10.0f;
        this.f15670c = -16777216;
        this.f15671d = 0.0f;
        this.f15672e = true;
        this.f = false;
        this.f15665X = false;
        this.f15666Y = new C1775c(0);
        this.f15667Z = new C1775c(0);
        this.f15673e0 = 0;
        this.f15674f0 = null;
        this.f15675g0 = new ArrayList();
        this.f15668a = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 2, this.f15668a, false);
        float f = this.f15669b;
        m5.d.K(parcel, 3, 4);
        parcel.writeFloat(f);
        int i8 = this.f15670c;
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(i8);
        float f4 = this.f15671d;
        m5.d.K(parcel, 5, 4);
        parcel.writeFloat(f4);
        boolean z7 = this.f15672e;
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.f;
        m5.d.K(parcel, 7, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.f15665X;
        m5.d.K(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        m5.d.A(parcel, 9, this.f15666Y.k(), i7, false);
        m5.d.A(parcel, 10, this.f15667Z.k(), i7, false);
        int i9 = this.f15673e0;
        m5.d.K(parcel, 11, 4);
        parcel.writeInt(i9);
        m5.d.F(parcel, 12, this.f15674f0, false);
        ArrayList<y> arrayList = this.f15675g0;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (y yVar : arrayList) {
            x xVar = yVar.f15682a;
            float f8 = xVar.f15677a;
            Pair pair = new Pair(Integer.valueOf(xVar.f15678b), Integer.valueOf(xVar.f15679c));
            arrayList2.add(new y(new x(this.f15669b, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.f15672e, xVar.f15681e), yVar.f15683b));
        }
        m5.d.F(parcel, 13, arrayList2, false);
        m5.d.J(G2, parcel);
    }

    public v(ArrayList arrayList, float f, int i7, float f4, boolean z7, boolean z8, boolean z9, C1776d c1776d, C1776d c1776d2, int i8, ArrayList arrayList2, ArrayList arrayList3) {
        this.f15669b = 10.0f;
        this.f15670c = -16777216;
        this.f15671d = 0.0f;
        this.f15672e = true;
        this.f = false;
        this.f15665X = false;
        this.f15666Y = new C1775c(0);
        this.f15667Z = new C1775c(0);
        this.f15673e0 = 0;
        this.f15674f0 = null;
        this.f15675g0 = new ArrayList();
        this.f15668a = arrayList;
        this.f15669b = f;
        this.f15670c = i7;
        this.f15671d = f4;
        this.f15672e = z7;
        this.f = z8;
        this.f15665X = z9;
        if (c1776d != null) {
            this.f15666Y = c1776d;
        }
        if (c1776d2 != null) {
            this.f15667Z = c1776d2;
        }
        this.f15673e0 = i8;
        this.f15674f0 = arrayList2;
        if (arrayList3 != null) {
            this.f15675g0 = arrayList3;
        }
    }
}
