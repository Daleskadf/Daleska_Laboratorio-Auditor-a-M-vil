package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1251f0 extends AbstractC1273j2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f13264b;

    /* renamed from: c  reason: collision with root package name */
    C1236c0 f13265c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1256g0 f13266d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1251f0(C1256g0 c1256g0, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13266d = c1256g0;
        InterfaceC1298o2 interfaceC1298o22 = this.f13287a;
        Objects.requireNonNull(interfaceC1298o22);
        this.f13265c = new C1236c0(interfaceC1298o22);
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13287a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        InterfaceC1286m0 interfaceC1286m0 = (InterfaceC1286m0) ((C1225a) this.f13266d.f13274n).apply(j);
        if (interfaceC1286m0 != null) {
            try {
                boolean z7 = this.f13264b;
                C1236c0 c1236c0 = this.f13265c;
                if (!z7) {
                    interfaceC1286m0.sequential().forEach(c1236c0);
                } else {
                    j$.util.c0 spliterator = interfaceC1286m0.sequential().spliterator();
                    while (!this.f13287a.n() && spliterator.tryAdvance((LongConsumer) c1236c0)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC1286m0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC1286m0 != null) {
            interfaceC1286m0.close();
        }
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        this.f13264b = true;
        return this.f13287a.n();
    }
}
