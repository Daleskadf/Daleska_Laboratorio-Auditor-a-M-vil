package L4;
/* renamed from: L4.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230w extends I4.G {

    /* renamed from: b  reason: collision with root package name */
    public static final C0228u f3012b = new C0228u(new C0230w(I4.E.LAZILY_PARSED_NUMBER), 0);

    /* renamed from: a  reason: collision with root package name */
    public final I4.E f3013a;

    public C0230w(I4.E e7) {
        this.f3013a = e7;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Q4.b D4 = aVar.D();
        int i7 = AbstractC0229v.f3011a[D4.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                throw new RuntimeException("Expecting number, got: " + D4 + "; at path " + aVar.n());
            }
            return this.f3013a.a(aVar);
        }
        aVar.z();
        return null;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        cVar.w((Number) obj);
    }
}
