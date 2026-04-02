package j$.util.stream;

import j$.util.C1359y;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class B extends AbstractC1230b implements E {
    @Override // j$.util.stream.E
    public final j$.util.C findAny() {
        return (j$.util.C) D(G.f13055d);
    }

    @Override // j$.util.stream.E
    public final j$.util.C findFirst() {
        return (j$.util.C) D(G.f13054c);
    }

    @Override // j$.util.stream.E
    public final E sorted() {
        return new A(this, EnumC1239c3.f13222q | EnumC1239c3.f13220o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.W Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.W) {
            return (j$.util.W) spliterator;
        }
        if (L3.f13096a) {
            L3.a(AbstractC1230b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.E
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new M(doubleConsumer, false));
    }

    @Override // j$.util.stream.E
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new M(doubleConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final EnumC1244d3 I() {
        return EnumC1244d3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 F(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC1340x0.F(abstractC1230b, spliterator, z7);
    }

    @Override // j$.util.stream.AbstractC1230b
    final Spliterator U(AbstractC1230b abstractC1230b, Supplier supplier, boolean z7) {
        return new AbstractC1249e3(abstractC1230b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC1230b
    final boolean H(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        DoubleConsumer c1295o;
        boolean n7;
        j$.util.W Z6 = Z(spliterator);
        if (interfaceC1298o2 instanceof DoubleConsumer) {
            c1295o = (DoubleConsumer) interfaceC1298o2;
        } else if (L3.f13096a) {
            L3.a(AbstractC1230b.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC1298o2);
            c1295o = new C1295o(interfaceC1298o2);
        }
        do {
            n7 = interfaceC1298o2.n();
            if (n7) {
                break;
            }
        } while (Z6.tryAdvance(c1295o));
        return n7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final B0 N(long j, IntFunction intFunction) {
        return AbstractC1340x0.J(j);
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final j$.util.I iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h
    public final j$.util.W spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.E
    public final Stream boxed() {
        return new C1319t(this, 0, new C1300p(26), 0);
    }

    @Override // j$.util.stream.E
    public final E e() {
        Objects.requireNonNull(null);
        return new C1324u(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 0);
    }

    @Override // j$.util.stream.E
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C1319t(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, doubleFunction, 0);
    }

    @Override // j$.util.stream.E
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new C1329v(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 0);
    }

    @Override // j$.util.stream.E
    public final InterfaceC1286m0 j() {
        Objects.requireNonNull(null);
        return new C1334w(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 0);
    }

    @Override // j$.util.stream.E
    public final E d(C1225a c1225a) {
        Objects.requireNonNull(c1225a);
        return new C1344y(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n | EnumC1239c3.f13225t, c1225a, 0);
    }

    @Override // j$.util.stream.E
    public final E b() {
        Objects.requireNonNull(null);
        return new C1324u(this, EnumC1239c3.f13225t, 2);
    }

    @Override // j$.util.stream.E
    public final E peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C1344y(this, doubleConsumer);
    }

    @Override // j$.util.stream.E
    public final E limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1340x0.W(this, 0L, j);
    }

    @Override // j$.util.stream.E
    public final E skip(long j) {
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i7 >= 0) {
            return i7 == 0 ? this : AbstractC1340x0.W(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.E
    public final E a() {
        int i7 = k4.f13297a;
        Objects.requireNonNull(null);
        return new A(this, k4.f13297a, 0);
    }

    @Override // j$.util.stream.E
    public final E c() {
        int i7 = k4.f13297a;
        Objects.requireNonNull(null);
        return new A(this, k4.f13298b, 0);
    }

    @Override // j$.util.stream.E
    public final E distinct() {
        return ((AbstractC1258g2) boxed()).distinct().mapToDouble(new C1300p(27));
    }

    @Override // j$.util.stream.E
    public final double sum() {
        double[] dArr = (double[]) collect(new r(0), new C1300p(3), new C1300p(0));
        int i7 = AbstractC1275k.f13293a;
        double d7 = dArr[0] + dArr[1];
        double d8 = dArr[dArr.length - 1];
        return (Double.isNaN(d7) && Double.isInfinite(d8)) ? d8 : d7;
    }

    @Override // j$.util.stream.E
    public final j$.util.C min() {
        return reduce(new C1300p(22));
    }

    @Override // j$.util.stream.E
    public final j$.util.C max() {
        return reduce(new C1300p(29));
    }

    @Override // j$.util.stream.E
    public final j$.util.C average() {
        double[] dArr = (double[]) collect(new C1300p(23), new C1300p(1), new C1300p(2));
        if (dArr[2] > 0.0d) {
            int i7 = AbstractC1275k.f13293a;
            double d7 = dArr[0] + dArr[1];
            double d8 = dArr[dArr.length - 1];
            if (Double.isNaN(d7) && Double.isInfinite(d8)) {
                d7 = d8;
            }
            return j$.util.C.d(d7 / dArr[2]);
        }
        return j$.util.C.a();
    }

    @Override // j$.util.stream.E
    public final C1359y summaryStatistics() {
        return (C1359y) collect(new C1300p(16), new C1300p(24), new C1300p(25));
    }

    @Override // j$.util.stream.E
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C1305q c1305q = new C1305q(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c1305q);
        return D(new D1(EnumC1244d3.DOUBLE_VALUE, c1305q, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.E
    public final boolean p() {
        return ((Boolean) D(AbstractC1340x0.X(EnumC1325u0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final boolean i() {
        return ((Boolean) D(AbstractC1340x0.X(EnumC1325u0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final boolean y() {
        return ((Boolean) D(AbstractC1340x0.X(EnumC1325u0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final double[] toArray() {
        return (double[]) AbstractC1340x0.O((D0) E(new C1300p(28))).d();
    }

    @Override // j$.util.stream.E
    public final double reduce(double d7, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) D(new H1(EnumC1244d3.DOUBLE_VALUE, doubleBinaryOperator, d7))).doubleValue();
    }

    @Override // j$.util.stream.E
    public final j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.C) D(new B1(EnumC1244d3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.E
    public final long count() {
        return ((Long) D(new F1(1))).longValue();
    }
}
