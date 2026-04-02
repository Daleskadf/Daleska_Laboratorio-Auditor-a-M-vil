package G1;

import A3.K;
import D.AbstractC0059i;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import m1.E;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1474a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i7;
        int i8;
        if (bArr != null) {
            i7 = bArr.length;
        } else {
            i7 = 0;
        }
        int i9 = i7 + 32;
        if (uuidArr != null) {
            i9 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i9);
        allocate.putInt(i9);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i8 = 16777216;
        } else {
            i8 = 0;
        }
        allocate.putInt(i8);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static boolean b(int i7, boolean z7) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579 && z7) {
            return true;
        }
        int[] iArr = f1474a;
        for (int i8 = 0; i8 < 29; i8++) {
            if (iArr[i8] == i7) {
                return true;
            }
        }
        return false;
    }

    public static A1.e c(int i7, K0.q qVar) {
        int h8 = qVar.h();
        if (qVar.h() == 1684108385) {
            qVar.H(8);
            String q2 = qVar.q(h8 - 16);
            return new A1.e("und", q2, q2);
        }
        K0.a.A("MetadataUtil", "Failed to parse comment attribute: " + c.b(i7));
        return null;
    }

    public static A1.a d(K0.q qVar) {
        String str;
        int h8 = qVar.h();
        if (qVar.h() == 1684108385) {
            int h9 = qVar.h() & 16777215;
            if (h9 == 13) {
                str = "image/jpeg";
            } else if (h9 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                AbstractC0059i.J("Unrecognized cover art flags: ", h9, "MetadataUtil");
                return null;
            }
            qVar.H(4);
            int i7 = h8 - 16;
            byte[] bArr = new byte[i7];
            qVar.f(bArr, 0, i7);
            return new A1.a(3, str, null, bArr);
        }
        K0.a.A("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static A1.n e(int i7, K0.q qVar, String str) {
        int h8 = qVar.h();
        if (qVar.h() == 1684108385 && h8 >= 22) {
            qVar.H(10);
            int A7 = qVar.A();
            if (A7 > 0) {
                String e7 = io.flutter.plugins.pathprovider.b.e(A7, StringUtils.EMPTY);
                int A8 = qVar.A();
                if (A8 > 0) {
                    e7 = e7 + "/" + A8;
                }
                return new A1.n(str, null, K.u(e7));
            }
        }
        K0.a.A("MetadataUtil", "Failed to parse index/count attribute: " + c.b(i7));
        return null;
    }

    public static int f(K0.q qVar) {
        int h8 = qVar.h();
        if (qVar.h() == 1684108385) {
            qVar.H(8);
            int i7 = h8 - 16;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4 && (qVar.e() & RecognitionOptions.ITF) == 0) {
                            return qVar.y();
                        }
                    } else {
                        return qVar.x();
                    }
                } else {
                    return qVar.A();
                }
            } else {
                return qVar.u();
            }
        }
        K0.a.A("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static A1.i g(int i7, String str, K0.q qVar, boolean z7, boolean z8) {
        int f = f(qVar);
        if (z8) {
            f = Math.min(1, f);
        }
        if (f >= 0) {
            if (z7) {
                return new A1.n(str, null, K.u(Integer.toString(f)));
            }
            return new A1.e("und", str, Integer.toString(f));
        }
        K0.a.A("MetadataUtil", "Failed to parse uint8 attribute: " + c.b(i7));
        return null;
    }

    public static A.m h(byte[] bArr) {
        K0.q qVar = new K0.q(bArr);
        if (qVar.f2515c < 32) {
            return null;
        }
        qVar.G(0);
        int a7 = qVar.a();
        int h8 = qVar.h();
        if (h8 != a7) {
            K0.a.A("PsshAtomUtil", "Advertised atom size (" + h8 + ") does not match buffer size: " + a7);
            return null;
        }
        int h9 = qVar.h();
        if (h9 != 1886614376) {
            AbstractC0059i.J("Atom type is not pssh: ", h9, "PsshAtomUtil");
            return null;
        }
        int d7 = c.d(qVar.h());
        if (d7 > 1) {
            AbstractC0059i.J("Unsupported pssh version: ", d7, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(qVar.o(), qVar.o());
        if (d7 == 1) {
            int y2 = qVar.y();
            UUID[] uuidArr = new UUID[y2];
            for (int i7 = 0; i7 < y2; i7++) {
                uuidArr[i7] = new UUID(qVar.o(), qVar.o());
            }
        }
        int y3 = qVar.y();
        int a8 = qVar.a();
        if (y3 != a8) {
            K0.a.A("PsshAtomUtil", "Atom data size (" + y3 + ") does not match the bytes left: " + a8);
            return null;
        }
        byte[] bArr2 = new byte[y3];
        qVar.f(bArr2, 0, y3);
        return new A.m(uuid, d7, bArr2);
    }

    public static A1.n i(int i7, K0.q qVar, String str) {
        int h8 = qVar.h();
        if (qVar.h() == 1684108385) {
            qVar.H(8);
            return new A1.n(str, null, K.u(qVar.q(h8 - 16)));
        }
        K0.a.A("MetadataUtil", "Failed to parse text attribute: " + c.b(i7));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [m1.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [m1.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [m1.E, java.lang.Object] */
    public static E j(m1.p pVar, boolean z7, boolean z8) {
        int i7;
        long j;
        long j8;
        int i8;
        int i9;
        boolean z9;
        int[] iArr;
        long j9;
        boolean z10 = true;
        long i10 = pVar.i();
        long j10 = -1;
        int i11 = (i10 > (-1L) ? 1 : (i10 == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && i10 <= 4096) {
            j11 = i10;
        }
        int i12 = (int) j11;
        K0.q qVar = new K0.q(64);
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (i14 < i12) {
            qVar.D(8);
            if (!pVar.q(qVar.f2513a, i13, 8, z10)) {
                break;
            }
            long w2 = qVar.w();
            int h8 = qVar.h();
            if (w2 == 1) {
                pVar.v(qVar.f2513a, 8, 8);
                i8 = 16;
                qVar.F(16);
                j8 = qVar.o();
                j = i10;
            } else {
                if (w2 == 0) {
                    long i15 = pVar.i();
                    if (i15 != j10) {
                        w2 = (i15 - pVar.t()) + 8;
                    }
                }
                j = i10;
                j8 = w2;
                i8 = 8;
            }
            long j12 = i8;
            if (j8 < j12) {
                return new Object();
            }
            i14 += i8;
            if (h8 == 1836019574) {
                i12 += (int) j8;
                if (i11 != 0 && i12 > j) {
                    j9 = j;
                    i12 = (int) j9;
                } else {
                    j9 = j;
                }
                i10 = j9;
                z10 = true;
            } else if (h8 != 1836019558 && h8 != 1836475768) {
                if (h8 == 1835295092) {
                    z11 = true;
                }
                if ((i14 + j8) - j12 >= i12) {
                    i7 = 0;
                    break;
                }
                int i16 = (int) (j8 - j12);
                i14 += i16;
                if (h8 == 1718909296) {
                    if (i16 < 8) {
                        return new Object();
                    }
                    qVar.D(i16);
                    i9 = 0;
                    pVar.v(qVar.f2513a, 0, i16);
                    if (b(qVar.h(), z8)) {
                        z11 = true;
                    }
                    qVar.H(4);
                    int a7 = qVar.a() / 4;
                    if (!z11 && a7 > 0) {
                        iArr = new int[a7];
                        int i17 = 0;
                        while (true) {
                            if (i17 < a7) {
                                int h9 = qVar.h();
                                iArr[i17] = h9;
                                if (b(h9, z8)) {
                                    z9 = true;
                                    z11 = true;
                                    break;
                                }
                                i17++;
                            } else {
                                z9 = true;
                                break;
                            }
                        }
                    } else {
                        z9 = true;
                        iArr = null;
                    }
                    if (!z11) {
                        ?? obj = new Object();
                        if (iArr != null) {
                            int i18 = D3.a.f857c;
                            if (iArr.length != 0) {
                                new D3.a(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i19 = D3.a.f857c;
                        }
                        return obj;
                    }
                } else {
                    i9 = 0;
                    z9 = true;
                    if (i16 != 0) {
                        pVar.w(i16);
                    }
                }
                i13 = i9;
                z10 = z9;
                i10 = j;
            } else {
                i7 = 1;
                break;
            }
            j10 = -1;
        }
        i7 = i13;
        if (!z11) {
            return o.f1436c;
        }
        if (z7 != i7) {
            if (i7 != 0) {
                return o.f1434a;
            }
            return o.f1435b;
        }
        return null;
    }
}
