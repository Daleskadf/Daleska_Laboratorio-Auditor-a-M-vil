package j$.util.stream;

import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class E0 implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13036a;

    public /* synthetic */ E0(int i7) {
        this.f13036a = i7;
    }

    private final void accept$j$$util$stream$Node$OfInt$$ExternalSyntheticLambda0(int i7) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfInt$$ExternalSyntheticLambda0(int i7) {
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        int i8 = this.f13036a;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f13036a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
        }
    }
}
