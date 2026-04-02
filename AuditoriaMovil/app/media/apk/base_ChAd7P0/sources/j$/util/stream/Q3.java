package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q3 extends AbstractC1226a0 {
    @Override // j$.util.stream.AbstractC1230b
    final Spliterator P(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        if (EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            return O(abstractC1230b, spliterator, new C1233b2(6)).spliterator();
        }
        return new g4((j$.util.Z) abstractC1230b.X(spliterator), 1);
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        return (J0) new e4(this, abstractC1230b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        return new P3(this, interfaceC1298o2);
    }
}
