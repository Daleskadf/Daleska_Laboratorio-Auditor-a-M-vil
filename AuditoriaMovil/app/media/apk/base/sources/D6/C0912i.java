package d6;

import c6.C0661e;
import c6.m2;
import c6.n2;
import c6.q2;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: d6.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912i implements Closeable {

    /* renamed from: X  reason: collision with root package name */
    public final io.grpc.okhttp.internal.c f10382X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f10383Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f10384Z;

    /* renamed from: a  reason: collision with root package name */
    public final A.m f10385a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f10386b;

    /* renamed from: c  reason: collision with root package name */
    public final A.m f10387c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f10388d;

    /* renamed from: e  reason: collision with root package name */
    public final q2 f10389e;

    /* renamed from: e0  reason: collision with root package name */
    public final C0661e f10390e0;
    public final SSLSocketFactory f;

    /* renamed from: f0  reason: collision with root package name */
    public final long f10391f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f10392g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f10393h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f10394i0;

    public C0912i(A.m mVar, A.m mVar2, SSLSocketFactory sSLSocketFactory, io.grpc.okhttp.internal.c cVar, int i7, boolean z7, long j, long j8, int i8, int i9, q2 q2Var) {
        this.f10385a = mVar;
        this.f10386b = (Executor) n2.a((m2) mVar.f28b);
        this.f10387c = mVar2;
        this.f10388d = (ScheduledExecutorService) n2.a((m2) mVar2.f28b);
        this.f = sSLSocketFactory;
        this.f10382X = cVar;
        this.f10383Y = i7;
        this.f10384Z = z7;
        this.f10390e0 = new C0661e(j);
        this.f10391f0 = j8;
        this.f10392g0 = i8;
        this.f10393h0 = i9;
        G.i.j(q2Var, "transportTracerFactory");
        this.f10389e = q2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10394i0) {
            return;
        }
        this.f10394i0 = true;
        n2.b((m2) this.f10385a.f28b, this.f10386b);
        n2.b((m2) this.f10387c.f28b, this.f10388d);
    }
}
