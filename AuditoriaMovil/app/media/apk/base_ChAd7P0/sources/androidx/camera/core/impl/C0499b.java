package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: androidx.camera.core.impl.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7604a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7605b;

    public C0499b(Executor executor, Handler handler) {
        if (executor != null) {
            this.f7604a = executor;
            if (handler != null) {
                this.f7605b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0499b)) {
            return false;
        }
        C0499b c0499b = (C0499b) obj;
        if (this.f7604a.equals(c0499b.f7604a) && this.f7605b.equals(c0499b.f7605b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7604a.hashCode() ^ 1000003) * 1000003) ^ this.f7605b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f7604a + ", schedulerHandler=" + this.f7605b + "}";
    }
}
