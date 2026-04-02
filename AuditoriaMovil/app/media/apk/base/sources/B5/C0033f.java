package B5;

import android.os.Build;
import java.util.Iterator;
/* renamed from: B5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033f implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f356a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f357b;

    public /* synthetic */ C0033f(Object obj, int i7) {
        this.f356a = i7;
        this.f357b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
        switch (this.f356a) {
            case 0:
                C0035h c0035h = (C0035h) this.f357b;
                c0035h.f360a.getClass();
                c0035h.f365g = false;
                return;
            case 1:
                return;
            default:
                B b5 = (B) this.f357b;
                b5.f294e0 = false;
                Iterator it = b5.f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.n) it.next()).a();
                }
                return;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        switch (this.f356a) {
            case 0:
                C0035h c0035h = (C0035h) this.f357b;
                AbstractActivityC0032e abstractActivityC0032e = c0035h.f360a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0032e.reportFullyDrawn();
                } else {
                    abstractActivityC0032e.getClass();
                }
                c0035h.f365g = true;
                c0035h.f366h = true;
                return;
            case 1:
                C0044q c0044q = (C0044q) this.f357b;
                c0044q.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.m mVar = c0044q.f380c;
                if (mVar != null) {
                    mVar.f11612a.removeIsDisplayingFlutterUiListener(this);
                    return;
                }
                return;
            default:
                B b5 = (B) this.f357b;
                b5.f294e0 = true;
                Iterator it = b5.f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.n) it.next()).b();
                }
                return;
        }
    }

    private final void c() {
    }
}
