package A3;

import java.util.List;
import java.util.ListIterator;
/* renamed from: A3.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015m extends C0007e implements ListIterator {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0016n f172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015m(C0016n c0016n) {
        super(c0016n);
        this.f172e = c0016n;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0016n c0016n = this.f172e;
        boolean isEmpty = c0016n.isEmpty();
        b().add(obj);
        c0016n.f.f126e++;
        if (isEmpty) {
            c0016n.e();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f135b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015m(C0016n c0016n, int i7) {
        super(c0016n, ((List) c0016n.f175b).listIterator(i7));
        this.f172e = c0016n;
    }
}
