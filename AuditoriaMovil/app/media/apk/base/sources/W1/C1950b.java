package w1;

import H0.H;
import K0.p;
import K0.q;
import a.AbstractC0412a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import v1.C1881a;
import x1.C1985a;
import z3.h;
/* renamed from: w1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950b extends AbstractC0412a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16333a;

    public static C1985a j0(q qVar) {
        String p7 = qVar.p();
        p7.getClass();
        String p8 = qVar.p();
        p8.getClass();
        return new C1985a(p7, p8, qVar.o(), qVar.o(), Arrays.copyOfRange(qVar.f2513a, qVar.f2514b, qVar.f2515c));
    }

    @Override // a.AbstractC0412a
    public final H m(C1881a c1881a, ByteBuffer byteBuffer) {
        switch (this.f16333a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    p pVar = new p(byteBuffer.array(), byteBuffer.limit());
                    int i7 = 12;
                    pVar.t(12);
                    int f = (pVar.f() + pVar.i(12)) - 4;
                    pVar.t(44);
                    pVar.u(pVar.i(12));
                    pVar.t(16);
                    ArrayList arrayList = new ArrayList();
                    while (pVar.f() < f) {
                        pVar.t(48);
                        int i8 = pVar.i(8);
                        pVar.t(4);
                        int f4 = pVar.f() + pVar.i(i7);
                        String str = null;
                        String str2 = null;
                        while (pVar.f() < f4) {
                            int i9 = pVar.i(8);
                            int i10 = pVar.i(8);
                            int f8 = pVar.f() + i10;
                            if (i9 == 2) {
                                int i11 = pVar.i(16);
                                pVar.t(8);
                                if (i11 == 3) {
                                    while (pVar.f() < f8) {
                                        int i12 = pVar.i(8);
                                        Charset charset = h.f16884a;
                                        byte[] bArr = new byte[i12];
                                        pVar.l(bArr, i12);
                                        String str3 = new String(bArr, charset);
                                        int i13 = pVar.i(8);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            pVar.u(pVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i9 == 21) {
                                Charset charset2 = h.f16884a;
                                byte[] bArr2 = new byte[i10];
                                pVar.l(bArr2, i10);
                                str2 = new String(bArr2, charset2);
                            }
                            pVar.q(f8 * 8);
                        }
                        pVar.q(f4 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new C1949a(i8, str.concat(str2)));
                        }
                        i7 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new H(arrayList);
                    }
                }
                return null;
            default:
                return new H(j0(new q(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
