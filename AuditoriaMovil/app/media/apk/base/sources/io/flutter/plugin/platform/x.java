package io.flutter.plugin.platform;

import android.view.View;
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11754b;

    public /* synthetic */ x(Object obj, int i7) {
        this.f11753a = i7;
        this.f11754b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11753a) {
            case 0:
                y yVar = (y) this.f11754b;
                ((View) yVar.f11756b).postDelayed((m) yVar.f11757c, 128L);
                return;
            default:
                z zVar = (z) this.f11754b;
                zVar.f11758a.getViewTreeObserver().removeOnDrawListener(zVar);
                return;
        }
    }
}
