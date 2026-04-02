package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1330v0 implements I3 {

    /* renamed from: a  reason: collision with root package name */
    final EnumC1325u0 f13364a;

    /* renamed from: b  reason: collision with root package name */
    final Supplier f13365b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1330v0(EnumC1244d3 enumC1244d3, EnumC1325u0 enumC1325u0, Supplier supplier) {
        this.f13364a = enumC1325u0;
        this.f13365b = supplier;
    }

    @Override // j$.util.stream.I3
    public final int d() {
        return EnumC1239c3.f13226u | EnumC1239c3.f13223r;
    }

    @Override // j$.util.stream.I3
    public final Object b(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        AbstractC1320t0 abstractC1320t0 = (AbstractC1320t0) this.f13365b.get();
        abstractC1230b.V(spliterator, abstractC1320t0);
        return Boolean.valueOf(abstractC1320t0.f13351b);
    }

    @Override // j$.util.stream.I3
    public final Object c(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        return (Boolean) new C1335w0(this, abstractC1230b, spliterator).invoke();
    }
}
