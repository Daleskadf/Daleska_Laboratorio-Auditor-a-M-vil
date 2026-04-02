package A3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* renamed from: A3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0007e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f134a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Iterator f135b;

    /* renamed from: c  reason: collision with root package name */
    public Object f136c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f137d;

    public C0007e(C0016n c0016n) {
        Iterator it;
        this.f137d = c0016n;
        Collection collection = c0016n.f175b;
        this.f136c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f135b = it;
    }

    public void a() {
        C0016n c0016n = (C0016n) this.f137d;
        c0016n.f();
        if (c0016n.f175b == ((Collection) this.f136c)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f134a) {
            case 0:
                return this.f135b.hasNext();
            case 1:
                return this.f135b.hasNext();
            default:
                a();
                return this.f135b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f134a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f135b.next();
                this.f136c = (Collection) entry.getValue();
                return ((C0008f) this.f137d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f135b.next();
                this.f136c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f135b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z7;
        boolean z8;
        switch (this.f134a) {
            case 0:
                if (((Collection) this.f136c) != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                G.i.o("no calls to next() since the last call to remove()", z7);
                this.f135b.remove();
                ((C0008f) this.f137d).f144d.f126e -= ((Collection) this.f136c).size();
                ((Collection) this.f136c).clear();
                this.f136c = null;
                return;
            case 1:
                if (((Map.Entry) this.f136c) != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                G.i.o("no calls to next() since the last call to remove()", z8);
                Collection collection = (Collection) ((Map.Entry) this.f136c).getValue();
                this.f135b.remove();
                ((C0009g) this.f137d).f147b.f126e -= collection.size();
                collection.clear();
                this.f136c = null;
                return;
            default:
                this.f135b.remove();
                C0016n c0016n = (C0016n) this.f137d;
                b0 b0Var = c0016n.f178e;
                b0Var.f126e--;
                c0016n.h();
                return;
        }
    }

    public C0007e(C0016n c0016n, ListIterator listIterator) {
        this.f137d = c0016n;
        this.f136c = c0016n.f175b;
        this.f135b = listIterator;
    }

    public C0007e(C0009g c0009g, Iterator it) {
        this.f137d = c0009g;
        this.f135b = it;
    }

    public C0007e(C0008f c0008f) {
        this.f137d = c0008f;
        this.f135b = c0008f.f143c.entrySet().iterator();
    }
}
