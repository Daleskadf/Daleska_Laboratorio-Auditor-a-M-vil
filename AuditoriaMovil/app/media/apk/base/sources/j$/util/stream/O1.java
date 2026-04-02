package j$.util.stream;

import java.util.function.IntBinaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O1 extends AbstractC1340x0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f13119h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f13120i;

    @Override // j$.util.stream.AbstractC1340x0
    public final T1 e0() {
        return new N1(this.f13120i, this.f13119h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O1(EnumC1244d3 enumC1244d3, IntBinaryOperator intBinaryOperator, int i7) {
        this.f13119h = intBinaryOperator;
        this.f13120i = i7;
    }
}
