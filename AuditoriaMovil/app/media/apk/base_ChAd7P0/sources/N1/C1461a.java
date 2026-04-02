package n1;

import A3.I;
import A3.K;
import A3.e0;
import H0.J;
import K0.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import m1.G;
import m1.InterfaceC1426A;
import m1.k;
import m1.l;
import m1.o;
import m1.p;
import m1.q;
import z3.h;
/* renamed from: n1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461a implements o {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f14136p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f14137q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f14138r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f14139s;

    /* renamed from: t  reason: collision with root package name */
    public static final int f14140t;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14143c;

    /* renamed from: d  reason: collision with root package name */
    public long f14144d;

    /* renamed from: e  reason: collision with root package name */
    public int f14145e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14146g;

    /* renamed from: h  reason: collision with root package name */
    public long f14147h;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public long f14149k;

    /* renamed from: l  reason: collision with root package name */
    public q f14150l;

    /* renamed from: m  reason: collision with root package name */
    public G f14151m;

    /* renamed from: n  reason: collision with root package name */
    public InterfaceC1426A f14152n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14153o;

    /* renamed from: b  reason: collision with root package name */
    public final int f14142b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14141a = new byte[1];

    /* renamed from: i  reason: collision with root package name */
    public int f14148i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f14137q = iArr;
        int i7 = x.f2529a;
        Charset charset = h.f16886c;
        f14138r = "#!AMR\n".getBytes(charset);
        f14139s = "#!AMR-WB\n".getBytes(charset);
        f14140t = iArr[8];
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        this.f14144d = 0L;
        this.f14145e = 0;
        this.f = 0;
        if (j != 0) {
            InterfaceC1426A interfaceC1426A = this.f14152n;
            if (interfaceC1426A instanceof k) {
                k kVar = (k) interfaceC1426A;
                this.f14149k = (Math.max(0L, j - kVar.f13965b) * 8000000) / kVar.f13968e;
                return;
            }
        }
        this.f14149k = 0L;
    }

    public final int b(l lVar) {
        String str;
        boolean z7;
        lVar.f = 0;
        byte[] bArr = this.f14141a;
        lVar.q(bArr, 0, 1, false);
        byte b5 = bArr[0];
        if ((b5 & 131) <= 0) {
            int i7 = (b5 >> 3) & 15;
            if (i7 >= 0 && i7 <= 15 && (((z7 = this.f14143c) && (i7 < 10 || i7 > 13)) || (!z7 && (i7 < 12 || i7 > 14)))) {
                if (z7) {
                    return f14137q[i7];
                }
                return f14136p[i7];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f14143c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i7);
            throw J.a(null, sb.toString());
        }
        throw J.a(null, "Invalid padding bits for frame header " + ((int) b5));
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    public final boolean d(l lVar) {
        lVar.f = 0;
        byte[] bArr = f14138r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.q(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f14143c = false;
            lVar.m(bArr.length);
            return true;
        }
        lVar.f = 0;
        byte[] bArr3 = f14139s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.q(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f14143c = true;
        lVar.m(bArr3.length);
        return true;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        return d((l) pVar);
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(q qVar) {
        this.f14150l = qVar;
        this.f14151m = qVar.s(0, 1);
        qVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r20, H0.C0140u r21) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C1461a.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
    }
}
