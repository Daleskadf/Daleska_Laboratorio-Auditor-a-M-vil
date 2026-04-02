package j$.util.stream;

import java.util.function.DoublePredicate;
/* loaded from: classes2.dex */
final class X3 extends AbstractC1263h2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f13181b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Y3 f13182c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(Y3 y3, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13182c = y3;
        this.f13181b = true;
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13277a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        if (this.f13181b) {
            this.f13182c.getClass();
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d7);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return !this.f13181b || this.f13277a.n();
    }
}
