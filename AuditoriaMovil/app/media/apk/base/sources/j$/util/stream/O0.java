package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O0 extends Q0 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f13118k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0(AbstractC1230b abstractC1230b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i7) {
        super(abstractC1230b, spliterator, longFunction, binaryOperator);
        this.f13118k = i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q0, j$.util.stream.AbstractC1245e
    public final AbstractC1245e e(Spliterator spliterator) {
        switch (this.f13118k) {
            case 0:
                return new Q0(this, spliterator);
            case 1:
                return new Q0(this, spliterator);
            case 2:
                return new Q0(this, spliterator);
            default:
                return new Q0(this, spliterator);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q0, j$.util.stream.AbstractC1245e
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f13118k) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }
}
