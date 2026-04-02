package j$.util.function;

import java.util.function.IntUnaryOperator;
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements IntUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12961a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntUnaryOperator f12962b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IntUnaryOperator f12963c;

    public /* synthetic */ e(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i7) {
        this.f12961a = i7;
        this.f12962b = intUnaryOperator;
        this.f12963c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.f12961a) {
            case 0:
                return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
            default:
                return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
        }
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.f12961a) {
            case 0:
                return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
            default:
                return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
        }
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i7) {
        switch (this.f12961a) {
            case 0:
                return this.f12963c.applyAsInt(this.f12962b.applyAsInt(i7));
            default:
                return this.f12962b.applyAsInt(this.f12963c.applyAsInt(i7));
        }
    }
}
