package q4;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class i implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final e4.c f15358a;

    /* renamed from: b  reason: collision with root package name */
    public final e4.e f15359b;

    public i(e4.c cVar, e4.e eVar) {
        this.f15358a = cVar;
        this.f15359b = eVar;
    }

    public final i e(h hVar) {
        e4.c cVar = this.f15358a;
        n nVar = (n) cVar.f(hVar);
        if (nVar == null) {
            return this;
        }
        return new i(cVar.o(hVar), this.f15359b.h(nVar));
    }

    public final boolean equals(Object obj) {
        e4.d dVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15358a.size() != iVar.f15358a.size()) {
            return false;
        }
        Iterator it = this.f15359b.iterator();
        Iterator it2 = iVar.f15359b.iterator();
        do {
            dVar = (e4.d) it;
            if (!((Iterator) dVar.f10875b).hasNext()) {
                return true;
            }
        } while (((n) dVar.next()).equals((n) ((e4.d) it2).next()));
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f15359b.iterator();
        int i7 = 0;
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                n nVar = (n) dVar.next();
                int hashCode = nVar.f15362a.f15357a.hashCode();
                i7 = nVar.f15366e.hashCode() + ((hashCode + (i7 * 31)) * 31);
            } else {
                return i7;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f15359b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f15359b.iterator();
        boolean z7 = true;
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                n nVar = (n) dVar.next();
                if (z7) {
                    z7 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(nVar);
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
