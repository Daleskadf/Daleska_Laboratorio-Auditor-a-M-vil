package t4;

import A3.N;
import a6.AbstractC0479h;
import a6.n0;
import a6.o0;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.J;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import k0.RunnableC1375b;
import p.Y0;
import p4.P;
/* renamed from: t4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1823c {

    /* renamed from: n  reason: collision with root package name */
    public static final long f15783n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f15784o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f15785p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f15786q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f15787r;

    /* renamed from: a  reason: collision with root package name */
    public P f15788a;

    /* renamed from: b  reason: collision with root package name */
    public P f15789b;

    /* renamed from: c  reason: collision with root package name */
    public final p f15790c;

    /* renamed from: d  reason: collision with root package name */
    public final Q0.A f15791d;
    public final u4.e f;

    /* renamed from: g  reason: collision with root package name */
    public final u4.d f15793g;

    /* renamed from: h  reason: collision with root package name */
    public final u4.d f15794h;

    /* renamed from: k  reason: collision with root package name */
    public n f15796k;

    /* renamed from: l  reason: collision with root package name */
    public final u4.l f15797l;

    /* renamed from: m  reason: collision with root package name */
    public final v f15798m;

    /* renamed from: i  reason: collision with root package name */
    public u f15795i = u.Initial;
    public long j = 0;

    /* renamed from: e  reason: collision with root package name */
    public final RunnableC1375b f15792e = new RunnableC1375b(this, 3);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f15783n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f15784o = timeUnit2.toMillis(1L);
        f15785p = timeUnit2.toMillis(1L);
        f15786q = timeUnit.toMillis(10L);
        f15787r = timeUnit.toMillis(10L);
    }

    public AbstractC1823c(p pVar, Q0.A a7, u4.e eVar, u4.d dVar, u4.d dVar2, u4.d dVar3, v vVar) {
        this.f15790c = pVar;
        this.f15791d = a7;
        this.f = eVar;
        this.f15793g = dVar2;
        this.f15794h = dVar3;
        this.f15798m = vVar;
        this.f15797l = new u4.l(eVar, dVar, f15783n, f15784o);
    }

    public final void a(u uVar, o0 o0Var) {
        boolean z7;
        m5.d.i("Only started streams should be closed.", d(), new Object[0]);
        u uVar2 = u.Error;
        if (uVar != uVar2 && !o0Var.e()) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("Can't provide an error when not in an error state.", z7, new Object[0]);
        this.f.d();
        HashSet hashSet = i.f15803d;
        n0 n0Var = o0Var.f7183a;
        Throwable th = o0Var.f7185c;
        if (th instanceof SSLHandshakeException) {
            th.getMessage().contains("no ciphers available");
        }
        P p7 = this.f15789b;
        if (p7 != null) {
            p7.b();
            this.f15789b = null;
        }
        P p8 = this.f15788a;
        if (p8 != null) {
            p8.b();
            this.f15788a = null;
        }
        u4.l lVar = this.f15797l;
        P p9 = lVar.f16013h;
        if (p9 != null) {
            p9.b();
            lVar.f16013h = null;
        }
        this.j++;
        n0 n0Var2 = n0.OK;
        n0 n0Var3 = o0Var.f7183a;
        if (n0Var3 == n0Var2) {
            lVar.f = 0L;
        } else if (n0Var3 == n0.RESOURCE_EXHAUSTED) {
            u4.q.a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            lVar.f = lVar.f16011e;
        } else if (n0Var3 == n0.UNAUTHENTICATED && this.f15795i != u.Healthy) {
            p pVar = this.f15790c;
            pVar.f15829b.C();
            pVar.f15830c.B();
        } else if (n0Var3 == n0.UNAVAILABLE && ((th instanceof UnknownHostException) || (th instanceof ConnectException))) {
            lVar.f16011e = f15787r;
        }
        if (uVar != uVar2) {
            u4.q.a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            h();
        }
        if (this.f15796k != null) {
            if (o0Var.e()) {
                u4.q.a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f15796k.b();
            }
            this.f15796k = null;
        }
        this.f15795i = uVar;
        this.f15798m.b(o0Var);
    }

    public final void b() {
        m5.d.i("Can only inhibit backoff after in a stopped state", !d(), new Object[0]);
        this.f.d();
        this.f15795i = u.Initial;
        this.f15797l.f = 0L;
    }

    public final boolean c() {
        this.f.d();
        u uVar = this.f15795i;
        if (uVar != u.Open && uVar != u.Healthy) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        this.f.d();
        u uVar = this.f15795i;
        if (uVar != u.Starting && uVar != u.Backoff && !c()) {
            return false;
        }
        return true;
    }

    public abstract void e(AbstractC0828a abstractC0828a);

    public abstract void f(AbstractC0828a abstractC0828a);

    public void g() {
        boolean z7;
        boolean z8;
        boolean z9;
        this.f.d();
        boolean z10 = true;
        if (this.f15796k == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Last call still set", z7, new Object[0]);
        if (this.f15789b == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        m5.d.i("Idle timer still set", z8, new Object[0]);
        u uVar = this.f15795i;
        u uVar2 = u.Error;
        if (uVar == uVar2) {
            if (uVar != uVar2) {
                z10 = false;
            }
            m5.d.i("Should only perform backoff in an error state", z10, new Object[0]);
            this.f15795i = u.Backoff;
            this.f15797l.a(new RunnableC1821a(this, 0));
            return;
        }
        if (uVar == u.Initial) {
            z9 = true;
        } else {
            z9 = false;
        }
        m5.d.i("Already started", z9, new Object[0]);
        N n7 = new N(this, new J2.e(this, this.j, 7));
        AbstractC0479h[] abstractC0479hArr = {null};
        p pVar = this.f15790c;
        Y0 y02 = pVar.f15831d;
        Task continueWithTask = ((Task) y02.f14760b).continueWithTask(((u4.e) y02.f14761c).f15988a, new A4.d(25, y02, this.f15791d));
        continueWithTask.addOnCompleteListener(pVar.f15828a.f15988a, new com.google.firebase.storage.r(pVar, abstractC0479hArr, n7, 3));
        this.f15796k = new n(pVar, abstractC0479hArr, continueWithTask);
        this.f15795i = u.Starting;
    }

    public final void i(J j) {
        this.f.d();
        u4.q.a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), j);
        P p7 = this.f15789b;
        if (p7 != null) {
            p7.b();
            this.f15789b = null;
        }
        this.f15796k.d(j);
    }

    public void h() {
    }
}
