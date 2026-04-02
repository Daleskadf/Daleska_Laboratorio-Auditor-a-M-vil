package io.flutter.view;

import X5.C0389o;
import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: e  reason: collision with root package name */
    public static w f12529e;
    public static C0389o f;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f12531b;

    /* renamed from: a  reason: collision with root package name */
    public long f12530a = -1;

    /* renamed from: c  reason: collision with root package name */
    public v f12532c = new v(this, 0);

    /* renamed from: d  reason: collision with root package name */
    public final a f12533d = new a(this);

    public w(FlutterJNI flutterJNI) {
        this.f12531b = flutterJNI;
    }

    public static w a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f12529e == null) {
            f12529e = new w(flutterJNI);
        }
        if (f == null) {
            w wVar = f12529e;
            Objects.requireNonNull(wVar);
            C0389o c0389o = new C0389o(1, wVar, displayManager);
            f = c0389o;
            displayManager.registerDisplayListener(c0389o, null);
        }
        if (f12529e.f12530a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f12529e.f12530a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f12529e;
    }
}
