package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1321t1 extends AbstractC1331v1 implements InterfaceC1293n2 {

    /* renamed from: h  reason: collision with root package name */
    private final long[] f13352h;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1293n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC1340x0.i(this, l8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1321t1(Spliterator spliterator, AbstractC1230b abstractC1230b, long[] jArr) {
        super(spliterator, abstractC1230b, jArr.length);
        this.f13352h = jArr;
    }

    C1321t1(C1321t1 c1321t1, Spliterator spliterator, long j, long j8) {
        super(c1321t1, spliterator, j, j8, c1321t1.f13352h.length);
        this.f13352h = c1321t1.f13352h;
    }

    @Override // j$.util.stream.AbstractC1331v1
    final AbstractC1331v1 b(Spliterator spliterator, long j, long j8) {
        return new C1321t1(this, spliterator, j, j8);
    }

    @Override // j$.util.stream.AbstractC1331v1, j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        int i7 = this.f;
        if (i7 >= this.f13371g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.f13352h;
        this.f = i7 + 1;
        jArr[i7] = j;
    }
}
