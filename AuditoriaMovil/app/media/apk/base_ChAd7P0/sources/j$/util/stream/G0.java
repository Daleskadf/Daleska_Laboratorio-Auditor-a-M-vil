package j$.util.stream;

import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class G0 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13056a;

    public /* synthetic */ G0(int i7) {
        this.f13056a = i7;
    }

    private final void accept$j$$util$stream$Node$OfLong$$ExternalSyntheticLambda0(long j) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfLong$$ExternalSyntheticLambda0(long j) {
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i7 = this.f13056a;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f13056a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
        }
    }
}
