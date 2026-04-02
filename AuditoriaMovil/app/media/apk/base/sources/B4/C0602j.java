package b4;

import a4.C0448A;
import a4.C0451D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: b4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602j extends X2.a {
    public static final Parcelable.Creator<C0602j> CREATOR = new C0595c(3);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8265a;

    /* renamed from: b  reason: collision with root package name */
    public final C0603k f8266b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8267c;

    /* renamed from: d  reason: collision with root package name */
    public final a4.K f8268d;

    /* renamed from: e  reason: collision with root package name */
    public final C0599g f8269e;
    public final ArrayList f;

    public C0602j(ArrayList arrayList, C0603k c0603k, String str, a4.K k2, C0599g c0599g, ArrayList arrayList2) {
        com.google.android.gms.common.internal.I.i(arrayList);
        this.f8265a = arrayList;
        com.google.android.gms.common.internal.I.i(c0603k);
        this.f8266b = c0603k;
        com.google.android.gms.common.internal.I.e(str);
        this.f8267c = str;
        this.f8268d = k2;
        this.f8269e = c0599g;
        com.google.android.gms.common.internal.I.i(arrayList2);
        this.f = arrayList2;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (C0448A c0448a : this.f8265a) {
            arrayList.add(c0448a);
        }
        for (C0451D c0451d : this.f) {
            arrayList.add(c0451d);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f8265a, false);
        m5.d.A(parcel, 2, this.f8266b, i7, false);
        m5.d.B(parcel, 3, this.f8267c, false);
        m5.d.A(parcel, 4, this.f8268d, i7, false);
        m5.d.A(parcel, 5, this.f8269e, i7, false);
        m5.d.F(parcel, 6, this.f, false);
        m5.d.J(G2, parcel);
    }
}
