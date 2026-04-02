package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class F implements I3 {

    /* renamed from: a  reason: collision with root package name */
    final int f13046a;

    /* renamed from: b  reason: collision with root package name */
    final Object f13047b;

    /* renamed from: c  reason: collision with root package name */
    final Predicate f13048c;

    /* renamed from: d  reason: collision with root package name */
    final Supplier f13049d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(boolean z7, EnumC1244d3 enumC1244d3, Object obj, Predicate predicate, Supplier supplier) {
        this.f13046a = (z7 ? 0 : EnumC1239c3.f13223r) | EnumC1239c3.f13226u;
        this.f13047b = obj;
        this.f13048c = predicate;
        this.f13049d = supplier;
    }

    @Override // j$.util.stream.I3
    public final int d() {
        return this.f13046a;
    }

    @Override // j$.util.stream.I3
    public final Object b(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        J3 j32 = (J3) this.f13049d.get();
        abstractC1230b.V(spliterator, j32);
        Object obj = j32.get();
        return obj != null ? obj : this.f13047b;
    }

    @Override // j$.util.stream.I3
    public final Object c(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        return new L(this, EnumC1239c3.ORDERED.t(abstractC1230b.K()), abstractC1230b, spliterator).invoke();
    }
}
