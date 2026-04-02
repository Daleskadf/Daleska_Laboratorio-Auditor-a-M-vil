package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B1 extends AbstractC1340x0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f13020h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f13021i;

    public /* synthetic */ B1(EnumC1244d3 enumC1244d3, Object obj, int i7) {
        this.f13020h = i7;
        this.f13021i = obj;
    }

    @Override // j$.util.stream.AbstractC1340x0
    public final T1 e0() {
        switch (this.f13020h) {
            case 0:
                return new S1((LongBinaryOperator) this.f13021i);
            case 1:
                return new E1((DoubleBinaryOperator) this.f13021i);
            case 2:
                return new J1((BinaryOperator) this.f13021i);
            default:
                return new P1((IntBinaryOperator) this.f13021i);
        }
    }
}
