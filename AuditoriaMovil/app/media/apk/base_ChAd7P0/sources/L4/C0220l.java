package L4;

import j$.util.concurrent.ConcurrentHashMap;
/* renamed from: L4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220l implements I4.H {

    /* renamed from: c  reason: collision with root package name */
    public static final C0219k f2961c = new C0219k(0);

    /* renamed from: d  reason: collision with root package name */
    public static final C0219k f2962d = new C0219k(0);

    /* renamed from: a  reason: collision with root package name */
    public final A.f f2963a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2964b = new ConcurrentHashMap();

    public C0220l(A.f fVar) {
        this.f2963a = fVar;
    }

    public final I4.G a(A.f fVar, I4.n nVar, P4.a aVar, J4.a aVar2, boolean z7) {
        I4.p pVar;
        C0219k c0219k;
        I4.G h8;
        Object c8 = fVar.j(new P4.a(aVar2.value())).c();
        boolean nullSafe = aVar2.nullSafe();
        if (c8 instanceof I4.G) {
            h8 = (I4.G) c8;
        } else if (c8 instanceof I4.H) {
            I4.H h9 = (I4.H) c8;
            if (z7) {
                I4.H h10 = (I4.H) this.f2964b.putIfAbsent(aVar.f4022a, h9);
                if (h10 != null) {
                    h9 = h10;
                }
            }
            h8 = h9.create(nVar, aVar);
        } else if (c8 instanceof I4.p) {
            if (c8 instanceof I4.p) {
                pVar = (I4.p) c8;
            } else {
                pVar = null;
            }
            I4.p pVar2 = pVar;
            if (z7) {
                c0219k = f2961c;
            } else {
                c0219k = f2962d;
            }
            h8 = new H(pVar2, nVar, aVar, c0219k, nullSafe);
            nullSafe = false;
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + c8.getClass().getName() + " as a @JsonAdapter for " + K4.d.l(aVar.f4023b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (h8 != null && nullSafe) {
            return h8.a();
        }
        return h8;
    }

    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        J4.a aVar2 = (J4.a) aVar.f4022a.getAnnotation(J4.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f2963a, nVar, aVar, aVar2, true);
    }
}
