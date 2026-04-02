package M;

import D.C0061k;
import D.RunnableC0053c;
import a.AbstractC0412a;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC0521x;
import g0.InterfaceC1003a;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class n implements Closeable {

    /* renamed from: X  reason: collision with root package name */
    public G.e f3116X;

    /* renamed from: b  reason: collision with root package name */
    public final Surface f3120b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3121c;

    /* renamed from: d  reason: collision with root package name */
    public final Size f3122d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f3123e;

    /* renamed from: e0  reason: collision with root package name */
    public final U.l f3124e0;
    public InterfaceC1003a f;

    /* renamed from: f0  reason: collision with root package name */
    public U.i f3125f0;

    /* renamed from: a  reason: collision with root package name */
    public final Object f3119a = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public boolean f3117Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f3118Z = false;

    public n(Surface surface, int i7, Size size, C0061k c0061k, C0061k c0061k2) {
        float[] fArr = new float[16];
        this.f3123e = fArr;
        this.f3120b = surface;
        this.f3121c = i7;
        this.f3122d = size;
        a(fArr, new float[16], c0061k);
        a(new float[16], new float[16], c0061k2);
        this.f3124e0 = AbstractC0412a.s(new A.j(this, 13));
    }

    public static void a(float[] fArr, float[] fArr2, C0061k c0061k) {
        Size size;
        Matrix.setIdentityM(fArr, 0);
        if (c0061k == null) {
            return;
        }
        f7.a.i0(fArr);
        int i7 = c0061k.f734d;
        f7.a.h0(fArr, i7);
        boolean z7 = c0061k.f735e;
        if (z7) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size e7 = F.g.e(c0061k.f731a, i7);
        float f = 0;
        android.graphics.Matrix a7 = F.g.a(new RectF(f, f, size.getWidth(), size.getHeight()), new RectF(f, f, e7.getWidth(), e7.getHeight()), i7, z7);
        RectF rectF = new RectF(c0061k.f732b);
        a7.mapRect(rectF);
        Matrix.translateM(fArr, 0, rectF.left / e7.getWidth(), ((e7.getHeight() - rectF.height()) - rectF.top) / e7.getHeight(), 0.0f);
        Matrix.scaleM(fArr, 0, rectF.width() / e7.getWidth(), rectF.height() / e7.getHeight(), 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        f7.a.i0(fArr2);
        InterfaceC0521x interfaceC0521x = c0061k.f733c;
        if (interfaceC0521x != null) {
            g0.c.g("Camera has no transform.", interfaceC0521x.k());
            f7.a.h0(fArr2, interfaceC0521x.a().a());
            if (interfaceC0521x.d()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface b(G.e eVar, InterfaceC1003a interfaceC1003a) {
        boolean z7;
        synchronized (this.f3119a) {
            this.f3116X = eVar;
            this.f = interfaceC1003a;
            z7 = this.f3117Y;
        }
        if (z7) {
            c();
        }
        return this.f3120b;
    }

    public final void c() {
        G.e eVar;
        InterfaceC1003a interfaceC1003a;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f3119a) {
            try {
                if (this.f3116X != null && (interfaceC1003a = this.f) != null) {
                    if (!this.f3118Z) {
                        atomicReference.set(interfaceC1003a);
                        eVar = this.f3116X;
                        this.f3117Y = false;
                    }
                    eVar = null;
                }
                this.f3117Y = true;
                eVar = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar != null) {
            try {
                eVar.execute(new RunnableC0053c(7, this, atomicReference));
            } catch (RejectedExecutionException e7) {
                String N7 = org.slf4j.helpers.i.N("SurfaceOutputImpl");
                if (org.slf4j.helpers.i.E(3, N7)) {
                    Log.d(N7, "Processor executor closed. Close request not posted.", e7);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f3119a) {
            try {
                if (!this.f3118Z) {
                    this.f3118Z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3125f0.a(null);
    }
}
