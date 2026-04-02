package j$.util;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1222p extends C1220n implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* renamed from: b  reason: collision with root package name */
    final java.util.List f13002b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1222p(java.util.List list) {
        super(list);
        this.f13002b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f13002b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f13002b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f13002b.get(i7);
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f13002b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f13002b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C1221o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C1221o(this, i7);
    }

    @Override // java.util.List
    public java.util.List subList(int i7, int i8) {
        return new C1222p(this.f13002b.subList(i7, i8));
    }

    private Object readResolve() {
        java.util.List list = this.f13002b;
        return list instanceof RandomAccess ? new C1222p(list) : this;
    }
}
