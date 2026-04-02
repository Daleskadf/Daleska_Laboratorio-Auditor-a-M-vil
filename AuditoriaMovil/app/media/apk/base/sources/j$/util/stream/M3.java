package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
/* loaded from: classes2.dex */
final class M3 extends AbstractC1253f2 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Predicate f13105m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(AbstractC1258g2 abstractC1258g2, int i7, Predicate predicate) {
        super(abstractC1258g2, i7, 0);
        this.f13105m = predicate;
    }

    @Override // j$.util.stream.AbstractC1230b
    final Spliterator P(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        if (EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            return O(abstractC1230b, spliterator, new r(29)).spliterator();
        }
        return new i4(abstractC1230b.X(spliterator), this.f13105m, 1);
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        return (J0) new e4(this, abstractC1230b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        return new C1280l(this, interfaceC1298o2);
    }
}
