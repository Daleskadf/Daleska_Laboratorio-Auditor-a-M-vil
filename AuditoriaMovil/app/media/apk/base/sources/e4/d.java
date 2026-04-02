package e4;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10874a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10875b;

    public d(i iVar, Object obj, Comparator comparator) {
        this.f10874a = 0;
        this.f10875b = new ArrayDeque();
        while (!iVar.isEmpty()) {
            int compare = obj != null ? comparator.compare(iVar.getKey(), obj) : 1;
            if (compare < 0) {
                iVar = iVar.d();
            } else if (compare == 0) {
                ((ArrayDeque) this.f10875b).push((k) iVar);
                return;
            } else {
                ((ArrayDeque) this.f10875b).push((k) iVar);
                iVar = iVar.a();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10874a) {
            case 0:
                if (((ArrayDeque) this.f10875b).size() > 0) {
                    return true;
                }
                return false;
            default:
                return ((Iterator) this.f10875b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10874a) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) this.f10875b;
                try {
                    k kVar = (k) arrayDeque.pop();
                    AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(kVar.f10879a, kVar.f10880b);
                    for (i iVar = kVar.f10882d; !iVar.isEmpty(); iVar = iVar.a()) {
                        arrayDeque.push((k) iVar);
                    }
                    return simpleEntry;
                } catch (EmptyStackException unused) {
                    throw new NoSuchElementException();
                }
            default:
                return ((Map.Entry) ((Iterator) this.f10875b).next()).getKey();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10874a) {
            case 0:
                throw new UnsupportedOperationException("remove called on immutable collection");
            default:
                ((Iterator) this.f10875b).remove();
                return;
        }
    }

    public d(Iterator it) {
        this.f10874a = 1;
        this.f10875b = it;
    }
}
