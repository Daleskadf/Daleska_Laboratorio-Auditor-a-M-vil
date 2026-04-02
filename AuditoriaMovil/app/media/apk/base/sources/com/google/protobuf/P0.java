package com.google.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class P0 {
    public static final P0 f = new P0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f10025a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f10026b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f10027c;

    /* renamed from: d  reason: collision with root package name */
    public int f10028d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10029e;

    public P0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f10025a = i7;
        this.f10026b = iArr;
        this.f10027c = objArr;
        this.f10029e = z7;
    }

    public static P0 c() {
        return new P0(0, new int[8], new Object[8], true);
    }

    public final void a(int i7) {
        int[] iArr = this.f10026b;
        if (i7 > iArr.length) {
            int i8 = this.f10025a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f10026b = Arrays.copyOf(iArr, i7);
            this.f10027c = Arrays.copyOf(this.f10027c, i7);
        }
    }

    public final int b() {
        int s02;
        int i7 = this.f10028d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f10025a; i9++) {
            int i10 = this.f10026b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                ((Integer) this.f10027c[i9]).getClass();
                                s02 = AbstractC0865t.c0(i11);
                            } else {
                                throw new IllegalStateException(X.d());
                            }
                        } else {
                            i8 = ((P0) this.f10027c[i9]).b() + (AbstractC0865t.p0(i11) * 2) + i8;
                        }
                    } else {
                        s02 = AbstractC0865t.Y(i11, (AbstractC0852m) this.f10027c[i9]);
                    }
                } else {
                    ((Long) this.f10027c[i9]).getClass();
                    s02 = AbstractC0865t.d0(i11);
                }
            } else {
                s02 = AbstractC0865t.s0(i11, ((Long) this.f10027c[i9]).longValue());
            }
            i8 = s02 + i8;
        }
        this.f10028d = i8;
        return i8;
    }

    public final void d(int i7, Object obj) {
        if (this.f10029e) {
            a(this.f10025a + 1);
            int[] iArr = this.f10026b;
            int i8 = this.f10025a;
            iArr[i8] = i7;
            this.f10027c[i8] = obj;
            this.f10025a = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(C0845i0 c0845i0) {
        if (this.f10025a == 0) {
            return;
        }
        c0845i0.getClass();
        for (int i7 = 0; i7 < this.f10025a; i7++) {
            int i8 = this.f10026b[i7];
            Object obj = this.f10027c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                c0845i0.f(i9, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(X.d());
                            }
                        } else {
                            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
                            abstractC0865t.K0(i9, 3);
                            ((P0) obj).e(c0845i0);
                            abstractC0865t.K0(i9, 4);
                        }
                    } else {
                        c0845i0.c(i9, (AbstractC0852m) obj);
                    }
                } else {
                    c0845i0.g(i9, ((Long) obj).longValue());
                }
            } else {
                c0845i0.k(i9, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        int i7 = this.f10025a;
        if (i7 == p02.f10025a) {
            int[] iArr = this.f10026b;
            int[] iArr2 = p02.f10026b;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.f10027c;
                    Object[] objArr2 = p02.f10027c;
                    int i9 = this.f10025a;
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
        int i7 = this.f10025a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f10026b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f10027c;
        int i13 = this.f10025a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
