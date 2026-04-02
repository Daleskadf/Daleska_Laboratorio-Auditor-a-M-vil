package O0;

import D.C0054d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* renamed from: O0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0239a extends BroadcastReceiver implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final E f3657a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3658b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0054d f3659c;

    public RunnableC0239a(C0054d c0054d, Handler handler, E e7) {
        this.f3659c = c0054d;
        this.f3658b = handler;
        this.f3657a = e7;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3658b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3659c.f688a) {
            this.f3657a.f3482a.W(-1, 3, false);
        }
    }
}
