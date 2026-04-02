package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class p0 extends r0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f9685b = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean c(Object obj, long j) {
        switch (this.f9685b) {
            case 0:
                if (s0.f9694g) {
                    if (s0.h(obj, j) == 0) {
                        return false;
                    }
                } else if (s0.i(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (s0.f9694g) {
                    if (s0.h(obj, j) == 0) {
                        return false;
                    }
                } else if (s0.i(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final byte d(Object obj, long j) {
        switch (this.f9685b) {
            case 0:
                if (s0.f9694g) {
                    return s0.h(obj, j);
                }
                return s0.i(obj, j);
            default:
                if (s0.f9694g) {
                    return s0.h(obj, j);
                }
                return s0.i(obj, j);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final double e(Object obj, long j) {
        switch (this.f9685b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j));
            default:
                return Double.longBitsToDouble(h(obj, j));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final float f(Object obj, long j) {
        switch (this.f9685b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j));
            default:
                return Float.intBitsToFloat(g(obj, j));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void k(Object obj, long j, boolean z7) {
        switch (this.f9685b) {
            case 0:
                if (s0.f9694g) {
                    s0.p(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s0.q(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (s0.f9694g) {
                    s0.p(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s0.q(obj, j, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void l(Object obj, long j, byte b5) {
        switch (this.f9685b) {
            case 0:
                if (s0.f9694g) {
                    s0.p(obj, j, b5);
                    return;
                } else {
                    s0.q(obj, j, b5);
                    return;
                }
            default:
                if (s0.f9694g) {
                    s0.p(obj, j, b5);
                    return;
                } else {
                    s0.q(obj, j, b5);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void m(Object obj, long j, double d7) {
        switch (this.f9685b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d7));
                return;
            default:
                p(obj, j, Double.doubleToLongBits(d7));
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void n(Object obj, long j, float f) {
        switch (this.f9685b) {
            case 0:
                o(j, obj, Float.floatToIntBits(f));
                return;
            default:
                o(j, obj, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean s() {
        switch (this.f9685b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
