package M0;

import A3.AbstractC0021t;
import A3.o0;
import A3.s0;
import i6.C1124k;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class o implements Map {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3190a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f3191b;

    public o() {
        this.f3190a = 1;
        this.f3191b = new HashMap();
    }

    public final boolean a(Object obj) {
        return c().containsKey(obj);
    }

    public final boolean b(Object obj) {
        return c().containsValue(obj);
    }

    public final Map c() {
        switch (this.f3190a) {
            case 0:
                return this.f3191b;
            default:
                return (HashMap) this.f3191b;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.f3190a) {
            case 0:
                if (obj != null && a(obj)) {
                    return true;
                }
                return false;
            default:
                return a(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.f3190a) {
            case 0:
                s0 s0Var = new s0(((o0) entrySet()).iterator());
                if (obj == null) {
                    while (s0Var.hasNext()) {
                        if (s0Var.next() == null) {
                            return true;
                        }
                    }
                } else {
                    while (s0Var.hasNext()) {
                        if (obj.equals(s0Var.next())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return b(obj);
        }
    }

    public double d() {
        HashMap hashMap = (HashMap) this.f3191b;
        if (hashMap.isEmpty()) {
            return 0.0d;
        }
        int i7 = 0;
        int i8 = 0;
        for (C1124k c1124k : hashMap.values()) {
            i8++;
            if (c1124k.d()) {
                i7++;
            }
        }
        return (i7 / i8) * 100.0d;
    }

    public final Set e() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public Set entrySet() {
        switch (this.f3190a) {
            case 0:
                return AbstractC0021t.j(e(), new n(0));
            default:
                return e();
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f3190a) {
            case 0:
                if (obj != null && AbstractC0021t.h(this, obj)) {
                    return true;
                }
                return false;
            default:
                return f(obj);
        }
    }

    public final boolean f(Object obj) {
        if (obj != this && !c().equals(obj)) {
            return false;
        }
        return true;
    }

    public final Object g(Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        switch (this.f3190a) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) g(obj);
            default:
                return g(obj);
        }
    }

    public final int h() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f3190a) {
            case 0:
                return AbstractC0021t.m(entrySet());
            default:
                return h();
        }
    }

    public final boolean i() {
        return c().isEmpty();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        switch (this.f3190a) {
            case 0:
                if (i()) {
                    return true;
                }
                if (k() == 1 && a(null)) {
                    return true;
                }
                return false;
            default:
                return i();
        }
    }

    public final Set j() {
        return c().keySet();
    }

    public final int k() {
        return c().size();
    }

    @Override // java.util.Map
    public Set keySet() {
        switch (this.f3190a) {
            case 0:
                return AbstractC0021t.j(j(), new n(1));
            default:
                return j();
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        switch (this.f3190a) {
            case 0:
                return k() - (a(null) ? 1 : 0);
            default:
                return k();
        }
    }

    public final String toString() {
        Object obj;
        switch (this.f3190a) {
            case 0:
                obj = this.f3191b;
                break;
            default:
                obj = (HashMap) this.f3191b;
                break;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return c().values();
    }

    public o(Map map) {
        this.f3190a = 0;
        this.f3191b = map;
    }
}
