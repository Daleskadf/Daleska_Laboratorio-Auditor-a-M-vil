package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j0 {
    public static final j0 f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f9667a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f9668b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f9669c;

    /* renamed from: d  reason: collision with root package name */
    public int f9670d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9671e;

    public j0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f9667a = i7;
        this.f9668b = iArr;
        this.f9669c = objArr;
        this.f9671e = z7;
    }

    public static j0 c() {
        return new j0(0, new int[8], new Object[8], true);
    }

    public final void a(int i7) {
        int[] iArr = this.f9668b;
        if (i7 > iArr.length) {
            int i8 = this.f9667a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f9668b = Arrays.copyOf(iArr, i7);
            this.f9669c = Arrays.copyOf(this.f9669c, i7);
        }
    }

    public final int b() {
        int V7;
        int i7 = this.f9670d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9667a; i9++) {
            int i10 = this.f9668b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                ((Integer) this.f9669c[i9]).getClass();
                                V7 = C0784k.F(i11);
                            } else {
                                throw new IllegalStateException(F.c());
                            }
                        } else {
                            i8 = ((j0) this.f9669c[i9]).b() + (C0784k.S(i11) * 2) + i8;
                        }
                    } else {
                        V7 = C0784k.B(i11, (AbstractC0781h) this.f9669c[i9]);
                    }
                } else {
                    ((Long) this.f9669c[i9]).getClass();
                    V7 = C0784k.G(i11);
                }
            } else {
                V7 = C0784k.V(i11, ((Long) this.f9669c[i9]).longValue());
            }
            i8 = V7 + i8;
        }
        this.f9670d = i8;
        return i8;
    }

    public final void d(int i7, Object obj) {
        if (this.f9671e) {
            a(this.f9667a + 1);
            int[] iArr = this.f9668b;
            int i8 = this.f9667a;
            iArr[i8] = i7;
            this.f9669c[i8] = obj;
            this.f9667a = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(O o7) {
        if (this.f9667a == 0) {
            return;
        }
        o7.getClass();
        for (int i7 = 0; i7 < this.f9667a; i7++) {
            int i8 = this.f9668b[i7];
            Object obj = this.f9669c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                o7.e(i9, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(F.c());
                            }
                        } else {
                            C0784k c0784k = (C0784k) o7.f9607a;
                            c0784k.e0(i9, 3);
                            ((j0) obj).e(o7);
                            c0784k.e0(i9, 4);
                        }
                    } else {
                        o7.b(i9, (AbstractC0781h) obj);
                    }
                } else {
                    o7.f(i9, ((Long) obj).longValue());
                }
            } else {
                o7.j(i9, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i7 = this.f9667a;
        if (i7 == j0Var.f9667a) {
            int[] iArr = this.f9668b;
            int[] iArr2 = j0Var.f9668b;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.f9669c;
                    Object[] objArr2 = j0Var.f9669c;
                    int i9 = this.f9667a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f9667a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f9668b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f9669c;
        int i13 = this.f9667a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
