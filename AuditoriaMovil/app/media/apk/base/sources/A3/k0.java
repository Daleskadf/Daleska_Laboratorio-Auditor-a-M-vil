package A3;
/* loaded from: classes.dex */
public final class k0 extends P {

    /* renamed from: Z  reason: collision with root package name */
    public static final Object[] f164Z;

    /* renamed from: e0  reason: collision with root package name */
    public static final k0 f165e0;

    /* renamed from: X  reason: collision with root package name */
    public final transient int f166X;

    /* renamed from: Y  reason: collision with root package name */
    public final transient int f167Y;

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f168d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f169e;
    public final transient Object[] f;

    static {
        Object[] objArr = new Object[0];
        f164Z = objArr;
        f165e0 = new k0(objArr, 0, objArr, 0, 0);
    }

    public k0(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f168d = objArr;
        this.f169e = i7;
        this.f = objArr2;
        this.f166X = i8;
        this.f167Y = i9;
    }

    @Override // A3.F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int t7 = AbstractC0021t.t(obj);
                while (true) {
                    int i7 = t7 & this.f166X;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    t7 = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // A3.F
    public final int f(int i7, Object[] objArr) {
        Object[] objArr2 = this.f168d;
        int i8 = this.f167Y;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // A3.F
    public final Object[] h() {
        return this.f168d;
    }

    @Override // A3.P, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f169e;
    }

    @Override // A3.F
    public final int i() {
        return this.f167Y;
    }

    @Override // A3.F
    public final int k() {
        return 0;
    }

    @Override // A3.F
    public final boolean l() {
        return false;
    }

    @Override // A3.F
    public final t0 m() {
        return e().listIterator(0);
    }

    @Override // A3.P
    public final K q() {
        return K.n(this.f167Y, this.f168d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f167Y;
    }
}
