package p3;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import n3.c0;
/* renamed from: p3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1663c extends X2.a {
    public static final Parcelable.Creator<C1663c> CREATOR = new c0(24);

    /* renamed from: e  reason: collision with root package name */
    public static final K4.k f15085e = new K4.k(3);

    /* renamed from: a  reason: collision with root package name */
    public final List f15086a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15087b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15088c;

    /* renamed from: d  reason: collision with root package name */
    public String f15089d;

    public C1663c(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        List unmodifiableList;
        com.google.android.gms.common.internal.I.j(arrayList, "transitions can't be null");
        com.google.android.gms.common.internal.I.a("transitions can't be empty.", !arrayList.isEmpty());
        TreeSet treeSet = new TreeSet(f15085e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1662b c1662b = (C1662b) it.next();
            boolean add = treeSet.add(c1662b);
            com.google.android.gms.common.internal.I.a("Found duplicated transition: " + c1662b + ".", add);
        }
        this.f15086a = DesugarCollections.unmodifiableList(arrayList);
        this.f15087b = str;
        if (arrayList2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
        }
        this.f15088c = unmodifiableList;
        this.f15089d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1663c.class == obj.getClass()) {
            C1663c c1663c = (C1663c) obj;
            if (com.google.android.gms.common.internal.I.m(this.f15086a, c1663c.f15086a) && com.google.android.gms.common.internal.I.m(this.f15087b, c1663c.f15087b) && com.google.android.gms.common.internal.I.m(this.f15089d, c1663c.f15089d) && com.google.android.gms.common.internal.I.m(this.f15088c, c1663c.f15088c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int hashCode = this.f15086a.hashCode() * 31;
        int i9 = 0;
        String str = this.f15087b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (hashCode + i7) * 31;
        List list = this.f15088c;
        if (list != null) {
            i8 = list.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str2 = this.f15089d;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15086a);
        String valueOf2 = String.valueOf(this.f15088c);
        String str = this.f15089d;
        int length = valueOf.length();
        String str2 = this.f15087b;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + valueOf2.length() + 18 + String.valueOf(str).length() + 1);
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str2);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        com.google.android.gms.common.internal.I.i(parcel);
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f15086a, false);
        m5.d.B(parcel, 2, this.f15087b, false);
        m5.d.F(parcel, 3, this.f15088c, false);
        m5.d.B(parcel, 4, this.f15089d, false);
        m5.d.J(G2, parcel);
    }
}
