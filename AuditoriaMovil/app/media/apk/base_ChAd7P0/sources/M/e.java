package M;

import D.D;
import a.AbstractC0412a;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: X  reason: collision with root package name */
    public final float[] f3064X;

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedHashMap f3065Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f3066Z;

    /* renamed from: a  reason: collision with root package name */
    public final g f3067a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f3068b;

    /* renamed from: c  reason: collision with root package name */
    public final G.e f3069c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f3070d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f3071e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f3072e0;
    public final float[] f;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f3073f0;

    public e(D d7) {
        Map emptyMap = Collections.emptyMap();
        this.f3071e = new AtomicBoolean(false);
        this.f = new float[16];
        this.f3064X = new float[16];
        this.f3065Y = new LinkedHashMap();
        this.f3066Z = 0;
        this.f3072e0 = false;
        this.f3073f0 = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f3068b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3070d = handler;
        this.f3069c = new G.e(handler);
        this.f3067a = new g();
        try {
            try {
                AbstractC0412a.s(new b(this, d7, emptyMap, 0)).get();
            } catch (InterruptedException | ExecutionException e7) {
                e = e7;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
        } catch (RuntimeException e8) {
            e();
            throw e8;
        }
    }

    public final void a() {
        if (this.f3072e0 && this.f3066Z == 0) {
            LinkedHashMap linkedHashMap = this.f3065Y;
            for (n nVar : linkedHashMap.keySet()) {
                nVar.close();
            }
            Iterator it = this.f3073f0.iterator();
            if (!it.hasNext()) {
                linkedHashMap.clear();
                g gVar = this.f3067a;
                if (gVar.f3076a.getAndSet(false)) {
                    O.i.c(gVar.f3078c);
                    gVar.h();
                }
                this.f3068b.quit();
                return;
            }
            ((a) it.next()).getClass();
            new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
            throw null;
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f3069c.execute(new A.h(this, runnable2, runnable, 2));
        } catch (RejectedExecutionException e7) {
            org.slf4j.helpers.i.P("DefaultSurfaceProcessor", "Unable to executor runnable", e7);
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.f3073f0;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            ((a) it.next()).getClass();
            throw null;
        }
    }

    public final Bitmap d(Size size, float[] fArr, int i7) {
        boolean z7;
        float[] fArr2 = (float[]) fArr.clone();
        f7.a.h0(fArr2, i7);
        f7.a.i0(fArr2);
        Size e7 = F.g.e(size, i7);
        g gVar = this.f3067a;
        gVar.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(e7.getHeight() * e7.getWidth() * 4);
        if (allocateDirect.capacity() == e7.getHeight() * e7.getWidth() * 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.a("ByteBuffer capacity is not equal to width * height * 4.", z7);
        g0.c.a("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = O.i.f3469a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        O.i.b("glGenTextures");
        int i8 = iArr2[0];
        GLES20.glActiveTexture(33985);
        O.i.b("glActiveTexture");
        GLES20.glBindTexture(3553, i8);
        O.i.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, e7.getWidth(), e7.getHeight(), 0, 6407, 5121, null);
        O.i.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        O.i.b("glGenFramebuffers");
        int i9 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i9);
        O.i.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i8, 0);
        O.i.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        O.i.b("glActiveTexture");
        GLES20.glBindTexture(36197, gVar.f3086m);
        O.i.b("glBindTexture");
        gVar.f3083i = null;
        GLES20.glViewport(0, 0, e7.getWidth(), e7.getHeight());
        GLES20.glScissor(0, 0, e7.getWidth(), e7.getHeight());
        O.g gVar2 = gVar.f3084k;
        gVar2.getClass();
        if (gVar2 instanceof O.h) {
            GLES20.glUniformMatrix4fv(((O.h) gVar2).f, 1, false, fArr2, 0);
            O.i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        O.i.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, e7.getWidth(), e7.getHeight(), 6408, 5121, allocateDirect);
        O.i.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i8}, 0);
        O.i.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i9}, 0);
        O.i.b("glDeleteFramebuffers");
        int i10 = gVar.f3086m;
        GLES20.glActiveTexture(33984);
        O.i.b("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        O.i.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(e7.getWidth(), e7.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.c(createBitmap, allocateDirect, e7.getWidth() * 4);
        return createBitmap;
    }

    public final void e() {
        if (this.f3071e.getAndSet(true)) {
            return;
        }
        b(new C.b(this, 9), new org.apache.tika.parser.a(2));
    }

    public final void f(l6.h hVar) {
        ArrayList arrayList = this.f3073f0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (hVar == null) {
            c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                byteArrayOutputStream.close();
                return;
            }
            ((a) it.next()).getClass();
            Bitmap d7 = d(hVar.f13873b, hVar.f13874c, 0);
            byteArrayOutputStream.reset();
            d7.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Surface surface = hVar.f13872a;
            Objects.requireNonNull(byteArray);
            ImageProcessingUtil.f(byteArray, surface);
            throw null;
        } catch (IOException e7) {
            c(e7);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z7;
        if (this.f3071e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        l6.h hVar = null;
        while (true) {
            l6.h hVar2 = hVar;
            for (Map.Entry entry : this.f3065Y.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                n nVar = (n) entry.getKey();
                float[] fArr2 = nVar.f3123e;
                float[] fArr3 = this.f3064X;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i7 = nVar.f3121c;
                if (i7 == 34) {
                    try {
                        this.f3067a.j(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException e7) {
                        org.slf4j.helpers.i.u("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e7);
                    }
                } else {
                    boolean z8 = true;
                    if (i7 == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    g0.c.g("Unsupported format: " + i7, z7);
                    if (hVar2 != null) {
                        z8 = false;
                    }
                    g0.c.g("Only one JPEG output is supported.", z8);
                    hVar = new l6.h(surface, nVar.f3122d, (float[]) fArr3.clone());
                }
            }
            try {
                f(hVar2);
                return;
            } catch (RuntimeException e8) {
                c(e8);
                return;
            }
        }
    }
}
