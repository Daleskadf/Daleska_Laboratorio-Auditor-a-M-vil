package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1311r1 extends AbstractC1331v1 implements InterfaceC1283l2 {

    /* renamed from: h  reason: collision with root package name */
    private final double[] f13339h;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1311r1(Spliterator spliterator, AbstractC1230b abstractC1230b, double[] dArr) {
        super(spliterator, abstractC1230b, dArr.length);
        this.f13339h = dArr;
    }

    C1311r1(C1311r1 c1311r1, Spliterator spliterator, long j, long j8) {
        super(c1311r1, spliterator, j, j8, c1311r1.f13339h.length);
        this.f13339h = c1311r1.f13339h;
    }

    @Override // j$.util.stream.AbstractC1331v1
    final AbstractC1331v1 b(Spliterator spliterator, long j, long j8) {
        return new C1311r1(this, spliterator, j, j8);
    }

    @Override // j$.util.stream.AbstractC1331v1, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        int i7 = this.f;
        if (i7 >= this.f13371g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.f13339h;
        this.f = i7 + 1;
        dArr[i7] = d7;
    }
}
