package A3;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class s0 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f191a;

    public s0(Iterator it) {
        it.getClass();
        this.f191a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f191a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f191a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f191a.remove();
    }
}
