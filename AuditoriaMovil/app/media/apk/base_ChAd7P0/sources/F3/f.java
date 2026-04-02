package F3;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f1164b = Logger.getLogger(f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f1165a;

    public f(f fVar) {
        this.f1165a = new ConcurrentHashMap(fVar.f1165a);
    }

    public final synchronized e a(String str) {
        if (this.f1165a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (e) this.f1165a.get(str);
    }

    public final synchronized void b(M3.d dVar) {
        if (dVar.b().a()) {
            c(new e(dVar));
        } else {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void c(e eVar) {
        try {
            M3.d dVar = eVar.f1163a;
            Class cls = (Class) dVar.f3230b;
            if (!((Map) dVar.f3231c).keySet().contains(cls) && !Void.class.equals(cls)) {
                String obj = dVar.toString();
                String name = cls.getName();
                throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
            }
            String c8 = dVar.c();
            e eVar2 = (e) this.f1165a.get(c8);
            if (eVar2 != null && !eVar2.f1163a.getClass().equals(eVar.f1163a.getClass())) {
                f1164b.warning("Attempted overwrite of a registered key manager for key type ".concat(c8));
                String name2 = eVar2.f1163a.getClass().getName();
                String name3 = eVar.f1163a.getClass().getName();
                throw new GeneralSecurityException("typeUrl (" + c8 + ") is already registered with " + name2 + ", cannot be re-registered with " + name3);
            }
            this.f1165a.putIfAbsent(c8, eVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public f() {
        this.f1165a = new ConcurrentHashMap();
    }
}
