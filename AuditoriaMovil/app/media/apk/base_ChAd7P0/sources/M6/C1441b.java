package m6;

import D.AbstractC0059i;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/* renamed from: m6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1441b extends kotlin.jvm.internal.a implements ListIterator {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC1443d f14063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441b(AbstractC1443d abstractC1443d, int i7) {
        super(abstractC1443d);
        this.f14063d = abstractC1443d;
        int e7 = abstractC1443d.e();
        if (i7 >= 0 && i7 <= e7) {
            this.f13783b = i7;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, e7, ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f13783b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13783b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f13783b - 1;
            this.f13783b = i7;
            return this.f14063d.get(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13783b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
