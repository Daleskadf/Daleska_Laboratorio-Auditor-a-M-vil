package M3;

import R3.EnumC0324v0;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f3240b = new j();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f3241a = new AtomicReference(new u(new E.e(6)));

    /* JADX WARN: Type inference failed for: r0v2, types: [F3.c, java.lang.Object] */
    public final F3.c a(q qVar) {
        AtomicReference atomicReference = this.f3241a;
        u uVar = (u) atomicReference.get();
        uVar.getClass();
        T3.a aVar = (T3.a) qVar.f3254c;
        if (!uVar.f3263b.containsKey(new s(q.class, aVar))) {
            try {
                ?? obj = new Object();
                int i7 = e.f3233b[((EnumC0324v0) qVar.f3256e).ordinal()];
                return obj;
            } catch (GeneralSecurityException e7) {
                throw new RuntimeException("Creating a LegacyProtoKey failed", e7);
            }
        }
        u uVar2 = (u) atomicReference.get();
        uVar2.getClass();
        s sVar = new s(q.class, aVar);
        HashMap hashMap = uVar2.f3263b;
        if (hashMap.containsKey(sVar)) {
            return ((a) hashMap.get(sVar)).f3225b.b(qVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + sVar + " available");
    }

    public final synchronized void b(a aVar) {
        E.e eVar = new E.e((u) this.f3241a.get());
        eVar.Y(aVar);
        this.f3241a.set(new u(eVar));
    }

    public final synchronized void c(b bVar) {
        E.e eVar = new E.e((u) this.f3241a.get());
        eVar.Z(bVar);
        this.f3241a.set(new u(eVar));
    }

    public final synchronized void d(k kVar) {
        E.e eVar = new E.e((u) this.f3241a.get());
        eVar.a0(kVar);
        this.f3241a.set(new u(eVar));
    }

    public final synchronized void e(l lVar) {
        E.e eVar = new E.e((u) this.f3241a.get());
        eVar.b0(lVar);
        this.f3241a.set(new u(eVar));
    }
}
