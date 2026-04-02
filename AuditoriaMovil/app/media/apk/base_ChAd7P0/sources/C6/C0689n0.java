package c6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: c6.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689n0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f8914g = Logger.getLogger(C0689n0.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final long f8915a;

    /* renamed from: b  reason: collision with root package name */
    public final T1 f8916b;

    /* renamed from: c  reason: collision with root package name */
    public LinkedHashMap f8917c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f8918d;

    /* renamed from: e  reason: collision with root package name */
    public a6.p0 f8919e;
    public long f;

    public C0689n0(long j, T1 t1) {
        this.f8915a = j;
        this.f8916b = t1;
    }

    public final void a(E0 e02, E3.a aVar) {
        RunnableC0686m0 runnableC0686m0;
        synchronized (this) {
            try {
                if (!this.f8918d) {
                    this.f8917c.put(e02, aVar);
                    return;
                }
                a6.p0 p0Var = this.f8919e;
                if (p0Var != null) {
                    runnableC0686m0 = new RunnableC0686m0(e02, p0Var);
                } else {
                    runnableC0686m0 = new RunnableC0686m0(e02, this.f);
                }
                try {
                    aVar.execute(runnableC0686m0);
                } catch (Throwable th) {
                    f8914g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.f8918d) {
                    return;
                }
                this.f8918d = true;
                long a7 = this.f8916b.a(TimeUnit.NANOSECONDS);
                this.f = a7;
                LinkedHashMap linkedHashMap = this.f8917c;
                this.f8917c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new RunnableC0686m0((E0) entry.getKey(), a7));
                    } catch (Throwable th) {
                        f8914g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(a6.p0 p0Var) {
        synchronized (this) {
            try {
                if (this.f8918d) {
                    return;
                }
                this.f8918d = true;
                this.f8919e = p0Var;
                LinkedHashMap linkedHashMap = this.f8917c;
                this.f8917c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new RunnableC0686m0((E0) entry.getKey(), p0Var));
                    } catch (Throwable th) {
                        f8914g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
