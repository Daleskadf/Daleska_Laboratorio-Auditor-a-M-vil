package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* renamed from: j$.util.stream.b2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1233b2 implements IntFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13204a;

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i7 = this.f13204a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f13204a) {
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        switch (this.f13204a) {
            case 0:
                return new Object[i7];
            case 1:
                return new Integer[i7];
            case 2:
                return new Long[i7];
            case 3:
                return new Double[i7];
            case 4:
            case 5:
            default:
                return new Double[i7];
            case 6:
                return new Integer[i7];
            case 7:
                return new Integer[i7];
            case 8:
                return new Long[i7];
            case 9:
                return new Long[i7];
            case 10:
                return new Double[i7];
        }
    }
}
