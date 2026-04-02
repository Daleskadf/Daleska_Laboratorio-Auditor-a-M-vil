package j$.util.stream;

import j$.util.C1213g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
/* loaded from: classes2.dex */
final class K1 extends AbstractC1340x0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f13083h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ BiConsumer f13084i;
    final /* synthetic */ Supplier j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ C1270j f13085k;

    @Override // j$.util.stream.AbstractC1340x0, j$.util.stream.I3
    public final int d() {
        Set<Collector.Characteristics> characteristics = this.f13085k.f13286a.characteristics();
        if (characteristics != null && !characteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = characteristics.iterator().next();
            if (next instanceof EnumC1265i) {
                Iterator<Collector.Characteristics> it = characteristics.iterator();
                while (it.hasNext()) {
                    try {
                        EnumC1265i enumC1265i = (EnumC1265i) it.next();
                        hashSet.add(enumC1265i == null ? null : enumC1265i == EnumC1265i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC1265i == EnumC1265i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e7) {
                        C1213g.a("java.util.stream.Collector.Characteristics", e7);
                        throw null;
                    }
                }
            } else if (!(next instanceof Collector.Characteristics)) {
                C1213g.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            } else {
                Iterator<Collector.Characteristics> it2 = characteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? EnumC1265i.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? EnumC1265i.UNORDERED : EnumC1265i.IDENTITY_FINISH);
                    } catch (ClassCastException e8) {
                        C1213g.a("java.util.stream.Collector.Characteristics", e8);
                        throw null;
                    }
                }
            }
            characteristics = hashSet;
        }
        if (characteristics.contains(EnumC1265i.UNORDERED)) {
            return EnumC1239c3.f13223r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC1340x0
    public final T1 e0() {
        return new L1(this.j, this.f13084i, this.f13083h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(EnumC1244d3 enumC1244d3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, C1270j c1270j) {
        this.f13083h = binaryOperator;
        this.f13084i = biConsumer;
        this.j = supplier;
        this.f13085k = c1270j;
    }
}
