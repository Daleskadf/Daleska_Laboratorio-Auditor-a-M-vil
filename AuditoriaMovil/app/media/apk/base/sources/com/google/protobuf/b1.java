package com.google.protobuf;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static final J0 f10057a;

    static {
        Z0 z02;
        if (Y0.f10051e && Y0.f10050d && !AbstractC0832c.a()) {
            z02 = new Z0(1);
        } else {
            z02 = new Z0(0);
        }
        f10057a = z02;
    }

    public static int a(byte[] bArr, int i7, int i8) {
        byte b5 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return e(b5, bArr[i7], bArr[i7 + 1]);
                }
                throw new AssertionError();
            }
            return d(b5, bArr[i7]);
        }
        if (b5 > -12) {
            b5 = -1;
        }
        return b5;
    }

    public static String b(int i7, ByteBuffer byteBuffer, int i8) {
        J0 j02 = f10057a;
        j02.getClass();
        if (byteBuffer.hasArray()) {
            return j02.H(byteBuffer.array(), byteBuffer.arrayOffset() + i7, i8);
        } else if (byteBuffer.isDirect()) {
            return j02.J(i7, byteBuffer, i8);
        } else {
            return J0.I(i7, byteBuffer, i8);
        }
    }

    public static int c(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) >= 65536) {
                                i8++;
                            } else {
                                throw new a1(i8, length2);
                            }
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static int d(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    public static int e(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    public static boolean f(byte[] bArr, int i7, int i8) {
        if (f10057a.U(0, bArr, i7, i8) != 0) {
            return false;
        }
        return true;
    }
}
