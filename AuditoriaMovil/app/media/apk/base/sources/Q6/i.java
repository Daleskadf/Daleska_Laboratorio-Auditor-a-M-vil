package Q6;

import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class i implements y {

    /* renamed from: a  reason: collision with root package name */
    public final k f4470a;

    /* renamed from: b  reason: collision with root package name */
    public long f4471b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4472c;

    public i(k fileHandle, long j) {
        kotlin.jvm.internal.j.e(fileHandle, "fileHandle");
        this.f4470a = fileHandle;
        this.f4471b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4472c) {
            return;
        }
        this.f4472c = true;
        k kVar = this.f4470a;
        ReentrantLock reentrantLock = kVar.f4477d;
        reentrantLock.lock();
        try {
            int i7 = kVar.f4476c - 1;
            kVar.f4476c = i7;
            if (i7 == 0) {
                if (kVar.f4475b) {
                    synchronized (kVar) {
                        kVar.f4478e.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Q6.y
    public final long i(e sink, long j) {
        long j8;
        long j9;
        int i7;
        int i8;
        kotlin.jvm.internal.j.e(sink, "sink");
        if (!this.f4472c) {
            k kVar = this.f4470a;
            long j10 = this.f4471b;
            kVar.getClass();
            if (j >= 0) {
                long j11 = j + j10;
                long j12 = j10;
                while (true) {
                    if (j12 >= j11) {
                        break;
                    }
                    t u7 = sink.u(1);
                    byte[] array = u7.f4491a;
                    int i9 = u7.f4493c;
                    int min = (int) Math.min(j11 - j12, 8192 - i9);
                    synchronized (kVar) {
                        kotlin.jvm.internal.j.e(array, "array");
                        kVar.f4478e.seek(j12);
                        i7 = 0;
                        while (true) {
                            if (i7 >= min) {
                                break;
                            }
                            int read = kVar.f4478e.read(array, i9, min - i7);
                            if (read == -1) {
                                if (i7 == 0) {
                                    i8 = -1;
                                    i7 = -1;
                                }
                            } else {
                                i7 += read;
                            }
                        }
                        i8 = -1;
                    }
                    if (i7 == i8) {
                        if (u7.f4492b == u7.f4493c) {
                            sink.f4461a = u7.a();
                            u.a(u7);
                        }
                        if (j10 == j12) {
                            j9 = -1;
                            j8 = -1;
                        }
                    } else {
                        u7.f4493c += i7;
                        long j13 = i7;
                        j12 += j13;
                        sink.f4462b += j13;
                    }
                }
                j8 = j12 - j10;
                j9 = -1;
                if (j8 != j9) {
                    this.f4471b += j8;
                }
                return j8;
            }
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("byteCount < 0: ", j).toString());
        }
        throw new IllegalStateException("closed");
    }
}
