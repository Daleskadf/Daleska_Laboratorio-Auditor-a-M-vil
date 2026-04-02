package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1314s extends AbstractC1263h2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13343b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC1230b f13344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1314s(AbstractC1230b abstractC1230b, InterfaceC1298o2 interfaceC1298o2, int i7) {
        super(interfaceC1298o2);
        this.f13343b = i7;
        this.f13344c = abstractC1230b;
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        switch (this.f13343b) {
            case 4:
                this.f13277a.l(-1L);
                return;
            default:
                super.l(j);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        switch (this.f13343b) {
            case 0:
                this.f13277a.accept((InterfaceC1298o2) ((DoubleFunction) ((C1319t) this.f13344c).f13349n).apply(d7));
                return;
            case 1:
                ((C1324u) this.f13344c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d7);
                throw null;
            case 2:
                ((C1329v) this.f13344c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d7);
                throw null;
            case 3:
                ((C1334w) this.f13344c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d7);
                throw null;
            case 4:
                ((C1324u) this.f13344c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d7);
                throw null;
            default:
                ((DoubleConsumer) ((C1344y) this.f13344c).f13394n).accept(d7);
                this.f13277a.accept(d7);
                return;
        }
    }
}
