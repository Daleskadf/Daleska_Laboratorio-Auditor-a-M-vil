package j$.util.stream;

import java.util.function.LongPredicate;
/* loaded from: classes2.dex */
final class V3 extends AbstractC1273j2 implements c4 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ W3 f13169b;

    @Override // j$.util.stream.c4
    public final long f() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3(W3 w32, InterfaceC1298o2 interfaceC1298o2, boolean z7) {
        super(interfaceC1298o2);
        this.f13169b = w32;
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f13169b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}
