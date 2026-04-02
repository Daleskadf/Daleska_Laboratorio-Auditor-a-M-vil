package j$.util.stream;

import j$.util.C1360z;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1231b0 extends AbstractC1230b implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.D findAny() {
        return (j$.util.D) D(H.f13061d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D findFirst() {
        return (j$.util.D) D(H.f13060c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new AbstractC1226a0(this, EnumC1239c3.f13222q | EnumC1239c3.f13220o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        D(new N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        D(new N(intConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.Z Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Z) {
            return (j$.util.Z) spliterator;
        }
        if (L3.f13096a) {
            L3.a(AbstractC1230b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final EnumC1244d3 I() {
        return EnumC1244d3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 F(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC1340x0.G(abstractC1230b, spliterator, z7);
    }

    @Override // j$.util.stream.AbstractC1230b
    final Spliterator U(AbstractC1230b abstractC1230b, Supplier supplier, boolean z7) {
        return new AbstractC1249e3(abstractC1230b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC1230b
    final boolean H(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        IntConsumer u7;
        boolean n7;
        j$.util.Z Z6 = Z(spliterator);
        if (interfaceC1298o2 instanceof IntConsumer) {
            u7 = (IntConsumer) interfaceC1298o2;
        } else if (L3.f13096a) {
            L3.a(AbstractC1230b.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC1298o2);
            u7 = new U(interfaceC1298o2);
        }
        do {
            n7 = interfaceC1298o2.n();
            if (n7) {
                break;
            }
        } while (Z6.tryAdvance(u7));
        return n7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final B0 N(long j, IntFunction intFunction) {
        return AbstractC1340x0.S(j);
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final j$.util.M iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h
    public final j$.util.Z spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC1286m0 asLongStream() {
        return new C1334w(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final E asDoubleStream() {
        return new C1324u(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C1319t(this, 0, new r(8), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        Objects.requireNonNull(intUnaryOperator);
        return new W(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C1319t(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC1286m0 m() {
        Objects.requireNonNull(null);
        return new C1334w(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final E f() {
        Objects.requireNonNull(null);
        return new C1324u(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i7, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) D(new O1(EnumC1244d3.INT_VALUE, intBinaryOperator, i7))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream q(P0 p02) {
        Objects.requireNonNull(p02);
        return new W(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n | EnumC1239c3.f13225t, p02, 2);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.D) D(new B1(EnumC1244d3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C1329v(this, EnumC1239c3.f13225t, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new W(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1340x0.Y(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i7 >= 0) {
            return i7 == 0 ? this : AbstractC1340x0.Y(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i7 = k4.f13297a;
        Objects.requireNonNull(null);
        return new AbstractC1226a0(this, k4.f13297a, 0);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i7 = k4.f13297a;
        Objects.requireNonNull(null);
        return new AbstractC1226a0(this, k4.f13298b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) D(new F1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC1258g2) boxed()).distinct().mapToInt(new r(7));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new r(12));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D min() {
        return reduce(new r(9));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D max() {
        return reduce(new r(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C average() {
        long[] jArr = (long[]) collect(new r(14), new r(15), new r(16));
        long j = jArr[0];
        return j > 0 ? j$.util.C.d(jArr[1] / j) : j$.util.C.a();
    }

    @Override // j$.util.stream.IntStream
    public final C1360z summaryStatistics() {
        return (C1360z) collect(new C1300p(17), new r(10), new r(11));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C1305q c1305q = new C1305q(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c1305q);
        return D(new D1(EnumC1244d3.INT_VALUE, c1305q, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) D(AbstractC1340x0.Z(EnumC1325u0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean v() {
        return ((Boolean) D(AbstractC1340x0.Z(EnumC1325u0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) D(AbstractC1340x0.Z(EnumC1325u0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC1340x0.P((F0) E(new r(6))).d();
    }
}
