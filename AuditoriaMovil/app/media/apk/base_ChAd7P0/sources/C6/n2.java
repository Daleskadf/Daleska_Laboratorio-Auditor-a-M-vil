package c6;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: d  reason: collision with root package name */
    public static final n2 f8931d = new n2(new q2(15));

    /* renamed from: a  reason: collision with root package name */
    public final IdentityHashMap f8932a = new IdentityHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final q2 f8933b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledExecutorService f8934c;

    public n2(q2 q2Var) {
        this.f8933b = q2Var;
    }

    public static Object a(m2 m2Var) {
        Object obj;
        n2 n2Var = f8931d;
        synchronized (n2Var) {
            try {
                l2 l2Var = (l2) n2Var.f8932a.get(m2Var);
                if (l2Var == null) {
                    l2Var = new l2(m2Var.l());
                    n2Var.f8932a.put(m2Var, l2Var);
                }
                ScheduledFuture scheduledFuture = l2Var.f8906c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    l2Var.f8906c = null;
                }
                l2Var.f8905b++;
                obj = l2Var.f8904a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(m2 m2Var, Object obj) {
        boolean z7;
        boolean z8;
        n2 n2Var = f8931d;
        synchronized (n2Var) {
            try {
                l2 l2Var = (l2) n2Var.f8932a.get(m2Var);
                if (l2Var != null) {
                    boolean z9 = false;
                    if (obj == l2Var.f8904a) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    G.i.f("Releasing the wrong instance", z7);
                    if (l2Var.f8905b > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    G.i.o("Refcount has already reached zero", z8);
                    int i7 = l2Var.f8905b - 1;
                    l2Var.f8905b = i7;
                    if (i7 == 0) {
                        if (l2Var.f8906c == null) {
                            z9 = true;
                        }
                        G.i.o("Destroy task already scheduled", z9);
                        if (n2Var.f8934c == null) {
                            n2Var.f8933b.getClass();
                            n2Var.f8934c = Executors.newSingleThreadScheduledExecutor(AbstractC0671h0.e("grpc-shared-destroyer-%d"));
                        }
                        l2Var.f8906c = n2Var.f8934c.schedule(new H0(new RunnableC0649a(n2Var, l2Var, m2Var, obj, 3)), 1L, TimeUnit.SECONDS);
                    }
                } else {
                    throw new IllegalArgumentException("No cached instance found for " + m2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
