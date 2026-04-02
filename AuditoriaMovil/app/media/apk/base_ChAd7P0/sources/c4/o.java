package c4;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class o implements InterfaceC1956b {

    /* renamed from: a  reason: collision with root package name */
    public volatile Set f8406a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Set f8407b;

    public final synchronized void a() {
        try {
            for (InterfaceC1956b interfaceC1956b : this.f8406a) {
                this.f8407b.add(interfaceC1956b.get());
            }
            this.f8406a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // w4.InterfaceC1956b
    public final Object get() {
        if (this.f8407b == null) {
            synchronized (this) {
                try {
                    if (this.f8407b == null) {
                        this.f8407b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f8407b);
    }
}
