package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1258g2 extends AbstractC1230b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new J2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new AbstractC1253f2(this, EnumC1239c3.f13218m | EnumC1239c3.f13225t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(1, comparator));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) D(J.f13074d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) D(J.f13073c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new J2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return D(new D1(EnumC1244d3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return D(new D1(EnumC1244d3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new P(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(0, comparator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final EnumC1244d3 I() {
        return EnumC1244d3.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) D(new B1(EnumC1244d3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 F(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC1340x0.E(abstractC1230b, spliterator, z7, intFunction);
    }

    @Override // j$.util.stream.AbstractC1230b
    final Spliterator U(AbstractC1230b abstractC1230b, Supplier supplier, boolean z7) {
        return new AbstractC1249e3(abstractC1230b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC1230b
    final boolean H(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        boolean n7;
        do {
            n7 = interfaceC1298o2.n();
            if (n7) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC1298o2));
        return n7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final B0 N(long j, IntFunction intFunction) {
        return AbstractC1340x0.D(j, intFunction);
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C1319t(this, EnumC1239c3.f13225t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C1319t(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new W(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, toIntFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return D(new D1(EnumC1244d3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC1286m0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C1256g0(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final E mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C1344y(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) D(new F1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(C1225a c1225a) {
        Objects.requireNonNull(c1225a);
        return new C1319t(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n | EnumC1239c3.f13225t, c1225a, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream t(C1225a c1225a) {
        Objects.requireNonNull(c1225a);
        return new W(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n | EnumC1239c3.f13225t, c1225a, 4);
    }

    @Override // j$.util.stream.Stream
    public final E z(C1225a c1225a) {
        Objects.requireNonNull(c1225a);
        return new C1344y(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n | EnumC1239c3.f13225t, c1225a, 3);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC1286m0 o(C1225a c1225a) {
        Objects.requireNonNull(c1225a);
        return new C1256g0(this, EnumC1239c3.f13221p | EnumC1239c3.f13219n | EnumC1239c3.f13225t, c1225a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C1319t(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1340x0.d0(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i7 >= 0) {
            return i7 == 0 ? this : AbstractC1340x0.d0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i7 = k4.f13297a;
        Objects.requireNonNull(predicate);
        return new M3(this, k4.f13297a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i7 = k4.f13297a;
        Objects.requireNonNull(predicate);
        return new O3(this, k4.f13298b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC1340x0.N(E(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C1233b2(0));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC1340x0.c0(EnumC1325u0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC1340x0.c0(EnumC1325u0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC1340x0.c0(EnumC1325u0.NONE, predicate))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x012f, code lost:
        if (r0.contains(j$.util.stream.EnumC1265i.UNORDERED) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(j$.util.stream.C1270j r10) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC1258g2.h(j$.util.stream.j):java.lang.Object");
    }
}
