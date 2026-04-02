package s3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class t extends X2.a {
    public static final Parcelable.Creator<t> CREATOR = new C1772G(0);

    /* renamed from: X  reason: collision with root package name */
    public boolean f15654X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f15655Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f15656Z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15657a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15658b;

    /* renamed from: c  reason: collision with root package name */
    public float f15659c;

    /* renamed from: d  reason: collision with root package name */
    public int f15660d;

    /* renamed from: e  reason: collision with root package name */
    public int f15661e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f15662e0;
    public float f;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f15663f0;

    public t() {
        this.f15659c = 10.0f;
        this.f15660d = -16777216;
        this.f15661e = 0;
        this.f = 0.0f;
        this.f15654X = true;
        this.f15655Y = false;
        this.f15656Z = false;
        this.f15662e0 = 0;
        this.f15663f0 = null;
        this.f15657a = new ArrayList();
        this.f15658b = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 2, this.f15657a, false);
        ArrayList arrayList = this.f15658b;
        if (arrayList != null) {
            int G7 = m5.d.G(3, parcel);
            parcel.writeList(arrayList);
            m5.d.J(G7, parcel);
        }
        float f = this.f15659c;
        m5.d.K(parcel, 4, 4);
        parcel.writeFloat(f);
        int i8 = this.f15660d;
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(i8);
        int i9 = this.f15661e;
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(i9);
        float f4 = this.f;
        m5.d.K(parcel, 7, 4);
        parcel.writeFloat(f4);
        boolean z7 = this.f15654X;
        m5.d.K(parcel, 8, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.f15655Y;
        m5.d.K(parcel, 9, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.f15656Z;
        m5.d.K(parcel, 10, 4);
        parcel.writeInt(z9 ? 1 : 0);
        m5.d.K(parcel, 11, 4);
        parcel.writeInt(this.f15662e0);
        m5.d.F(parcel, 12, this.f15663f0, false);
        m5.d.J(G2, parcel);
    }

    public t(ArrayList arrayList, ArrayList arrayList2, float f, int i7, int i8, float f4, boolean z7, boolean z8, boolean z9, int i9, ArrayList arrayList3) {
        this.f15657a = arrayList;
        this.f15658b = arrayList2;
        this.f15659c = f;
        this.f15660d = i7;
        this.f15661e = i8;
        this.f = f4;
        this.f15654X = z7;
        this.f15655Y = z8;
        this.f15656Z = z9;
        this.f15662e0 = i9;
        this.f15663f0 = arrayList3;
    }
}
