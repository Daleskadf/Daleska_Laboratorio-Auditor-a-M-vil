package F6;

import K6.AbstractC0208a;
import o6.EnumC1565a;
import r3.AbstractC1740d;
/* renamed from: F6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0076a extends u0 implements n6.d, D {

    /* renamed from: c  reason: collision with root package name */
    public final n6.i f1251c;

    public AbstractC0076a(n6.i iVar, boolean z7) {
        super(z7);
        A((InterfaceC0091h0) iVar.get(C.f1216b));
        this.f1251c = iVar.plus(this);
    }

    @Override // F6.u0
    public final void H(Object obj) {
        boolean z7;
        if (obj instanceof C0108v) {
            C0108v c0108v = (C0108v) obj;
            Throwable th = c0108v.f1316a;
            if (C0108v.f1315b.get(c0108v) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            O(z7, th);
            return;
        }
        P(obj);
    }

    public final void Q(F f, AbstractC0076a abstractC0076a, w6.p pVar) {
        f.getClass();
        int i7 = E.f1217a[f.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new RuntimeException();
                    }
                    return;
                }
                try {
                    n6.i iVar = this.f1251c;
                    Object m7 = AbstractC0208a.m(iVar, null);
                    kotlin.jvm.internal.u.b(2, pVar);
                    Object invoke = pVar.invoke(abstractC0076a, this);
                    AbstractC0208a.g(iVar, m7);
                    if (invoke != EnumC1565a.COROUTINE_SUSPENDED) {
                        resumeWith(invoke);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    resumeWith(org.slf4j.helpers.i.j(th));
                    return;
                }
            }
            kotlin.jvm.internal.j.e(pVar, "<this>");
            AbstractC1740d.q(AbstractC1740d.k(abstractC0076a, this, pVar)).resumeWith(l6.j.f13876a);
            return;
        }
        android.support.v4.media.session.a.A(pVar, abstractC0076a, this);
    }

    @Override // F6.D
    public final n6.i a() {
        return this.f1251c;
    }

    @Override // n6.d
    public final n6.i getContext() {
        return this.f1251c;
    }

    @Override // F6.u0
    public final String n() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // n6.d
    public final void resumeWith(Object obj) {
        Throwable a7 = l6.f.a(obj);
        if (a7 != null) {
            obj = new C0108v(false, a7);
        }
        Object D4 = D(obj);
        if (D4 == H.f1224e) {
            return;
        }
        i(D4);
    }

    @Override // F6.u0
    public final void z(C0110x c0110x) {
        H.l(this.f1251c, c0110x);
    }

    public void P(Object obj) {
    }

    public void O(boolean z7, Throwable th) {
    }
}
