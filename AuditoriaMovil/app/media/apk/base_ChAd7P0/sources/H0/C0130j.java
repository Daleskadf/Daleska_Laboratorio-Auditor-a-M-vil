package H0;

import D.AbstractC0059i;
import java.util.Arrays;
/* renamed from: H0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130j {

    /* renamed from: h  reason: collision with root package name */
    public static final C0130j f1810h = new C0130j(1, 2, 3, -1, -1, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f1811a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1812b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1813c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f1814d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1815e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public int f1816g;

    static {
        AbstractC0059i.F(0, 1, 2, 3, 4);
        K0.x.H(5);
    }

    public C0130j(int i7, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f1811a = i7;
        this.f1812b = i8;
        this.f1813c = i9;
        this.f1814d = bArr;
        this.f1815e = i10;
        this.f = i11;
    }

    public static String a(int i7) {
        if (i7 != -1) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return io.flutter.plugins.pathprovider.b.e(i7, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i7) {
        if (i7 != -1) {
            if (i7 != 6) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        return io.flutter.plugins.pathprovider.b.e(i7, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i7) {
        if (i7 != -1) {
            if (i7 != 10) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    return io.flutter.plugins.pathprovider.b.e(i7, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean e(C0130j c0130j) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (c0130j == null) {
            return true;
        }
        int i11 = c0130j.f1811a;
        if ((i11 == -1 || i11 == 1 || i11 == 2) && (((i7 = c0130j.f1812b) == -1 || i7 == 2) && (((i8 = c0130j.f1813c) == -1 || i8 == 3) && c0130j.f1814d == null && (((i9 = c0130j.f) == -1 || i9 == 8) && ((i10 = c0130j.f1815e) == -1 || i10 == 8))))) {
            return true;
        }
        return false;
    }

    public static int f(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 9) {
            return 6;
        }
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i7) {
        if (i7 != 1) {
            if (i7 != 4) {
                if (i7 != 13) {
                    if (i7 == 16) {
                        return 6;
                    }
                    if (i7 == 18) {
                        return 7;
                    }
                    if (i7 != 6 && i7 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean d() {
        if (this.f1811a != -1 && this.f1812b != -1 && this.f1813c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0130j.class != obj.getClass()) {
            return false;
        }
        C0130j c0130j = (C0130j) obj;
        if (this.f1811a == c0130j.f1811a && this.f1812b == c0130j.f1812b && this.f1813c == c0130j.f1813c && Arrays.equals(this.f1814d, c0130j.f1814d) && this.f1815e == c0130j.f1815e && this.f == c0130j.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1816g == 0) {
            this.f1816g = ((((Arrays.hashCode(this.f1814d) + ((((((527 + this.f1811a) * 31) + this.f1812b) * 31) + this.f1813c) * 31)) * 31) + this.f1815e) * 31) + this.f;
        }
        return this.f1816g;
    }

    public final String toString() {
        boolean z7;
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f1811a));
        sb.append(", ");
        sb.append(a(this.f1812b));
        sb.append(", ");
        sb.append(c(this.f1813c));
        sb.append(", ");
        if (this.f1814d != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        sb.append(z7);
        sb.append(", ");
        String str2 = "NA";
        int i7 = this.f1815e;
        if (i7 == -1) {
            str = "NA";
        } else {
            str = i7 + "bit Luma";
        }
        sb.append(str);
        sb.append(", ");
        int i8 = this.f;
        if (i8 != -1) {
            str2 = i8 + "bit Chroma";
        }
        return AbstractC0059i.D(sb, str2, ")");
    }
}
