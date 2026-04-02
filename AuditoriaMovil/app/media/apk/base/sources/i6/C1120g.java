package i6;

import a6.AbstractC0471A;
import a6.C0472a;
import a6.C0473b;
import a6.P;
import a6.Q;
import java.util.IdentityHashMap;
import java.util.Map;
/* renamed from: i6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120g extends AbstractC1115b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0471A f11518a;

    /* renamed from: b  reason: collision with root package name */
    public final P f11519b;

    public C1120g(AbstractC0471A abstractC0471A, P p7) {
        G.i.j(abstractC0471A, "delegate");
        this.f11518a = abstractC0471A;
        G.i.j(p7, "healthListener");
        this.f11519b = p7;
    }

    @Override // a6.AbstractC0471A
    public final C0473b c() {
        C0473b c8 = this.f11518a.c();
        c8.getClass();
        C0472a c0472a = Q.f7101d;
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0472a, bool);
        for (Map.Entry entry : c8.f7116a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0472a) entry.getKey(), entry.getValue());
            }
        }
        return new C0473b(identityHashMap);
    }

    @Override // a6.AbstractC0471A
    public final void o(P p7) {
        this.f11518a.o(new C1119f(this, p7, 0));
    }

    @Override // i6.AbstractC1115b
    public final AbstractC0471A q() {
        return this.f11518a;
    }
}
