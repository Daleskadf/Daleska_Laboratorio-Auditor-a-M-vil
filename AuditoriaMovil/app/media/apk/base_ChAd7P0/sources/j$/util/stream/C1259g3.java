package j$.util.stream;

import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.g3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1259g3 extends AbstractC1269i3 implements IntConsumer {

    /* renamed from: c  reason: collision with root package name */
    final int[] f13275c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1259g3(int i7) {
        this.f13275c = new int[i7];
    }

    @Override // j$.util.stream.AbstractC1269i3
    public final void b(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i7 = 0; i7 < j; i7++) {
            intConsumer.accept(this.f13275c[i7]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        int i8 = this.f13283b;
        this.f13283b = i8 + 1;
        this.f13275c[i8] = i7;
    }
}
