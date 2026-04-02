package j$.util.stream;

import j$.util.Optional;
/* loaded from: classes2.dex */
final class J extends K {

    /* renamed from: c  reason: collision with root package name */
    static final F f13073c;

    /* renamed from: d  reason: collision with root package name */
    static final F f13074d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f13080a) {
            return Optional.b(this.f13081b);
        }
        return null;
    }

    static {
        EnumC1244d3 enumC1244d3 = EnumC1244d3.REFERENCE;
        f13073c = new F(true, enumC1244d3, Optional.a(), new r(4), new C1300p(7));
        f13074d = new F(false, enumC1244d3, Optional.a(), new r(4), new C1300p(7));
    }
}
