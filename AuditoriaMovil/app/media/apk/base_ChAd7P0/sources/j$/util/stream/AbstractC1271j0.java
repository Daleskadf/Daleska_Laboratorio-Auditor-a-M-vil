package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1271j0 extends AbstractC1230b implements InterfaceC1286m0 {
    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.E findAny() {
        return (j$.util.E) D(I.f13067d);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.E findFirst() {
        return (j$.util.E) D(I.f13066c);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 sorted() {
        return new AbstractC1266i0(this, EnumC1239c3.f13222q | EnumC1239c3.f13220o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new O(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new O(longConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.c0 Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.c0) {
            return (j$.util.c0) spliterator;
        }
        if (L3.f13096a) {
            L3.a(AbstractC1230b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final EnumC1244d3 I() {
        return EnumC1244d3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 F(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC1340x0.H(abstractC1230b, spliterator, z7);
    }

    @Override // j$.util.stream.AbstractC1230b
    final Spliterator U(AbstractC1230b abstractC1230b, Supplier supplier, boolean z7) {
        return new AbstractC1249e3(abstractC1230b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC1230b
    final boolean H(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        LongConsumer c1236c0;
        boolean n7;
        j$.util.c0 Z6 = Z(spliterator);
        if (interfaceC1298o2 instanceof LongConsumer) {
            c1236c0 = (LongConsumer) interfaceC1298o2;
        } else if (L3.f13096a) {
            L3.a(AbstractC1230b.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC1298o2);
            c1236c0 = new C1236c0(interfaceC1298o2);
        }
        do {
            n7 = interfaceC1298o2.n();
            if (n7) {
                break;
            }
        } while (Z6.tryAdvance(c1236c0));
        return n7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final B0 N(long j, IntFunction intFunction) {
        return AbstractC1340x0.U(j);
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final j$.util.Q iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h
    public final j$.util.c0 spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final E asDoubleStream() {
        return new C1324u(this, EnumC1239c3.f13219n, 5);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final Stream boxed() {
        return new C1319t(this, 0, new r(22), 2);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 e() {
        Objects.requireNonNull(null);
        return new C1334w(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 3);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C1319t(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final IntStream x() {
        Objects.requireNonNull(null);
        return new C1329v(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 3);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final E l() {
        Objects.requireNonNull(null);
        return new C1324u(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, 6);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 d(C1225a c1225a) {
        Objects.requireNonNull(c1225a);
        return new C1256g0(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n | EnumC1239c3.f13225t, c1225a, 0);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 b() {
        Objects.requireNonNull(null);
        return new C1334w(this, EnumC1239c3.f13225t, 5);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C1256g0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1340x0.a0(this, 0L, j);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 skip(long j) {
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i7 >= 0) {
            return i7 == 0 ? this : AbstractC1340x0.a0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 a() {
        int i7 = k4.f13297a;
        Objects.requireNonNull(null);
        return new AbstractC1266i0(this, k4.f13297a, 0);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 c() {
        int i7 = k4.f13297a;
        Objects.requireNonNull(null);
        return new AbstractC1266i0(this, k4.f13298b, 0);
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final InterfaceC1286m0 distinct() {
        return ((AbstractC1258g2) boxed()).distinct().mapToLong(new r(19));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final long sum() {
        return reduce(0L, new r(27));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.E min() {
        return reduce(new r(18));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.E max() {
        return reduce(new r(26));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.C average() {
        long[] jArr = (long[]) collect(new r(23), new r(24), new r(25));
        long j = jArr[0];
        return j > 0 ? j$.util.C.d(jArr[1] / j) : j$.util.C.a();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) D(new C1351z1(EnumC1244d3.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.B summaryStatistics() {
        return (j$.util.B) collect(new C1300p(18), new r(17), new r(20));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C1305q c1305q = new C1305q(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c1305q);
        return D(new D1(EnumC1244d3.LONG_VALUE, c1305q, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final boolean w() {
        return ((Boolean) D(AbstractC1340x0.b0(EnumC1325u0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final boolean r() {
        return ((Boolean) D(AbstractC1340x0.b0(EnumC1325u0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.E) D(new B1(EnumC1244d3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final boolean n() {
        return ((Boolean) D(AbstractC1340x0.b0(EnumC1325u0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final long[] toArray() {
        return (long[]) AbstractC1340x0.Q((H0) E(new r(21))).d();
    }

    @Override // j$.util.stream.InterfaceC1286m0
    public final long count() {
        return ((Long) D(new F1(0))).longValue();
    }
}
