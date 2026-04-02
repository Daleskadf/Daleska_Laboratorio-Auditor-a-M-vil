package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O3 extends AbstractC1253f2 implements b4 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Predicate f13123m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(AbstractC1258g2 abstractC1258g2, int i7, Predicate predicate) {
        super(abstractC1258g2, i7, 0);
        this.f13123m = predicate;
    }

    @Override // j$.util.stream.AbstractC1230b
    final Spliterator P(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        if (EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            return O(abstractC1230b, spliterator, new r(29)).spliterator();
        }
        return new i4(abstractC1230b.X(spliterator), this.f13123m, 0);
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        return (J0) new d4(this, abstractC1230b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        return new N3(this, interfaceC1298o2, false);
    }

    @Override // j$.util.stream.b4
    public final c4 k(B0 b0, boolean z7) {
        return new N3(this, b0, z7);
    }
}
