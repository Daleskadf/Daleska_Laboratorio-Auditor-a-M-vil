package j$.util;

import j$.util.List;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1215i extends C1214h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c  reason: collision with root package name */
    final java.util.List f12975c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1215i(java.util.List list) {
        super(list);
        this.f12975c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1215i(java.util.List list, Object obj) {
        super(list, obj);
        this.f12975c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f12971b) {
            equals = this.f12975c.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.f12971b) {
            hashCode = this.f12975c.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object obj;
        synchronized (this.f12971b) {
            obj = this.f12975c.get(i7);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        Object obj2;
        synchronized (this.f12971b) {
            obj2 = this.f12975c.set(i7, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        synchronized (this.f12971b) {
            this.f12975c.add(i7, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        Object remove;
        synchronized (this.f12971b) {
            remove = this.f12975c.remove(i7);
        }
        return remove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.f12971b) {
            indexOf = this.f12975c.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.f12971b) {
            lastIndexOf = this.f12975c.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, java.util.Collection collection) {
        boolean addAll;
        synchronized (this.f12971b) {
            addAll = this.f12975c.addAll(i7, collection);
        }
        return addAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f12975c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return this.f12975c.listIterator(i7);
    }

    @Override // java.util.List
    public java.util.List subList(int i7, int i8) {
        C1215i c1215i;
        synchronized (this.f12971b) {
            c1215i = new C1215i(this.f12975c.subList(i7, i8), this.f12971b);
        }
        return c1215i;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f12971b) {
            java.util.List list = this.f12975c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.f12971b) {
            List.EL.sort(this.f12975c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f12975c;
        return list instanceof RandomAccess ? new C1215i(list) : this;
    }
}
