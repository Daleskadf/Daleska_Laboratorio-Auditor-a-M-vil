package D6;

import java.util.Iterator;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class j implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f906b;

    public j(k kVar) {
        this.f906b = kVar;
        this.f905a = new E6.b(kVar.f907a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f905a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f906b.f908b.invoke(this.f905a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
