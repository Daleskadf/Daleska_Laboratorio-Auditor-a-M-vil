package a1;

import android.os.Handler;
import android.os.HandlerThread;
import j$.util.Objects;
import java.io.Closeable;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f6915a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f6916b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f6917c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f6918d;

    public x(y yVar, OutputStream outputStream) {
        this.f6918d = yVar;
        this.f6915a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f6916b = handlerThread;
        handlerThread.start();
        this.f6917c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.f6917c;
        HandlerThread handlerThread = this.f6916b;
        Objects.requireNonNull(handlerThread);
        handler.post(new C.b(handlerThread, 25));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
