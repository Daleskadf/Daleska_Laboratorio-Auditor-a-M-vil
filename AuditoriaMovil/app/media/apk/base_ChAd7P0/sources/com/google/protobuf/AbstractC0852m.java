package com.google.protobuf;

import D.AbstractC0059i;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: com.google.protobuf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0852m implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C0850l f10085b = new C0850l(V.f10034b);

    /* renamed from: c  reason: collision with root package name */
    public static final C0846j f10086c;

    /* renamed from: a  reason: collision with root package name */
    public int f10087a = 0;

    static {
        C0846j c0846j;
        if (AbstractC0832c.a()) {
            c0846j = new C0846j(1);
        } else {
            c0846j = new C0846j(0);
        }
        f10086c = c0846j;
    }

    public static AbstractC0852m f(Iterator it, int i7) {
        AbstractC0852m abstractC0852m;
        if (i7 >= 1) {
            if (i7 == 1) {
                return (AbstractC0852m) it.next();
            }
            int i8 = i7 >>> 1;
            AbstractC0852m f = f(it, i8);
            AbstractC0852m f4 = f(it, i7 - i8);
            if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - f.size() >= f4.size()) {
                if (f4.size() == 0) {
                    return f;
                }
                if (f.size() != 0) {
                    int size = f4.size() + f.size();
                    if (size < 128) {
                        int size2 = f.size();
                        int size3 = f4.size();
                        int i9 = size2 + size3;
                        byte[] bArr = new byte[i9];
                        k(0, size2, f.size());
                        k(0, size2, i9);
                        if (size2 > 0) {
                            f.m(0, bArr, 0, size2);
                        }
                        k(0, size3, f4.size());
                        k(size2, i9, i9);
                        if (size3 > 0) {
                            f4.m(0, bArr, size2, size3);
                        }
                        return new C0850l(bArr);
                    }
                    if (f instanceof D0) {
                        D0 d02 = (D0) f;
                        AbstractC0852m abstractC0852m2 = d02.f;
                        int size4 = f4.size() + abstractC0852m2.size();
                        AbstractC0852m abstractC0852m3 = d02.f9999e;
                        if (size4 < 128) {
                            int size5 = abstractC0852m2.size();
                            int size6 = f4.size();
                            int i10 = size5 + size6;
                            byte[] bArr2 = new byte[i10];
                            k(0, size5, abstractC0852m2.size());
                            k(0, size5, i10);
                            if (size5 > 0) {
                                abstractC0852m2.m(0, bArr2, 0, size5);
                            }
                            k(0, size6, f4.size());
                            k(size5, i10, i10);
                            if (size6 > 0) {
                                f4.m(0, bArr2, size5, size6);
                            }
                            abstractC0852m = new D0(abstractC0852m3, new C0850l(bArr2));
                            return abstractC0852m;
                        } else if (abstractC0852m3.n() > abstractC0852m2.n()) {
                            if (d02.f9997Y > f4.n()) {
                                return new D0(abstractC0852m3, new D0(abstractC0852m2, f4));
                            }
                        }
                    }
                    if (size >= D0.y(Math.max(f.n(), f4.n()) + 1)) {
                        abstractC0852m = new D0(f, f4);
                    } else {
                        C0845i0 c0845i0 = new C0845i0(2);
                        c0845i0.a(f);
                        c0845i0.a(f4);
                        ArrayDeque arrayDeque = (ArrayDeque) c0845i0.f10074a;
                        abstractC0852m = (AbstractC0852m) arrayDeque.pop();
                        while (!arrayDeque.isEmpty()) {
                            abstractC0852m = new D0((AbstractC0852m) arrayDeque.pop(), abstractC0852m);
                        }
                    }
                    return abstractC0852m;
                }
                return f4;
            }
            throw new IllegalArgumentException("ByteString would be too long: " + f.size() + "+" + f4.size());
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("length (", i7, ") must be >= 1"));
    }

    public static void i(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(io.flutter.plugins.pathprovider.b.e(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0059i.x("Index > length: ", i7, i8, ", "));
        }
    }

    public static int k(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) < 0) {
            if (i7 >= 0) {
                if (i8 < i7) {
                    throw new IndexOutOfBoundsException(AbstractC0059i.x("Beginning index larger than ending index: ", i7, i8, ", "));
                }
                throw new IndexOutOfBoundsException(AbstractC0059i.x("End index: ", i8, i9, " >= "));
            }
            throw new IndexOutOfBoundsException(io.flutter.plugins.pathprovider.b.f("Beginning index: ", i7, " < 0"));
        }
        return i10;
    }

    public static C0850l l(byte[] bArr, int i7, int i8) {
        byte[] copyOfRange;
        k(i7, i7 + i8, bArr.length);
        switch (f10086c.f10075a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, copyOfRange, 0, i8);
                break;
        }
        return new C0850l(copyOfRange);
    }

    public abstract ByteBuffer e();

    public abstract boolean equals(Object obj);

    public abstract byte h(int i7);

    public final int hashCode() {
        int i7 = this.f10087a;
        if (i7 == 0) {
            int size = size();
            i7 = s(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f10087a = i7;
        }
        return i7;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract void m(int i7, byte[] bArr, int i8, int i9);

    public abstract int n();

    public abstract byte o(int i7);

    public abstract boolean p();

    public abstract boolean q();

    public abstract J6.b r();

    public abstract int s(int i7, int i8, int i9);

    public abstract int size();

    public abstract int t(int i7, int i8, int i9);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = J0.Q(this);
        } else {
            str = J0.Q(u(0, 47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0059i.D(sb, str, "\">");
    }

    public abstract AbstractC0852m u(int i7, int i8);

    public final byte[] v() {
        int size = size();
        if (size == 0) {
            return V.f10034b;
        }
        byte[] bArr = new byte[size];
        m(0, bArr, 0, size);
        return bArr;
    }

    public abstract String w(Charset charset);

    public abstract void x(AbstractC0865t abstractC0865t);
}
