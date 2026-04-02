package A3;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class e0 extends K {

    /* renamed from: e  reason: collision with root package name */
    public static final e0 f138e = new e0(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f139c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f140d;

    public e0(Object[] objArr, int i7) {
        this.f139c = objArr;
        this.f140d = i7;
    }

    @Override // A3.K, A3.F
    public final int f(int i7, Object[] objArr) {
        Object[] objArr2 = this.f139c;
        int i8 = this.f140d;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        G.i.i(i7, this.f140d);
        Object obj = this.f139c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // A3.F
    public final Object[] h() {
        return this.f139c;
    }

    @Override // A3.F
    public final int i() {
        return this.f140d;
    }

    @Override // A3.F
    public final int k() {
        return 0;
    }

    @Override // A3.F
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f140d;
    }
}
