package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;
/* loaded from: classes2.dex */
final class I2 extends AbstractC1266i0 {
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        Objects.requireNonNull(interfaceC1298o2);
        return EnumC1239c3.SORTED.t(i7) ? interfaceC1298o2 : EnumC1239c3.SIZED.t(i7) ? new AbstractC1273j2(interfaceC1298o2) : new AbstractC1273j2(interfaceC1298o2);
    }

    @Override // j$.util.stream.AbstractC1230b
    public final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC1239c3.SORTED.t(abstractC1230b.K())) {
            return abstractC1230b.C(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((H0) abstractC1230b.C(spliterator, true, intFunction)).d();
        Arrays.sort(jArr);
        return new C1297o1(jArr);
    }
}
