package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W3 extends AbstractC1266i0 implements b4 {
    @Override // j$.util.stream.AbstractC1230b
    final Spliterator P(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        if (EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            return O(abstractC1230b, spliterator, new C1233b2(9)).spliterator();
        }
        return new h4((j$.util.c0) abstractC1230b.X(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        return (J0) new d4(this, abstractC1230b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        return new V3(this, interfaceC1298o2, false);
    }

    @Override // j$.util.stream.b4
    public final c4 k(B0 b0, boolean z7) {
        return new V3(this, b0, z7);
    }
}
