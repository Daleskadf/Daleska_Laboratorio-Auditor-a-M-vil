package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1290n extends AbstractC1253f2 {
    static N0 Y(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        C1300p c1300p = new C1300p(19);
        C1300p c1300p2 = new C1300p(20);
        C1300p c1300p3 = new C1300p(21);
        Objects.requireNonNull(c1300p);
        Objects.requireNonNull(c1300p2);
        Objects.requireNonNull(c1300p3);
        return new N0((Collection) new D1(EnumC1244d3.REFERENCE, c1300p3, c1300p2, c1300p, 3).c(abstractC1230b, spliterator));
    }

    @Override // j$.util.stream.AbstractC1230b
    final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC1239c3.DISTINCT.t(abstractC1230b.K())) {
            return abstractC1230b.C(spliterator, false, intFunction);
        }
        if (EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            return Y(abstractC1230b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C1296o0 c1296o0 = new C1296o0(2, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c1296o0);
        new P(c1296o0, false).e(abstractC1230b, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new N0(keySet);
    }

    @Override // j$.util.stream.AbstractC1230b
    final Spliterator P(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        if (EnumC1239c3.DISTINCT.t(abstractC1230b.K())) {
            return abstractC1230b.X(spliterator);
        }
        if (EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            return Y(abstractC1230b, spliterator).spliterator();
        }
        return new C1284l3(abstractC1230b.X(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        Objects.requireNonNull(interfaceC1298o2);
        if (EnumC1239c3.DISTINCT.t(i7)) {
            return interfaceC1298o2;
        }
        if (EnumC1239c3.SORTED.t(i7)) {
            return new C1280l(interfaceC1298o2);
        }
        return new C1285m(interfaceC1298o2);
    }
}
