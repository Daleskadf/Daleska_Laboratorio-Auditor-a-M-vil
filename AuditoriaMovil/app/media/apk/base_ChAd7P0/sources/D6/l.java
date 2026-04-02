package d6;

import D.AbstractC0059i;
import a6.I;
import a6.J;
import a6.Z;
import a6.c0;
import a6.e0;
import a6.o0;
import androidx.datastore.preferences.protobuf.Y;
import c6.AbstractC0655c;
import c6.AbstractC0671h0;
import c6.AbstractC0683l0;
import c6.C0684l1;
import c6.EnumC0714w;
import c6.G0;
import c6.G1;
import c6.H1;
import c6.RunnableC0649a;
import c6.o2;
import c6.r2;
import e6.C0967b;
import e6.EnumC0966a;
import i6.C1129p;
import j6.AbstractC1371b;
import j6.C1370a;
import j6.C1372c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class l extends AbstractC0683l0 implements y {

    /* renamed from: A  reason: collision with root package name */
    public boolean f10408A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f10409B;

    /* renamed from: C  reason: collision with root package name */
    public int f10410C;

    /* renamed from: D  reason: collision with root package name */
    public int f10411D;

    /* renamed from: E  reason: collision with root package name */
    public final C0907d f10412E;

    /* renamed from: F  reason: collision with root package name */
    public final K0.o f10413F;

    /* renamed from: G  reason: collision with root package name */
    public final p f10414G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f10415H;

    /* renamed from: I  reason: collision with root package name */
    public final C1372c f10416I;

    /* renamed from: J  reason: collision with root package name */
    public z f10417J;

    /* renamed from: K  reason: collision with root package name */
    public int f10418K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ m f10419L;

    /* renamed from: v  reason: collision with root package name */
    public final int f10420v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f10421w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f10422x;

    /* renamed from: y  reason: collision with root package name */
    public final Q6.e f10423y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10424z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v3, types: [Q6.e, java.lang.Object] */
    public l(m mVar, int i7, o2 o2Var, Object obj, C0907d c0907d, K0.o oVar, p pVar, int i8) {
        super(i7, o2Var, mVar.f8793c);
        this.f10419L = mVar;
        this.f8885s = z3.h.f16886c;
        this.f10423y = new Object();
        this.f10424z = false;
        this.f10408A = false;
        this.f10409B = false;
        this.f10415H = true;
        this.f10418K = -1;
        G.i.j(obj, "lock");
        this.f10421w = obj;
        this.f10412E = c0907d;
        this.f10413F = oVar;
        this.f10414G = pVar;
        this.f10410C = i8;
        this.f10411D = i8;
        this.f10420v = i8;
        AbstractC1371b.f13458a.getClass();
        this.f10416I = C1370a.f13456a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v9, types: [a6.e0, java.lang.Object] */
    public static void k(l lVar, e0 e0Var, String str) {
        boolean z7;
        m mVar = lVar.f10419L;
        String str2 = mVar.f10428m;
        boolean z8 = mVar.f10432q;
        p pVar = lVar.f10414G;
        if (pVar.f10440B == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        C0967b c0967b = AbstractC0908e.f10375a;
        G.i.j(e0Var, "headers");
        G.i.j(str, "defaultPath");
        G.i.j(str2, "authority");
        e0Var.a(AbstractC0671h0.f8836i);
        e0Var.a(AbstractC0671h0.j);
        Z z9 = AbstractC0671h0.f8837k;
        e0Var.a(z9);
        ArrayList arrayList = new ArrayList(e0Var.f7143b + 7);
        if (z7) {
            arrayList.add(AbstractC0908e.f10376b);
        } else {
            arrayList.add(AbstractC0908e.f10375a);
        }
        if (z8) {
            arrayList.add(AbstractC0908e.f10378d);
        } else {
            arrayList.add(AbstractC0908e.f10377c);
        }
        arrayList.add(new C0967b(C0967b.f10924h, str2));
        arrayList.add(new C0967b(C0967b.f, str));
        arrayList.add(new C0967b(z9.f7118a, mVar.f10426k));
        arrayList.add(AbstractC0908e.f10379e);
        arrayList.add(AbstractC0908e.f);
        Logger logger = r2.f8971a;
        Charset charset = I.f7083a;
        int i7 = e0Var.f7143b * 2;
        byte[][] bArr = new byte[i7];
        Object[] objArr = e0Var.f7142a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i7);
        } else {
            for (int i8 = 0; i8 < e0Var.f7143b; i8++) {
                int i9 = i8 * 2;
                bArr[i9] = e0Var.e(i8);
                int i10 = i9 + 1;
                Object obj = e0Var.f7142a[i10];
                if (obj instanceof byte[]) {
                    bArr[i10] = (byte[]) obj;
                } else {
                    AbstractC0059i.I(obj);
                    throw null;
                }
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i7; i12 += 2) {
            byte[] bArr2 = bArr[i12];
            byte[] bArr3 = bArr[i12 + 1];
            if (r2.a(bArr2, r2.f8972b)) {
                bArr[i11] = bArr2;
                bArr[i11 + 1] = I.f7084b.c(bArr3).getBytes(z3.h.f16884a);
            } else {
                for (byte b5 : bArr3) {
                    if (b5 < 32 || b5 > 126) {
                        StringBuilder m7 = Y.m("Metadata key=", new String(bArr2, z3.h.f16884a), ", value=");
                        m7.append(Arrays.toString(bArr3));
                        m7.append(" contains invalid ASCII characters");
                        r2.f8971a.warning(m7.toString());
                        break;
                    }
                }
                bArr[i11] = bArr2;
                bArr[i11 + 1] = bArr3;
            }
            i11 += 2;
        }
        if (i11 != i7) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i11);
        }
        for (int i13 = 0; i13 < bArr.length; i13 += 2) {
            Q6.g k2 = Q6.g.k(bArr[i13]);
            byte[] bArr4 = k2.f4464a;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new C0967b(k2, Q6.g.k(bArr[i13 + 1])));
            }
        }
        lVar.f10422x = arrayList;
        o0 o0Var = pVar.f10473v;
        if (o0Var != null) {
            mVar.f10429n.g(o0Var, EnumC0714w.MISCARRIED, true, new Object());
        } else if (pVar.f10465n.size() >= pVar.f10441C) {
            pVar.f10442D.add(mVar);
            if (!pVar.f10477z) {
                pVar.f10477z = true;
                G0 g02 = pVar.f10444F;
                if (g02 != null) {
                    g02.b();
                }
            }
            if (mVar.f8795e) {
                pVar.f10451M.u(mVar, true);
            }
        } else {
            pVar.w(mVar);
        }
    }

    public static void l(l lVar, Q6.e eVar, boolean z7, boolean z8) {
        boolean z9;
        if (!lVar.f10409B) {
            if (lVar.f10415H) {
                lVar.f10423y.l(eVar, (int) eVar.f4462b);
                lVar.f10424z |= z7;
                lVar.f10408A |= z8;
                return;
            }
            if (lVar.f10418K != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            G.i.o("streamId should be set", z9);
            lVar.f10413F.b(z7, lVar.f10417J, eVar, z8);
        }
    }

    @Override // c6.AbstractC0652b
    public final void a(int i7) {
        int i8 = this.f10411D - i7;
        this.f10411D = i8;
        int i9 = this.f10420v;
        if (i8 <= i9 * 0.5f) {
            int i10 = i9 - i8;
            this.f10410C += i10;
            this.f10411D = i8 + i10;
            this.f10412E.m(this.f10418K, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [a6.e0, java.lang.Object] */
    @Override // c6.AbstractC0652b
    public final void c(boolean z7) {
        if (!this.f8782n) {
            this.f10414G.j(this.f10418K, null, EnumC0714w.PROCESSED, false, EnumC0966a.CANCEL, null);
        } else {
            this.f10414G.j(this.f10418K, null, EnumC0714w.PROCESSED, false, null, null);
        }
        G.i.o("status should have been reported on deframer closed", this.f8783o);
        this.f8780l = true;
        if (this.f8784p && z7) {
            h(o0.f7179m.g("Encountered end-of-stream mid-frame"), true, new Object());
        }
        RunnableC0649a runnableC0649a = this.f8781m;
        if (runnableC0649a != null) {
            runnableC0649a.run();
            this.f8781m = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(o0 o0Var, boolean z7, e0 e0Var) {
        if (this.f10409B) {
            return;
        }
        this.f10409B = true;
        if (this.f10415H) {
            p pVar = this.f10414G;
            LinkedList linkedList = pVar.f10442D;
            m mVar = this.f10419L;
            linkedList.remove(mVar);
            pVar.p(mVar);
            this.f10422x = null;
            Q6.e eVar = this.f10423y;
            eVar.r(eVar.f4462b);
            this.f10415H = false;
            e0 e0Var2 = e0Var;
            if (e0Var == null) {
                e0Var2 = new Object();
            }
            h(o0Var, true, e0Var2);
            return;
        }
        this.f10414G.j(this.f10418K, o0Var, EnumC0714w.PROCESSED, z7, EnumC0966a.CANCEL, e0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a6.e0, java.lang.Object] */
    public final void n(Throwable th) {
        m(o0.d(th), true, new Object());
    }

    public final z o() {
        z zVar;
        synchronized (this.f10421w) {
            zVar = this.f10417J;
        }
        return zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [a6.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [a6.e0, java.lang.Object] */
    public final void p(int i7, Q6.e eVar, boolean z7) {
        boolean z8;
        Throwable th;
        boolean z9 = true;
        long j = eVar.f4462b;
        int i8 = this.f10410C - (((int) j) + i7);
        this.f10410C = i8;
        this.f10411D -= i7;
        if (i8 < 0) {
            this.f10412E.g(this.f10418K, EnumC0966a.FLOW_CONTROL_ERROR);
            this.f10414G.j(this.f10418K, o0.f7179m.g("Received data size exceeded our receiving window size"), EnumC0714w.PROCESSED, false, null, null);
            return;
        }
        u uVar = new u(eVar);
        o0 o0Var = this.f8883q;
        if (o0Var != null) {
            Charset charset = this.f8885s;
            G1 g12 = H1.f8472a;
            G.i.j(charset, "charset");
            int i9 = (int) eVar.f4462b;
            byte[] bArr = new byte[i9];
            uVar.m(bArr, 0, i9);
            this.f8883q = o0Var.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            uVar.close();
            if (this.f8883q.f7184b.length() > 1000 || z7) {
                m(this.f8883q, false, this.f8884r);
            }
        } else if (!this.f8886t) {
            m(o0.f7179m.g("headers not received before payload"), false, new Object());
        } else {
            int i10 = (int) j;
            try {
                if (this.f8783o) {
                    AbstractC0655c.f8792i.log(Level.INFO, "Received data on closed stream");
                    uVar.close();
                } else {
                    try {
                        C0684l1 c0684l1 = this.f8771a;
                        c0684l1.getClass();
                        try {
                            if (!c0684l1.b() && !c0684l1.f8902l0) {
                                c0684l1.f8897g0.r(uVar);
                                try {
                                    c0684l1.a();
                                } catch (Throwable th2) {
                                    th = th2;
                                    z8 = false;
                                    if (z8) {
                                        uVar.close();
                                    }
                                    throw th;
                                }
                            }
                            uVar.close();
                        } catch (Throwable th3) {
                            z8 = true;
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            n(th4);
                        } catch (Throwable th5) {
                            th = th5;
                            z9 = false;
                            if (z9) {
                                uVar.close();
                            }
                            throw th;
                        }
                    }
                }
                if (z7) {
                    if (i10 > 0) {
                        this.f8883q = o0.f7179m.g("Received unexpected EOS on non-empty DATA frame from server");
                    } else {
                        this.f8883q = o0.f7179m.g("Received unexpected EOS on empty DATA frame from server");
                    }
                    ?? obj = new Object();
                    this.f8884r = obj;
                    h(this.f8883q, false, obj);
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [a6.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [a6.e0, java.lang.Object] */
    public final void q(ArrayList arrayList, boolean z7) {
        o0 j;
        StringBuilder sb;
        o0 g3;
        o0 a7;
        c0 c0Var = AbstractC0683l0.f8882u;
        if (z7) {
            byte[][] a8 = AbstractC0903A.a(arrayList);
            ?? obj = new Object();
            obj.f7143b = a8.length / 2;
            obj.f7142a = a8;
            if (this.f8883q == null && !this.f8886t) {
                o0 j8 = AbstractC0683l0.j(obj);
                this.f8883q = j8;
                if (j8 != null) {
                    this.f8884r = obj;
                }
            }
            o0 o0Var = this.f8883q;
            if (o0Var != null) {
                o0 a9 = o0Var.a("trailers: " + ((Object) obj));
                this.f8883q = a9;
                m(a9, false, this.f8884r);
                return;
            }
            c0 c0Var2 = J.f7086b;
            o0 o0Var2 = (o0) obj.c(c0Var2);
            if (o0Var2 != null) {
                a7 = o0Var2.g((String) obj.c(J.f7085a));
            } else if (this.f8886t) {
                a7 = o0.f7174g.g("missing GRPC status in response");
            } else {
                Integer num = (Integer) obj.c(c0Var);
                if (num != null) {
                    g3 = AbstractC0671h0.g(num.intValue());
                } else {
                    g3 = o0.f7179m.g("missing HTTP status code");
                }
                a7 = g3.a("missing GRPC status, inferred error from HTTP status code");
            }
            obj.a(c0Var);
            obj.a(c0Var2);
            obj.a(J.f7085a);
            if (this.f8783o) {
                AbstractC0655c.f8792i.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{a7, obj});
                return;
            }
            for (C1129p c1129p : this.f8777h.f8947a) {
                c1129p.e(obj);
            }
            h(a7, false, obj);
            return;
        }
        byte[][] a10 = AbstractC0903A.a(arrayList);
        ?? obj2 = new Object();
        obj2.f7143b = a10.length / 2;
        obj2.f7142a = a10;
        o0 o0Var3 = this.f8883q;
        if (o0Var3 != null) {
            this.f8883q = o0Var3.a("headers: " + ((Object) obj2));
            return;
        }
        try {
            if (this.f8886t) {
                j = o0.f7179m.g("Received headers twice");
                this.f8883q = j;
                sb = new StringBuilder("headers: ");
            } else {
                Integer num2 = (Integer) obj2.c(c0Var);
                if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                    j = this.f8883q;
                    if (j != null) {
                        sb = new StringBuilder("headers: ");
                    } else {
                        return;
                    }
                } else {
                    this.f8886t = true;
                    j = AbstractC0683l0.j(obj2);
                    this.f8883q = j;
                    if (j != null) {
                        sb = new StringBuilder("headers: ");
                    } else {
                        obj2.a(c0Var);
                        obj2.a(J.f7086b);
                        obj2.a(J.f7085a);
                        d(obj2);
                        j = this.f8883q;
                        if (j != null) {
                            sb = new StringBuilder("headers: ");
                        } else {
                            return;
                        }
                    }
                }
            }
            sb.append((Object) obj2);
            this.f8883q = j.a(sb.toString());
            this.f8884r = obj2;
            this.f8885s = AbstractC0683l0.i(obj2);
        } catch (Throwable th) {
            o0 o0Var4 = this.f8883q;
            if (o0Var4 != null) {
                this.f8883q = o0Var4.a("headers: " + ((Object) obj2));
                this.f8884r = obj2;
                this.f8885s = AbstractC0683l0.i(obj2);
            }
            throw th;
        }
    }
}
