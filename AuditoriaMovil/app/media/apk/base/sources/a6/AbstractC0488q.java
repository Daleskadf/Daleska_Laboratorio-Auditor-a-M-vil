package a6;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* renamed from: a6.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0488q {

    /* renamed from: a  reason: collision with root package name */
    public static final r f7190a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a6.r] */
    static {
        r rVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            rVar = (r) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(r.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e7) {
            atomicReference.set(e7);
            rVar = new Object();
        } catch (Exception e8) {
            throw new RuntimeException("Storage override failed to initialize", e8);
        }
        f7190a = rVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C0489s.f7197a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
