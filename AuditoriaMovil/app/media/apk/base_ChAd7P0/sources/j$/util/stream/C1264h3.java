package j$.util.stream;

import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.h3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1264h3 extends AbstractC1269i3 implements LongConsumer {

    /* renamed from: c  reason: collision with root package name */
    final long[] f13278c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1264h3(int i7) {
        this.f13278c = new long[i7];
    }

    @Override // j$.util.stream.AbstractC1269i3
    public final void b(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i7 = 0; i7 < j; i7++) {
            longConsumer.accept(this.f13278c[i7]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i7 = this.f13283b;
        this.f13283b = i7 + 1;
        this.f13278c[i7] = j;
    }
}
