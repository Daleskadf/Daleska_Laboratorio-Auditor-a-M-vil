package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.C1359y;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
/* loaded from: classes2.dex */
public final /* synthetic */ class C implements E {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f13023a;

    private /* synthetic */ C(DoubleStream doubleStream) {
        this.f13023a = doubleStream;
    }

    public static /* synthetic */ E k(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof D ? ((D) doubleStream).f13030a : new C(doubleStream);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E a() {
        return k(this.f13023a.takeWhile(null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.C average() {
        return AbstractC1210d.j(this.f13023a.average());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E b() {
        return k(this.f13023a.filter(null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream boxed() {
        return Z2.k(this.f13023a.boxed());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E c() {
        return k(this.f13023a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f13023a.close();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f13023a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ long count() {
        return this.f13023a.count();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E distinct() {
        return k(this.f13023a.distinct());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E e() {
        return k(this.f13023a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f13023a;
        if (obj instanceof C) {
            obj = ((C) obj).f13023a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.C findAny() {
        return AbstractC1210d.j(this.f13023a.findAny());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.C findFirst() {
        return AbstractC1210d.j(this.f13023a.findFirst());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f13023a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f13023a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13023a.hashCode();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean i() {
        return this.f13023a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ boolean isParallel() {
        return this.f13023a.isParallel();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.I iterator() {
        return j$.util.G.a(this.f13023a.iterator());
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f13023a.iterator();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ InterfaceC1286m0 j() {
        return C1276k0.k(this.f13023a.mapToLong(null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E limit(long j) {
        return k(this.f13023a.limit(j));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return Z2.k(this.f13023a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.C max() {
        return AbstractC1210d.j(this.f13023a.max());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.C min() {
        return AbstractC1210d.j(this.f13023a.min());
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h onClose(Runnable runnable) {
        return C1250f.k(this.f13023a.onClose(runnable));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean p() {
        return this.f13023a.anyMatch(null);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E parallel() {
        return k(this.f13023a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h parallel() {
        return C1250f.k(this.f13023a.parallel());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E peek(DoubleConsumer doubleConsumer) {
        return k(this.f13023a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double reduce(double d7, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f13023a.reduce(d7, doubleBinaryOperator);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC1210d.j(this.f13023a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sequential() {
        return k(this.f13023a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h sequential() {
        return C1250f.k(this.f13023a.sequential());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E skip(long j) {
        return k(this.f13023a.skip(j));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sorted() {
        return k(this.f13023a.sorted());
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f13023a.spliterator());
    }

    @Override // j$.util.stream.E, j$.util.stream.InterfaceC1260h
    public final /* synthetic */ j$.util.W spliterator() {
        return j$.util.U.a(this.f13023a.spliterator());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double sum() {
        return this.f13023a.sum();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double[] toArray() {
        return this.f13023a.toArray();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.f13023a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h unordered() {
        return C1250f.k(this.f13023a.unordered());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean y() {
        return this.f13023a.noneMatch(null);
    }

    @Override // j$.util.stream.E
    public final C1359y summaryStatistics() {
        this.f13023a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.E
    public final E d(C1225a c1225a) {
        DoubleStream doubleStream = this.f13023a;
        C1225a c1225a2 = new C1225a(7);
        c1225a2.f13191b = c1225a;
        return k(doubleStream.flatMap(c1225a2));
    }
}
