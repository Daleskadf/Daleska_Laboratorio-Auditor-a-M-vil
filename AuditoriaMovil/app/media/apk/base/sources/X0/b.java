package X0;

import android.os.HandlerThread;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements z3.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6245a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6246b;

    public /* synthetic */ b(int i7, int i8) {
        this.f6245a = i8;
        this.f6246b = i7;
    }

    @Override // z3.o
    public final Object get() {
        switch (this.f6245a) {
            case 0:
                return new HandlerThread(c.g(this.f6246b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.g(this.f6246b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
