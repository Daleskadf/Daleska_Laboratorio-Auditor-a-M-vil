package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class h0 {
    public static final h0 f = new h0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f7828a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f7829b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f7830c;

    /* renamed from: d  reason: collision with root package name */
    public int f7831d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7832e;

    public h0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f7828a = i7;
        this.f7829b = iArr;
        this.f7830c = objArr;
        this.f7832e = z7;
    }

    public final void a(int i7) {
        int[] iArr = this.f7829b;
        if (i7 > iArr.length) {
            int i8 = this.f7828a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f7829b = Arrays.copyOf(iArr, i7);
            this.f7830c = Arrays.copyOf(this.f7830c, i7);
        }
    }

    public final int b() {
        int j02;
        int i7 = this.f7831d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7828a; i9++) {
            int i10 = this.f7829b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                ((Integer) this.f7830c[i9]).getClass();
                                j02 = C0534k.U(i11);
                            } else {
                                throw new IllegalStateException(C.b());
                            }
                        } else {
                            i8 = ((h0) this.f7830c[i9]).b() + (C0534k.g0(i11) * 2) + i8;
                        }
                    } else {
                        j02 = C0534k.R(i11, (C0530g) this.f7830c[i9]);
                    }
                } else {
                    ((Long) this.f7830c[i9]).getClass();
                    j02 = C0534k.V(i11);
                }
            } else {
                j02 = C0534k.j0(i11, ((Long) this.f7830c[i9]).longValue());
            }
            i8 = j02 + i8;
        }
        this.f7831d = i8;
        return i8;
    }

    public final void c(int i7, Object obj) {
        if (this.f7832e) {
            a(this.f7828a + 1);
            int[] iArr = this.f7829b;
            int i8 = this.f7828a;
            iArr[i8] = i7;
            this.f7830c[i8] = obj;
            this.f7828a = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(I i7) {
        if (this.f7828a == 0) {
            return;
        }
        i7.getClass();
        for (int i8 = 0; i8 < this.f7828a; i8++) {
            int i9 = this.f7829b[i8];
            Object obj = this.f7830c[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                i7.e(i10, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(C.b());
                            }
                        } else {
                            C0534k c0534k = (C0534k) i7.f7755a;
                            c0534k.A0(i10, 3);
                            ((h0) obj).d(i7);
                            c0534k.A0(i10, 4);
                        }
                    } else {
                        i7.b(i10, (C0530g) obj);
                    }
                } else {
                    i7.f(i10, ((Long) obj).longValue());
                }
            } else {
                i7.j(i10, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        int i7 = this.f7828a;
        if (i7 == h0Var.f7828a) {
            int[] iArr = this.f7829b;
            int[] iArr2 = h0Var.f7829b;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.f7830c;
                    Object[] objArr2 = h0Var.f7830c;
                    int i9 = this.f7828a;
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
        int i7 = this.f7828a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f7829b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f7830c;
        int i13 = this.f7828a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
