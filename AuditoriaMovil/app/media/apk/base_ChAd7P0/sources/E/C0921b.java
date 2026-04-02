package e;

import android.window.BackEvent;
/* renamed from: e.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921b {

    /* renamed from: a  reason: collision with root package name */
    public final float f10518a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10519b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10520c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10521d;

    public C0921b(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        C0920a c0920a = C0920a.f10517a;
        float d7 = c0920a.d(backEvent);
        float e7 = c0920a.e(backEvent);
        float b5 = c0920a.b(backEvent);
        int c8 = c0920a.c(backEvent);
        this.f10518a = d7;
        this.f10519b = e7;
        this.f10520c = b5;
        this.f10521d = c8;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f10518a + ", touchY=" + this.f10519b + ", progress=" + this.f10520c + ", swipeEdge=" + this.f10521d + '}';
    }
}
