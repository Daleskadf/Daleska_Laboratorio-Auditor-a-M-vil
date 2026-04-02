package ca;

import k9.f;
import kotlin.coroutines.Continuation;
/* loaded from: classes3.dex */
public abstract class x {

    /* loaded from: classes3.dex */
    public static final class a extends t9.j implements s9.p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5811a = new a();

        public a() {
            super(2);
        }

        @Override // s9.p
        /* renamed from: b */
        public final k9.f invoke(k9.f fVar, f.b bVar) {
            return fVar.s(bVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends t9.j implements s9.p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t9.w f5812a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f5813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t9.w wVar, boolean z10) {
            super(2);
            this.f5812a = wVar;
            this.f5813b = z10;
        }

        @Override // s9.p
        /* renamed from: b */
        public final k9.f invoke(k9.f fVar, f.b bVar) {
            return fVar.s(bVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends t9.j implements s9.p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f5814a = new c();

        public c() {
            super(2);
        }

        public final Boolean b(boolean z10, f.b bVar) {
            boolean z11;
            if (!z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }

        @Override // s9.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (f.b) obj2);
        }
    }

    public static final k9.f a(k9.f fVar, k9.f fVar2, boolean z10) {
        boolean c10 = c(fVar);
        boolean c11 = c(fVar2);
        if (!c10 && !c11) {
            return fVar.s(fVar2);
        }
        t9.w wVar = new t9.w();
        wVar.f18961a = fVar2;
        k9.g gVar = k9.g.f15708a;
        k9.f fVar3 = (k9.f) fVar.m(gVar, new b(wVar, z10));
        if (c11) {
            wVar.f18961a = ((k9.f) wVar.f18961a).m(gVar, a.f5811a);
        }
        return fVar3.s((k9.f) wVar.f18961a);
    }

    public static final String b(k9.f fVar) {
        return null;
    }

    public static final boolean c(k9.f fVar) {
        return ((Boolean) fVar.m(Boolean.FALSE, c.f5814a)).booleanValue();
    }

    public static final k9.f d(c0 c0Var, k9.f fVar) {
        k9.f a10 = a(c0Var.d(), fVar, true);
        if (a10 != n0.a() && a10.a(k9.d.f15705e0) == null) {
            return a10.s(n0.a());
        }
        return a10;
    }

    public static final y1 e(m9.d dVar) {
        do {
            dVar = dVar.getCallerFrame();
        } while (dVar != null);
        return null;
    }

    public static final y1 f(Continuation continuation, k9.f fVar, Object obj) {
        boolean z10;
        if (!(continuation instanceof m9.d)) {
            return null;
        }
        if (fVar.a(z1.f5821a) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        e((m9.d) continuation);
        return null;
    }
}
