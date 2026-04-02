package b3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/* renamed from: b3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580a extends X2.a {
    public static final Parcelable.Creator<C0580a> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8165a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8166b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8167c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8168d;

    public C0580a(ArrayList arrayList, boolean z7, String str, String str2) {
        I.i(arrayList);
        this.f8165a = arrayList;
        this.f8166b = z7;
        this.f8167c = str;
        this.f8168d = str2;
    }

    public static C0580a k(List list, boolean z7) {
        TreeSet treeSet = new TreeSet(C0581b.f8169a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((p) it.next()).a());
        }
        return new C0580a(new ArrayList(treeSet), z7, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0580a)) {
            return false;
        }
        C0580a c0580a = (C0580a) obj;
        if (this.f8166b != c0580a.f8166b || !I.m(this.f8165a, c0580a.f8165a) || !I.m(this.f8167c, c0580a.f8167c) || !I.m(this.f8168d, c0580a.f8168d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8166b), this.f8165a, this.f8167c, this.f8168d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f8165a, false);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f8166b ? 1 : 0);
        m5.d.B(parcel, 3, this.f8167c, false);
        m5.d.B(parcel, 4, this.f8168d, false);
        m5.d.J(G2, parcel);
    }
}
