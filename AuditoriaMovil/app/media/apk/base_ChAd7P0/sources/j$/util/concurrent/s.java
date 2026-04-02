package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s extends b implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12899a.containsValue(obj);
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        AbstractC1209a abstractC1209a;
        if (obj != null) {
            Iterator it = iterator();
            do {
                abstractC1209a = (AbstractC1209a) it;
                if (!abstractC1209a.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((i) it).next()));
            abstractC1209a.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f12899a;
        l[] lVarArr = concurrentHashMap.f12886a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new i(lVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z7 = false;
        while (true) {
            AbstractC1209a abstractC1209a = (AbstractC1209a) it;
            if (!abstractC1209a.hasNext()) {
                return z7;
            }
            if (collection.contains(((i) it).next())) {
                abstractC1209a.remove();
                z7 = true;
            }
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f12899a;
        concurrentHashMap.getClass();
        predicate.getClass();
        l[] lVarArr = concurrentHashMap.f12886a;
        boolean z7 = false;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a7 = pVar.a();
                if (a7 == null) {
                    break;
                }
                Object obj = a7.f12916b;
                Object obj2 = a7.f12917c;
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z7 = true;
                }
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final j$.util.Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f12899a;
        long j = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.f12886a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, j < 0 ? 0L : j, 1);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.f12899a.f12886a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a7 = pVar.a();
            if (a7 == null) {
                return;
            }
            consumer.accept(a7.f12917c);
        }
    }
}
