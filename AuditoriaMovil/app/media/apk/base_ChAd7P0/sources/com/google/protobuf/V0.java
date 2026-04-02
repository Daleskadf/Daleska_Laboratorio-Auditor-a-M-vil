package com.google.protobuf;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class V0 extends X0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f10036b = i7;
    }

    @Override // com.google.protobuf.X0
    public final void c(long j, byte[] bArr, long j8, long j9) {
        switch (this.f10036b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.X0
    public final boolean d(Object obj, long j) {
        switch (this.f10036b) {
            case 0:
                if (Y0.f10053h) {
                    if (Y0.h(obj, j) == 0) {
                        return false;
                    }
                } else if (Y0.i(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (Y0.f10053h) {
                    if (Y0.h(obj, j) == 0) {
                        return false;
                    }
                } else if (Y0.i(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.X0
    public final byte e(long j) {
        switch (this.f10036b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.X0
    public final byte f(Object obj, long j) {
        switch (this.f10036b) {
            case 0:
                if (Y0.f10053h) {
                    return Y0.h(obj, j);
                }
                return Y0.i(obj, j);
            default:
                if (Y0.f10053h) {
                    return Y0.h(obj, j);
                }
                return Y0.i(obj, j);
        }
    }

    @Override // com.google.protobuf.X0
    public final double g(Object obj, long j) {
        switch (this.f10036b) {
            case 0:
                return Double.longBitsToDouble(j(obj, j));
            default:
                return Double.longBitsToDouble(j(obj, j));
        }
    }

    @Override // com.google.protobuf.X0
    public final float h(Object obj, long j) {
        switch (this.f10036b) {
            case 0:
                return Float.intBitsToFloat(i(obj, j));
            default:
                return Float.intBitsToFloat(i(obj, j));
        }
    }

    @Override // com.google.protobuf.X0
    public final void m(Object obj, long j, boolean z7) {
        switch (this.f10036b) {
            case 0:
                if (Y0.f10053h) {
                    Y0.m(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    Y0.n(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (Y0.f10053h) {
                    Y0.m(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    Y0.n(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.X0
    public final void n(Object obj, long j, byte b5) {
        switch (this.f10036b) {
            case 0:
                if (Y0.f10053h) {
                    Y0.m(obj, j, b5);
                    return;
                } else {
                    Y0.n(obj, j, b5);
                    return;
                }
            default:
                if (Y0.f10053h) {
                    Y0.m(obj, j, b5);
                    return;
                } else {
                    Y0.n(obj, j, b5);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.X0
    public final void o(Object obj, long j, double d7) {
        switch (this.f10036b) {
            case 0:
                r(obj, j, Double.doubleToLongBits(d7));
                return;
            default:
                r(obj, j, Double.doubleToLongBits(d7));
                return;
        }
    }

    @Override // com.google.protobuf.X0
    public final void p(Object obj, long j, float f) {
        switch (this.f10036b) {
            case 0:
                q(j, obj, Float.floatToIntBits(f));
                return;
            default:
                q(j, obj, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // com.google.protobuf.X0
    public final boolean u() {
        switch (this.f10036b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
