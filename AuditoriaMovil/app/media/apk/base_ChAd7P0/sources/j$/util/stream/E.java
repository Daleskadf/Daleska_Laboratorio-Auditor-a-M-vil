package j$.util.stream;

import j$.util.C1359y;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
/* loaded from: classes2.dex */
public interface E extends InterfaceC1260h {
    E a();

    j$.util.C average();

    E b();

    Stream boxed();

    E c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    E d(C1225a c1225a);

    E distinct();

    E e();

    j$.util.C findAny();

    j$.util.C findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean i();

    @Override // 
    j$.util.I iterator();

    InterfaceC1286m0 j();

    E limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.C max();

    j$.util.C min();

    boolean p();

    @Override // 
    E parallel();

    E peek(DoubleConsumer doubleConsumer);

    double reduce(double d7, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // 
    E sequential();

    E skip(long j);

    E sorted();

    @Override // j$.util.stream.InterfaceC1260h
    j$.util.W spliterator();

    double sum();

    C1359y summaryStatistics();

    double[] toArray();

    IntStream u();

    boolean y();
}
