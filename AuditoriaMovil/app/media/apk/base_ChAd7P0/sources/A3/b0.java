package A3;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
/* loaded from: classes.dex */
public final class b0 extends AbstractC0019q implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final transient Map f125d;

    /* renamed from: e  reason: collision with root package name */
    public transient int f126e;
    public transient a0 f;

    public b0(Map map) {
        G.i.g(map.isEmpty());
        this.f125d = map;
    }

    @Override // A3.AbstractC0019q
    public final Map a() {
        Map c0008f;
        Map map = this.f187c;
        if (map == null) {
            Map map2 = this.f125d;
            if (map2 instanceof NavigableMap) {
                c0008f = new C0010h(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                c0008f = new C0013k(this, (SortedMap) map2);
            } else {
                c0008f = new C0008f(this, map2);
            }
            map = c0008f;
            this.f187c = map;
        }
        return map;
    }

    public final void c() {
        Map map = this.f125d;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f126e = 0;
    }

    public final Collection d() {
        return (List) this.f.get();
    }
}
