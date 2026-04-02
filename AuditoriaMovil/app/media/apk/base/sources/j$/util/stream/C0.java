package j$.util.stream;

import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class C0 implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13024a;

    public /* synthetic */ C0(int i7) {
        this.f13024a = i7;
    }

    private final void accept$j$$util$stream$Node$OfDouble$$ExternalSyntheticLambda0(double d7) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0(double d7) {
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        int i7 = this.f13024a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f13024a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
        }
    }
}
