package j$.util.stream;

import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.f3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1254f3 extends AbstractC1269i3 implements DoubleConsumer {

    /* renamed from: c  reason: collision with root package name */
    final double[] f13270c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1254f3(int i7) {
        this.f13270c = new double[i7];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1269i3
    public final void b(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i7 = 0; i7 < j; i7++) {
            doubleConsumer.accept(this.f13270c[i7]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        int i7 = this.f13283b;
        this.f13283b = i7 + 1;
        this.f13270c[i7] = d7;
    }
}
