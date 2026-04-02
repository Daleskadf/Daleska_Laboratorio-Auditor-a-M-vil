package H1;

import A.n;
import A3.K;
import H0.C0137q;
import H0.H;
import H0.I;
import H0.J;
import H0.r;
import K0.p;
import K0.q;
import java.util.ArrayList;
import java.util.Arrays;
import m1.AbstractC1428b;
import m1.y;
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    public B.a f1961n;

    /* renamed from: o  reason: collision with root package name */
    public int f1962o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1963p;

    /* renamed from: q  reason: collision with root package name */
    public y f1964q;

    /* renamed from: r  reason: collision with root package name */
    public io.grpc.okhttp.internal.e f1965r;

    @Override // H1.i
    public final void a(long j) {
        boolean z7;
        this.f1955g = j;
        int i7 = 0;
        if (j != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f1963p = z7;
        y yVar = this.f1964q;
        if (yVar != null) {
            i7 = yVar.f14017e;
        }
        this.f1962o = i7;
    }

    @Override // H1.i
    public final long b(q qVar) {
        int i7;
        int i8 = 0;
        byte b5 = qVar.f2513a[0];
        if ((b5 & 1) == 1) {
            return -1L;
        }
        B.a aVar = this.f1961n;
        K0.a.k(aVar);
        boolean z7 = ((n[]) aVar.f227e)[(b5 >> 1) & (255 >>> (8 - aVar.f223a))].f29a;
        y yVar = (y) aVar.f224b;
        if (!z7) {
            i7 = yVar.f14017e;
        } else {
            i7 = yVar.f;
        }
        if (this.f1963p) {
            i8 = (this.f1962o + i7) / 4;
        }
        long j = i8;
        byte[] bArr = qVar.f2513a;
        int length = bArr.length;
        int i9 = qVar.f2515c + 4;
        if (length < i9) {
            byte[] copyOf = Arrays.copyOf(bArr, i9);
            qVar.E(copyOf, copyOf.length);
        } else {
            qVar.F(i9);
        }
        byte[] bArr2 = qVar.f2513a;
        int i10 = qVar.f2515c;
        bArr2[i10 - 4] = (byte) (j & 255);
        bArr2[i10 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i10 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i10 - 1] = (byte) ((j >>> 24) & 255);
        this.f1963p = true;
        this.f1962o = i7;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [A.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, m1.y] */
    @Override // H1.i
    public final boolean c(q qVar, long j, A.f fVar) {
        B.a aVar;
        int i7;
        y yVar;
        int i8;
        y yVar2;
        byte[] bArr;
        long j8;
        int i9;
        if (this.f1961n != null) {
            ((r) fVar.f10b).getClass();
            return false;
        }
        y yVar3 = this.f1964q;
        int i10 = 4;
        if (yVar3 == null) {
            AbstractC1428b.w(1, qVar, false);
            qVar.m();
            int u7 = qVar.u();
            int m7 = qVar.m();
            int j9 = qVar.j();
            if (j9 <= 0) {
                j9 = -1;
            }
            int j10 = qVar.j();
            if (j10 <= 0) {
                i9 = -1;
            } else {
                i9 = j10;
            }
            qVar.j();
            int u8 = qVar.u();
            int pow = (int) Math.pow(2.0d, (u8 & 240) >> 4);
            qVar.u();
            ?? copyOf = Arrays.copyOf(qVar.f2513a, qVar.f2515c);
            ?? obj = new Object();
            obj.f14013a = u7;
            obj.f14014b = m7;
            obj.f14015c = j9;
            obj.f14016d = i9;
            obj.f14017e = (int) Math.pow(2.0d, u8 & 15);
            obj.f = pow;
            obj.f14018g = copyOf;
            this.f1964q = obj;
        } else {
            io.grpc.okhttp.internal.e eVar = this.f1965r;
            if (eVar == null) {
                this.f1965r = AbstractC1428b.v(qVar, true, true);
            } else {
                int i11 = qVar.f2515c;
                byte[] bArr2 = new byte[i11];
                System.arraycopy(qVar.f2513a, 0, bArr2, 0, i11);
                int i12 = 5;
                AbstractC1428b.w(5, qVar, false);
                int u9 = qVar.u() + 1;
                p pVar = new p(qVar.f2513a);
                pVar.t(qVar.f2514b * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = 16;
                    if (i13 < u9) {
                        if (pVar.i(24) == 5653314) {
                            int i16 = pVar.i(16);
                            int i17 = pVar.i(24);
                            if (!pVar.h()) {
                                boolean h8 = pVar.h();
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if (h8) {
                                        if (pVar.h()) {
                                            pVar.t(i12);
                                        }
                                    } else {
                                        pVar.t(i12);
                                    }
                                }
                            } else {
                                pVar.t(i12);
                                for (int i19 = 0; i19 < i17; i19 += pVar.i(AbstractC1428b.n(i17 - i19))) {
                                }
                            }
                            int i20 = pVar.i(i10);
                            if (i20 <= 2) {
                                if (i20 != 1 && i20 != 2) {
                                    yVar2 = yVar3;
                                    bArr = bArr2;
                                } else {
                                    pVar.t(32);
                                    pVar.t(32);
                                    int i21 = pVar.i(i10) + 1;
                                    pVar.t(1);
                                    if (i20 == 1) {
                                        if (i16 != 0) {
                                            yVar2 = yVar3;
                                            bArr = bArr2;
                                            j8 = (long) Math.floor(Math.pow(i17, 1.0d / i16));
                                        } else {
                                            yVar2 = yVar3;
                                            bArr = bArr2;
                                            j8 = 0;
                                        }
                                    } else {
                                        yVar2 = yVar3;
                                        bArr = bArr2;
                                        j8 = i17 * i16;
                                    }
                                    pVar.t((int) (j8 * i21));
                                }
                                i13++;
                                yVar3 = yVar2;
                                bArr2 = bArr;
                                i10 = 4;
                                i12 = 5;
                            } else {
                                throw J.a(null, "lookup type greater than 2 not decodable: " + i20);
                            }
                        } else {
                            throw J.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((pVar.f2508c * 8) + pVar.f2510e));
                        }
                    } else {
                        y yVar4 = yVar3;
                        byte[] bArr3 = bArr2;
                        int i22 = 6;
                        int i23 = pVar.i(6) + 1;
                        for (int i24 = 0; i24 < i23; i24++) {
                            if (pVar.i(16) != 0) {
                                throw J.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i25 = pVar.i(6) + 1;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < i25) {
                                int i28 = pVar.i(i15);
                                if (i28 != 0) {
                                    if (i28 == 1) {
                                        int i29 = pVar.i(5);
                                        int[] iArr = new int[i29];
                                        int i30 = -1;
                                        for (int i31 = 0; i31 < i29; i31++) {
                                            int i32 = pVar.i(4);
                                            iArr[i31] = i32;
                                            if (i32 > i30) {
                                                i30 = i32;
                                            }
                                        }
                                        int i33 = i30 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = pVar.i(i27) + 1;
                                            int i35 = pVar.i(i14);
                                            int i36 = 8;
                                            if (i35 > 0) {
                                                pVar.t(8);
                                            }
                                            int i37 = 0;
                                            while (i37 < (1 << i35)) {
                                                pVar.t(i36);
                                                i37++;
                                                i36 = 8;
                                            }
                                            i34++;
                                            i27 = 3;
                                            i14 = 2;
                                        }
                                        pVar.t(i14);
                                        int i38 = pVar.i(4);
                                        int i39 = 0;
                                        int i40 = 0;
                                        for (int i41 = 0; i41 < i29; i41++) {
                                            i39 += iArr2[iArr[i41]];
                                            while (i40 < i39) {
                                                pVar.t(i38);
                                                i40++;
                                            }
                                        }
                                    } else {
                                        throw J.a(null, "floor type greater than 1 not decodable: " + i28);
                                    }
                                } else {
                                    int i42 = 8;
                                    pVar.t(8);
                                    pVar.t(16);
                                    pVar.t(16);
                                    pVar.t(6);
                                    pVar.t(8);
                                    int i43 = pVar.i(4) + 1;
                                    int i44 = 0;
                                    while (i44 < i43) {
                                        pVar.t(i42);
                                        i44++;
                                        i42 = 8;
                                    }
                                }
                                i26++;
                                i22 = 6;
                                i15 = 16;
                                i14 = 2;
                            } else {
                                int i45 = pVar.i(i22) + 1;
                                int i46 = 0;
                                while (i46 < i45) {
                                    if (pVar.i(16) <= 2) {
                                        pVar.t(24);
                                        pVar.t(24);
                                        pVar.t(24);
                                        int i47 = pVar.i(i22) + 1;
                                        int i48 = 8;
                                        pVar.t(8);
                                        int[] iArr3 = new int[i47];
                                        for (int i49 = 0; i49 < i47; i49++) {
                                            int i50 = pVar.i(3);
                                            if (pVar.h()) {
                                                i8 = pVar.i(5);
                                            } else {
                                                i8 = 0;
                                            }
                                            iArr3[i49] = (i8 * 8) + i50;
                                        }
                                        int i51 = 0;
                                        while (i51 < i47) {
                                            int i52 = 0;
                                            while (i52 < i48) {
                                                if ((iArr3[i51] & (1 << i52)) != 0) {
                                                    pVar.t(i48);
                                                }
                                                i52++;
                                                i48 = 8;
                                            }
                                            i51++;
                                            i48 = 8;
                                        }
                                        i46++;
                                        i22 = 6;
                                    } else {
                                        throw J.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int i53 = pVar.i(i22) + 1;
                                int i54 = 0;
                                while (i54 < i53) {
                                    int i55 = pVar.i(16);
                                    if (i55 != 0) {
                                        K0.a.n("VorbisUtil", "mapping type other than 0 not supported: " + i55);
                                        yVar = yVar4;
                                    } else {
                                        if (pVar.h()) {
                                            i7 = pVar.i(4) + 1;
                                        } else {
                                            i7 = 1;
                                        }
                                        boolean h9 = pVar.h();
                                        yVar = yVar4;
                                        int i56 = yVar.f14013a;
                                        if (h9) {
                                            int i57 = pVar.i(8) + 1;
                                            for (int i58 = 0; i58 < i57; i58++) {
                                                int i59 = i56 - 1;
                                                pVar.t(AbstractC1428b.n(i59));
                                                pVar.t(AbstractC1428b.n(i59));
                                            }
                                        }
                                        if (pVar.i(2) == 0) {
                                            if (i7 > 1) {
                                                for (int i60 = 0; i60 < i56; i60++) {
                                                    pVar.t(4);
                                                }
                                            }
                                            for (int i61 = 0; i61 < i7; i61++) {
                                                pVar.t(8);
                                                pVar.t(8);
                                                pVar.t(8);
                                            }
                                        } else {
                                            throw J.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                    i54++;
                                    yVar4 = yVar;
                                }
                                y yVar5 = yVar4;
                                int i62 = pVar.i(6);
                                int i63 = i62 + 1;
                                n[] nVarArr = new n[i63];
                                for (int i64 = 0; i64 < i63; i64++) {
                                    boolean h10 = pVar.h();
                                    pVar.i(16);
                                    pVar.i(16);
                                    pVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f29a = h10;
                                    nVarArr[i64] = obj2;
                                }
                                if (pVar.h()) {
                                    aVar = new B.a(yVar5, eVar, bArr3, nVarArr, AbstractC1428b.n(i62));
                                } else {
                                    throw J.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        aVar = null;
        this.f1961n = aVar;
        if (aVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        y yVar6 = (y) aVar.f224b;
        arrayList.add((byte[]) yVar6.f14018g);
        arrayList.add((byte[]) aVar.f226d);
        H s7 = AbstractC1428b.s(K.q(((io.grpc.okhttp.internal.e) aVar.f225c).f12550b));
        C0137q c0137q = new C0137q();
        c0137q.f1850l = I.l("audio/vorbis");
        c0137q.f1846g = yVar6.f14016d;
        c0137q.f1847h = yVar6.f14015c;
        c0137q.f1864z = yVar6.f14013a;
        c0137q.f1832A = yVar6.f14014b;
        c0137q.f1853o = arrayList;
        c0137q.j = s7;
        fVar.f10b = new r(c0137q);
        return true;
    }

    @Override // H1.i
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.f1961n = null;
            this.f1964q = null;
            this.f1965r = null;
        }
        this.f1962o = 0;
        this.f1963p = false;
    }
}
