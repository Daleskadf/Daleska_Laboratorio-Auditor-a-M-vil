package J6;

import F6.x0;
import K6.AbstractC0208a;
import K6.w;
import kotlin.jvm.internal.u;
import o6.EnumC1565a;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a */
    public static final w f2445a = new w("NULL", 0);

    public static /* synthetic */ I6.d a(j jVar, x0 x0Var, int i7, H6.a aVar, int i8) {
        n6.j jVar2 = x0Var;
        if ((i8 & 1) != 0) {
            jVar2 = n6.j.f14394a;
        }
        if ((i8 & 2) != 0) {
            i7 = -3;
        }
        if ((i8 & 4) != 0) {
            aVar = H6.a.SUSPEND;
        }
        return jVar.r(jVar2, i7, aVar);
    }

    public static final Object b(n6.i iVar, Object obj, Object obj2, w6.p pVar, n6.d frame) {
        Object m7 = AbstractC0208a.m(iVar, obj2);
        try {
            s sVar = new s(frame, iVar);
            u.b(2, pVar);
            Object invoke = pVar.invoke(obj, sVar);
            AbstractC0208a.g(iVar, m7);
            if (invoke == EnumC1565a.COROUTINE_SUSPENDED) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            AbstractC0208a.g(iVar, m7);
            throw th;
        }
    }
}
