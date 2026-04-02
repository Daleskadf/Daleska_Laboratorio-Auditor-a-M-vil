package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class Z2 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Stream f13188a;

    private /* synthetic */ Z2(java.util.stream.Stream stream) {
        this.f13188a = stream;
    }

    public static /* synthetic */ Stream k(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new Z2(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f13188a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f13188a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f13188a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f13188a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f13188a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream d(C1225a c1225a) {
        return k(this.f13188a.flatMap(AbstractC1340x0.R(c1225a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return k(this.f13188a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return k(this.f13188a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f13188a;
        if (obj instanceof Z2) {
            obj = ((Z2) obj).f13188a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return k(this.f13188a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC1210d.i(this.f13188a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC1210d.i(this.f13188a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f13188a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f13188a.forEachOrdered(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object h(C1270j c1270j) {
        return this.f13188a.collect(c1270j == null ? null : c1270j.f13286a);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13188a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ boolean isParallel() {
        return this.f13188a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f13188a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return k(this.f13188a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return k(this.f13188a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ E mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C.k(this.f13188a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f13188a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC1286m0 mapToLong(ToLongFunction toLongFunction) {
        return C1276k0.k(this.f13188a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC1210d.i(this.f13188a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC1210d.i(this.f13188a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f13188a.noneMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC1286m0 o(C1225a c1225a) {
        return C1276k0.k(this.f13188a.flatMapToLong(AbstractC1340x0.R(c1225a)));
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h onClose(Runnable runnable) {
        return C1250f.k(this.f13188a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h parallel() {
        return C1250f.k(this.f13188a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return k(this.f13188a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC1210d.i(this.f13188a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f13188a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f13188a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h sequential() {
        return C1250f.k(this.f13188a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return k(this.f13188a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return k(this.f13188a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return k(this.f13188a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f13188a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream t(C1225a c1225a) {
        return IntStream.VivifiedWrapper.convert(this.f13188a.flatMapToInt(AbstractC1340x0.R(c1225a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return k(this.f13188a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f13188a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f13188a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h unordered() {
        return C1250f.k(this.f13188a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ E z(C1225a c1225a) {
        return C.k(this.f13188a.flatMapToDouble(AbstractC1340x0.R(c1225a)));
    }
}
