package i6;

import a6.M;
import a6.O;
import c6.D1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: i6.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135v extends O {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11566a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f11567b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11568c;

    public C1135v(ArrayList arrayList, AtomicInteger atomicInteger) {
        G.i.f("empty list", !arrayList.isEmpty());
        this.f11566a = arrayList;
        G.i.j(atomicInteger, "index");
        this.f11567b = atomicInteger;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((O) it.next()).hashCode();
        }
        this.f11568c = i7;
    }

    @Override // a6.O
    public final M a(D1 d12) {
        int andIncrement = this.f11567b.getAndIncrement() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayList = this.f11566a;
        return ((O) arrayList.get(andIncrement % arrayList.size())).a(d12);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1135v)) {
            return false;
        }
        C1135v c1135v = (C1135v) obj;
        if (c1135v == this) {
            return true;
        }
        if (this.f11568c != c1135v.f11568c || this.f11567b != c1135v.f11567b) {
            return false;
        }
        ArrayList arrayList = this.f11566a;
        int size = arrayList.size();
        ArrayList arrayList2 = c1135v.f11566a;
        if (size != arrayList2.size() || !new HashSet(arrayList).containsAll(arrayList2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11568c;
    }

    public final String toString() {
        K5.d dVar = new K5.d(C1135v.class.getSimpleName());
        dVar.a(this.f11566a, "subchannelPickers");
        return dVar.toString();
    }
}
