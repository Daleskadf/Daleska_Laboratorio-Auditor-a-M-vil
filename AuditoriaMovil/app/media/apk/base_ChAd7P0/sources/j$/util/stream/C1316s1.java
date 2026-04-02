package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1316s1 extends AbstractC1331v1 implements InterfaceC1288m2 {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f13345h;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC1340x0.g(this, num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1316s1(Spliterator spliterator, AbstractC1230b abstractC1230b, int[] iArr) {
        super(spliterator, abstractC1230b, iArr.length);
        this.f13345h = iArr;
    }

    C1316s1(C1316s1 c1316s1, Spliterator spliterator, long j, long j8) {
        super(c1316s1, spliterator, j, j8, c1316s1.f13345h.length);
        this.f13345h = c1316s1.f13345h;
    }

    @Override // j$.util.stream.AbstractC1331v1
    final AbstractC1331v1 b(Spliterator spliterator, long j, long j8) {
        return new C1316s1(this, spliterator, j, j8);
    }

    @Override // j$.util.stream.AbstractC1331v1, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        int i8 = this.f;
        if (i8 >= this.f13371g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.f13345h;
        this.f = i8 + 1;
        iArr[i8] = i7;
    }
}
