package L5;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f3029a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ V2.k f3030b;

    public h(V2.k kVar) {
        this.f3030b = kVar;
    }

    public final void a() {
        if (!this.f3029a.getAndSet(true)) {
            V2.k kVar = this.f3030b;
            if (((AtomicReference) kVar.f5966c).get() == this) {
                j jVar = (j) kVar.f5967d;
                jVar.f3031a.k(jVar.f3032b, null);
            }
        }
    }

    public final void b(String str, String str2, Serializable serializable) {
        if (!this.f3029a.get()) {
            V2.k kVar = this.f3030b;
            if (((AtomicReference) kVar.f5966c).get() == this) {
                j jVar = (j) kVar.f5967d;
                jVar.f3031a.k(jVar.f3032b, jVar.f3033c.d(serializable, str, str2));
            }
        }
    }

    public final void c(Object obj) {
        if (!this.f3029a.get()) {
            V2.k kVar = this.f3030b;
            if (((AtomicReference) kVar.f5966c).get() == this) {
                j jVar = (j) kVar.f5967d;
                jVar.f3031a.k(jVar.f3032b, jVar.f3033c.a(obj));
            }
        }
    }
}
