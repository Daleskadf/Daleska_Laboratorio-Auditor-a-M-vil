package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface T {
    int E();

    D.b0 M();

    void N(S s7, Executor executor);

    D.b0 acquireLatestImage();

    int c();

    void close();

    int getHeight();

    Surface getSurface();

    int getWidth();

    void y();
}
