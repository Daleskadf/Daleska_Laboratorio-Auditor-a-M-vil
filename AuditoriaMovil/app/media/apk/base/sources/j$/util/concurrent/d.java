package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class d extends AbstractC1209a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f12924b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f12916b;
        Object obj2 = lVar.f12917c;
        this.j = lVar;
        a();
        return new k(obj, obj2, this.f12898i);
    }
}
