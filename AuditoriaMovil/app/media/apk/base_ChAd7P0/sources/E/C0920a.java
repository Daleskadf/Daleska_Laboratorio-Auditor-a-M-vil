package e;

import android.window.BackEvent;
/* renamed from: e.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0920a f10517a = new Object();

    public final BackEvent a(float f, float f4, float f8, int i7) {
        return new BackEvent(f, f4, f8, i7);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
