package M3;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final i f3238b = new i();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f3239a = new AtomicReference(new p(new n(0)));

    public final Class a(Class cls) {
        HashMap hashMap = ((p) this.f3239a.get()).f3251b;
        if (hashMap.containsKey(cls)) {
            return ((F3.r) hashMap.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(m mVar) {
        n nVar = new n((p) this.f3239a.get());
        nVar.a(mVar);
        this.f3239a.set(new p(nVar));
    }

    public final synchronized void c(F3.r rVar) {
        n nVar = new n((p) this.f3239a.get());
        nVar.b(rVar);
        this.f3239a.set(new p(nVar));
    }
}
