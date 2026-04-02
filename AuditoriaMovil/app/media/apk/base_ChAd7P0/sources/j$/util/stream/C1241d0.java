package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
/* renamed from: j$.util.stream.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1241d0 extends AbstractC1273j2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13237b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC1230b f13238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1241d0(AbstractC1230b abstractC1230b, InterfaceC1298o2 interfaceC1298o2, int i7) {
        super(interfaceC1298o2);
        this.f13237b = i7;
        this.f13238c = abstractC1230b;
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        switch (this.f13237b) {
            case 4:
                this.f13287a.l(-1L);
                return;
            default:
                super.l(j);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.f13237b) {
            case 0:
                this.f13287a.accept((InterfaceC1298o2) ((LongFunction) ((C1319t) this.f13238c).f13349n).apply(j));
                return;
            case 1:
                ((C1334w) this.f13238c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((C1329v) this.f13238c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C1324u) this.f13238c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((C1334w) this.f13238c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((C1256g0) this.f13238c).f13274n).accept(j);
                this.f13287a.accept(j);
                return;
        }
    }
}
