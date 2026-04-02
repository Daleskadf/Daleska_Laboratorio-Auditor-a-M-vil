package A3;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: A3.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023v extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0025x f198b;

    public /* synthetic */ C0023v(C0025x c0025x, int i7) {
        this.f197a = i7;
        this.f198b = c0025x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f197a) {
            case 0:
                this.f198b.clear();
                return;
            default:
                this.f198b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f197a) {
            case 0:
                C0025x c0025x = this.f198b;
                Map c8 = c0025x.c();
                if (c8 != null) {
                    return c8.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e7 = c0025x.e(entry.getKey());
                    if (e7 != -1 && F.f.l(c0025x.k()[e7], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f198b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f197a) {
            case 0:
                C0025x c0025x = this.f198b;
                Map c8 = c0025x.c();
                if (c8 != null) {
                    return c8.entrySet().iterator();
                }
                return new C0022u(c0025x, 1);
            default:
                C0025x c0025x2 = this.f198b;
                Map c9 = c0025x2.c();
                if (c9 != null) {
                    return c9.keySet().iterator();
                }
                return new C0022u(c0025x2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f197a) {
            case 0:
                C0025x c0025x = this.f198b;
                Map c8 = c0025x.c();
                if (c8 != null) {
                    return c8.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0025x.g()) {
                        int d7 = c0025x.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0025x.f206a;
                        Objects.requireNonNull(obj2);
                        int q2 = AbstractC0021t.q(key, value, d7, obj2, c0025x.i(), c0025x.j(), c0025x.k());
                        if (q2 != -1) {
                            c0025x.f(q2, d7);
                            c0025x.f--;
                            c0025x.f210e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0025x c0025x2 = this.f198b;
                Map c9 = c0025x2.c();
                if (c9 != null) {
                    return c9.keySet().remove(obj);
                }
                if (c0025x2.h(obj) != C0025x.f202e0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f197a) {
            case 0:
                return this.f198b.size();
            default:
                return this.f198b.size();
        }
    }
}
