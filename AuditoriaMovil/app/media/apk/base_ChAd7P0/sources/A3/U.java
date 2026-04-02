package A3;

import java.util.AbstractList;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class U extends s0 implements ListIterator {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f116b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractList f117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f116b = i7;
        this.f117c = abstractList;
    }

    @Override // A3.s0
    public final Object a(Object obj) {
        switch (this.f116b) {
            case 0:
                return ((V) this.f117c).f119b.apply(obj);
            default:
                return ((W) this.f117c).f121b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f191a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f191a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f191a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f191a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
