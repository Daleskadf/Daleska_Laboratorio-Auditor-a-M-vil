package m1;

import H0.J;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final List f14001a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14002b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14003c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14004d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14005e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14006g;

    /* renamed from: h  reason: collision with root package name */
    public final float f14007h;

    /* renamed from: i  reason: collision with root package name */
    public final int f14008i;
    public final String j;

    public w(List list, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, String str) {
        this.f14001a = list;
        this.f14002b = i7;
        this.f14003c = i8;
        this.f14004d = i9;
        this.f14005e = i10;
        this.f = i11;
        this.f14006g = i12;
        this.f14007h = f;
        this.f14008i = i13;
        this.j = str;
    }

    public static w a(K0.q qVar) {
        List singletonList;
        int i7;
        int i8;
        try {
            qVar.H(21);
            int u7 = qVar.u() & 3;
            int u8 = qVar.u();
            int i9 = qVar.f2514b;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < u8; i12++) {
                qVar.H(1);
                int A7 = qVar.A();
                for (int i13 = 0; i13 < A7; i13++) {
                    int A8 = qVar.A();
                    i11 += A8 + 4;
                    qVar.H(A8);
                }
            }
            qVar.G(i9);
            byte[] bArr = new byte[i11];
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            float f = 1.0f;
            String str = null;
            int i20 = 0;
            int i21 = 0;
            while (i20 < u8) {
                int u9 = qVar.u() & 63;
                int A9 = qVar.A();
                int i22 = i10;
                while (i22 < A9) {
                    int A10 = qVar.A();
                    int i23 = u8;
                    System.arraycopy(L0.g.f2861a, i10, bArr, i21, 4);
                    int i24 = i21 + 4;
                    System.arraycopy(qVar.f2513a, qVar.f2514b, bArr, i24, A10);
                    if (u9 == 33 && i22 == 0) {
                        L0.d c8 = L0.g.c(bArr, i24, i24 + A10);
                        int i25 = c8.f2833e + 8;
                        i15 = c8.f + 8;
                        i16 = c8.f2839m;
                        int i26 = c8.f2840n;
                        int i27 = c8.f2841o;
                        float f4 = c8.f2837k;
                        int i28 = c8.f2838l;
                        i7 = u9;
                        i8 = A9;
                        i14 = i25;
                        str = K0.a.c(c8.f2829a, c8.f2830b, c8.f2831c, c8.f2832d, c8.f2834g, c8.f2835h);
                        i18 = i27;
                        i17 = i26;
                        i19 = i28;
                        f = f4;
                    } else {
                        i7 = u9;
                        i8 = A9;
                    }
                    i21 = i24 + A10;
                    qVar.H(A10);
                    i22++;
                    u8 = i23;
                    u9 = i7;
                    A9 = i8;
                    i10 = 0;
                }
                i20++;
                i10 = 0;
            }
            if (i11 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new w(singletonList, u7 + 1, i14, i15, i16, i17, i18, f, i19, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw J.a(e7, "Error parsing HEVC config");
        }
    }
}
