package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
/* loaded from: classes2.dex */
final class V extends AbstractC1268i2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13167b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC1230b f13168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractC1230b abstractC1230b, InterfaceC1298o2 interfaceC1298o2, int i7) {
        super(interfaceC1298o2);
        this.f13167b = i7;
        this.f13168c = abstractC1230b;
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        switch (this.f13167b) {
            case 5:
                this.f13282a.l(-1L);
                return;
            default:
                super.l(j);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        switch (this.f13167b) {
            case 0:
                this.f13282a.accept((InterfaceC1298o2) ((IntFunction) ((C1319t) this.f13168c).f13349n).apply(i7));
                return;
            case 1:
                ((IntConsumer) ((W) this.f13168c).f13171n).accept(i7);
                this.f13282a.accept(i7);
                return;
            case 2:
                this.f13282a.accept(((IntUnaryOperator) ((W) this.f13168c).f13171n).applyAsInt(i7));
                return;
            case 3:
                ((C1334w) this.f13168c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i7);
                throw null;
            case 4:
                ((C1324u) this.f13168c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i7);
                throw null;
            default:
                ((C1329v) this.f13168c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i7);
                throw null;
        }
    }
}
