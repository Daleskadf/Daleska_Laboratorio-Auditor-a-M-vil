package a1;

import A3.e0;
import D.RunnableC0053c;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: X  reason: collision with root package name */
    public static final Charset f6919X = z3.h.f16886c;

    /* renamed from: a  reason: collision with root package name */
    public final M0.x f6920a;

    /* renamed from: b  reason: collision with root package name */
    public final i1.n f6921b = new i1.n("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c  reason: collision with root package name */
    public final Map f6922c = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: d  reason: collision with root package name */
    public x f6923d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f6924e;
    public volatile boolean f;

    public y(M0.x xVar) {
        this.f6920a = xVar;
    }

    public final void a(Socket socket) {
        this.f6924e = socket;
        this.f6923d = new x(this, socket.getOutputStream());
        this.f6921b.f(new w(this, socket.getInputStream()), new A.c(this, 21), 0);
    }

    public final void b(e0 e0Var) {
        K0.a.k(this.f6923d);
        x xVar = this.f6923d;
        xVar.getClass();
        xVar.f6917c.post(new RunnableC0053c(xVar, new K6.w(z.f6931h, 1).b(e0Var).getBytes(f6919X), e0Var));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        try {
            x xVar = this.f6923d;
            if (xVar != null) {
                xVar.close();
            }
            this.f6921b.e(null);
            Socket socket = this.f6924e;
            if (socket != null) {
                socket.close();
            }
            this.f = true;
        } catch (Throwable th) {
            this.f = true;
            throw th;
        }
    }
}
