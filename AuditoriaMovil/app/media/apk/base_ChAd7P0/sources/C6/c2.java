package c6;

import a6.AbstractC0478g;
import a6.C0472a;
import a6.C0473b;
import c1.RunnableC0626c;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c2 extends AbstractC0478g {

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0478g f8802d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d2 f8803e;

    public c2(d2 d2Var, AbstractC0478g abstractC0478g) {
        this.f8803e = d2Var;
        this.f8802d = abstractC0478g;
    }

    @Override // a6.AbstractC0478g
    public final void o(a6.o0 o0Var) {
        this.f8802d.o(o0Var);
        this.f8803e.f8813c.execute(new RunnableC0626c(this, 4));
    }

    @Override // a6.AbstractC0478g
    public final void p(a6.i0 i0Var) {
        C0472a c0472a = d2.f8810d;
        C0473b c0473b = i0Var.f7156b;
        if (c0473b.f7116a.get(c0472a) == null) {
            Collections.emptyList();
            C0473b c0473b2 = C0473b.f7115b;
            c0473b.getClass();
            b2 b2Var = new b2(this.f8803e);
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(c0472a, b2Var);
            for (Map.Entry entry : c0473b.f7116a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put((C0472a) entry.getKey(), entry.getValue());
                }
            }
            this.f8802d.p(new a6.i0(i0Var.f7155a, new C0473b(identityHashMap), i0Var.f7157c));
            return;
        }
        throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
    }
}
