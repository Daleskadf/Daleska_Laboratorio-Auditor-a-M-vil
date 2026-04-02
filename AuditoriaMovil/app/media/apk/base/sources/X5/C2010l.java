package x5;

import B5.AbstractActivityC0032e;
import D.A;
import D.C;
import D.j0;
import X5.C0389o;
import X5.E;
import a.AbstractC0412a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.hardware.display.DisplayManager;
import android.os.Trace;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.h0;
import g5.InterfaceC1009a;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.List;
import k5.C1401d;
/* renamed from: x5.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010l {

    /* renamed from: v  reason: collision with root package name */
    public static final C2006h f16530v = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0032e f16531a;

    /* renamed from: b  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f16532b;

    /* renamed from: c  reason: collision with root package name */
    public final C2012n f16533c;

    /* renamed from: d  reason: collision with root package name */
    public final C2011m f16534d;

    /* renamed from: e  reason: collision with root package name */
    public final C2003e f16535e;
    public final w6.l f;

    /* renamed from: g  reason: collision with root package name */
    public R.e f16536g;

    /* renamed from: h  reason: collision with root package name */
    public R.b f16537h;

    /* renamed from: i  reason: collision with root package name */
    public j0 f16538i;
    public TextureRegistry$SurfaceProducer j;

    /* renamed from: k  reason: collision with root package name */
    public InterfaceC1009a f16539k;

    /* renamed from: l  reason: collision with root package name */
    public List f16540l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16541m;

    /* renamed from: n  reason: collision with root package name */
    public C0389o f16542n;

    /* renamed from: o  reason: collision with root package name */
    public List f16543o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16544p;

    /* renamed from: q  reason: collision with root package name */
    public y5.c f16545q;

    /* renamed from: r  reason: collision with root package name */
    public long f16546r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16547s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16548t;

    /* renamed from: u  reason: collision with root package name */
    public final E f16549u;

    public C2010l(AbstractActivityC0032e activity, io.flutter.embedding.engine.renderer.m textureRegistry, C2012n c2012n, C2011m c2011m, C2003e c2003e) {
        C2005g c2005g = new C2005g(1, f16530v, C2006h.class, "defaultBarcodeScannerFactory", "defaultBarcodeScannerFactory(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/mlkit/vision/barcode/BarcodeScanner;", 0, 0);
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(textureRegistry, "textureRegistry");
        this.f16531a = activity;
        this.f16532b = textureRegistry;
        this.f16533c = c2012n;
        this.f16534d = c2011m;
        this.f16535e = c2003e;
        this.f = c2005g;
        try {
            W c8 = W.c(AbstractC0412a.o());
            new A(c8, 0);
            c8.j(C.f596X, 6);
            R.e eVar = R.e.f4513h;
            C c9 = new C(Z.a(c8));
            Trace.beginSection(F.f.D("CX:configureInstance"));
            R.e.a(R.e.f4513h, c9);
            Trace.endSection();
        } catch (IllegalStateException unused) {
        }
        this.f16545q = y5.c.NO_DUPLICATES;
        this.f16546r = 250L;
        this.f16549u = new E(this, 27);
    }

    public static Bitmap a(Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        kotlin.jvm.internal.j.b(config);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        kotlin.jvm.internal.j.d(createBitmap, "createBitmap(bitmap.widt….height, bitmap.config!!)");
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public final void b(double d7) {
        if (d7 <= 1.0d && d7 >= 0.0d) {
            R.b bVar = this.f16537h;
            if (bVar != null) {
                g0 g0Var = bVar.f4508c.f2103k0;
                if (g0Var != null) {
                    g0Var.i((float) d7);
                    return;
                }
                return;
            }
            throw new Exception();
        }
        throw new Exception();
    }

    public final void c(boolean z7) {
        h0 h0Var;
        if (!z7 && !this.f16548t && this.f16537h == null && this.f16538i == null) {
            throw new Exception();
        }
        C2003e c2003e = this.f16535e;
        if (c2003e.f16510d) {
            c2003e.f16507a.unregisterReceiver(c2003e);
            c2003e.f16510d = false;
        }
        C0389o c0389o = this.f16542n;
        AbstractActivityC0032e abstractActivityC0032e = this.f16531a;
        if (c0389o != null) {
            Object systemService = abstractActivityC0032e.getApplicationContext().getSystemService("display");
            kotlin.jvm.internal.j.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            ((DisplayManager) systemService).unregisterDisplayListener(this.f16542n);
            this.f16542n = null;
        }
        kotlin.jvm.internal.j.c(abstractActivityC0032e, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        R.b bVar = this.f16537h;
        if (bVar != null && (h0Var = bVar.f4508c.f2104l0) != null) {
            InterfaceC0519v interfaceC0519v = h0Var.f7630b;
            interfaceC0519v.d().k(abstractActivityC0032e);
            interfaceC0519v.j().k(abstractActivityC0032e);
            h0Var.f7558a.k().k(abstractActivityC0032e);
        }
        R.e eVar = this.f16536g;
        if (eVar != null) {
            eVar.g();
        }
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = this.j;
        if (textureRegistry$SurfaceProducer != null) {
            textureRegistry$SurfaceProducer.release();
        }
        this.j = null;
        InterfaceC1009a interfaceC1009a = this.f16539k;
        if (interfaceC1009a != null) {
            ((C1401d) interfaceC1009a).close();
        }
        this.f16539k = null;
        this.f16540l = null;
    }
}
