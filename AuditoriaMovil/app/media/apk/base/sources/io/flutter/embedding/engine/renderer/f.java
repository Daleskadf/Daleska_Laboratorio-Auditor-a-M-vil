package io.flutter.embedding.engine.renderer;

import io.flutter.view.s;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f11582b;

    public /* synthetic */ f(s sVar, int i7) {
        this.f11581a = i7;
        this.f11582b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11581a) {
            case 0:
                FlutterRenderer$ImageReaderSurfaceProducer.a((FlutterRenderer$ImageReaderSurfaceProducer) this.f11582b);
                return;
            default:
                ((k) this.f11582b).getClass();
                return;
        }
    }
}
