package O0;

import android.media.AudioManager;
import android.os.Handler;
/* renamed from: O0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3672a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0242d f3673b;

    public C0241c(C0242d c0242d, Handler handler) {
        this.f3673b = c0242d;
        this.f3672a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f3672a.post(new RunnableC0240b(this, i7, 0));
    }
}
