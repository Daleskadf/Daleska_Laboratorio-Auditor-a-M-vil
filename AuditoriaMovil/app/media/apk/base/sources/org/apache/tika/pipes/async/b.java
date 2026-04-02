package org.apache.tika.pipes.async;

import K5.d;
import W2.g;
import W2.h;
import a6.AbstractC0478g;
import a6.C0474c;
import a6.C0476e;
import a6.C0483l;
import a6.U;
import a6.V;
import a6.W;
import a6.Y;
import android.content.Context;
import b6.C0617c;
import b6.C0618d;
import h6.AbstractC1090b;
import h6.EnumC1089a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import n4.RunnableC1531q;
import p.Y0;
import t3.AbstractC1812a;
import t4.k;
import u4.c;
import u4.e;
import u4.q;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14616a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14617b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f14616a = i7;
        this.f14617b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Y y2;
        switch (this.f14616a) {
            case 0:
                return AsyncProcessor.b((AsyncProcessor) this.f14617b);
            case 1:
                Y0 y02 = (Y0) this.f14617b;
                Context context = (Context) y02.f14759a;
                d dVar = (d) y02.f;
                try {
                    AbstractC1812a.a(context);
                } catch (g | h | IllegalStateException e7) {
                    q.d("GrpcCallProvider", "Failed to update ssl context: %s", e7);
                }
                String str = (String) dVar.f2701e;
                Logger logger = Y.f7109c;
                synchronized (Y.class) {
                    try {
                        if (Y.f7110d == null) {
                            List<W> k2 = AbstractC0478g.k(W.class, Y.b(), W.class.getClassLoader(), new C0483l(7));
                            Y.f7110d = new Y();
                            for (W w2 : k2) {
                                Logger logger2 = Y.f7109c;
                                logger2.fine("Service loader found " + w2);
                                Y.f7110d.a(w2);
                            }
                            Y.f7110d.d();
                        }
                        y2 = Y.f7110d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                W c8 = y2.c();
                if (c8 != null) {
                    V a7 = c8.a(str);
                    if (!dVar.f2698b) {
                        a7.c();
                    }
                    a7.b(TimeUnit.SECONDS);
                    C0618d c0618d = new C0618d(a7);
                    c0618d.f8318b = context;
                    U a8 = c0618d.a();
                    ((e) y02.f14761c).a(new t4.q(y02, (C0617c) a8, 0));
                    C0474c b5 = C0476e.b(C0476e.f7131i.c(AbstractC1090b.f11344a, EnumC1089a.ASYNC));
                    b5.f7123c = (k) y02.f14758X;
                    C0476e c0476e = new C0476e(b5);
                    c cVar = ((e) y02.f14761c).f15988a;
                    C0474c b7 = C0476e.b(c0476e);
                    b7.f7122b = cVar;
                    y02.f14762d = new C0476e(b7);
                    q.a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
                    return a8;
                }
                throw new RuntimeException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
            case 2:
                ((Runnable) this.f14617b).run();
                return null;
            default:
                ((RunnableC1531q) this.f14617b).run();
                return null;
        }
    }
}
