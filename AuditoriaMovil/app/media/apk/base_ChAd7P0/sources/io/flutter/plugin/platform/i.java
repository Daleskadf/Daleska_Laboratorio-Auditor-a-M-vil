package io.flutter.plugin.platform;

import android.view.Surface;
/* loaded from: classes.dex */
public interface i {
    void a(int i7, int i8);

    long b();

    int getHeight();

    Surface getSurface();

    int getWidth();

    void release();

    void scheduleFrame();
}
