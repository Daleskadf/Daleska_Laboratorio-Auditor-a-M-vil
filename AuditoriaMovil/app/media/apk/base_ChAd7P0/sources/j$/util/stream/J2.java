package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;
/* loaded from: classes2.dex */
final class J2 extends AbstractC1253f2 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f13078m;

    /* renamed from: n  reason: collision with root package name */
    private final Comparator f13079n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(AbstractC1258g2 abstractC1258g2) {
        super(abstractC1258g2, EnumC1239c3.f13222q | EnumC1239c3.f13220o, 0);
        this.f13078m = true;
        this.f13079n = AbstractC1210d.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(AbstractC1258g2 abstractC1258g2, Comparator comparator) {
        super(abstractC1258g2, EnumC1239c3.f13222q | EnumC1239c3.f13221p, 0);
        this.f13078m = false;
        this.f13079n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        Objects.requireNonNull(interfaceC1298o2);
        if (EnumC1239c3.SORTED.t(i7) && this.f13078m) {
            return interfaceC1298o2;
        }
        boolean t7 = EnumC1239c3.SIZED.t(i7);
        Comparator comparator = this.f13079n;
        if (t7) {
            return new C2(interfaceC1298o2, comparator);
        }
        return new C2(interfaceC1298o2, comparator);
    }

    @Override // j$.util.stream.AbstractC1230b
    public final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC1239c3.SORTED.t(abstractC1230b.K()) && this.f13078m) {
            return abstractC1230b.C(spliterator, false, intFunction);
        }
        Object[] o7 = abstractC1230b.C(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(o7, this.f13079n);
        return new M0(o7);
    }
}
