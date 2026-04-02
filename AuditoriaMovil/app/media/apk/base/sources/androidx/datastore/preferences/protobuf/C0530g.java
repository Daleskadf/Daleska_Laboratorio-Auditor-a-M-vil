package androidx.datastore.preferences.protobuf;

import D.AbstractC0059i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0530g implements Iterable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final C0530g f7818c = new C0530g(A.f7748b);

    /* renamed from: d  reason: collision with root package name */
    public static final C0528e f7819d;

    /* renamed from: a  reason: collision with root package name */
    public int f7820a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7821b;

    static {
        C0528e c0528e;
        if (AbstractC0526c.a()) {
            c0528e = new C0528e(1);
        } else {
            c0528e = new C0528e(0);
        }
        f7819d = c0528e;
    }

    public C0530g(byte[] bArr) {
        bArr.getClass();
        this.f7821b = bArr;
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

    public static C0530g h(byte[] bArr, int i7, int i8) {
        byte[] copyOfRange;
        f(i7, i7 + i8, bArr.length);
        switch (f7819d.f7808a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, copyOfRange, 0, i8);
                break;
        }
        return new C0530g(copyOfRange);
    }

    public byte e(int i7) {
        return this.f7821b[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0530g) || size() != ((C0530g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0530g) {
            C0530g c0530g = (C0530g) obj;
            int i7 = this.f7820a;
            int i8 = c0530g.f7820a;
            if (i7 != 0 && i8 != 0 && i7 != i8) {
                return false;
            }
            int size = size();
            if (size <= c0530g.size()) {
                if (size <= c0530g.size()) {
                    int k2 = k() + size;
                    int k8 = k();
                    int k9 = c0530g.k();
                    while (k8 < k2) {
                        if (this.f7821b[k8] != c0530g.f7821b[k9]) {
                            return false;
                        }
                        k8++;
                        k9++;
                    }
                    return true;
                }
                StringBuilder k10 = io.flutter.plugins.pathprovider.b.k("Ran off end of other: 0, ", size, ", ");
                k10.append(c0530g.size());
                throw new IllegalArgumentException(k10.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        int i7 = this.f7820a;
        if (i7 == 0) {
            int size = size();
            int k2 = k();
            int i8 = size;
            for (int i9 = k2; i9 < k2 + size; i9++) {
                i8 = (i8 * 31) + this.f7821b[i9];
            }
            if (i8 == 0) {
                i7 = 1;
            } else {
                i7 = i8;
            }
            this.f7820a = i7;
        }
        return i7;
    }

    public void i(byte[] bArr, int i7) {
        System.arraycopy(this.f7821b, 0, bArr, 0, i7);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0527d(this);
    }

    public int k() {
        return 0;
    }

    public byte l(int i7) {
        return this.f7821b[i7];
    }

    public int size() {
        return this.f7821b.length;
    }

    public final String toString() {
        C0530g c0529f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = H4.W.i(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int f = f(0, 47, size());
            if (f == 0) {
                c0529f = f7818c;
            } else {
                c0529f = new C0529f(this.f7821b, k(), f);
            }
            sb2.append(H4.W.i(c0529f));
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
