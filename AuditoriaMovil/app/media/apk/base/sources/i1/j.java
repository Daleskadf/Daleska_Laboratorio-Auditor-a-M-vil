package i1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class j extends Handler implements Runnable {

    /* renamed from: X  reason: collision with root package name */
    public Thread f11418X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f11419Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile boolean f11420Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f11421a;

    /* renamed from: b  reason: collision with root package name */
    public final k f11422b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11423c;

    /* renamed from: d  reason: collision with root package name */
    public i f11424d;

    /* renamed from: e  reason: collision with root package name */
    public IOException f11425e;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ n f11426e0;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i7, long j) {
        super(looper);
        this.f11426e0 = nVar;
        this.f11422b = kVar;
        this.f11424d = iVar;
        this.f11421a = i7;
        this.f11423c = j;
    }

    public final void a(boolean z7) {
        this.f11420Z = z7;
        this.f11425e = null;
        if (hasMessages(1)) {
            this.f11419Y = true;
            removeMessages(1);
            if (!z7) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f11419Y = true;
                    this.f11422b.k();
                    Thread thread = this.f11418X;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z7) {
            this.f11426e0.f11430b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.f11424d;
            iVar.getClass();
            iVar.E(this.f11422b, elapsedRealtime, elapsedRealtime - this.f11423c, true);
            this.f11424d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z7;
        if (this.f11420Z) {
            return;
        }
        int i7 = message.what;
        if (i7 == 1) {
            this.f11425e = null;
            n nVar = this.f11426e0;
            ExecutorService executorService = nVar.f11429a;
            j jVar = nVar.f11430b;
            jVar.getClass();
            executorService.execute(jVar);
        } else if (i7 != 4) {
            this.f11426e0.f11430b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f11423c;
            i iVar = this.f11424d;
            iVar.getClass();
            if (this.f11419Y) {
                iVar.E(this.f11422b, elapsedRealtime, j, false);
                return;
            }
            int i8 = message.what;
            if (i8 != 2) {
                if (i8 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f11425e = iOException;
                    int i9 = this.f + 1;
                    this.f = i9;
                    T1.e y2 = iVar.y(this.f11422b, elapsedRealtime, j, iOException, i9);
                    int i10 = y2.f5318a;
                    if (i10 == 3) {
                        this.f11426e0.f11431c = this.f11425e;
                        return;
                    } else if (i10 != 2) {
                        if (i10 == 1) {
                            this.f = 1;
                        }
                        long j8 = y2.f5319b;
                        if (j8 == -9223372036854775807L) {
                            j8 = Math.min((this.f - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000);
                        }
                        n nVar2 = this.f11426e0;
                        if (nVar2.f11430b == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        K0.a.j(z7);
                        nVar2.f11430b = this;
                        if (j8 > 0) {
                            sendEmptyMessageDelayed(1, j8);
                            return;
                        }
                        this.f11425e = null;
                        nVar2.f11429a.execute(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            try {
                iVar.j(this.f11422b, elapsedRealtime, j);
            } catch (RuntimeException e7) {
                K0.a.o("LoadTask", "Unexpected exception handling load completed", e7);
                this.f11426e0.f11431c = new m(e7);
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        try {
            synchronized (this) {
                z7 = this.f11419Y;
                this.f11418X = Thread.currentThread();
            }
            if (!z7) {
                Trace.beginSection("load:".concat(this.f11422b.getClass().getSimpleName()));
                try {
                    this.f11422b.b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f11418X = null;
                Thread.interrupted();
            }
            if (!this.f11420Z) {
                sendEmptyMessage(2);
            }
        } catch (IOException e7) {
            if (!this.f11420Z) {
                obtainMessage(3, e7).sendToTarget();
            }
        } catch (Exception e8) {
            if (!this.f11420Z) {
                K0.a.o("LoadTask", "Unexpected exception loading stream", e8);
                obtainMessage(3, new m(e8)).sendToTarget();
            }
        } catch (OutOfMemoryError e9) {
            if (!this.f11420Z) {
                K0.a.o("LoadTask", "OutOfMemory error loading stream", e9);
                obtainMessage(3, new m(e9)).sendToTarget();
            }
        } catch (Error e10) {
            if (!this.f11420Z) {
                K0.a.o("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(4, e10).sendToTarget();
            }
            throw e10;
        }
    }
}
