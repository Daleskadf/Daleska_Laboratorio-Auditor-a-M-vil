package Q6;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class k implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4474a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4475b;

    /* renamed from: c  reason: collision with root package name */
    public int f4476c;

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f4477d = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    public final RandomAccessFile f4478e;

    public k(boolean z7, RandomAccessFile randomAccessFile) {
        this.f4474a = z7;
        this.f4478e = randomAccessFile;
    }

    public static h a(k kVar) {
        if (kVar.f4474a) {
            ReentrantLock reentrantLock = kVar.f4477d;
            reentrantLock.lock();
            try {
                if (!kVar.f4475b) {
                    kVar.f4476c++;
                    reentrantLock.unlock();
                    return new h(kVar, 0L);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f4477d;
        reentrantLock.lock();
        try {
            if (!this.f4475b) {
                synchronized (this) {
                    length = this.f4478e.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final i c(long j) {
        ReentrantLock reentrantLock = this.f4477d;
        reentrantLock.lock();
        try {
            if (!this.f4475b) {
                this.f4476c++;
                reentrantLock.unlock();
                return new i(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f4477d;
        reentrantLock.lock();
        try {
            if (this.f4475b) {
                return;
            }
            this.f4475b = true;
            if (this.f4476c != 0) {
                return;
            }
            synchronized (this) {
                this.f4478e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.f4474a) {
            ReentrantLock reentrantLock = this.f4477d;
            reentrantLock.lock();
            try {
                if (!this.f4475b) {
                    synchronized (this) {
                        this.f4478e.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed");
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }
}
