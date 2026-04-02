package c3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import m5.d;
/* renamed from: c3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629a extends X2.a {
    public static final Parcelable.Creator<C0629a> CREATOR = new android.support.v4.media.session.b(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f8367a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8368b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f8369c = new SparseArray();

    public C0629a(int i7, ArrayList arrayList) {
        this.f8367a = i7;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0631c c0631c = (C0631c) arrayList.get(i8);
            String str = c0631c.f8373b;
            int i9 = c0631c.f8374c;
            this.f8368b.put(str, Integer.valueOf(i9));
            this.f8369c.put(i9, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f8367a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f8368b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new C0631c(str, ((Integer) hashMap.get(str)).intValue()));
        }
        d.F(parcel, 2, arrayList, false);
        d.J(G2, parcel);
    }
}
