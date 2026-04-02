package S1;

import H0.C0137q;
import java.util.concurrent.atomic.AtomicInteger;
import m1.C1427a;
/* renamed from: S1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339g implements InterfaceC0341i {

    /* renamed from: a  reason: collision with root package name */
    public final K0.q f5013a;

    /* renamed from: c  reason: collision with root package name */
    public final String f5015c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5016d;

    /* renamed from: e  reason: collision with root package name */
    public String f5017e;
    public m1.G f;

    /* renamed from: h  reason: collision with root package name */
    public int f5019h;

    /* renamed from: i  reason: collision with root package name */
    public int f5020i;
    public long j;

    /* renamed from: k  reason: collision with root package name */
    public H0.r f5021k;

    /* renamed from: l  reason: collision with root package name */
    public int f5022l;

    /* renamed from: m  reason: collision with root package name */
    public int f5023m;

    /* renamed from: g  reason: collision with root package name */
    public int f5018g = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f5026p = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f5014b = new AtomicInteger();

    /* renamed from: n  reason: collision with root package name */
    public int f5024n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f5025o = -1;

    public C0339g(String str, int i7, int i8) {
        this.f5013a = new K0.q(new byte[i8]);
        this.f5015c = str;
        this.f5016d = i7;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        this.f5018g = 0;
        this.f5019h = 0;
        this.f5020i = 0;
        this.f5026p = -9223372036854775807L;
        this.f5014b.set(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a0  */
    @Override // S1.InterfaceC0341i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(K0.q r38) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C0339g.b(K0.q):void");
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        this.f5026p = j;
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f5017e = (String) h8.f4961e;
        h8.d();
        this.f = qVar.s(h8.f4959c, 1);
    }

    public final boolean f(K0.q qVar, byte[] bArr, int i7) {
        int min = Math.min(qVar.a(), i7 - this.f5019h);
        qVar.f(bArr, this.f5019h, min);
        int i8 = this.f5019h + min;
        this.f5019h = i8;
        if (i8 == i7) {
            return true;
        }
        return false;
    }

    public final void g(C1427a c1427a) {
        int i7;
        C0137q a7;
        int i8 = c1427a.f13903b;
        if (i8 != -2147483647 && (i7 = c1427a.f13904c) != -1) {
            H0.r rVar = this.f5021k;
            String str = c1427a.f13902a;
            if (rVar == null || i7 != rVar.f1865A || i8 != rVar.f1866B || !str.equals(rVar.f1886m)) {
                H0.r rVar2 = this.f5021k;
                if (rVar2 == null) {
                    a7 = new C0137q();
                } else {
                    a7 = rVar2.a();
                }
                a7.f1841a = this.f5017e;
                a7.f1850l = H0.I.l(str);
                a7.f1864z = i7;
                a7.f1832A = i8;
                a7.f1844d = this.f5015c;
                a7.f = this.f5016d;
                H0.r rVar3 = new H0.r(a7);
                this.f5021k = rVar3;
                this.f.c(rVar3);
            }
        }
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
    }
}
