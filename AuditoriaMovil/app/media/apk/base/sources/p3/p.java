package p3;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import n3.c0;
/* loaded from: classes.dex */
public final class p extends X2.a {
    public static final Parcelable.Creator<p> CREATOR = new c0(16);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15124a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15125b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15126c;

    public p(ArrayList arrayList, boolean z7, boolean z8) {
        this.f15124a = arrayList;
        this.f15125b = z7;
        this.f15126c = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, DesugarCollections.unmodifiableList(this.f15124a), false);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15125b ? 1 : 0);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15126c ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
