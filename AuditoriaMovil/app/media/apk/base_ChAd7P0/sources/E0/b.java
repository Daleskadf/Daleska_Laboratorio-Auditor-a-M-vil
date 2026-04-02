package E0;

import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.firebase.storage.z;
import d0.i;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f933a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f934b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f933a = i7;
        this.f934b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f933a) {
            case 0:
                a aVar = (a) this.f934b;
                AtomicBoolean atomicBoolean = aVar.f931d;
                AtomicBoolean atomicBoolean2 = aVar.f930c;
                atomicBoolean.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        aVar.f932e.d();
                    } catch (i e7) {
                        if (!atomicBoolean2.get()) {
                            throw e7;
                        }
                    }
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        atomicBoolean2.set(true);
                        throw th;
                    } finally {
                        aVar.a(null);
                    }
                }
            case 1:
                ((Runnable) this.f934b).run();
                return null;
            default:
                z zVar = (z) this.f934b;
                zVar.f9971m.f287e = false;
                C4.a aVar2 = zVar.f9978t;
                if (aVar2 != null) {
                    aVar2.o();
                }
                C4.a aVar3 = new C4.a(zVar.f9970l.b(), zVar.f9970l.f9931b.f9900a, zVar.f9975q);
                zVar.f9978t = aVar3;
                zVar.f9971m.b(aVar3, false);
                zVar.f9973o = zVar.f9978t.f542e;
                Exception exc = zVar.f9978t.f538a;
                if (exc == null) {
                    exc = zVar.f9972n;
                }
                zVar.f9972n = exc;
                int i7 = zVar.f9973o;
                if ((i7 == 308 || (i7 >= 200 && i7 < 300)) && zVar.f9972n == null && zVar.f9959h == 4) {
                    String j = zVar.f9978t.j("ETag");
                    if (!TextUtils.isEmpty(j) && (str = zVar.f9979u) != null && !str.equals(j)) {
                        zVar.f9973o = 409;
                        throw new IOException("The ETag on the server changed.");
                    }
                    zVar.f9979u = j;
                    C4.a aVar4 = zVar.f9978t;
                    int i8 = aVar4.f543g;
                    return aVar4.f544h;
                }
                throw new IOException("Could not open resulting stream.");
        }
    }
}
