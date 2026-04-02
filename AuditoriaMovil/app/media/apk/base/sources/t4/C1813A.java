package t4;

import H4.W;
import com.google.protobuf.P;
import com.google.protobuf.T;
import java.util.List;
/* renamed from: t4.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1813A extends W {

    /* renamed from: g  reason: collision with root package name */
    public final List f15763g;

    /* renamed from: h  reason: collision with root package name */
    public final T f15764h;

    /* renamed from: i  reason: collision with root package name */
    public final q4.h f15765i;
    public final q4.n j;

    public C1813A(List list, T t7, q4.h hVar, q4.n nVar) {
        this.f15763g = list;
        this.f15764h = t7;
        this.f15765i = hVar;
        this.j = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1813A.class != obj.getClass()) {
            return false;
        }
        C1813A c1813a = (C1813A) obj;
        if (!this.f15763g.equals(c1813a.f15763g)) {
            return false;
        }
        if (!((P) this.f15764h).equals(c1813a.f15764h) || !this.f15765i.equals(c1813a.f15765i)) {
            return false;
        }
        q4.n nVar = c1813a.j;
        q4.n nVar2 = this.j;
        if (nVar2 != null) {
            return nVar2.equals(nVar);
        }
        if (nVar == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((P) this.f15764h).hashCode();
        int hashCode2 = (this.f15765i.f15357a.hashCode() + ((hashCode + (this.f15763g.hashCode() * 31)) * 31)) * 31;
        q4.n nVar = this.j;
        if (nVar != null) {
            i7 = nVar.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode2 + i7;
    }

    public final String toString() {
        return "DocumentChange{updatedTargetIds=" + this.f15763g + ", removedTargetIds=" + this.f15764h + ", key=" + this.f15765i + ", newDocument=" + this.j + '}';
    }
}
