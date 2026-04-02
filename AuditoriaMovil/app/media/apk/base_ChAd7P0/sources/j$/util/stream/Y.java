package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
final class Y extends AbstractC1268i2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f13183b;

    /* renamed from: c  reason: collision with root package name */
    U f13184c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ W f13185d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(W w2, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13185d = w2;
        InterfaceC1298o2 interfaceC1298o22 = this.f13282a;
        Objects.requireNonNull(interfaceC1298o22);
        this.f13184c = new U(interfaceC1298o22);
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13282a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        IntStream intStream = (IntStream) ((P0) this.f13185d.f13171n).apply(i7);
        if (intStream != null) {
            try {
                boolean z7 = this.f13183b;
                U u7 = this.f13184c;
                if (!z7) {
                    intStream.sequential().forEach(u7);
                } else {
                    j$.util.Z spliterator = intStream.sequential().spliterator();
                    while (!this.f13282a.n() && spliterator.tryAdvance((IntConsumer) u7)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        this.f13183b = true;
        return this.f13282a.n();
    }
}
