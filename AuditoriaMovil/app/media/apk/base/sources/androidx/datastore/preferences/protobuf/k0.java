package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class k0 extends m0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f7846b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean c(Object obj, long j) {
        switch (this.f7846b) {
            case 0:
                if (n0.f7856g) {
                    return n0.b(obj, j);
                }
                return n0.c(obj, j);
            default:
                if (n0.f7856g) {
                    return n0.b(obj, j);
                }
                return n0.c(obj, j);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final double d(Object obj, long j) {
        switch (this.f7846b) {
            case 0:
                return Double.longBitsToDouble(g(obj, j));
            default:
                return Double.longBitsToDouble(g(obj, j));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final float e(Object obj, long j) {
        switch (this.f7846b) {
            case 0:
                return Float.intBitsToFloat(f(obj, j));
            default:
                return Float.intBitsToFloat(f(obj, j));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void j(Object obj, long j, boolean z7) {
        switch (this.f7846b) {
            case 0:
                if (n0.f7856g) {
                    n0.k(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    n0.l(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (n0.f7856g) {
                    n0.k(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    n0.l(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void k(Object obj, long j, byte b5) {
        switch (this.f7846b) {
            case 0:
                if (n0.f7856g) {
                    n0.k(obj, j, b5);
                    return;
                } else {
                    n0.l(obj, j, b5);
                    return;
                }
            default:
                if (n0.f7856g) {
                    n0.k(obj, j, b5);
                    return;
                } else {
                    n0.l(obj, j, b5);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void l(Object obj, long j, double d7) {
        switch (this.f7846b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d7));
                return;
            default:
                o(obj, j, Double.doubleToLongBits(d7));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void m(Object obj, long j, float f) {
        switch (this.f7846b) {
            case 0:
                n(j, obj, Float.floatToIntBits(f));
                return;
            default:
                n(j, obj, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean r() {
        switch (this.f7846b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
