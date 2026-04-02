package c6;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: c6.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673i {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f8850e = Logger.getLogger(C0673i.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final X0 f8851a;

    /* renamed from: b  reason: collision with root package name */
    public final a6.u0 f8852b;

    /* renamed from: c  reason: collision with root package name */
    public Y f8853c;

    /* renamed from: d  reason: collision with root package name */
    public a6.t0 f8854d;

    public C0673i(q2 q2Var, X0 x02, a6.u0 u0Var) {
        this.f8851a = x02;
        this.f8852b = u0Var;
    }

    public final void a(G.c cVar) {
        this.f8852b.e();
        if (this.f8853c == null) {
            this.f8853c = q2.e();
        }
        a6.t0 t0Var = this.f8854d;
        if (t0Var != null) {
            a6.s0 s0Var = (a6.s0) t0Var.f7209b;
            if (!s0Var.f7201c && !s0Var.f7200b) {
                return;
            }
        }
        long a7 = this.f8853c.a();
        this.f8854d = this.f8852b.d(cVar, a7, TimeUnit.NANOSECONDS, this.f8851a);
        f8850e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a7));
    }
}
