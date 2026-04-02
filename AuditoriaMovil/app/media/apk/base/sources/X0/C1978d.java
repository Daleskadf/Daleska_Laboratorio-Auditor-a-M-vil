package x0;

import D.AbstractC0059i;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: x0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978d {

    /* renamed from: a  reason: collision with root package name */
    public final int f16424a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16425b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16426c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f16427d;

    public C1978d(byte[] bArr, int i7, int i8) {
        this(-1L, bArr, i7, i8);
    }

    public static C1978d a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(C1982h.b0);
        return new C1978d(bytes, 2, bytes.length);
    }

    public static C1978d b(long j, ByteOrder byteOrder) {
        return c(new long[]{j}, byteOrder);
    }

    public static C1978d c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1982h.f16452S[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C1978d(wrap.array(), 4, jArr.length);
    }

    public static C1978d d(C1980f[] c1980fArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1982h.f16452S[5] * c1980fArr.length]);
        wrap.order(byteOrder);
        for (C1980f c1980f : c1980fArr) {
            wrap.putInt((int) c1980f.f16432a);
            wrap.putInt((int) c1980f.f16433b);
        }
        return new C1978d(wrap.array(), 5, c1980fArr.length);
    }

    public static C1978d e(int i7, ByteOrder byteOrder) {
        return f(new int[]{i7}, byteOrder);
    }

    public static C1978d f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1982h.f16452S[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i7 : iArr) {
            wrap.putShort((short) i7);
        }
        return new C1978d(wrap.array(), 3, iArr.length);
    }

    public final double g(ByteOrder byteOrder) {
        Serializable j = j(byteOrder);
        if (j != null) {
            if (j instanceof String) {
                return Double.parseDouble((String) j);
            }
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof int[]) {
                int[] iArr = (int[]) j;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof double[]) {
                double[] dArr = (double[]) j;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof C1980f[]) {
                C1980f[] c1980fArr = (C1980f[]) j;
                if (c1980fArr.length == 1) {
                    C1980f c1980f = c1980fArr[0];
                    return c1980f.f16432a / c1980f.f16433b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int h(ByteOrder byteOrder) {
        Serializable j = j(byteOrder);
        if (j != null) {
            if (j instanceof String) {
                return Integer.parseInt((String) j);
            }
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof int[]) {
                int[] iArr = (int[]) j;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String i(ByteOrder byteOrder) {
        Serializable j = j(byteOrder);
        if (j == null) {
            return null;
        }
        if (j instanceof String) {
            return (String) j;
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        if (j instanceof long[]) {
            long[] jArr = (long[]) j;
            while (i7 < jArr.length) {
                sb.append(jArr[i7]);
                i7++;
                if (i7 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (j instanceof int[]) {
            int[] iArr = (int[]) j;
            while (i7 < iArr.length) {
                sb.append(iArr[i7]);
                i7++;
                if (i7 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (j instanceof double[]) {
            double[] dArr = (double[]) j;
            while (i7 < dArr.length) {
                sb.append(dArr[i7]);
                i7++;
                if (i7 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(j instanceof C1980f[])) {
            return null;
        } else {
            C1980f[] c1980fArr = (C1980f[]) j;
            while (i7 < c1980fArr.length) {
                sb.append(c1980fArr[i7].f16432a);
                sb.append('/');
                sb.append(c1980fArr[i7].f16433b);
                i7++;
                if (i7 != c1980fArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0129, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [x0.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [x0.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C1978d.j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C1982h.f16451R[this.f16424a]);
        sb.append(", data length:");
        return AbstractC0059i.B(sb, this.f16427d.length, ")");
    }

    public C1978d(long j, byte[] bArr, int i7, int i8) {
        this.f16424a = i7;
        this.f16425b = i8;
        this.f16426c = j;
        this.f16427d = bArr;
    }
}
