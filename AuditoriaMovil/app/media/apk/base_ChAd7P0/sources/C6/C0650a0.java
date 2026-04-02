package c6;

import a6.AbstractC0482k;
import a6.C0476e;
import a6.C0481j;
import i6.C1130q;
/* renamed from: c6.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650a0 implements InterfaceC0720y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8734a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8735b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8736c;

    public C0650a0(a6.o0 o0Var, EnumC0714w enumC0714w) {
        G.i.f("error must not be OK", !o0Var.e());
        this.f8735b = o0Var;
        this.f8736c = enumC0714w;
    }

    @Override // c6.InterfaceC0720y
    public final InterfaceC0711v b(Q0.A a7, a6.e0 e0Var, C0476e c0476e, AbstractC0482k[] abstractC0482kArr) {
        Object obj = this.f8736c;
        Object obj2 = this.f8735b;
        switch (this.f8734a) {
            case 0:
                return new Z((a6.o0) obj2, (EnumC0714w) obj, abstractC0482kArr);
            default:
                C0476e c0476e2 = C0476e.f7131i;
                G.i.j(c0476e, "callOptions cannot be null");
                boolean z7 = false;
                AbstractC0482k a8 = ((C1130q) obj2).a(new C0481j(c0476e, 0, false), e0Var);
                if (abstractC0482kArr[abstractC0482kArr.length - 1] == AbstractC0671h0.f8841o) {
                    z7 = true;
                }
                G.i.o("lb tracer already assigned", z7);
                abstractC0482kArr[abstractC0482kArr.length - 1] = a8;
                return ((InterfaceC0672h1) obj).b(a7, e0Var, c0476e, abstractC0482kArr);
        }
    }

    @Override // a6.G
    public final a6.H c() {
        switch (this.f8734a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((InterfaceC0672h1) this.f8736c).c();
        }
    }

    public C0650a0(C1130q c1130q, InterfaceC0672h1 interfaceC0672h1) {
        this.f8735b = c1130q;
        this.f8736c = interfaceC0672h1;
    }
}
