package com.fasterxml.jackson.databind.deser.std;
/* loaded from: classes.dex */
public class r extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final r f6590b = new r();

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f6591b = new a();

        public a() {
            super(z3.a.class, Boolean.TRUE);
        }

        public static a m() {
            return f6591b;
        }

        @Override // k3.k
        /* renamed from: k */
        public z3.a deserialize(c3.k kVar, k3.g gVar) {
            if (kVar.n0()) {
                return f(kVar, gVar, gVar.R());
            }
            return (z3.a) gVar.a0(z3.a.class, kVar);
        }

        @Override // k3.k
        /* renamed from: l */
        public z3.a deserialize(c3.k kVar, k3.g gVar, z3.a aVar) {
            if (kVar.n0()) {
                return (z3.a) i(kVar, gVar, aVar);
            }
            return (z3.a) gVar.a0(z3.a.class, kVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final b f6592b = new b();

        public b() {
            super(z3.r.class, Boolean.TRUE);
        }

        public static b m() {
            return f6592b;
        }

        @Override // k3.k
        /* renamed from: k */
        public z3.r deserialize(c3.k kVar, k3.g gVar) {
            if (kVar.o0()) {
                return g(kVar, gVar, gVar.R());
            }
            if (kVar.j0(c3.n.FIELD_NAME)) {
                return h(kVar, gVar, gVar.R());
            }
            if (kVar.j0(c3.n.END_OBJECT)) {
                return gVar.R().k();
            }
            return (z3.r) gVar.a0(z3.r.class, kVar);
        }

        @Override // k3.k
        /* renamed from: l */
        public z3.r deserialize(c3.k kVar, k3.g gVar, z3.r rVar) {
            if (!kVar.o0() && !kVar.j0(c3.n.FIELD_NAME)) {
                return (z3.r) gVar.a0(z3.r.class, kVar);
            }
            return (z3.r) j(kVar, gVar, rVar);
        }
    }

    public r() {
        super(k3.m.class, null);
    }

    public static k3.k l(Class cls) {
        if (cls == z3.r.class) {
            return b.m();
        }
        if (cls == z3.a.class) {
            return a.m();
        }
        return f6590b;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.f, com.fasterxml.jackson.databind.deser.std.b0, k3.k
    public /* bridge */ /* synthetic */ Object deserializeWithType(c3.k kVar, k3.g gVar, w3.e eVar) {
        return super.deserializeWithType(kVar, gVar, eVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.f, k3.k
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // k3.k
    /* renamed from: k */
    public k3.m deserialize(c3.k kVar, k3.g gVar) {
        int q10 = kVar.q();
        if (q10 != 1) {
            if (q10 != 3) {
                return e(kVar, gVar, gVar.R());
            }
            return f(kVar, gVar, gVar.R());
        }
        return g(kVar, gVar, gVar.R());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.f, k3.k
    public /* bridge */ /* synthetic */ c4.f logicalType() {
        return super.logicalType();
    }

    @Override // k3.k, n3.q
    /* renamed from: m */
    public k3.m getNullValue(k3.g gVar) {
        return gVar.R().d();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.f, k3.k
    public /* bridge */ /* synthetic */ Boolean supportsUpdate(k3.f fVar) {
        return super.supportsUpdate(fVar);
    }
}
