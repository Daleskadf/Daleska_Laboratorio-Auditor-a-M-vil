package e4;

import java.util.Comparator;
import java.util.Iterator;
import q4.n;
/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: a  reason: collision with root package name */
    public final i f10885a;

    /* renamed from: b  reason: collision with root package name */
    public final Comparator f10886b;

    public m(i iVar, Comparator comparator) {
        this.f10885a = iVar;
        this.f10886b = comparator;
    }

    @Override // e4.c
    public final boolean e(Object obj) {
        if (p(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // e4.c
    public final Object f(q4.h hVar) {
        i p7 = p(hVar);
        if (p7 != null) {
            return p7.getValue();
        }
        return null;
    }

    @Override // e4.c
    public final Comparator h() {
        return this.f10886b;
    }

    @Override // e4.c
    public final Object i() {
        return this.f10885a.h().getKey();
    }

    @Override // e4.c
    public final boolean isEmpty() {
        return this.f10885a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f10885a, null, this.f10886b);
    }

    @Override // e4.c
    public final Object k() {
        return this.f10885a.f().getKey();
    }

    @Override // e4.c
    public final int l(n nVar) {
        i iVar = this.f10885a;
        int i7 = 0;
        while (!iVar.isEmpty()) {
            int compare = this.f10886b.compare(nVar, iVar.getKey());
            if (compare == 0) {
                return iVar.a().size() + i7;
            }
            if (compare < 0) {
                iVar = iVar.a();
            } else {
                iVar = iVar.d();
                i7 = iVar.a().size() + 1 + i7;
            }
        }
        return -1;
    }

    @Override // e4.c
    public final c m(Object obj, Object obj2) {
        i iVar = this.f10885a;
        Comparator comparator = this.f10886b;
        return new m(((k) iVar.b(obj, obj2, comparator)).g(h.BLACK, null, null), comparator);
    }

    @Override // e4.c
    public final Iterator n(Object obj) {
        return new d(this.f10885a, obj, this.f10886b);
    }

    @Override // e4.c
    public final c o(Object obj) {
        if (!e(obj)) {
            return this;
        }
        i iVar = this.f10885a;
        Comparator comparator = this.f10886b;
        return new m(iVar.e(obj, comparator).g(h.BLACK, null, null), comparator);
    }

    public final i p(Object obj) {
        i iVar = this.f10885a;
        while (!iVar.isEmpty()) {
            int compare = this.f10886b.compare(obj, iVar.getKey());
            if (compare < 0) {
                iVar = iVar.a();
            } else if (compare == 0) {
                return iVar;
            } else {
                iVar = iVar.d();
            }
        }
        return null;
    }

    @Override // e4.c
    public final int size() {
        return this.f10885a.size();
    }
}
