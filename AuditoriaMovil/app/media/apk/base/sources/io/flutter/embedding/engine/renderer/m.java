package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.H;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f11612a;

    /* renamed from: c  reason: collision with root package name */
    public Surface f11614c;

    /* renamed from: h  reason: collision with root package name */
    public final a f11618h;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f11613b = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f11615d = false;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f11616e = new Handler();
    public final HashSet f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f11617g = new ArrayList();

    public m(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f11618h = aVar;
        this.f11612a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        H.f7888Z.f.a(new b(this));
    }

    public final void a(s sVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((s) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(sVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f11613b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f11612a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c() {
        if (Build.VERSION.SDK_INT >= 29) {
            long andIncrement = this.f11613b.getAndIncrement();
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
            this.f11612a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer);
            a(flutterRenderer$ImageReaderSurfaceProducer);
            this.f11617g.add(flutterRenderer$ImageReaderSurfaceProducer);
            return flutterRenderer$ImageReaderSurfaceProducer;
        }
        k d7 = d();
        return new p(d7.f11591a, this.f11616e, this.f11612a, d7);
    }

    public final k d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f11613b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        k kVar = new k(this, andIncrement, surfaceTexture);
        this.f11612a.registerTexture(kVar.f11591a, kVar.f11592b);
        a(kVar);
        return kVar;
    }

    public final void e(int i7) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            s sVar = (s) ((WeakReference) it.next()).get();
            if (sVar != null) {
                sVar.onTrimMemory(i7);
            } else {
                it.remove();
            }
        }
    }

    public final void f(s sVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == sVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f11614c != null) {
            this.f11612a.onSurfaceDestroyed();
            if (this.f11615d) {
                this.f11618h.a();
            }
            this.f11615d = false;
            this.f11614c = null;
        }
    }
}
