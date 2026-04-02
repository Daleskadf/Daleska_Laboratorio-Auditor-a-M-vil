package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1339x extends AbstractC1263h2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f13378b;

    /* renamed from: c  reason: collision with root package name */
    C1295o f13379c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1344y f13380d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339x(C1344y c1344y, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13380d = c1344y;
        InterfaceC1298o2 interfaceC1298o22 = this.f13277a;
        Objects.requireNonNull(interfaceC1298o22);
        this.f13379c = new C1295o(interfaceC1298o22);
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13277a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        E e7 = (E) ((C1225a) this.f13380d.f13394n).apply(d7);
        if (e7 != null) {
            try {
                boolean z7 = this.f13378b;
                C1295o c1295o = this.f13379c;
                if (!z7) {
                    e7.sequential().forEach(c1295o);
                } else {
                    j$.util.W spliterator = e7.sequential().spliterator();
                    while (!this.f13277a.n() && spliterator.tryAdvance((DoubleConsumer) c1295o)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    e7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (e7 != null) {
            e7.close();
        }
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        this.f13378b = true;
        return this.f13277a.n();
    }
}
