package A3;

import java.util.Iterator;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class J extends K {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f95c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f96d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ K f97e;

    public J(K k2, int i7, int i8) {
        this.f97e = k2;
        this.f95c = i7;
        this.f96d = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        G.i.i(i7, this.f96d);
        return this.f97e.get(i7 + this.f95c);
    }

    @Override // A3.F
    public final Object[] h() {
        return this.f97e.h();
    }

    @Override // A3.F
    public final int i() {
        return this.f97e.k() + this.f95c + this.f96d;
    }

    @Override // A3.K, A3.F, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // A3.F
    public final int k() {
        return this.f97e.k() + this.f95c;
    }

    @Override // A3.F
    public final boolean l() {
        return true;
    }

    @Override // A3.K, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f96d;
    }

    @Override // A3.K, java.util.List
    /* renamed from: y */
    public final K subList(int i7, int i8) {
        G.i.l(i7, i8, this.f96d);
        int i9 = this.f95c;
        return this.f97e.subList(i7 + i9, i8 + i9);
    }

    @Override // A3.K, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
