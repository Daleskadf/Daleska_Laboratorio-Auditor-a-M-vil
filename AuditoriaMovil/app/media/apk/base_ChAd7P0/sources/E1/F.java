package e1;

import A3.AbstractC0021t;
import A3.e0;
import H0.C0137q;
import O0.l0;
import f5.C0993a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class F implements InterfaceC0958x, InterfaceC0957w {

    /* renamed from: X  reason: collision with root package name */
    public b0 f10624X;

    /* renamed from: Y  reason: collision with root package name */
    public InterfaceC0958x[] f10625Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0947l f10626Z;

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0958x[] f10627a;

    /* renamed from: b  reason: collision with root package name */
    public final IdentityHashMap f10628b;

    /* renamed from: c  reason: collision with root package name */
    public final C0993a f10629c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f10630d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f10631e = new HashMap();
    public InterfaceC0957w f;

    public F(C0993a c0993a, long[] jArr, InterfaceC0958x... interfaceC0958xArr) {
        this.f10629c = c0993a;
        this.f10627a = interfaceC0958xArr;
        c0993a.getClass();
        A3.I i7 = A3.K.f98b;
        e0 e0Var = e0.f138e;
        this.f10626Z = new C0947l(e0Var, e0Var);
        this.f10628b = new IdentityHashMap();
        this.f10625Y = new InterfaceC0958x[0];
        for (int i8 = 0; i8 < interfaceC0958xArr.length; i8++) {
            long j = jArr[i8];
            if (j != 0) {
                this.f10627a[i8] = new a0(interfaceC0958xArr[i8], j);
            }
        }
    }

    @Override // e1.V
    public final void B(W w2) {
        InterfaceC0958x interfaceC0958x = (InterfaceC0958x) w2;
        InterfaceC0957w interfaceC0957w = this.f;
        interfaceC0957w.getClass();
        interfaceC0957w.B(this);
    }

    @Override // e1.InterfaceC0957w
    public final void a(InterfaceC0958x interfaceC0958x) {
        ArrayList arrayList = this.f10630d;
        arrayList.remove(interfaceC0958x);
        if (!arrayList.isEmpty()) {
            return;
        }
        InterfaceC0958x[] interfaceC0958xArr = this.f10627a;
        int i7 = 0;
        for (InterfaceC0958x interfaceC0958x2 : interfaceC0958xArr) {
            i7 += interfaceC0958x2.m().f10780a;
        }
        H0.W[] wArr = new H0.W[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < interfaceC0958xArr.length; i9++) {
            b0 m7 = interfaceC0958xArr[i9].m();
            int i10 = m7.f10780a;
            int i11 = 0;
            while (i11 < i10) {
                H0.W a7 = m7.a(i11);
                int i12 = a7.f1739a;
                H0.r[] rVarArr = new H0.r[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    H0.r rVar = a7.f1742d[i13];
                    C0137q a8 = rVar.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    String str = rVar.f1876a;
                    if (str == null) {
                        str = StringUtils.EMPTY;
                    }
                    sb.append(str);
                    a8.f1841a = sb.toString();
                    rVarArr[i13] = new H0.r(a8);
                }
                H0.W w2 = new H0.W(i9 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + a7.f1740b, rVarArr);
                this.f10631e.put(w2, a7);
                wArr[i8] = w2;
                i11++;
                i8++;
            }
        }
        this.f10624X = new b0(wArr);
        InterfaceC0957w interfaceC0957w = this.f;
        interfaceC0957w.getClass();
        interfaceC0957w.a(this);
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        InterfaceC0958x interfaceC0958x;
        InterfaceC0958x[] interfaceC0958xArr = this.f10625Y;
        if (interfaceC0958xArr.length > 0) {
            interfaceC0958x = interfaceC0958xArr[0];
        } else {
            interfaceC0958x = this.f10627a[0];
        }
        return interfaceC0958x.c(j, l0Var);
    }

    @Override // e1.W
    public final boolean d() {
        return this.f10626Z.d();
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        this.f = interfaceC0957w;
        ArrayList arrayList = this.f10630d;
        InterfaceC0958x[] interfaceC0958xArr = this.f10627a;
        Collections.addAll(arrayList, interfaceC0958xArr);
        for (InterfaceC0958x interfaceC0958x : interfaceC0958xArr) {
            interfaceC0958x.f(this, j);
        }
    }

    @Override // e1.InterfaceC0958x
    public final long i(h1.r[] rVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        U u7;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f10628b;
            if (i8 >= length) {
                break;
            }
            U u8 = uArr[i8];
            if (u8 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(u8);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i8] = intValue;
            h1.r rVar = rVarArr[i8];
            if (rVar != null) {
                String str = rVar.i().f1740b;
                iArr2[i8] = Integer.parseInt(str.substring(0, str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        U[] uArr2 = new U[length2];
        U[] uArr3 = new U[rVarArr.length];
        h1.r[] rVarArr2 = new h1.r[rVarArr.length];
        InterfaceC0958x[] interfaceC0958xArr = this.f10627a;
        ArrayList arrayList2 = new ArrayList(interfaceC0958xArr.length);
        long j8 = j;
        int i9 = 0;
        while (i9 < interfaceC0958xArr.length) {
            int i10 = i7;
            while (i10 < rVarArr.length) {
                if (iArr[i10] == i9) {
                    u7 = uArr[i10];
                } else {
                    u7 = null;
                }
                uArr3[i10] = u7;
                if (iArr2[i10] == i9) {
                    h1.r rVar2 = rVarArr[i10];
                    rVar2.getClass();
                    arrayList = arrayList2;
                    H0.W w2 = (H0.W) this.f10631e.get(rVar2.i());
                    w2.getClass();
                    rVarArr2[i10] = new C0935E(rVar2, w2);
                } else {
                    arrayList = arrayList2;
                    rVarArr2[i10] = null;
                }
                i10++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i11 = i9;
            InterfaceC0958x[] interfaceC0958xArr2 = interfaceC0958xArr;
            h1.r[] rVarArr3 = rVarArr2;
            long i12 = interfaceC0958xArr[i9].i(rVarArr2, zArr, uArr3, zArr2, j8);
            if (i11 == 0) {
                j8 = i12;
            } else if (i12 != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i13 = 0; i13 < rVarArr.length; i13++) {
                boolean z8 = true;
                if (iArr2[i13] == i11) {
                    U u9 = uArr3[i13];
                    u9.getClass();
                    uArr2[i13] = uArr3[i13];
                    identityHashMap.put(u9, Integer.valueOf(i11));
                    z7 = true;
                } else if (iArr[i13] == i11) {
                    if (uArr3[i13] != null) {
                        z8 = false;
                    }
                    K0.a.j(z8);
                }
            }
            if (z7) {
                arrayList3.add(interfaceC0958xArr2[i11]);
            }
            i9 = i11 + 1;
            arrayList2 = arrayList3;
            interfaceC0958xArr = interfaceC0958xArr2;
            rVarArr2 = rVarArr3;
            i7 = 0;
        }
        int i14 = i7;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(uArr2, i14, uArr, i14, length2);
        this.f10625Y = (InterfaceC0958x[]) arrayList4.toArray(new InterfaceC0958x[i14]);
        AbstractList w7 = AbstractC0021t.w(arrayList4, new com.it_nomads.fluttersecurestorage.ciphers.d(6));
        this.f10629c.getClass();
        this.f10626Z = new C0947l(arrayList4, w7);
        return j8;
    }

    @Override // e1.W
    public final long k() {
        return this.f10626Z.k();
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        InterfaceC0958x[] interfaceC0958xArr;
        InterfaceC0958x[] interfaceC0958xArr2;
        long j = -9223372036854775807L;
        for (InterfaceC0958x interfaceC0958x : this.f10625Y) {
            long l8 = interfaceC0958x.l();
            if (l8 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (InterfaceC0958x interfaceC0958x2 : this.f10625Y) {
                        if (interfaceC0958x2 == interfaceC0958x) {
                            break;
                        } else if (interfaceC0958x2.q(l8) != l8) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = l8;
                } else if (l8 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && interfaceC0958x.q(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        b0 b0Var = this.f10624X;
        b0Var.getClass();
        return b0Var;
    }

    @Override // e1.W
    public final boolean n(O0.Q q2) {
        ArrayList arrayList = this.f10630d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((InterfaceC0958x) arrayList.get(i7)).n(q2);
            }
            return false;
        }
        return this.f10626Z.n(q2);
    }

    @Override // e1.W
    public final long o() {
        return this.f10626Z.o();
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        for (InterfaceC0958x interfaceC0958x : this.f10627a) {
            interfaceC0958x.p();
        }
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        long q2 = this.f10625Y[0].q(j);
        int i7 = 1;
        while (true) {
            InterfaceC0958x[] interfaceC0958xArr = this.f10625Y;
            if (i7 < interfaceC0958xArr.length) {
                if (interfaceC0958xArr[i7].q(q2) == q2) {
                    i7++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return q2;
            }
        }
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        for (InterfaceC0958x interfaceC0958x : this.f10625Y) {
            interfaceC0958x.r(j);
        }
    }

    @Override // e1.W
    public final void t(long j) {
        this.f10626Z.t(j);
    }
}
