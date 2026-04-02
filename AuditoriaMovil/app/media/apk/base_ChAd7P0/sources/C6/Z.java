package c6;

import a6.AbstractC0482k;
/* loaded from: classes.dex */
public final class Z extends C0696p1 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f8661b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.o0 f8662c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC0714w f8663d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0482k[] f8664e;

    public Z(a6.o0 o0Var, EnumC0714w enumC0714w, AbstractC0482k[] abstractC0482kArr) {
        G.i.f("error must not be OK", !o0Var.e());
        this.f8662c = o0Var;
        this.f8663d = enumC0714w;
        this.f8664e = abstractC0482kArr;
    }

    @Override // c6.C0696p1, c6.InterfaceC0711v
    public final void d(C0692o0 c0692o0) {
        c0692o0.f(this.f8662c, "error");
        c0692o0.f(this.f8663d, "progress");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a6.e0, java.lang.Object] */
    @Override // c6.C0696p1, c6.InterfaceC0711v
    public final void k(InterfaceC0717x interfaceC0717x) {
        G.i.o("already started", !this.f8661b);
        this.f8661b = true;
        AbstractC0482k[] abstractC0482kArr = this.f8664e;
        int length = abstractC0482kArr.length;
        int i7 = 0;
        while (true) {
            a6.o0 o0Var = this.f8662c;
            if (i7 < length) {
                abstractC0482kArr[i7].m(o0Var);
                i7++;
            } else {
                interfaceC0717x.O(o0Var, this.f8663d, new Object());
                return;
            }
        }
    }

    public Z(a6.o0 o0Var, AbstractC0482k[] abstractC0482kArr) {
        this(o0Var, EnumC0714w.PROCESSED, abstractC0482kArr);
    }
}
