package Q6;

import java.io.Serializable;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public class g implements Serializable, Comparable {

    /* renamed from: d  reason: collision with root package name */
    public static final g f4463d = new g(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4464a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f4465b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f4466c;

    public g(byte[] data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.f4464a = data;
    }

    public static int f(g gVar, g other) {
        gVar.getClass();
        kotlin.jvm.internal.j.e(other, "other");
        return gVar.e(other.f4464a, 0);
    }

    public static int j(g gVar, g other) {
        gVar.getClass();
        kotlin.jvm.internal.j.e(other, "other");
        return gVar.i(other.f4464a, -1234567890);
    }

    public static final g k(byte... data) {
        kotlin.jvm.internal.j.e(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.j.d(copyOf, "copyOf(this, size)");
        return new g(copyOf);
    }

    public static /* synthetic */ g o(g gVar, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = -1234567890;
        }
        return gVar.n(i7, i8);
    }

    public String a() {
        byte[] map = AbstractC0280a.f4454a;
        byte[] bArr = this.f4464a;
        kotlin.jvm.internal.j.e(bArr, "<this>");
        kotlin.jvm.internal.j.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b5 = bArr[i7];
            int i9 = i7 + 2;
            byte b7 = bArr[i7 + 1];
            i7 += 3;
            byte b8 = bArr[i9];
            bArr2[i8] = map[(b5 & ForkServer.ERROR) >> 2];
            bArr2[i8 + 1] = map[((b5 & 3) << 4) | ((b7 & ForkServer.ERROR) >> 4)];
            int i10 = i8 + 3;
            bArr2[i8 + 2] = map[((b7 & 15) << 2) | ((b8 & ForkServer.ERROR) >> 6)];
            i8 += 4;
            bArr2[i10] = map[b8 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i11 = i7 + 1;
                byte b9 = bArr[i7];
                byte b10 = bArr[i11];
                bArr2[i8] = map[(b9 & ForkServer.ERROR) >> 2];
                bArr2[i8 + 1] = map[((b9 & 3) << 4) | ((b10 & ForkServer.ERROR) >> 4)];
                bArr2[i8 + 2] = map[(b10 & 15) << 2];
                bArr2[i8 + 3] = 61;
            }
        } else {
            byte b11 = bArr[i7];
            bArr2[i8] = map[(b11 & ForkServer.ERROR) >> 2];
            bArr2[i8 + 1] = map[(b11 & 3) << 4];
            bArr2[i8 + 2] = 61;
            bArr2[i8 + 3] = 61;
        }
        return new String(bArr2, E6.a.f1074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(Q6.g r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.j.e(r10, r0)
            int r0 = r9.c()
            int r1 = r10.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.h(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.h(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.g.compareTo(Q6.g):int");
    }

    public int c() {
        return this.f4464a.length;
    }

    public String d() {
        byte[] bArr = this.f4464a;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b5 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = R6.b.f4784a;
            cArr[i7] = cArr2[(b5 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public int e(byte[] other, int i7) {
        kotlin.jvm.internal.j.e(other, "other");
        byte[] bArr = this.f4464a;
        int length = bArr.length - other.length;
        int max = Math.max(i7, 0);
        if (max <= length) {
            while (!AbstractC0281b.a(bArr, max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            int c8 = gVar.c();
            byte[] bArr = this.f4464a;
            if (c8 == bArr.length && gVar.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] g() {
        return this.f4464a;
    }

    public byte h(int i7) {
        return this.f4464a[i7];
    }

    public int hashCode() {
        int i7 = this.f4465b;
        if (i7 == 0) {
            int hashCode = Arrays.hashCode(this.f4464a);
            this.f4465b = hashCode;
            return hashCode;
        }
        return i7;
    }

    public int i(byte[] other, int i7) {
        kotlin.jvm.internal.j.e(other, "other");
        if (i7 == -1234567890) {
            i7 = c();
        }
        byte[] bArr = this.f4464a;
        for (int min = Math.min(i7, bArr.length - other.length); -1 < min; min--) {
            if (AbstractC0281b.a(bArr, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i7, g other, int i8) {
        kotlin.jvm.internal.j.e(other, "other");
        return other.m(0, this.f4464a, i7, i8);
    }

    public boolean m(int i7, byte[] other, int i8, int i9) {
        kotlin.jvm.internal.j.e(other, "other");
        if (i7 >= 0) {
            byte[] bArr = this.f4464a;
            if (i7 <= bArr.length - i9 && i8 >= 0 && i8 <= other.length - i9 && AbstractC0281b.a(bArr, i7, other, i8, i9)) {
                return true;
            }
        }
        return false;
    }

    public g n(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = c();
        }
        if (i7 >= 0) {
            byte[] bArr = this.f4464a;
            if (i8 <= bArr.length) {
                if (i8 - i7 >= 0) {
                    if (i7 == 0 && i8 == bArr.length) {
                        return this;
                    }
                    F.f.h(i8, bArr.length);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
                    kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
                    return new g(copyOfRange);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public g p() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f4464a;
            if (i7 < bArr.length) {
                byte b5 = bArr[i7];
                if (b5 >= 65 && b5 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(this, size)");
                    copyOf[i7] = (byte) (b5 + 32);
                    for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                        byte b7 = copyOf[i8];
                        if (b7 >= 65 && b7 <= 90) {
                            copyOf[i8] = (byte) (b7 + 32);
                        }
                    }
                    return new g(copyOf);
                }
                i7++;
            } else {
                return this;
            }
        }
    }

    public byte[] q() {
        byte[] bArr = this.f4464a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.j.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final String r() {
        String str = this.f4466c;
        if (str == null) {
            byte[] g3 = g();
            kotlin.jvm.internal.j.e(g3, "<this>");
            String str2 = new String(g3, E6.a.f1074a);
            this.f4466c = str2;
            return str2;
        }
        return str;
    }

    public void s(e buffer, int i7) {
        kotlin.jvm.internal.j.e(buffer, "buffer");
        buffer.w(this.f4464a, 0, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0120, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0124, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x015c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0163, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x016a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x019b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x019e, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a1, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01a4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f0, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.g.toString():java.lang.String");
    }
}
