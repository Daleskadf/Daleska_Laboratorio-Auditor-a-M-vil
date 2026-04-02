package Q6;

import D.AbstractC0059i;
import java.util.Arrays;
import m6.AbstractC1446g;
/* loaded from: classes.dex */
public final class v extends g {

    /* renamed from: e  reason: collision with root package name */
    public final transient byte[][] f4500e;
    public final transient int[] f;

    public v(byte[][] bArr, int[] iArr) {
        super(g.f4463d.f4464a);
        this.f4500e = bArr;
        this.f = iArr;
    }

    @Override // Q6.g
    public final String a() {
        throw null;
    }

    @Override // Q6.g
    public final int c() {
        return this.f[this.f4500e.length - 1];
    }

    @Override // Q6.g
    public final String d() {
        return t().d();
    }

    @Override // Q6.g
    public final int e(byte[] other, int i7) {
        kotlin.jvm.internal.j.e(other, "other");
        return t().e(other, i7);
    }

    @Override // Q6.g
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.c() == c() && l(0, gVar, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // Q6.g
    public final byte[] g() {
        return q();
    }

    @Override // Q6.g
    public final byte h(int i7) {
        int i8;
        byte[][] bArr = this.f4500e;
        int[] iArr = this.f;
        AbstractC0281b.c(iArr[bArr.length - 1], i7, 1L);
        int e7 = R6.b.e(this, i7);
        if (e7 == 0) {
            i8 = 0;
        } else {
            i8 = iArr[e7 - 1];
        }
        return bArr[e7][(i7 - i8) + iArr[bArr.length + e7]];
    }

    @Override // Q6.g
    public final int hashCode() {
        int i7 = this.f4465b;
        if (i7 == 0) {
            byte[][] bArr = this.f4500e;
            int length = bArr.length;
            int i8 = 0;
            int i9 = 1;
            int i10 = 0;
            while (i8 < length) {
                int[] iArr = this.f;
                int i11 = iArr[length + i8];
                int i12 = iArr[i8];
                byte[] bArr2 = bArr[i8];
                int i13 = (i12 - i10) + i11;
                while (i11 < i13) {
                    i9 = (i9 * 31) + bArr2[i11];
                    i11++;
                }
                i8++;
                i10 = i12;
            }
            this.f4465b = i9;
            return i9;
        }
        return i7;
    }

    @Override // Q6.g
    public final int i(byte[] other, int i7) {
        kotlin.jvm.internal.j.e(other, "other");
        return t().i(other, i7);
    }

    @Override // Q6.g
    public final boolean l(int i7, g other, int i8) {
        int i9;
        kotlin.jvm.internal.j.e(other, "other");
        if (i7 < 0 || i7 > c() - i8) {
            return false;
        }
        int i10 = i8 + i7;
        int e7 = R6.b.e(this, i7);
        int i11 = 0;
        while (i7 < i10) {
            int[] iArr = this.f;
            if (e7 == 0) {
                i9 = 0;
            } else {
                i9 = iArr[e7 - 1];
            }
            byte[][] bArr = this.f4500e;
            int i12 = iArr[bArr.length + e7];
            int min = Math.min(i10, (iArr[e7] - i9) + i9) - i7;
            if (!other.m(i11, bArr[e7], (i7 - i9) + i12, min)) {
                return false;
            }
            i11 += min;
            i7 += min;
            e7++;
        }
        return true;
    }

    @Override // Q6.g
    public final boolean m(int i7, byte[] other, int i8, int i9) {
        int i10;
        kotlin.jvm.internal.j.e(other, "other");
        if (i7 < 0 || i7 > c() - i9 || i8 < 0 || i8 > other.length - i9) {
            return false;
        }
        int i11 = i9 + i7;
        int e7 = R6.b.e(this, i7);
        while (i7 < i11) {
            int[] iArr = this.f;
            if (e7 == 0) {
                i10 = 0;
            } else {
                i10 = iArr[e7 - 1];
            }
            byte[][] bArr = this.f4500e;
            int i12 = iArr[bArr.length + e7];
            int min = Math.min(i11, (iArr[e7] - i10) + i10) - i7;
            if (!AbstractC0281b.a(bArr[e7], (i7 - i10) + i12, other, i8, min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            e7++;
        }
        return true;
    }

    @Override // Q6.g
    public final g n(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = c();
        }
        if (i7 >= 0) {
            if (i8 <= c()) {
                int i9 = i8 - i7;
                if (i9 >= 0) {
                    if (i7 == 0 && i8 == c()) {
                        return this;
                    }
                    if (i7 == i8) {
                        return g.f4463d;
                    }
                    int e7 = R6.b.e(this, i7);
                    int e8 = R6.b.e(this, i8 - 1);
                    int i10 = e8 + 1;
                    byte[][] bArr = this.f4500e;
                    kotlin.jvm.internal.j.e(bArr, "<this>");
                    F.f.h(i10, bArr.length);
                    Object[] copyOfRange = Arrays.copyOfRange(bArr, e7, i10);
                    kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
                    byte[][] bArr2 = (byte[][]) copyOfRange;
                    int[] iArr = new int[bArr2.length * 2];
                    int i11 = 0;
                    int[] iArr2 = this.f;
                    if (e7 <= e8) {
                        int i12 = e7;
                        int i13 = 0;
                        while (true) {
                            iArr[i13] = Math.min(iArr2[i12] - i7, i9);
                            int i14 = i13 + 1;
                            iArr[i13 + bArr2.length] = iArr2[bArr.length + i12];
                            if (i12 == e8) {
                                break;
                            }
                            i12++;
                            i13 = i14;
                        }
                    }
                    if (e7 != 0) {
                        i11 = iArr2[e7 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i7 - i11) + iArr[length];
                    return new v(bArr2, iArr);
                }
                throw new IllegalArgumentException(AbstractC0059i.x("endIndex=", i8, i7, " < beginIndex=").toString());
            }
            StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("endIndex=", i8, " > length(");
            k2.append(c());
            k2.append(')');
            throw new IllegalArgumentException(k2.toString().toString());
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("beginIndex=", i7, " < 0").toString());
    }

    @Override // Q6.g
    public final g p() {
        return t().p();
    }

    @Override // Q6.g
    public final byte[] q() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f4500e;
        int length = bArr2.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = i11 - i8;
            AbstractC1446g.K(bArr2[i7], i9, bArr, i10, i10 + i12);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // Q6.g
    public final void s(e buffer, int i7) {
        int i8;
        kotlin.jvm.internal.j.e(buffer, "buffer");
        int e7 = R6.b.e(this, 0);
        int i9 = 0;
        while (i9 < i7) {
            int[] iArr = this.f;
            if (e7 == 0) {
                i8 = 0;
            } else {
                i8 = iArr[e7 - 1];
            }
            byte[][] bArr = this.f4500e;
            int i10 = iArr[bArr.length + e7];
            int min = Math.min(i7, (iArr[e7] - i8) + i8) - i9;
            int i11 = (i9 - i8) + i10;
            t tVar = new t(bArr[e7], i11, i11 + min, true);
            t tVar2 = buffer.f4461a;
            if (tVar2 == null) {
                tVar.f4496g = tVar;
                tVar.f = tVar;
                buffer.f4461a = tVar;
            } else {
                t tVar3 = tVar2.f4496g;
                kotlin.jvm.internal.j.b(tVar3);
                tVar3.b(tVar);
            }
            i9 += min;
            e7++;
        }
        buffer.f4462b += i7;
    }

    public final g t() {
        return new g(q());
    }

    @Override // Q6.g
    public final String toString() {
        return t().toString();
    }
}
