package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* loaded from: classes2.dex */
interface J0 {
    J0 b(int i7);

    long count();

    void forEach(Consumer consumer);

    J0 h(long j, long j8, IntFunction intFunction);

    void i(Object[] objArr, int i7);

    Object[] o(IntFunction intFunction);

    int q();

    Spliterator spliterator();
}
