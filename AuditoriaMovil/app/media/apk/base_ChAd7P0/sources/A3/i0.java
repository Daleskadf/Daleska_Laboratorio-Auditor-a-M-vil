package A3;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class i0 extends K {

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f154c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f155d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f156e;

    public i0(Object[] objArr, int i7, int i8) {
        this.f154c = objArr;
        this.f155d = i7;
        this.f156e = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        G.i.i(i7, this.f156e);
        Object obj = this.f154c[(i7 * 2) + this.f155d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // A3.F
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f156e;
    }
}
