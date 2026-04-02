package N;

import A.h;
import D.D;
import D.RunnableC0053c;
import D.e0;
import D.r0;
import D.v0;
import M.n;
import O.i;
import a.AbstractC0412a;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: X  reason: collision with root package name */
    public final AtomicBoolean f3322X;

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedHashMap f3323Y;

    /* renamed from: Z  reason: collision with root package name */
    public SurfaceTexture f3324Z;

    /* renamed from: a  reason: collision with root package name */
    public final c f3325a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f3326b;

    /* renamed from: c  reason: collision with root package name */
    public final G.e f3327c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f3328d;

    /* renamed from: e  reason: collision with root package name */
    public int f3329e;

    /* renamed from: e0  reason: collision with root package name */
    public SurfaceTexture f3330e0;
    public boolean f;

    public e(D d7, e0 e0Var, e0 e0Var2) {
        Map emptyMap = Collections.emptyMap();
        this.f3329e = 0;
        this.f = false;
        this.f3322X = new AtomicBoolean(false);
        this.f3323Y = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f3326b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3328d = handler;
        this.f3327c = new G.e(handler);
        this.f3325a = new c(e0Var, e0Var2);
        try {
            try {
                AbstractC0412a.s(new M.b(this, d7, emptyMap, 1)).get();
            } catch (InterruptedException | ExecutionException e7) {
                e = e7;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
        } catch (RuntimeException e8) {
            d();
            throw e8;
        }
    }

    public final void a() {
        if (this.f && this.f3329e == 0) {
            LinkedHashMap linkedHashMap = this.f3323Y;
            for (n nVar : linkedHashMap.keySet()) {
                nVar.close();
            }
            linkedHashMap.clear();
            c cVar = this.f3325a;
            if (cVar.f3076a.getAndSet(false)) {
                i.c(cVar.f3078c);
                cVar.h();
            }
            cVar.f3315n = -1;
            cVar.f3316o = -1;
            this.f3326b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f3327c.execute(new h(this, runnable2, runnable, 4));
        } catch (RejectedExecutionException e7) {
            org.slf4j.helpers.i.P("DualSurfaceProcessor", "Unable to executor runnable", e7);
            runnable2.run();
        }
    }

    public final void c(v0 v0Var) {
        if (this.f3322X.get()) {
            v0Var.b();
        } else {
            b(new RunnableC0053c(8, this, v0Var), new r0(v0Var, 1));
        }
    }

    public final void d() {
        if (this.f3322X.getAndSet(true)) {
            return;
        }
        b(new C.b(this, 13), new org.apache.tika.parser.a(2));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.f3322X.get() && (surfaceTexture2 = this.f3324Z) != null && this.f3330e0 != null) {
            surfaceTexture2.updateTexImage();
            this.f3330e0.updateTexImage();
            for (Map.Entry entry : this.f3323Y.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                n nVar = (n) entry.getKey();
                if (nVar.f3121c == 34) {
                    try {
                        this.f3325a.l(surfaceTexture.getTimestamp(), surface, nVar, this.f3324Z, this.f3330e0);
                    } catch (RuntimeException e7) {
                        org.slf4j.helpers.i.u("DualSurfaceProcessor", "Failed to render with OpenGL.", e7);
                    }
                }
            }
        }
    }
}
