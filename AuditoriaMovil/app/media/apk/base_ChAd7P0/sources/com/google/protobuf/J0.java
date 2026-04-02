package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class J0 {

    /* renamed from: a  reason: collision with root package name */
    public static final H0 f10014a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final I0 f10015b = new Object();

    public static int A(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        P p7 = (P) u7;
        int L6 = L(bArr, i8, c0838f);
        p7.h(J6.b.c(c0838f.f10064a));
        while (L6 < i9) {
            int L7 = L(bArr, L6, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            L6 = L(bArr, L7, c0838f);
            p7.h(J6.b.c(c0838f.f10064a));
        }
        return L6;
    }

    public static int B(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) u7;
        int N7 = N(bArr, i8, c0838f);
        abstractC0839f0.h(J6.b.d(c0838f.f10065b));
        while (N7 < i9) {
            int L6 = L(bArr, N7, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            N7 = N(bArr, L6, c0838f);
            abstractC0839f0.h(J6.b.d(c0838f.f10065b));
        }
        return N7;
    }

    public static int C(byte[] bArr, int i7, C0838f c0838f) {
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a;
        if (i8 >= 0) {
            if (i8 == 0) {
                c0838f.f10066c = StringUtils.EMPTY;
                return L6;
            }
            c0838f.f10066c = new String(bArr, L6, i8, V.f10033a);
            return L6 + i8;
        }
        throw X.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.U r8, com.google.protobuf.C0838f r9) {
        /*
            int r6 = L(r5, r6, r9)
            int r0 = r9.f10064a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.V.f10033a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = L(r5, r6, r9)
            int r2 = r9.f10064a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = L(r5, r0, r9)
            int r0 = r9.f10064a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.V.f10033a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.protobuf.X r4 = com.google.protobuf.X.f()
            throw r4
        L44:
            return r6
        L45:
            com.google.protobuf.X r4 = com.google.protobuf.X.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.J0.D(int, byte[], int, int, com.google.protobuf.U, com.google.protobuf.f):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0026). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int E(int r6, byte[] r7, int r8, int r9, com.google.protobuf.U r10, com.google.protobuf.C0838f r11) {
        /*
            int r8 = L(r7, r8, r11)
            int r0 = r11.f10064a
            if (r0 < 0) goto L64
            r1 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto L11
            r10.add(r2)
            goto L26
        L11:
            int r3 = r8 + r0
            com.google.protobuf.J0 r4 = com.google.protobuf.b1.f10057a
            int r4 = r4.U(r1, r7, r8, r3)
            if (r4 != 0) goto L5f
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = com.google.protobuf.V.f10033a
            r4.<init>(r7, r8, r0, r5)
            r10.add(r4)
        L25:
            r8 = r3
        L26:
            if (r8 >= r9) goto L5e
            int r0 = L(r7, r8, r11)
            int r3 = r11.f10064a
            if (r6 == r3) goto L31
            goto L5e
        L31:
            int r8 = L(r7, r0, r11)
            int r0 = r11.f10064a
            if (r0 < 0) goto L59
            if (r0 != 0) goto L3f
            r10.add(r2)
            goto L26
        L3f:
            int r3 = r8 + r0
            com.google.protobuf.J0 r4 = com.google.protobuf.b1.f10057a
            int r4 = r4.U(r1, r7, r8, r3)
            if (r4 != 0) goto L54
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = com.google.protobuf.V.f10033a
            r4.<init>(r7, r8, r0, r5)
            r10.add(r4)
            goto L25
        L54:
            com.google.protobuf.X r6 = com.google.protobuf.X.c()
            throw r6
        L59:
            com.google.protobuf.X r6 = com.google.protobuf.X.f()
            throw r6
        L5e:
            return r8
        L5f:
            com.google.protobuf.X r6 = com.google.protobuf.X.c()
            throw r6
        L64:
            com.google.protobuf.X r6 = com.google.protobuf.X.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.J0.E(int, byte[], int, int, com.google.protobuf.U, com.google.protobuf.f):int");
    }

    public static int F(byte[] bArr, int i7, C0838f c0838f) {
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a;
        if (i8 >= 0) {
            if (i8 == 0) {
                c0838f.f10066c = StringUtils.EMPTY;
                return L6;
            }
            c0838f.f10066c = b1.f10057a.H(bArr, L6, i8);
            return L6 + i8;
        }
        throw X.f();
    }

    public static int G(int i7, byte[] bArr, int i8, int i9, P0 p02, C0838f c0838f) {
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                p02.d(i7, Integer.valueOf(j(bArr, i8)));
                                return i8 + 4;
                            }
                            throw X.b();
                        }
                        P0 c8 = P0.c();
                        int i11 = (i7 & (-8)) | 4;
                        int i12 = c0838f.f10067d + 1;
                        c0838f.f10067d = i12;
                        if (i12 < 100) {
                            int i13 = 0;
                            while (true) {
                                if (i8 >= i9) {
                                    break;
                                }
                                int L6 = L(bArr, i8, c0838f);
                                int i14 = c0838f.f10064a;
                                if (i14 == i11) {
                                    i13 = i14;
                                    i8 = L6;
                                    break;
                                }
                                i13 = i14;
                                i8 = G(i14, bArr, L6, i9, c8, c0838f);
                            }
                            c0838f.f10067d--;
                            if (i8 <= i9 && i13 == i11) {
                                p02.d(i7, c8);
                                return i8;
                            }
                            throw X.g();
                        }
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int L7 = L(bArr, i8, c0838f);
                    int i15 = c0838f.f10064a;
                    if (i15 >= 0) {
                        if (i15 <= bArr.length - L7) {
                            if (i15 == 0) {
                                p02.d(i7, AbstractC0852m.f10085b);
                            } else {
                                p02.d(i7, AbstractC0852m.l(bArr, L7, i15));
                            }
                            return L7 + i15;
                        }
                        throw X.h();
                    }
                    throw X.f();
                }
                p02.d(i7, Long.valueOf(l(bArr, i8)));
                return i8 + 8;
            }
            int N7 = N(bArr, i8, c0838f);
            p02.d(i7, Long.valueOf(c0838f.f10065b));
            return N7;
        }
        throw X.b();
    }

    public static String I(int i7, ByteBuffer byteBuffer, int i8) {
        if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) >= 0) {
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b5 = byteBuffer.get(i7);
                if (!b(b5)) {
                    break;
                }
                i7++;
                cArr[i10] = (char) b5;
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b7 = byteBuffer.get(i7);
                if (b(b7)) {
                    int i13 = i11 + 1;
                    cArr[i11] = (char) b7;
                    while (i12 < i9) {
                        byte b8 = byteBuffer.get(i12);
                        if (!b(b8)) {
                            break;
                        }
                        i12++;
                        cArr[i13] = (char) b8;
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (b7 < -32) {
                    if (i12 < i9) {
                        i7 += 2;
                        c(b7, byteBuffer.get(i12), cArr, i11);
                        i11++;
                    } else {
                        throw X.c();
                    }
                } else if (b7 < -16) {
                    if (i12 < i9 - 1) {
                        int i14 = i7 + 2;
                        i7 += 3;
                        d(b7, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                        i11++;
                    } else {
                        throw X.c();
                    }
                } else if (i12 < i9 - 2) {
                    byte b9 = byteBuffer.get(i12);
                    int i15 = i7 + 3;
                    i7 += 4;
                    a(b7, b9, byteBuffer.get(i7 + 2), byteBuffer.get(i15), cArr, i11);
                    i11 += 2;
                } else {
                    throw X.c();
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    public static int K(int i7, byte[] bArr, int i8, C0838f c0838f) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            c0838f.f10064a = i9 | (b5 << 7);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b7 = bArr[i10];
        if (b7 >= 0) {
            c0838f.f10064a = i11 | (b7 << 14);
            return i12;
        }
        int i13 = i11 | ((b7 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            c0838f.f10064a = i13 | (b8 << 21);
            return i14;
        }
        int i15 = i13 | ((b8 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            c0838f.f10064a = i15 | (b9 << 28);
            return i16;
        }
        int i17 = i15 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] < 0) {
                i16 = i18;
            } else {
                c0838f.f10064a = i17;
                return i18;
            }
        }
    }

    public static int L(byte[] bArr, int i7, C0838f c0838f) {
        int i8 = i7 + 1;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            c0838f.f10064a = b5;
            return i8;
        }
        return K(b5, bArr, i8, c0838f);
    }

    public static int M(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        P p7 = (P) u7;
        int L6 = L(bArr, i8, c0838f);
        p7.h(c0838f.f10064a);
        while (L6 < i9) {
            int L7 = L(bArr, L6, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            L6 = L(bArr, L7, c0838f);
            p7.h(c0838f.f10064a);
        }
        return L6;
    }

    public static int N(byte[] bArr, int i7, C0838f c0838f) {
        byte b5;
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            c0838f.f10065b = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j8 = (j & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (b5 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        c0838f.f10065b = j8;
        return i9;
    }

    public static int O(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) u7;
        int N7 = N(bArr, i8, c0838f);
        abstractC0839f0.h(c0838f.f10065b);
        while (N7 < i9) {
            int L6 = L(bArr, N7, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            N7 = N(bArr, L6, c0838f);
            abstractC0839f0.h(c0838f.f10065b);
        }
        return N7;
    }

    public static String Q(AbstractC0852m abstractC0852m) {
        StringBuilder sb = new StringBuilder(abstractC0852m.size());
        for (int i7 = 0; i7 < abstractC0852m.size(); i7++) {
            byte h8 = abstractC0852m.h(i7);
            if (h8 != 34) {
                if (h8 != 39) {
                    if (h8 != 92) {
                        switch (h8) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (h8 >= 32 && h8 <= 126) {
                                    sb.append((char) h8);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((h8 >>> 6) & 3) + 48));
                                    sb.append((char) (((h8 >>> 3) & 7) + 48));
                                    sb.append((char) ((h8 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static boolean R(byte b5) {
        if (b5 > -65) {
            return true;
        }
        return false;
    }

    public static int S(Object obj, E0 e02, byte[] bArr, int i7, int i8, int i9, C0838f c0838f) {
        C0862r0 c0862r0 = (C0862r0) e02;
        int i10 = c0838f.f10067d + 1;
        c0838f.f10067d = i10;
        if (i10 < 100) {
            int G2 = c0862r0.G(obj, bArr, i7, i8, i9, c0838f);
            c0838f.f10067d--;
            c0838f.f10066c = obj;
            return G2;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int T(Object obj, E0 e02, byte[] bArr, int i7, int i8, C0838f c0838f) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = K(i10, bArr, i9, c0838f);
            i10 = c0838f.f10064a;
        }
        int i11 = i9;
        if (i10 >= 0 && i10 <= i8 - i11) {
            int i12 = c0838f.f10067d + 1;
            c0838f.f10067d = i12;
            if (i12 < 100) {
                int i13 = i10 + i11;
                e02.h(obj, bArr, i11, i13, c0838f);
                c0838f.f10067d--;
                c0838f.f10066c = obj;
                return i13;
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw X.h();
    }

    public static int V(int i7, byte[] bArr, int i8, int i9, C0838f c0838f) {
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                return i8 + 4;
                            }
                            throw X.b();
                        }
                        int i11 = (i7 & (-8)) | 4;
                        int i12 = 0;
                        while (i8 < i9) {
                            i8 = L(bArr, i8, c0838f);
                            i12 = c0838f.f10064a;
                            if (i12 == i11) {
                                break;
                            }
                            i8 = V(i12, bArr, i8, i9, c0838f);
                        }
                        if (i8 <= i9 && i12 == i11) {
                            return i8;
                        }
                        throw X.g();
                    }
                    return L(bArr, i8, c0838f) + c0838f.f10064a;
                }
                return i8 + 8;
            }
            return N(bArr, i8, c0838f);
        }
        throw X.b();
    }

    public static void a(byte b5, byte b7, byte b8, byte b9, char[] cArr, int i7) {
        if (!R(b7)) {
            if ((((b7 + 112) + (b5 << 28)) >> 30) == 0 && !R(b8) && !R(b9)) {
                int i8 = ((b5 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i7] = (char) ((i8 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
                return;
            }
        }
        throw X.c();
    }

    public static boolean b(byte b5) {
        if (b5 >= 0) {
            return true;
        }
        return false;
    }

    public static void c(byte b5, byte b7, char[] cArr, int i7) {
        if (b5 >= -62 && !R(b7)) {
            cArr[i7] = (char) (((b5 & 31) << 6) | (b7 & 63));
            return;
        }
        throw X.c();
    }

    public static void d(byte b5, byte b7, byte b8, char[] cArr, int i7) {
        if (!R(b7) && ((b5 != -32 || b7 >= -96) && ((b5 != -19 || b7 < -96) && !R(b8)))) {
            cArr[i7] = (char) (((b5 & 15) << 12) | ((b7 & 63) << 6) | (b8 & 63));
            return;
        }
        throw X.c();
    }

    public static int e(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        boolean z7;
        boolean z8;
        AbstractC0840g abstractC0840g = (AbstractC0840g) u7;
        int N7 = N(bArr, i8, c0838f);
        if (c0838f.f10065b != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        abstractC0840g.h(z7);
        while (N7 < i9) {
            int L6 = L(bArr, N7, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            N7 = N(bArr, L6, c0838f);
            if (c0838f.f10065b != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            abstractC0840g.h(z8);
        }
        return N7;
    }

    public static int f(byte[] bArr, int i7, C0838f c0838f) {
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a;
        if (i8 >= 0) {
            if (i8 <= bArr.length - L6) {
                if (i8 == 0) {
                    c0838f.f10066c = AbstractC0852m.f10085b;
                    return L6;
                }
                c0838f.f10066c = AbstractC0852m.l(bArr, L6, i8);
                return L6 + i8;
            }
            throw X.h();
        }
        throw X.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(int r2, byte[] r3, int r4, int r5, com.google.protobuf.U r6, com.google.protobuf.C0838f r7) {
        /*
            int r4 = L(r3, r4, r7)
            int r0 = r7.f10064a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.protobuf.l r0 = com.google.protobuf.AbstractC0852m.f10085b
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.l r1 = com.google.protobuf.AbstractC0852m.l(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = L(r3, r4, r7)
            int r1 = r7.f10064a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = L(r3, r0, r7)
            int r0 = r7.f10064a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.protobuf.l r0 = com.google.protobuf.AbstractC0852m.f10085b
            r6.add(r0)
            goto L1c
        L3b:
            com.google.protobuf.l r1 = com.google.protobuf.AbstractC0852m.l(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.protobuf.X r2 = com.google.protobuf.X.h()
            throw r2
        L48:
            com.google.protobuf.X r2 = com.google.protobuf.X.f()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.protobuf.X r2 = com.google.protobuf.X.h()
            throw r2
        L53:
            com.google.protobuf.X r2 = com.google.protobuf.X.f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.J0.g(int, byte[], int, int, com.google.protobuf.U, com.google.protobuf.f):int");
    }

    public static double h(byte[] bArr, int i7) {
        return Double.longBitsToDouble(l(bArr, i7));
    }

    public static int i(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        AbstractC0867u abstractC0867u = (AbstractC0867u) u7;
        abstractC0867u.h(h(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int L6 = L(bArr, i10, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            abstractC0867u.h(Double.longBitsToDouble(l(bArr, L6)));
            i10 = L6 + 8;
        }
        return i10;
    }

    public static int j(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
    }

    public static int k(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        P p7 = (P) u7;
        p7.h(j(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int L6 = L(bArr, i10, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            p7.h(j(bArr, L6));
            i10 = L6 + 4;
        }
        return i10;
    }

    public static long l(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static int m(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) u7;
        abstractC0839f0.h(l(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int L6 = L(bArr, i10, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            abstractC0839f0.h(l(bArr, L6));
            i10 = L6 + 8;
        }
        return i10;
    }

    public static float n(byte[] bArr, int i7) {
        return Float.intBitsToFloat(j(bArr, i7));
    }

    public static int o(int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        E e7 = (E) u7;
        e7.h(n(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int L6 = L(bArr, i10, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            e7.h(Float.intBitsToFloat(j(bArr, L6)));
            i10 = L6 + 4;
        }
        return i10;
    }

    public static int p(E0 e02, int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        int i10 = (i7 & (-8)) | 4;
        J newInstance = e02.newInstance();
        int S7 = S(newInstance, e02, bArr, i8, i9, i10, c0838f);
        e02.b(newInstance);
        c0838f.f10066c = newInstance;
        u7.add(newInstance);
        while (S7 < i9) {
            int L6 = L(bArr, S7, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            J newInstance2 = e02.newInstance();
            int S8 = S(newInstance2, e02, bArr, L6, i9, i10, c0838f);
            e02.b(newInstance2);
            c0838f.f10066c = newInstance2;
            u7.add(newInstance2);
            S7 = S8;
        }
        return S7;
    }

    public static int q(E0 e02, int i7, byte[] bArr, int i8, int i9, U u7, C0838f c0838f) {
        J newInstance = e02.newInstance();
        int T7 = T(newInstance, e02, bArr, i8, i9, c0838f);
        e02.b(newInstance);
        c0838f.f10066c = newInstance;
        u7.add(newInstance);
        while (T7 < i9) {
            int L6 = L(bArr, T7, c0838f);
            if (i7 != c0838f.f10064a) {
                break;
            }
            J newInstance2 = e02.newInstance();
            int T8 = T(newInstance2, e02, bArr, L6, i9, c0838f);
            e02.b(newInstance2);
            c0838f.f10066c = newInstance2;
            u7.add(newInstance2);
            T7 = T8;
        }
        return T7;
    }

    public static int r(byte[] bArr, int i7, U u7, C0838f c0838f) {
        boolean z7;
        AbstractC0840g abstractC0840g = (AbstractC0840g) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            L6 = N(bArr, L6, c0838f);
            if (c0838f.f10065b != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            abstractC0840g.h(z7);
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int s(byte[] bArr, int i7, U u7, C0838f c0838f) {
        AbstractC0867u abstractC0867u = (AbstractC0867u) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            abstractC0867u.h(Double.longBitsToDouble(l(bArr, L6)));
            L6 += 8;
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int t(byte[] bArr, int i7, U u7, C0838f c0838f) {
        P p7 = (P) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            p7.h(j(bArr, L6));
            L6 += 4;
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int u(byte[] bArr, int i7, U u7, C0838f c0838f) {
        AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            abstractC0839f0.h(l(bArr, L6));
            L6 += 8;
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int v(byte[] bArr, int i7, U u7, C0838f c0838f) {
        E e7 = (E) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            e7.h(Float.intBitsToFloat(j(bArr, L6)));
            L6 += 4;
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int w(byte[] bArr, int i7, U u7, C0838f c0838f) {
        P p7 = (P) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            L6 = L(bArr, L6, c0838f);
            p7.h(J6.b.c(c0838f.f10064a));
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int x(byte[] bArr, int i7, U u7, C0838f c0838f) {
        AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            L6 = N(bArr, L6, c0838f);
            abstractC0839f0.h(J6.b.d(c0838f.f10065b));
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int y(byte[] bArr, int i7, U u7, C0838f c0838f) {
        P p7 = (P) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            L6 = L(bArr, L6, c0838f);
            p7.h(c0838f.f10064a);
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public static int z(byte[] bArr, int i7, U u7, C0838f c0838f) {
        AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) u7;
        int L6 = L(bArr, i7, c0838f);
        int i8 = c0838f.f10064a + L6;
        while (L6 < i8) {
            L6 = N(bArr, L6, c0838f);
            abstractC0839f0.h(c0838f.f10065b);
        }
        if (L6 == i8) {
            return L6;
        }
        throw X.h();
    }

    public abstract String H(byte[] bArr, int i7, int i8);

    public abstract String J(int i7, ByteBuffer byteBuffer, int i8);

    public abstract int P(String str, byte[] bArr, int i7, int i8);

    public abstract int U(int i7, byte[] bArr, int i8, int i9);

    public abstract void W(byte[] bArr, int i7, int i8);
}
