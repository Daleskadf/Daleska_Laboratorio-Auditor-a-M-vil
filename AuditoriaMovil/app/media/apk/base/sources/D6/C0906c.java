package d6;

import c6.h2;
import j6.AbstractC1371b;
import java.io.IOException;
import java.net.Socket;
/* renamed from: d6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906c implements Q6.w {

    /* renamed from: Z  reason: collision with root package name */
    public Q6.c f10361Z;

    /* renamed from: c  reason: collision with root package name */
    public final h2 f10364c;

    /* renamed from: d  reason: collision with root package name */
    public final p f10365d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10366e;

    /* renamed from: e0  reason: collision with root package name */
    public Socket f10367e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f10368f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f10369g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f10370h0;

    /* renamed from: a  reason: collision with root package name */
    public final Object f10362a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Q6.e f10363b = new Object();
    public boolean f = false;

    /* renamed from: X  reason: collision with root package name */
    public boolean f10359X = false;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f10360Y = false;

    /* JADX WARN: Type inference failed for: r0v1, types: [Q6.e, java.lang.Object] */
    public C0906c(h2 h2Var, p pVar) {
        G.i.j(h2Var, "executor");
        this.f10364c = h2Var;
        this.f10365d = pVar;
        this.f10366e = 10000;
    }

    public final void a(Q6.c cVar, Socket socket) {
        boolean z7;
        if (this.f10361Z == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("AsyncSink's becomeConnected should only be called once.", z7);
        this.f10361Z = cVar;
        this.f10367e0 = socket;
    }

    @Override // Q6.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10360Y) {
            return;
        }
        this.f10360Y = true;
        this.f10364c.execute(new G.c(this, 24));
    }

    @Override // Q6.w, java.io.Flushable
    public final void flush() {
        if (!this.f10360Y) {
            AbstractC1371b.c();
            try {
                synchronized (this.f10362a) {
                    if (this.f10359X) {
                        AbstractC1371b.f13458a.getClass();
                        return;
                    }
                    this.f10359X = true;
                    this.f10364c.execute(new C0904a(this, 1));
                    AbstractC1371b.f13458a.getClass();
                    return;
                }
            } catch (Throwable th) {
                try {
                    AbstractC1371b.f13458a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new IOException("closed");
    }

    @Override // Q6.w
    public final void l(Q6.e eVar, long j) {
        if (!this.f10360Y) {
            AbstractC1371b.c();
            try {
                synchronized (this.f10362a) {
                    this.f10363b.l(eVar, j);
                    int i7 = this.f10370h0 + this.f10369g0;
                    this.f10370h0 = i7;
                    boolean z7 = false;
                    this.f10369g0 = 0;
                    if (!this.f10368f0 && i7 > this.f10366e) {
                        this.f10368f0 = true;
                        z7 = true;
                    } else {
                        if (!this.f && !this.f10359X && this.f10363b.a() > 0) {
                            this.f = true;
                        }
                        AbstractC1371b.f13458a.getClass();
                        return;
                    }
                    if (z7) {
                        try {
                            this.f10367e0.close();
                        } catch (IOException e7) {
                            this.f10365d.q(e7);
                        }
                        AbstractC1371b.f13458a.getClass();
                        return;
                    }
                    this.f10364c.execute(new C0904a(this, 0));
                    AbstractC1371b.f13458a.getClass();
                    return;
                }
            } catch (Throwable th) {
                try {
                    AbstractC1371b.f13458a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new IOException("closed");
    }
}
