package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0568u;
import io.flutter.view.t;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f11577a;

    public b(m mVar) {
        this.f11577a = mVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void g(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0568u interfaceC0568u) {
        t tVar;
        boolean z7;
        t tVar2;
        Iterator it = this.f11577a.f11617g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = (FlutterRenderer$ImageReaderSurfaceProducer) it.next();
            tVar = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (tVar != null) {
                z7 = flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy;
                if (z7) {
                    flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                    tVar2 = flutterRenderer$ImageReaderSurfaceProducer.callback;
                    tVar2.b();
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC0568u interfaceC0568u) {
    }
}
