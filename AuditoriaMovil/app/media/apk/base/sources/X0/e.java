package X0;

import B5.AbstractC0046t;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: X  reason: collision with root package name */
    public static final ArrayDeque f6257X = new ArrayDeque();

    /* renamed from: Y  reason: collision with root package name */
    public static final Object f6258Y = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f6259a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f6260b;

    /* renamed from: c  reason: collision with root package name */
    public F0.a f6261c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f6262d;

    /* renamed from: e  reason: collision with root package name */
    public final A.n f6263e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r0v0, types: [A.n, java.lang.Object] */
    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f6259a = mediaCodec;
        this.f6260b = handlerThread;
        this.f6263e = obj;
        this.f6262d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f6257X;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(d dVar) {
        ArrayDeque arrayDeque = f6257X;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override // X0.k
    public final void a(Bundle bundle) {
        c();
        F0.a aVar = this.f6261c;
        int i7 = K0.x.f2529a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // X0.k
    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.f6262d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override // X0.k
    public final void d(int i7, N0.b bVar, long j, int i8) {
        c();
        d b5 = b();
        b5.f6252a = i7;
        b5.f6253b = 0;
        b5.f6255d = j;
        b5.f6256e = i8;
        int i9 = bVar.f;
        MediaCodec.CryptoInfo cryptoInfo = b5.f6254c;
        cryptoInfo.numSubSamples = i9;
        int[] iArr = bVar.f3340d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = bVar.f3341e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = bVar.f3338b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = bVar.f3337a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = bVar.f3339c;
        if (K0.x.f2529a >= 24) {
            AbstractC0046t.p();
            cryptoInfo.setPattern(AbstractC0046t.g(bVar.f3342g, bVar.f3343h));
        }
        this.f6261c.obtainMessage(2, b5).sendToTarget();
    }

    @Override // X0.k
    public final void e(int i7, int i8, long j, int i9) {
        c();
        d b5 = b();
        b5.f6252a = i7;
        b5.f6253b = i8;
        b5.f6255d = j;
        b5.f6256e = i9;
        F0.a aVar = this.f6261c;
        int i10 = K0.x.f2529a;
        aVar.obtainMessage(1, b5).sendToTarget();
    }

    @Override // X0.k
    public final void flush() {
        if (this.f) {
            try {
                F0.a aVar = this.f6261c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                A.n nVar = this.f6263e;
                nVar.a();
                F0.a aVar2 = this.f6261c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                synchronized (nVar) {
                    while (!nVar.f29a) {
                        nVar.wait();
                    }
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // X0.k
    public final void shutdown() {
        if (this.f) {
            flush();
            this.f6260b.quit();
        }
        this.f = false;
    }

    @Override // X0.k
    public final void start() {
        if (!this.f) {
            HandlerThread handlerThread = this.f6260b;
            handlerThread.start();
            this.f6261c = new F0.a(this, handlerThread.getLooper(), 1);
            this.f = true;
        }
    }
}
