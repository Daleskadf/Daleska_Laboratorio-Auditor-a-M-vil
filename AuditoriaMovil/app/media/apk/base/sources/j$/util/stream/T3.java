package j$.util.stream;

import java.util.function.LongPredicate;
/* loaded from: classes2.dex */
final class T3 extends AbstractC1273j2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f13162b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ U3 f13163c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3(U3 u32, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13163c = u32;
        this.f13162b = true;
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13287a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.f13162b) {
            this.f13163c.getClass();
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return !this.f13162b || this.f13287a.n();
    }
}
