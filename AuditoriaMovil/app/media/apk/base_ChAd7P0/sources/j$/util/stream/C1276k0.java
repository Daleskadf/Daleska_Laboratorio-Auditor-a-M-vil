package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.k0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1276k0 implements InterfaceC1286m0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f13294a;

    private /* synthetic */ C1276k0(LongStream longStream) {
        this.f13294a = longStream;
    }

    public static /* synthetic */ InterfaceC1286m0 k(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C1281l0 ? ((C1281l0) longStream).f13302a : new C1276k0(longStream);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 a() {
        return k(this.f13294a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ E asDoubleStream() {
        return C.k(this.f13294a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ j$.util.C average() {
        return AbstractC1210d.j(this.f13294a.average());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 b() {
        return k(this.f13294a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ Stream boxed() {
        return Z2.k(this.f13294a.boxed());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 c() {
        return k(this.f13294a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f13294a.close();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f13294a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ long count() {
        return this.f13294a.count();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 distinct() {
        return k(this.f13294a.distinct());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 e() {
        return k(this.f13294a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f13294a;
        if (obj instanceof C1276k0) {
            obj = ((C1276k0) obj).f13294a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ j$.util.E findAny() {
        return AbstractC1210d.l(this.f13294a.findAny());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ j$.util.E findFirst() {
        return AbstractC1210d.l(this.f13294a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f13294a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f13294a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13294a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ boolean isParallel() {
        return this.f13294a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1286m0, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ j$.util.Q iterator() {
        return j$.util.O.a(this.f13294a.iterator());
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f13294a.iterator();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ E l() {
        return C.k(this.f13294a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 limit(long j) {
        return k(this.f13294a.limit(j));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return Z2.k(this.f13294a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ j$.util.E max() {
        return AbstractC1210d.l(this.f13294a.max());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ j$.util.E min() {
        return AbstractC1210d.l(this.f13294a.min());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ boolean n() {
        return this.f13294a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h onClose(Runnable runnable) {
        return C1250f.k(this.f13294a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h parallel() {
        return C1250f.k(this.f13294a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1286m0, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1286m0 parallel() {
        return k(this.f13294a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 peek(LongConsumer longConsumer) {
        return k(this.f13294a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ boolean r() {
        return this.f13294a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f13294a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC1210d.l(this.f13294a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h sequential() {
        return C1250f.k(this.f13294a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1286m0, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1286m0 sequential() {
        return k(this.f13294a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 skip(long j) {
        return k(this.f13294a.skip(j));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ InterfaceC1286m0 sorted() {
        return k(this.f13294a.sorted());
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f13294a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1286m0, j$.util.stream.InterfaceC1260h
    public final /* synthetic */ j$.util.c0 spliterator() {
        return j$.util.a0.a(this.f13294a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ long sum() {
        return this.f13294a.sum();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ long[] toArray() {
        return this.f13294a.toArray();
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h unordered() {
        return C1250f.k(this.f13294a.unordered());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ boolean w() {
        return this.f13294a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final /* synthetic */ IntStream x() {
        return IntStream.VivifiedWrapper.convert(this.f13294a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.B summaryStatistics() {
        this.f13294a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 d(C1225a c1225a) {
        LongStream longStream = this.f13294a;
        C1225a c1225a2 = new C1225a(9);
        c1225a2.f13191b = c1225a;
        return k(longStream.flatMap(c1225a2));
    }
}
