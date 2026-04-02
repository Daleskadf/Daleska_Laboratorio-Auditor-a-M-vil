package ca;

import h9.l;
import java.util.List;
import java.util.ServiceLoader;
/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List f5735a = aa.g.f(aa.e.a(ServiceLoader.load(z.class, z.class.getClassLoader()).iterator()));

    public static final void a(k9.f fVar, Throwable th) {
        for (z zVar : f5735a) {
            try {
                zVar.y(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, b0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            l.a aVar = h9.l.f14231a;
            h9.a.a(th, new k0(fVar));
            h9.l.a(h9.t.f14242a);
        } catch (Throwable th3) {
            l.a aVar2 = h9.l.f14231a;
            h9.l.a(h9.m.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
