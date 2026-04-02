package H;

import a.AbstractC0412a;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public abstract class i {
    public static Object a(E3.b bVar) {
        boolean isDone = bVar.isDone();
        g0.c.g("Future was expected to be done, " + bVar, isDone);
        return b(bVar);
    }

    public static Object b(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static k c(Object obj) {
        if (obj == null) {
            return k.f1628c;
        }
        return new k(obj, 0);
    }

    public static E3.b d(E3.b bVar) {
        bVar.getClass();
        if (bVar.isDone()) {
            return bVar;
        }
        return AbstractC0412a.s(new g(bVar, 1));
    }

    public static void e(boolean z7, E3.b bVar, U.i iVar, G.a aVar) {
        bVar.getClass();
        iVar.getClass();
        aVar.getClass();
        bVar.a(new h(0, bVar, new C5.i(iVar, 9)), aVar);
        if (z7) {
            G.c cVar = new G.c(bVar, 2);
            G.a r7 = j3.f.r();
            U.m mVar = iVar.f5531c;
            if (mVar != null) {
                mVar.a(cVar, r7);
            }
        }
    }

    public static b f(E3.b bVar, a aVar, Executor executor) {
        b bVar2 = new b(aVar, bVar);
        bVar.a(bVar2, executor);
        return bVar2;
    }
}
