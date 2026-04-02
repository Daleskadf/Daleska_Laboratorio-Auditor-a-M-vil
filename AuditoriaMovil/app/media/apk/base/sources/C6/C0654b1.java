package c6;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* renamed from: c6.b1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654b1 extends WeakReference {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: g  reason: collision with root package name */
    public static final RuntimeException f8785g;

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue f8786a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f8787b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8788c;

    /* renamed from: d  reason: collision with root package name */
    public final SoftReference f8789d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f8790e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f8785g = runtimeException;
    }

    public C0654b1(C0657c1 c0657c1, Z0 z02, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
        super(c0657c1, referenceQueue);
        RuntimeException runtimeException;
        this.f8790e = new AtomicBoolean();
        if (f) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = f8785g;
        }
        this.f8789d = new SoftReference(runtimeException);
        this.f8788c = z02.toString();
        this.f8786a = referenceQueue;
        this.f8787b = concurrentHashMap;
        concurrentHashMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            C0654b1 c0654b1 = (C0654b1) referenceQueue.poll();
            if (c0654b1 != null) {
                SoftReference softReference = c0654b1.f8789d;
                RuntimeException runtimeException = (RuntimeException) softReference.get();
                super.clear();
                c0654b1.f8787b.remove(c0654b1);
                softReference.clear();
                if (!c0654b1.f8790e.get()) {
                    Level level = Level.SEVERE;
                    Logger logger = C0657c1.f8800h;
                    if (logger.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(logger.getName());
                        logRecord.setParameters(new Object[]{c0654b1.f8788c});
                        logRecord.setThrown(runtimeException);
                        logger.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f8787b.remove(this);
        this.f8789d.clear();
        a(this.f8786a);
    }
}
