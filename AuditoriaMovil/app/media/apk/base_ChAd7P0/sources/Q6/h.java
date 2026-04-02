package Q6;

import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class h implements w {

    /* renamed from: a  reason: collision with root package name */
    public final k f4467a;

    /* renamed from: b  reason: collision with root package name */
    public long f4468b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4469c;

    public h(k fileHandle, long j) {
        kotlin.jvm.internal.j.e(fileHandle, "fileHandle");
        this.f4467a = fileHandle;
        this.f4468b = j;
    }

    @Override // Q6.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4469c) {
            return;
        }
        this.f4469c = true;
        k kVar = this.f4467a;
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

    @Override // Q6.w, java.io.Flushable
    public final void flush() {
        if (!this.f4469c) {
            k kVar = this.f4467a;
            synchronized (kVar) {
                kVar.f4478e.getFD().sync();
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Q6.w
    public final void l(e eVar, long j) {
        if (!this.f4469c) {
            k kVar = this.f4467a;
            long j8 = this.f4468b;
            kVar.getClass();
            AbstractC0281b.c(eVar.f4462b, 0L, j);
            long j9 = j8 + j;
            while (j8 < j9) {
                t tVar = eVar.f4461a;
                kotlin.jvm.internal.j.b(tVar);
                int min = (int) Math.min(j9 - j8, tVar.f4493c - tVar.f4492b);
                byte[] array = tVar.f4491a;
                int i7 = tVar.f4492b;
                synchronized (kVar) {
                    kotlin.jvm.internal.j.e(array, "array");
                    kVar.f4478e.seek(j8);
                    kVar.f4478e.write(array, i7, min);
                }
                int i8 = tVar.f4492b + min;
                tVar.f4492b = i8;
                long j10 = min;
                j8 += j10;
                eVar.f4462b -= j10;
                if (i8 == tVar.f4493c) {
                    eVar.f4461a = tVar.a();
                    u.a(tVar);
                }
            }
            this.f4468b += j;
            return;
        }
        throw new IllegalStateException("closed");
    }
}
