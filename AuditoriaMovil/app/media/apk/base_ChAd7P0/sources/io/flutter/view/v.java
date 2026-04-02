package io.flutter.view;

import android.view.Choreographer;
/* loaded from: classes.dex */
public final class v implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public long f12527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f12528b;

    public v(w wVar, long j) {
        this.f12528b = wVar;
        this.f12527a = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j8;
        long nanoTime = System.nanoTime() - j;
        if (nanoTime < 0) {
            j8 = 0;
        } else {
            j8 = nanoTime;
        }
        w wVar = this.f12528b;
        wVar.f12531b.onVsync(j8, wVar.f12530a, this.f12527a);
        wVar.f12532c = this;
    }
}
