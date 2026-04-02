package X0;

import O0.I;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f6265b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f6266c;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f6270h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f6271i;
    public MediaCodec.CodecException j;

    /* renamed from: k  reason: collision with root package name */
    public MediaCodec.CryptoException f6272k;

    /* renamed from: l  reason: collision with root package name */
    public long f6273l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6274m;

    /* renamed from: n  reason: collision with root package name */
    public IllegalStateException f6275n;

    /* renamed from: o  reason: collision with root package name */
    public r f6276o;

    /* renamed from: a  reason: collision with root package name */
    public final Object f6264a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final K0.l f6267d = new K0.l(1);

    /* renamed from: e  reason: collision with root package name */
    public final K0.l f6268e = new K0.l(1);
    public final ArrayDeque f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f6269g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f6265b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f6269g;
        if (!arrayDeque.isEmpty()) {
            this.f6271i = (MediaFormat) arrayDeque.getLast();
        }
        K0.l lVar = this.f6267d;
        lVar.f2495c = lVar.f2494b;
        K0.l lVar2 = this.f6268e;
        lVar2.f2495c = lVar2.f2494b;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f6264a) {
            this.f6275n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f6264a) {
            this.f6272k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6264a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        I i8;
        synchronized (this.f6264a) {
            this.f6267d.a(i7);
            r rVar = this.f6276o;
            if (rVar != null && (i8 = rVar.f6297a.f6304A0) != null) {
                i8.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        I i8;
        synchronized (this.f6264a) {
            try {
                MediaFormat mediaFormat = this.f6271i;
                if (mediaFormat != null) {
                    this.f6268e.a(-2);
                    this.f6269g.add(mediaFormat);
                    this.f6271i = null;
                }
                this.f6268e.a(i7);
                this.f.add(bufferInfo);
                r rVar = this.f6276o;
                if (rVar != null && (i8 = rVar.f6297a.f6304A0) != null) {
                    i8.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6264a) {
            this.f6268e.a(-2);
            this.f6269g.add(mediaFormat);
            this.f6271i = null;
        }
    }
}
