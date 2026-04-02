package j$.util.stream;

import java.util.function.DoublePredicate;
/* loaded from: classes2.dex */
final class Z3 extends AbstractC1263h2 implements c4 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a4 f13189b;

    @Override // j$.util.stream.c4
    public final long f() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(a4 a4Var, InterfaceC1298o2 interfaceC1298o2, boolean z7) {
        super(interfaceC1298o2);
        this.f13189b = a4Var;
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        this.f13189b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d7);
        throw null;
    }
}
