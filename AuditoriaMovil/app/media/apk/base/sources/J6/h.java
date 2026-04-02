package J6;

import F6.C0111y;
import F6.H;
import K6.AbstractC0208a;
import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: d  reason: collision with root package name */
    public final I6.d f2441d;

    public h(I6.d dVar, n6.i iVar, int i7, H6.a aVar) {
        super(iVar, i7, aVar);
        this.f2441d = dVar;
    }

    @Override // J6.f
    public final Object a(H6.p pVar, n6.d dVar) {
        Object c02 = this.f2441d.c0(new r(pVar), dVar);
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        l6.j jVar = l6.j.f13876a;
        if (c02 != enumC1565a) {
            c02 = jVar;
        }
        if (c02 == enumC1565a) {
            return c02;
        }
        return jVar;
    }

    @Override // J6.f
    public final f b(n6.i iVar, int i7, H6.a aVar) {
        return new h(this.f2441d, iVar, i7, aVar);
    }

    @Override // J6.f, I6.d
    public final Object c0(I6.e eVar, n6.d dVar) {
        Object c02;
        n6.i h8;
        l6.j jVar = l6.j.f13876a;
        if (this.f2436b == -3) {
            n6.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0111y c0111y = C0111y.f1322c;
            n6.i iVar = this.f2435a;
            if (!((Boolean) iVar.fold(bool, c0111y)).booleanValue()) {
                h8 = context.plus(iVar);
            } else {
                h8 = H.h(context, iVar, false);
            }
            if (kotlin.jvm.internal.j.a(h8, context)) {
                c02 = this.f2441d.c0(eVar, dVar);
                EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
                if (c02 != enumC1565a) {
                    c02 = jVar;
                }
                if (c02 != enumC1565a) {
                    return jVar;
                }
            } else {
                n6.e eVar2 = n6.e.f14393a;
                if (kotlin.jvm.internal.j.a(h8.get(eVar2), context.get(eVar2))) {
                    n6.i context2 = dVar.getContext();
                    if (!(eVar instanceof r)) {
                        eVar = new I6.l(eVar, context2);
                    }
                    c02 = l.b(h8, eVar, AbstractC0208a.l(h8), new g(this, null), dVar);
                    EnumC1565a enumC1565a2 = EnumC1565a.COROUTINE_SUSPENDED;
                    if (c02 != enumC1565a2) {
                        c02 = jVar;
                    }
                    if (c02 != enumC1565a2) {
                        return jVar;
                    }
                }
            }
            return c02;
        }
        c02 = super.c0(eVar, dVar);
        if (c02 != EnumC1565a.COROUTINE_SUSPENDED) {
            return jVar;
        }
        return c02;
    }

    @Override // J6.f
    public final String toString() {
        return this.f2441d + " -> " + super.toString();
    }
}
