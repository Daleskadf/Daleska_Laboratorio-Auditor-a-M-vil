package androidx.lifecycle;
/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a  reason: collision with root package name */
    public final C0.a f7923a = new C0.a();

    public final void a() {
        C0.a aVar = this.f7923a;
        if (aVar != null && !aVar.f429d) {
            aVar.f429d = true;
            synchronized (aVar.f426a) {
                try {
                    for (AutoCloseable autoCloseable : aVar.f427b.values()) {
                        C0.a.a(autoCloseable);
                    }
                    for (AutoCloseable autoCloseable2 : aVar.f428c) {
                        C0.a.a(autoCloseable2);
                    }
                    aVar.f428c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
