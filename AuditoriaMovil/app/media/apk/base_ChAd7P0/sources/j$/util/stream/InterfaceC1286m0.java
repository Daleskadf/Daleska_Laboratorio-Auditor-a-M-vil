package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1286m0 extends InterfaceC1260h {
    InterfaceC1286m0 a();

    E asDoubleStream();

    j$.util.C average();

    InterfaceC1286m0 b();

    Stream boxed();

    InterfaceC1286m0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC1286m0 d(C1225a c1225a);

    InterfaceC1286m0 distinct();

    InterfaceC1286m0 e();

    j$.util.E findAny();

    j$.util.E findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    j$.util.Q iterator();

    E l();

    InterfaceC1286m0 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.E max();

    j$.util.E min();

    boolean n();

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    InterfaceC1286m0 parallel();

    InterfaceC1286m0 peek(LongConsumer longConsumer);

    boolean r();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.E reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    InterfaceC1286m0 sequential();

    InterfaceC1286m0 skip(long j);

    InterfaceC1286m0 sorted();

    @Override // j$.util.stream.InterfaceC1260h
    j$.util.c0 spliterator();

    long sum();

    j$.util.B summaryStatistics();

    long[] toArray();

    boolean w();

    IntStream x();
}
