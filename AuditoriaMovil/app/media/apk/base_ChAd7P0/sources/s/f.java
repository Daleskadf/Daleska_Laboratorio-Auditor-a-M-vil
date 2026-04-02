package S;

import j$.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* loaded from: classes.dex */
public final class f extends k implements Map, j$.util.Map {

    /* renamed from: d  reason: collision with root package name */
    public a f4821d;

    /* renamed from: e  reason: collision with root package name */
    public c f4822e;
    public e f;

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f4821d;
        if (aVar == null) {
            a aVar2 = new a(0, this);
            this.f4821d = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean i(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i7 = this.f4834c;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i7 != this.f4834c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f4822e;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f4822e = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.f4834c;
        int i7 = this.f4834c;
        int[] iArr = this.f4832a;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f4832a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4833b, size * 2);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f4833b = copyOf2;
        }
        if (this.f4834c == i7) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f = eVar2;
            return eVar2;
        }
        return eVar;
    }
}
