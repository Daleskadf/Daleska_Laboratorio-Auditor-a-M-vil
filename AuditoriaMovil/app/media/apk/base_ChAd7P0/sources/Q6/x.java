package Q6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class x extends A {

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f4501d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4502b;

    /* renamed from: c  reason: collision with root package name */
    public x f4503c;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f4501d = reentrantLock;
        kotlin.jvm.internal.j.d(reentrantLock.newCondition(), "lock.newCondition()");
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    public x(Socket socket) {
    }

    public final boolean b() {
        ReentrantLock reentrantLock = f4501d;
        reentrantLock.lock();
        try {
            if (!this.f4502b) {
                return false;
            }
            this.f4502b = false;
            x xVar = null;
            while (xVar != null) {
                x xVar2 = xVar.f4503c;
                if (xVar2 == this) {
                    xVar.f4503c = this.f4503c;
                    this.f4503c = null;
                    return false;
                }
                xVar = xVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final IOException c(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
