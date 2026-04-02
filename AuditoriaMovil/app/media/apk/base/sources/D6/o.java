package d6;

import a6.o0;
import a6.t0;
import c6.G0;
import e6.C0972g;
import e6.EnumC0966a;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final C0972g f10434b;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p f10436d;

    /* renamed from: a  reason: collision with root package name */
    public final t0 f10433a = new t0(Level.FINE);

    /* renamed from: c  reason: collision with root package name */
    public boolean f10435c = true;

    public o(p pVar, C0972g c0972g) {
        this.f10436d = pVar;
        this.f10434b = c0972g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar;
        o0 o0Var;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f10434b.a(this)) {
            try {
                G0 g02 = this.f10436d.f10444F;
                if (g02 != null) {
                    g02.a();
                }
            } catch (Throwable th) {
                try {
                    p pVar2 = this.f10436d;
                    EnumC0966a enumC0966a = EnumC0966a.PROTOCOL_ERROR;
                    o0 f = o0.f7179m.g("error in frame handler").f(th);
                    Map map = p.f10437P;
                    pVar2.u(0, enumC0966a, f);
                    try {
                        this.f10434b.close();
                    } catch (IOException e7) {
                        p.f10438Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e7);
                    } catch (RuntimeException e8) {
                        if (!"bio == null".equals(e8.getMessage())) {
                            throw e8;
                        }
                    }
                    pVar = this.f10436d;
                } catch (Throwable th2) {
                    try {
                        this.f10434b.close();
                    } catch (IOException e9) {
                        p.f10438Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e9);
                    } catch (RuntimeException e10) {
                        if (!"bio == null".equals(e10.getMessage())) {
                            throw e10;
                        }
                    }
                    this.f10436d.f10460h.t();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (this.f10436d.f10462k) {
            o0Var = this.f10436d.f10473v;
        }
        if (o0Var == null) {
            o0Var = o0.f7180n.g("End of stream or IOException");
        }
        this.f10436d.u(0, EnumC0966a.INTERNAL_ERROR, o0Var);
        try {
            this.f10434b.close();
        } catch (IOException e11) {
            p.f10438Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
        } catch (RuntimeException e12) {
            if (!"bio == null".equals(e12.getMessage())) {
                throw e12;
            }
        }
        pVar = this.f10436d;
        pVar.f10460h.t();
        Thread.currentThread().setName(name);
    }
}
