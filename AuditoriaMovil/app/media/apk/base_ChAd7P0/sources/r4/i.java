package r4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f15499a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.p f15500b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f15501c;

    /* renamed from: d  reason: collision with root package name */
    public final List f15502d;

    public i(int i7, U3.p pVar, ArrayList arrayList, List list) {
        m5.d.i("Cannot create an empty mutation batch", !list.isEmpty(), new Object[0]);
        this.f15499a = i7;
        this.f15500b = pVar;
        this.f15501c = arrayList;
        this.f15502d = list;
    }

    public final f a(q4.n nVar, f fVar) {
        U3.p pVar;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f15501c;
            int size = arrayList.size();
            pVar = this.f15500b;
            if (i8 >= size) {
                break;
            }
            h hVar = (h) arrayList.get(i8);
            if (hVar.f15496a.equals(nVar.f15362a)) {
                fVar = hVar.a(nVar, fVar, pVar);
            }
            i8++;
        }
        while (true) {
            List list = this.f15502d;
            if (i7 < list.size()) {
                h hVar2 = (h) list.get(i7);
                if (hVar2.f15496a.equals(nVar.f15362a)) {
                    fVar = hVar2.a(nVar, fVar, pVar);
                }
                i7++;
            } else {
                return fVar;
            }
        }
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        for (h hVar : this.f15502d) {
            hashSet.add(hVar.f15496a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15499a == iVar.f15499a && this.f15500b.equals(iVar.f15500b) && this.f15501c.equals(iVar.f15501c) && this.f15502d.equals(iVar.f15502d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f15500b.hashCode();
        int hashCode2 = this.f15501c.hashCode();
        return this.f15502d.hashCode() + ((hashCode2 + ((hashCode + (this.f15499a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutationBatch(batchId=" + this.f15499a + ", localWriteTime=" + this.f15500b + ", baseMutations=" + this.f15501c + ", mutations=" + this.f15502d + ')';
    }
}
