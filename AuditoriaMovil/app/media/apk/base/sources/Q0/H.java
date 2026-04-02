package Q0;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4161a = new Handler(Looper.myLooper());

    /* renamed from: b  reason: collision with root package name */
    public final G f4162b = new G(this);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I f4163c;

    public H(I i7) {
        this.f4163c = i7;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.f4161a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new F(handler, 0), this.f4162b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f4162b);
        this.f4161a.removeCallbacksAndMessages(null);
    }
}
