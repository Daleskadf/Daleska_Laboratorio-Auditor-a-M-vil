package j$.util.stream;

import java.util.function.IntPredicate;
/* loaded from: classes2.dex */
final class P3 extends AbstractC1268i2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f13134b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Q3 f13135c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(Q3 q32, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13135c = q32;
        this.f13134b = true;
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13282a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        if (this.f13134b) {
            this.f13135c.getClass();
            IntPredicate intPredicate = null;
            intPredicate.test(i7);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return !this.f13134b || this.f13282a.n();
    }
}
