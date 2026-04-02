package j$.util.stream;

import java.util.function.DoubleBinaryOperator;
/* loaded from: classes2.dex */
final class H1 extends AbstractC1340x0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f13062h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ double f13063i;

    @Override // j$.util.stream.AbstractC1340x0
    public final T1 e0() {
        return new C1(this.f13063i, this.f13062h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H1(EnumC1244d3 enumC1244d3, DoubleBinaryOperator doubleBinaryOperator, double d7) {
        this.f13062h = doubleBinaryOperator;
        this.f13063i = d7;
    }
}
