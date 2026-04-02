package d6;

import B5.S;
import a6.t0;
import e6.C0973h;
import e6.EnumC0966a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: d6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907d implements Closeable {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f10371d = Logger.getLogger(p.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final p f10372a;

    /* renamed from: b  reason: collision with root package name */
    public final C0905b f10373b;

    /* renamed from: c  reason: collision with root package name */
    public final t0 f10374c = new t0(Level.FINE);

    public C0907d(p pVar, C0905b c0905b) {
        this.f10372a = pVar;
        this.f10373b = c0905b;
    }

    public final void a(S s7) {
        q qVar = q.OUTBOUND;
        t0 t0Var = this.f10374c;
        if (t0Var.K()) {
            ((Logger) t0Var.f7209b).log((Level) t0Var.f7210c, qVar + " SETTINGS: ack=true");
        }
        try {
            this.f10373b.a(s7);
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }

    public final void b(boolean z7, int i7, Q6.e eVar, int i8) {
        byte b5;
        q qVar = q.OUTBOUND;
        eVar.getClass();
        this.f10374c.M(qVar, i7, eVar, i8, z7);
        try {
            C0973h c0973h = this.f10373b.f10357a;
            synchronized (c0973h) {
                if (!c0973h.f10953e) {
                    if (z7) {
                        b5 = (byte) 1;
                    } else {
                        b5 = 0;
                    }
                    c0973h.a(i7, i8, (byte) 0, b5);
                    if (i8 > 0) {
                        c0973h.f10949a.l(eVar, i8);
                    }
                } else {
                    throw new IOException("closed");
                }
            }
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }

    public final void c(EnumC0966a enumC0966a, byte[] bArr) {
        C0905b c0905b = this.f10373b;
        this.f10374c.N(q.OUTBOUND, 0, enumC0966a, Q6.g.k(bArr));
        try {
            c0905b.c(enumC0966a, bArr);
            c0905b.flush();
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Level level;
        try {
            this.f10373b.close();
        } catch (IOException e7) {
            if (e7.getClass().equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            f10371d.log(level, "Failed closing connection", (Throwable) e7);
        }
    }

    public final void d(int i7, int i8, boolean z7) {
        t0 t0Var = this.f10374c;
        if (z7) {
            q qVar = q.OUTBOUND;
            long j = (4294967295L & i8) | (i7 << 32);
            if (t0Var.K()) {
                ((Logger) t0Var.f7209b).log((Level) t0Var.f7210c, qVar + " PING: ack=true bytes=" + j);
            }
        } else {
            t0Var.O(q.OUTBOUND, (4294967295L & i8) | (i7 << 32));
        }
        try {
            this.f10373b.d(i7, i8, z7);
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }

    public final void flush() {
        try {
            this.f10373b.flush();
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }

    public final void g(int i7, EnumC0966a enumC0966a) {
        this.f10374c.P(q.OUTBOUND, i7, enumC0966a);
        try {
            this.f10373b.g(i7, enumC0966a);
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }

    public final void j(boolean z7, int i7, ArrayList arrayList) {
        try {
            C0973h c0973h = this.f10373b.f10357a;
            synchronized (c0973h) {
                if (!c0973h.f10953e) {
                    c0973h.b(z7, i7, arrayList);
                } else {
                    throw new IOException("closed");
                }
            }
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }

    public final void m(int i7, long j) {
        this.f10374c.R(q.OUTBOUND, i7, j);
        try {
            this.f10373b.m(i7, j);
        } catch (IOException e7) {
            this.f10372a.q(e7);
        }
    }
}
