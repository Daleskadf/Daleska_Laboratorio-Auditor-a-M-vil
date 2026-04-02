package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1326u1 extends AbstractC1331v1 {

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f13360h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1326u1(Spliterator spliterator, AbstractC1230b abstractC1230b, Object[] objArr) {
        super(spliterator, abstractC1230b, objArr.length);
        this.f13360h = objArr;
    }

    C1326u1(C1326u1 c1326u1, Spliterator spliterator, long j, long j8) {
        super(c1326u1, spliterator, j, j8, c1326u1.f13360h.length);
        this.f13360h = c1326u1.f13360h;
    }

    @Override // j$.util.stream.AbstractC1331v1
    final AbstractC1331v1 b(Spliterator spliterator, long j, long j8) {
        return new C1326u1(this, spliterator, j, j8);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i7 = this.f;
        if (i7 >= this.f13371g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.f13360h;
        this.f = i7 + 1;
        objArr[i7] = obj;
    }
}
