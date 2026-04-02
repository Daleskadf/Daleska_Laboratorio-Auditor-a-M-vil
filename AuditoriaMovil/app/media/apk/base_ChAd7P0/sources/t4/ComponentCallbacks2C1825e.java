package t4;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: t4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1825e implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f15801a;

    public ComponentCallbacks2C1825e(AtomicBoolean atomicBoolean) {
        this.f15801a = atomicBoolean;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20) {
            this.f15801a.set(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
