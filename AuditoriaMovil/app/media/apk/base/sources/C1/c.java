package C1;

import H0.G;
import H0.H;
import K0.p;
import K0.q;
import K0.v;
import a.AbstractC0412a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v1.C1881a;
/* loaded from: classes.dex */
public final class c extends AbstractC0412a {

    /* renamed from: a  reason: collision with root package name */
    public final q f434a = new q();

    /* renamed from: b  reason: collision with root package name */
    public final p f435b = new p();

    /* renamed from: c  reason: collision with root package name */
    public v f436c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.AbstractC0412a
    public final H m(C1881a c1881a, ByteBuffer byteBuffer) {
        Object obj;
        boolean z7;
        int i7;
        int i8;
        long j;
        ArrayList arrayList;
        long j8;
        long j9;
        boolean z8;
        boolean z9;
        boolean z10;
        int i9;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        long j11;
        boolean z14;
        boolean z15;
        List list;
        long j12;
        long j13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i12;
        int i13;
        int i14;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        long j14;
        boolean z24;
        long j15;
        int i15 = 32;
        boolean z25 = true;
        v vVar = this.f436c;
        if (vVar == null || c1881a.f16031e0 != vVar.e()) {
            v vVar2 = new v(c1881a.f3345X);
            this.f436c = vVar2;
            vVar2.a(c1881a.f3345X - c1881a.f16031e0);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        q qVar = this.f434a;
        qVar.E(array, limit);
        p pVar = this.f435b;
        pVar.p(array, limit);
        pVar.t(39);
        long i16 = (pVar.i(1) << 32) | pVar.i(32);
        pVar.t(20);
        int i17 = pVar.i(12);
        int i18 = pVar.i(8);
        qVar.H(14);
        if (i18 != 0) {
            if (i18 != 255) {
                long j16 = 1;
                long j17 = -9223372036854775807L;
                if (i18 != 4) {
                    if (i18 != 5) {
                        if (i18 != 6) {
                            obj = null;
                        } else {
                            v vVar3 = this.f436c;
                            long a7 = j.a(i16, qVar);
                            obj = new j(a7, vVar3.b(a7));
                        }
                    } else {
                        v vVar4 = this.f436c;
                        long w2 = qVar.w();
                        if ((qVar.u() & RecognitionOptions.ITF) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z15) {
                            int u7 = qVar.u();
                            if ((u7 & RecognitionOptions.ITF) != 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if ((u7 & 64) != 0) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if ((u7 & 32) != 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if ((u7 & 16) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if (z21 && !z23) {
                                j14 = j.a(i16, qVar);
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            if (!z21) {
                                int u8 = qVar.u();
                                ArrayList arrayList2 = new ArrayList(u8);
                                for (int i19 = 0; i19 < u8; i19++) {
                                    int u9 = qVar.u();
                                    if (!z23) {
                                        j15 = j.a(i16, qVar);
                                    } else {
                                        j15 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new d(u9, j15, vVar4.b(j15)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z22) {
                                long u10 = qVar.u();
                                if ((u10 & 128) != 0) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                j17 = ((((u10 & 1) << 32) | qVar.w()) * 1000) / 90;
                            } else {
                                z24 = false;
                            }
                            int A7 = qVar.A();
                            int u11 = qVar.u();
                            z19 = z24;
                            i12 = A7;
                            list = emptyList;
                            i14 = qVar.u();
                            i13 = u11;
                            z16 = z20;
                            j13 = j17;
                            j12 = j14;
                            z18 = z23;
                            z17 = z21;
                        } else {
                            list = emptyList;
                            j12 = -9223372036854775807L;
                            j13 = -9223372036854775807L;
                            z16 = false;
                            z17 = false;
                            z18 = false;
                            z19 = false;
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                        }
                        obj = new e(w2, z15, z16, z17, z18, j12, vVar4.b(j12), list, z19, j13, i12, i13, i14);
                    }
                } else {
                    int u12 = qVar.u();
                    ArrayList arrayList3 = new ArrayList(u12);
                    int i20 = 0;
                    while (i20 < u12) {
                        long w7 = qVar.w();
                        if ((qVar.u() & RecognitionOptions.ITF) != 0) {
                            z7 = z25;
                        } else {
                            z7 = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z7) {
                            int u13 = qVar.u();
                            if ((u13 & RecognitionOptions.ITF) != 0) {
                                z11 = z25;
                            } else {
                                z11 = false;
                            }
                            if ((u13 & 64) != 0) {
                                z12 = z25;
                            } else {
                                z12 = false;
                            }
                            if ((u13 & i15) != 0) {
                                z13 = z25;
                            } else {
                                z13 = false;
                            }
                            if (z12) {
                                j10 = qVar.w();
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (!z12) {
                                int u14 = qVar.u();
                                ArrayList arrayList5 = new ArrayList(u14);
                                int i21 = 0;
                                while (i21 < u14) {
                                    arrayList5.add(new g(qVar.u(), qVar.w()));
                                    i21++;
                                    i20 = i20;
                                }
                                i8 = i20;
                                arrayList4 = arrayList5;
                            } else {
                                i8 = i20;
                            }
                            if (z13) {
                                long u15 = qVar.u();
                                if ((u15 & 128) != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                j = 1;
                                i7 = 32;
                                j11 = ((((u15 & 1) << 32) | qVar.w()) * 1000) / 90;
                            } else {
                                i7 = 32;
                                j = 1;
                                j11 = -9223372036854775807L;
                                z14 = false;
                            }
                            j9 = j11;
                            z10 = z14;
                            arrayList = arrayList4;
                            z8 = z11;
                            z9 = z12;
                            j8 = j10;
                            i9 = qVar.A();
                            i10 = qVar.u();
                            i11 = qVar.u();
                        } else {
                            i7 = i15;
                            i8 = i20;
                            j = j16;
                            arrayList = arrayList4;
                            j8 = -9223372036854775807L;
                            j9 = -9223372036854775807L;
                            z8 = false;
                            z9 = false;
                            z10 = false;
                            i9 = 0;
                            i10 = 0;
                            i11 = 0;
                        }
                        arrayList3.add(new h(w7, z7, z8, z9, arrayList, j8, z10, j9, i9, i10, i11));
                        i20 = i8 + 1;
                        z25 = true;
                        i15 = i7;
                        j16 = j;
                    }
                    obj = new i(arrayList3);
                }
            } else {
                long w8 = qVar.w();
                int i22 = i17 - 4;
                byte[] bArr = new byte[i22];
                qVar.f(bArr, 0, i22);
                obj = new a(w8, bArr, i16);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new H(new G[0]);
        }
        return new H(obj);
    }
}
