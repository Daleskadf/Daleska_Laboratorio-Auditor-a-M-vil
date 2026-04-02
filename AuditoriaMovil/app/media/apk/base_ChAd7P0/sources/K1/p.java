package k1;

import K0.x;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
/* loaded from: classes.dex */
public final class p implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e  reason: collision with root package name */
    public static final p f13660e = new p();

    /* renamed from: a  reason: collision with root package name */
    public volatile long f13661a = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f13662b;

    /* renamed from: c  reason: collision with root package name */
    public Choreographer f13663c;

    /* renamed from: d  reason: collision with root package name */
    public int f13664d;

    public p() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = x.f2529a;
        Handler handler = new Handler(looper, this);
        this.f13662b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f13661a = j;
        Choreographer choreographer = this.f13663c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                Choreographer choreographer = this.f13663c;
                if (choreographer != null) {
                    int i8 = this.f13664d - 1;
                    this.f13664d = i8;
                    if (i8 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f13661a = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f13663c;
            if (choreographer2 != null) {
                int i9 = this.f13664d + 1;
                this.f13664d = i9;
                if (i9 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f13663c = Choreographer.getInstance();
        } catch (RuntimeException e7) {
            K0.a.B("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
        }
        return true;
    }
}
