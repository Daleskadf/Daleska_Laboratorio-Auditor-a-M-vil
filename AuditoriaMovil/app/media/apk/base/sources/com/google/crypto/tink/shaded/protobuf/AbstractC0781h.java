package com.google.crypto.tink.shaded.protobuf;

import D.AbstractC0059i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.google.crypto.tink.shaded.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0781h implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C0780g f9648b = new C0780g(D.f9599b);

    /* renamed from: c  reason: collision with root package name */
    public static final C0778e f9649c;

    /* renamed from: a  reason: collision with root package name */
    public int f9650a;

    static {
        C0778e c0778e;
        if (AbstractC0776c.a()) {
            c0778e = new C0778e(1);
        } else {
            c0778e = new C0778e(0);
        }
        f9649c = c0778e;
    }

    public static int f(int i7, int i8, int i9) {
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

    public static C0780g h(byte[] bArr, int i7, int i8) {
        byte[] copyOfRange;
        f(i7, i7 + i8, bArr.length);
        switch (f9649c.f9638a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, copyOfRange, 0, i8);
                break;
        }
        return new C0780g(copyOfRange);
    }

    public abstract byte e(int i7);

    public final int hashCode() {
        int i7 = this.f9650a;
        if (i7 == 0) {
            int size = size();
            C0780g c0780g = (C0780g) this;
            int l8 = c0780g.l();
            int i8 = size;
            for (int i9 = l8; i9 < l8 + size; i9++) {
                i8 = (i8 * 31) + c0780g.f9647d[i9];
            }
            if (i8 == 0) {
                i7 = 1;
            } else {
                i7 = i8;
            }
            this.f9650a = i7;
        }
        return i7;
    }

    public abstract void i(byte[] bArr, int i7);

    public final byte[] k() {
        int size = size();
        if (size == 0) {
            return D.f9599b;
        }
        byte[] bArr = new byte[size];
        i(bArr, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        C0780g c0779f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = j3.f.t(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C0780g c0780g = (C0780g) this;
            int f = f(0, 47, c0780g.size());
            if (f == 0) {
                c0779f = f9648b;
            } else {
                c0779f = new C0779f(c0780g.f9647d, c0780g.l(), f);
            }
            sb2.append(j3.f.t(c0779f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC0059i.D(sb3, sb, "\">");
    }
}
